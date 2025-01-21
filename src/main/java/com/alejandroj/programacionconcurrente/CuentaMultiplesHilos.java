
package com.alejandroj.programacionconcurrente;

import java.util.Scanner;

public class CuentaMultiplesHilos  {    
    public  void start() throws InterruptedException {
        Scanner myInput = new Scanner( System.in );
        System.out.print( "Numero de cuenta: " );
        int a = myInput.nextInt();
        
        System.out.print( "Numero de hilos: " );
        int h = myInput.nextInt();       
       
        int cuenta=0;
        Tarea hilo1;
        for(int i=0;i<h;i++){
            if(i==h-1){
                hilo1 = new Tarea(cuenta,a,"hilo "+i);     
            } else{
                hilo1 = new Tarea(cuenta,cuenta+(a/h),"hilo "+i);
            }
            hilo1.start();
            cuenta += a/h;
            hilo1.join();
        }      
    }
}
