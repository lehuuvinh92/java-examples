/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gochocit.examples;

import java.util.Arrays;

/**
 *
 * @author LHVINH
 */
public class FinalAttributeInClass {

    final double PI = 3.141592653589793;
    public final int VAL_THREE = 39;
    private final int[] A = {1, 2, 3, 4, 5, 6};

    public static void main(String[] args) {
        FinalAttributeInClass obj = new FinalAttributeInClass();
        System.out.println(obj.PI);
        System.out.println(obj.VAL_THREE);
        System.out.println(Arrays.toString(obj.A));
    }
}
