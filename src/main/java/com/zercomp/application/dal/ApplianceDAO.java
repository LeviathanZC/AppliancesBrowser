package com.zercomp.application.dal;

import com.zercomp.application.entity.AbstractAppliance;

import java.util.List;

public interface ApplianceDAO {

    List<String> find(String applianceName) throws DaoException;

}
