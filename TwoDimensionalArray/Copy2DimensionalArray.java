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
public class Copy2DimensionalArray {

    public static void main(String[] args) {
        int[][] source = {
            {1, 2, 3, 4},
            {5, 6},
            {0, 2, 42, -4, 5}
        };
        int[][] dest = new int[source.length][];
        for (int i = 0; i < dest.length; ++i) {
            dest[i] = new int[source[i].length];
            for (int j = 0; j < dest[i].length; ++j) {
                dest[i][j] = source[i][j];
            }
        }
        System.out.print("Mang 2 chieu sao chep duoc:");
        System.out.println(Arrays.deepToString(dest));
    }
}
