package com.zercomp.application.dal;

import com.zercomp.application.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceDAO {

    List<String> selectAll() throws DaoException;

    //List<> findAppliance(Criteria criteria) throws DaoException;

    //String se

}
