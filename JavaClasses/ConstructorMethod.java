/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gochocit.examples;

/**
 *
 * @author LHVINH
 */
class Company {

    String name;
    String country;

    public Company() {
        name = "Google";
        System.out.println("Company name is " + name);
    }

    //public constructor
    public Company(String cName) {
        name = cName;
        System.out.println("Company name is " + name);
    }

    //public constructor
    public Company(String cName, String cCountry) {
        name = cName;
        country = cCountry;
        System.out.println("Company name is " + name + " in " + country);
    }
}

class ConstructorMethod {

    public static void main(String[] args) {
        Company com1 = new Company();
        Company com2 = new Company("Apple");
        Company com3 = new Company("Facebook", "USA");
    }
}
