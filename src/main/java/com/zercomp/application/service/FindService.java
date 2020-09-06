package com.zercomp.application.service;

import com.zercomp.application.dal.ApplianceDAO;
import com.zercomp.application.dal.DaoException;
import com.zercomp.application.entity.criteria.ParamDefiner;
import com.zercomp.application.entity.criteria.Parameter;
import com.zercomp.application.service.factory.AbstractFactory;
import com.zercomp.application.service.factory.FactoryException;
import com.zercomp.application.service.factory.definer.FactoryDefiner;
import com.zercomp.application.dal.impl.ApplianceDAOImpl;
import com.zercomp.application.dal.parser.ApplianceParser;
import com.zercomp.application.entity.AbstractAppliance;
import com.zercomp.application.entity.criteria.Criteria;

import java.util.*;

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

        Map<String, String> criteriaMap = criteria.getCriteria();
        Map<String, String> info = new HashMap<>();
        try {
            factory = FactoryDefiner.getDefiner().define(criteria.getGroupName());
            List<String> criteriaAppliances = dao.find(criteria.getGroupName());
            Map<String, String> temp;
            for (String appliance : criteriaAppliances) {
                temp = splitting(appliance);
                for (Map.Entry<String, String> entry : temp.entrySet()) {
                    if (criteriaMap.containsKey(entry.getKey())) {
                        if (criteriaMap.get(entry.getKey()).equals(entry.getValue())) {
                            info = new HashMap<>();
                            for (Map.Entry<String, String> entrySet : temp.entrySet()) {
                                info.put(entrySet.getKey(), entrySet.getValue());
                            }
                            foundAppliances.add(factory.create(info));
                        }
                    }
                }
            }
        } catch (DaoException | FactoryException ex) {
            throw new ServiceException("exception at \"findBy(criteria)\" method :" + ex);
        }
        return foundAppliances;
    }

    private Map<String, String> splitting(String appliance) {
        Map<String, String> split = new HashMap<>();
        ApplianceParser parser = ApplianceParser.getInstance();
        List<String> params = parser.selectParams(appliance);
        for (String param : params) {
            split.put(parser.parseParam(param), parser.parseValue(param));
        }
        return split;
    }

}
