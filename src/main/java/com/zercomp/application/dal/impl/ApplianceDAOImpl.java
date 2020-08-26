package com.zercomp.application.dal.impl;

import com.zercomp.application.dal.ApplianceDAO;
import com.zercomp.application.dal.DaoException;
import com.zercomp.application.entity.AbstractAppliance;
import com.zercomp.application.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class ApplianceDAOImpl implements ApplianceDAO {

    private static final String FILE = "file";
    private static final String KEY = "file.path";


    public List<AbstractAppliance> selectAll() throws DaoException {
        return null;
    }

    public List<AbstractAppliance> find(Criteria criteria) throws DaoException {
        String criteriaName = criteria.getCriteriaName();
        String path;
        BufferedReader reader = null;
        try {
            ResourceBundle resource = ResourceBundle.getBundle(FILE);
            path = resource.getString(KEY);
            reader = new BufferedReader(new FileReader(path));
        } catch (IOException | MissingResourceException ex) {
            throw new DaoException(ex);
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new DaoException(e);
            }
        }
        return null;
    }
}
