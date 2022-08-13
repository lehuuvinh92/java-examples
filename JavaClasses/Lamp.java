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
class Lamp {

    boolean isOn;

    // method to turn on the light
    void turnOn() {
        isOn = true;
        System.out.println("Light on? " + isOn);
    }

    // method to turnoff the light
    void turnOff() {
        isOn = false;
        System.out.println("Light on? " + isOn);
    }
}

class Main {

    public static void main(String[] args) {
        //tạo các đối tượng led và halogen
        Lamp led = new Lamp();
        Lamp halogen = new Lamp();

        led.turnOn();
        halogen.turnOff();
    }
}