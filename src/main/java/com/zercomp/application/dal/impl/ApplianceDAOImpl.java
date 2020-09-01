package com.zercomp.application.dal.impl;

import com.zercomp.application.dal.ApplianceDAO;
import com.zercomp.application.dal.DaoException;
import com.zercomp.application.entity.AbstractAppliance;
import com.zercomp.application.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class ApplianceDAOImpl implements ApplianceDAO {

    private static final String FILE_PATH = "file.path";
    private static final String PROPERTIES = "file";

    private static BufferedReader reader;

    private static BufferedReader initReader(String filePath) throws DaoException {
        try {
            if (reader == null) {
                reader = new BufferedReader(new FileReader(filePath));
            }
            return reader;
        } catch (IOException e) {
            throw new DaoException("error while init \"reader\"", e);
        }
    }

    private static void closeReader() throws DaoException {
        try {
            if(reader != null) {
                reader.close();
            }
        } catch (IOException e) {
            throw new DaoException("error while closing \"reader\"", e);
        }
    }

    public List<AbstractAppliance> find(Criteria criteria) throws DaoException {
        ResourceBundle bundle = ResourceBundle.getBundle(PROPERTIES);
        String fileName = bundle.getString(FILE_PATH);
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

    private List<String> selectAll(String filePath) throws DaoException {

    }
}
