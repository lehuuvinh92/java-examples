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
import java.io.*;

class ThrowsAndThrow {

    public static void findFile() throws IOException {
        //code that may produce IOException
        File newFile = new File("test.txt");
        if (newFile.exists() && !newFile.isDirectory()) {
            // do something
        } else {
            throw new IOException("File not found");
        }
    }

    public static void main(String[] args) {
        try {
            findFile();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}