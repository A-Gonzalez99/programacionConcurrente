
package com.alejandroj.programacionconcurrente;

public class CuatroHilosOrdenados {
    public void start() throws InterruptedException {
        for(int i =0; i<10;i++) {
            Hilo hilo = new Hilo("Hilo "+ i);
            hilo.start();
            hilo.join();
        }
    }    
}

class Hilo extends Thread {  
    String nombre;
    public Hilo(String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public void run() {
        System.out.print(nombre+": ");   
        for(int i =0; i<10;i++){
            System.out.print(i+", ");   
        }
        System.out.println();   
        System.out.println(nombre+" Finalizado.");   
    }
}