package com.zercomp.application.dal;

import java.util.List;

public interface ApplianceDAO {

    List<String> selectAll() throws DaoException;

}
