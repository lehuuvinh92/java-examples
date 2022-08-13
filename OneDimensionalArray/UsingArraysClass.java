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
public class UsingArraysClass {

    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];
        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }

    public static void main(String[] args) {
        double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
        System.out.println("Index cua phan tu 1.9 la:" + Arrays.binarySearch(numbers, 1.9));
        Arrays.sort(numbers);//sắp xếp mảng tang dan
        System.out.println("Mang da sap xep tang dan:" + Arrays.toString(numbers));
    }
}
