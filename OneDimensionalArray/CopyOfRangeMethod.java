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
public class CopyOfRangeMethod {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        //sao chép toàn bộ mảng numbers
        int[] copyArr1 = Arrays.copyOfRange(numbers, 0, numbers.length);
        System.out.print("Mang copyArr1 sao chep duoc: ");
        for (int number : copyArr1) {
            System.out.print(number + " ");
        }
        System.out.println();
        //sao chép mảng numbers từ index 2 đến 5 (không bao gồm index=5)
        int[] copyArr2 = Arrays.copyOfRange(numbers, 2, 5);
        System.out.print("Mang copyArr2 sao chep duoc: ");
        for (int number : copyArr2) {
            System.out.print(number + " ");
        }
    }
}
