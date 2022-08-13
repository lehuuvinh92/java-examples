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
public class MethodReturn2DimensionalArray {

    public static int[][] initMatrix(int row, int col) {
        int[][] matrix = new int[row][col];
        matrix[0][0] = 1;
        matrix[0][1] = 0;
        matrix[0][2] = 0;
        matrix[0][3] = 0;
        matrix[1][0] = 0;
        matrix[1][1] = 1;
        matrix[1][2] = 0;
        matrix[1][3] = 0;
        matrix[2][0] = 0;
        matrix[2][1] = 0;
        matrix[2][2] = 1;
        matrix[2][3] = 0;
        return matrix;
    }

    public static void main(String[] args) {
        int row = 3;
        int col = 4;
        int[][] matrix;
        matrix = initMatrix(row, col);
        System.out.println("Matrix duoc khoi tao:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
