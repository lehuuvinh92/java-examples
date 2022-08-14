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
enum Size {
    SMALL, MEDIUM, LARGE, EXTRALARGE
}

class Enum {

    public static void main(String[] args) {
        Size s1 = Size.LARGE;
        Size s2 = Size.SMALL;
        System.out.println(s1);
        System.out.println(s2);
    }
}
