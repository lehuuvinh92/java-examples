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
public class PassArrayToMethod {

    public static void swapFirstTwoInArray(int[] array) {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2};
        System.out.println("Mang truoc khi goi ham swap");
        System.out.println("array la {" + arr[0] + ", " + arr[1] + "}");
        swapFirstTwoInArray(arr);
        System.out.println("Mang sau khi goi ham swap");
        System.out.println("array la {" + arr[0] + ", " + arr[1] + "}");
    }
}
