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
public class SwitchCaseWithBreak {

    public static void main(String[] args) {
        int number = 44;
        String size;
        // switch statement to check size
        switch (number) {
            case 29:
                size = "Small";
                break;
            case 42:
                size = "Medium";
                break;
            // match the value of week
            case 44:
                size = "Large";
                break;
            case 48:
                size = "Extra Large";
                break;

            default:
                size = "Unknown";
                break;
        }
        System.out.println("Size: " + size);
    }
}
