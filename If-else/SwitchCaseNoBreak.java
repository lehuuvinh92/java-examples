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
public class SwitchCaseNoBreak {

    public static void main(String[] args) {
        int expression = 2;
        // switch statement to check size
        switch (expression) {
            case 1:
                System.out.println("Case 1");
            // matching case
            case 2:
                System.out.println("Case 2");

            case 3:
                System.out.println("Case 3");
            default:
                System.out.println("Default case");
        }
    }
}
