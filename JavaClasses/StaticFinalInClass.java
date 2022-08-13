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
public class StaticFinalInClass {

    public static final double PI;

    static {
        PI = 3.14159;
    }

    public static void main(String args[]) {
        double banKinh = 20.0;
        System.out.print("Dien tich hinh tron: ");
        System.out.println(banKinh * banKinh * StaticFinalInClass.PI);
    }

}
