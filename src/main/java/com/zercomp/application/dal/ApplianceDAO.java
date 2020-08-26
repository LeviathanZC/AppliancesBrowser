package com.zercomp.application.dal;

import com.zercomp.application.entity.AbstractAppliance;
import com.zercomp.application.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceDAO {

    List<AbstractAppliance> selectAll() throws DaoException;

    List<AbstractAppliance> find(Criteria criteria) throws DaoException;

}
