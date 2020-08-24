package com.zercomp.application.controller;

import com.zercomp.application.entity.Refrigerator;

import java.sql.Ref;

public class MainController {

    public static void main(String[] args) {
        Refrigerator refrigerator = new Refrigerator(100, 20, 10 , 300, 200, 70);
        Refrigerator refrigerator1 = new Refrigerator(200, 30, 15, 300, 100, 80);
        System.out.println(refrigerator);
        System.out.println(refrigerator1);
    }

}
