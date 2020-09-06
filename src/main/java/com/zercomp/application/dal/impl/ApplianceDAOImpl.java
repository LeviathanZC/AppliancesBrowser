package com.zercomp.application.dal.impl;

import com.zercomp.application.dal.ApplianceDAO;
import com.zercomp.application.dal.DaoException;
import com.zercomp.application.dal.parser.ApplianceParser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ApplianceDAOImpl implements ApplianceDAO {

    private static final String PROPERTIES = "file";
    private static final String PATH = "file.path";
    private static final char VALUE_DELIMETER = '=';
    private static final String PARAMETER_DELIMETER = ", ";


    private static BufferedReader reader;
    
    private ApplianceParser parser;

    public List<String> find(String groupName) throws DaoException {
        List<String> allAppliances = readFile();
        parser = ApplianceParser.getInstance();
        return parser.selectSpecifiedGroup(allAppliances, groupName);
    }

    private List<String> readFile() throws DaoException {
        ResourceBundle bundle = ResourceBundle.getBundle(PROPERTIES);
        String filePath = bundle.getString(PATH);
        return selectAll(filePath);
    }

    public List<String> selectAll(String filePath) throws DaoException {
        ArrayList<String> stringAppliances = new ArrayList<String>();
        String line;
        try {
            BufferedReader tempReader = initReader(filePath);
            while ((line = tempReader.readLine()) != null) {
                stringAppliances.add(line);
            }
        } catch (IOException e) {
            throw new DaoException("error while reading file", e);
        } finally {
            closeReader();
        }
        return stringAppliances;
    }

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
            if (reader != null) {
                reader.close();
            }
        } catch (IOException e) {
            throw new DaoException("error while closing \"reader\"", e);
        }
    }
}
