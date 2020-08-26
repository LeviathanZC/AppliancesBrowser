package com.zercomp.application.dal.impl;

import com.zercomp.application.dal.ApplianceDAO;
import com.zercomp.application.dal.DaoException;
import com.zercomp.application.entity.AbstractAppliance;
import com.zercomp.application.entity.criteria.Criteria;

import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO {

    public List<AbstractAppliance> selectAll() throws DaoException {
        return null;
    }

    public List<AbstractAppliance> find(Criteria criteria) throws DaoException {
        String groupSearchName = criteria.getCriteriaName();
        return null;
    }
}
