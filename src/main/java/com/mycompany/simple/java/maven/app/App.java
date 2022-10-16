/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simple.java.maven.app;

/**
 *
 * @author 0019324
 */
public class App {
 
    private final String message = "Hello World Maven Pipeline!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }    
}
