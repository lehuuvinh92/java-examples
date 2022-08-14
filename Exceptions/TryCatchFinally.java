/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gochocit.examples;

import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author LHVINH
 */
public class TryCatchFinally {

    public static void main(String args[]) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("D:\\test.txt");
            // do something
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
