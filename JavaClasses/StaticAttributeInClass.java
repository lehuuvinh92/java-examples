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
public class StaticAttributeInClass {

    public static int iStatic;//thuộc tính static
    public int iNonStatic;//thuộc tính không phải static

    public static void main(String[] args) {
        StaticAttributeInClass obj1 = new StaticAttributeInClass();
        obj1.iStatic = 10;
        obj1.iNonStatic = 11;
        StaticAttributeInClass obj2 = new StaticAttributeInClass();
        System.out.println("obj1.iStatic=" + obj1.iStatic + ", obj1.iNonStatic=" + obj1.iNonStatic);
        System.out.println("obj2.iStatic=" + obj2.iStatic + ", obj2.iNonStatic=" + obj2.iNonStatic);
        obj1.iNonStatic = 111;
        obj2.iNonStatic = 999;
        obj2.iStatic = -555;
        System.out.println("obj1.iStatic=" + obj1.iStatic + ", obj1.iNonStatic=" + obj1.iNonStatic);
        System.out.println("obj2.iStatic=" + obj2.iStatic + ", obj2.iNonStatic=" + obj2.iNonStatic);
    }
}
