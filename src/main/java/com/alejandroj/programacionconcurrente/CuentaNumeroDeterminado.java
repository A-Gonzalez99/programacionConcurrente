/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alejandroj.programacionconcurrente;

import java.io.Console;
import java.util.Scanner;
/**
 *
 * @author Alejandro
 */
public class CuentaNumeroDeterminado  {    
    public  void start() throws InterruptedException {
        Scanner myInput = new Scanner( System.in );
        System.out.print( "Enter first integer: " );
        int a = myInput.nextInt();

        Tarea hilo1 = new Tarea(0,a/2,"hilo 1");
        Tarea hilo2 = new Tarea(a/2,a,"hilo 2");

        hilo1.start();
        hilo1.join();

        hilo2.start();
        hilo2.join();
    }
}

class Tarea extends Thread {
    private int numMin;
    private int numMax;
    private String name;
    
    @Override
    public void run() {
        for (int i = numMin; i < numMax; i++) {
            System.out.println(name+": "+i);
        }
    }

    public Tarea(int numMin, int numMax, String name) {
        this.numMin = numMin;
        this.numMax = numMax;
        this.name = name;
    }
}
