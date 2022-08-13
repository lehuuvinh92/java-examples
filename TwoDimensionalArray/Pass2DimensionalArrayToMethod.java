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
public class Pass2DimensionalArrayToMethod {

    public static void changeMatrix(int[][] arr) {
        arr[0][0] = 1;
        arr[0][1] = 0;
        arr[0][2] = 0;
        arr[0][3] = 0;
        arr[1][0] = 0;
        arr[1][1] = 1;
        arr[1][2] = 0;
        arr[1][3] = 0;
        arr[2][0] = 0;
        arr[2][1] = 0;
        arr[2][2] = 1;
        arr[2][3] = 0;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 0},
            {4, 5, 6, 9},
            {7, 2, 5, 5}
        };
        System.out.println("Matrix truoc khi goi ham changeMatrix():");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        changeMatrix(matrix);
        System.out.println("Matrix sau khi goi ham changeMatrix():");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }
}
