package com.zercomp.application.service;

import com.zercomp.application.dal.ApplianceDAO;
import com.zercomp.application.dal.DaoException;
import com.zercomp.application.entity.criteria.Parameter;
import com.zercomp.application.service.factory.AbstractFactory;
import com.zercomp.application.service.factory.FactoryException;
import com.zercomp.application.service.factory.definer.FactoryDefiner;
import com.zercomp.application.dal.impl.ApplianceDAOImpl;
import com.zercomp.application.dal.parser.ApplianceParser;
import com.zercomp.application.entity.AbstractAppliance;
import com.zercomp.application.entity.criteria.Criteria;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FindService {

    private static FindService service;

    private FindService() {
    }

    public static FindService getService() {
        if (service == null) {
            service = new FindService();
        }
        return service;
    }

    public List<AbstractAppliance> findBy(Criteria criteria) throws ServiceException {

        List<AbstractAppliance> foundAppliances = new ArrayList<>();
        ApplianceDAO dao = new ApplianceDAOImpl();
        ApplianceParser parser = ApplianceParser.getInstance();
        AbstractFactory factory;

        Map<String, String> info;
        try {
            factory = FactoryDefiner.getDefiner().define(criteria.getGroupName());
            List<String> criteriaAppliances = dao.find(criteria.getGroupName());
            Parameter parameter =
            for (:){
                foundAppliances.add(factory.create(info));
            }
        } catch (DaoException | FactoryException ex) {
            throw new ServiceException("exception at \"findBy(criteria)\" method :" + ex);
        }
        return foundAppliances;
    }
}
