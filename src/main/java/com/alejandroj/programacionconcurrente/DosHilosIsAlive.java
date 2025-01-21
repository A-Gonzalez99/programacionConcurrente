package com.alejandroj.programacionconcurrente;

public class DosHilosIsAlive {   
    public void start(){
        HiloPrincipal tareaPrincipal = new HiloPrincipal();
        Thread hiloPrincipal = new Thread(tareaPrincipal);

        HiloSecundario tareaAlive = new HiloSecundario(hiloPrincipal);
        Thread hiloAlive = new Thread(tareaAlive);

        hiloPrincipal.start();
        hiloAlive.start();
    }
}

class HiloPrincipal extends Thread {  
    @Override
    public void run() {
        for(int i =0; i<25;i++){
            System.out.println("Hilo 2: "+i);   
        }
    }
}

class HiloSecundario extends Thread {      
    private Thread otroHilo; 
    public HiloSecundario(Thread otroHilo) {
        this.otroHilo = otroHilo;
    }
    
    public void run() {
        while (otroHilo.isAlive()) {
          System.out.println("Yo hago cosas mientras el otro hilo siga en ejecución");         
        }
        System.out.println("El otro hilo ha terminado. Yo también");
    }
}
