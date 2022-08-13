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
public class Account {

    String owner;
    long balance;

    void setAccountInfo(String owner, long balance) {
        this.owner = owner;
        this.balance = balance;
    }
}
