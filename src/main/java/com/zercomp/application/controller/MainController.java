package com.zercomp.application.controller;

import com.zercomp.application.dal.DaoException;
import com.zercomp.application.dal.impl.ApplianceDAOImpl;
import com.zercomp.application.dal.parser.ApplianceParser;

import java.util.*;

public class MainController {

    public static void main(String[] args) throws DaoException {
        /*Map<String, Object> info = new HashMap<>();
        info.put("name", "LAPTOP");
        AbstractFactory factory = ComputerFactory.getInstance();
        factory.create(info);
        //System.out.println(ApplianceName.LAPTOP.getName() );
        HashMap<String, Object> map = new HashMap<>();
        map.put("key", "value");
        map.put("key1", "value1");
        map.put("key2", "value2");*/

        /*Request request = new Request("Command", map);
        System.out.println(request.toString());*/
        ResourceBundle bundle = ResourceBundle.getBundle("file");
        String filePath = bundle.getString("file.path");
        ApplianceDAOImpl dao = new ApplianceDAOImpl();
        List<String> apps = dao.selectAll(filePath);
        ApplianceParser parser = ApplianceParser.getInstance();
        /*Criteria criteria = new Criteria("Laptop");
        List<String> glist = parser.selectSpecifiedAppliance(apps, criteria);
        for (String app : glist) {
            System.out.println(app);
        }*/
        List<String> params;
        for (String app : apps) {
            params = parser.selectParams(app);
            for (String str : params) {
                System.out.println(str);
                System.out.print(parser.parseParam(str) + " ");
                System.out.println(parser.parseValue(str));
            }
        }
        System.out.println();
    }


}