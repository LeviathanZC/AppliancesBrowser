package com.zercomp.application.controller;

import com.zercomp.application.entity.household.Refrigerator;

public class MainController {

    public static void main(String[] args) {
        Refrigerator object1 = new Refrigerator(100, 20, 10 , 300, 200, 70);
        Refrigerator object2 = new Refrigerator(200, 30, 15, 300, 100, 80);

        System.out.println(object1);
        System.out.println(object2);
    }

}
