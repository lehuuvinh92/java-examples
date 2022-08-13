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
public class ArrayCopyMethod {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] copyArr1 = new int[5];
        int[] copyArr2 = new int[numbers.length];
        System.arraycopy(numbers, 2, copyArr1, 1, 3);
        System.out.print("Mang copyArr1 sao chep duoc: ");
        for (int number : copyArr1) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.arraycopy(numbers, 0, copyArr2, 0, numbers.length);
        System.out.print("Mang copyArr2 sao chep duoc: ");
        for (int number : copyArr2) {
            System.out.print(number + " ");
        }
    }
}
