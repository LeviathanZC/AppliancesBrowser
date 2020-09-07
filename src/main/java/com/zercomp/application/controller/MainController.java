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
        System.out.println(found);

        Criteria criteria1 = new Criteria("VacuumCleaner");
        criteria1.add("BAG_TYPE", "AA-89");
        List<AbstractAppliance> found1 = FindService.getService().findBy(criteria1);
        System.out.println(found1);

        Criteria criteria2 = new Criteria("TabletPC");
        criteria2.add("FLASH_MEMORY_CAPACITY", "6");
        List<AbstractAppliance> found2 = FindService.getService().findBy(criteria2);
        System.out.println(found2);
    }


}