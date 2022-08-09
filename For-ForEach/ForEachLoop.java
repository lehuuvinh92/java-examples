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
public class ForEachLoop {

    public static void main(String[] args) {
        // create an array
        int[] numbers = {3, 9, 5, -5};

        // for each loop 
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
