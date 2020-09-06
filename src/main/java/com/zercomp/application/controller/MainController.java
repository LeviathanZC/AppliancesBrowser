package com.zercomp.application.controller;

import com.zercomp.application.dal.DaoException;
import com.zercomp.application.entity.AbstractAppliance;
import com.zercomp.application.entity.criteria.Criteria;
import com.zercomp.application.service.FindService;
import com.zercomp.application.service.ServiceException;

import java.util.*;

public class MainController {

    public static void main(String[] args) throws DaoException, ServiceException {
        Criteria criteria = new Criteria("Laptop");
        criteria.add("MEMORY_ROM", "8000");
        List<AbstractAppliance> found = FindService.getService().findBy(criteria);
        for (AbstractAppliance item : found) {
            System.out.println(item);
        }
    }


}