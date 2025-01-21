/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alejandroj.programacionconcurrente;

public class CarreraDeCoches {    
    void start(){
        Float distancia = 4024f;
        Coche cocheRojo= new Coche(distancia,69.44f,"Coche Rojo");
        Coche cocheAzul= new Coche(distancia,63.89f,"Coche Azul");
        Coche cocheAmarillo= new Coche(distancia,43.67f,"Coche Amarillo");
        Coche cocheVerde= new Coche(distancia,41.67f,"Coche Verde");

        System.out.print( "Start: " );        
        cocheRojo.start();
        cocheAzul.start();
        cocheAmarillo.start();
        cocheVerde.start();
    }
}

class Coche extends Thread {
    private float metroscircuito;
    private float velovidadCocheMs;
    private String name;
    
    @Override
    public void run() {   
        for(float i =0; i<metroscircuito; i+=velovidadCocheMs){
            System.out.print("\r" + name +": "+ i+"M/"+metroscircuito+"M"); 
        }
        
        System.out.print(name +": End");  
    }

    public Coche(float metroscircuito,float velovidadCocheMs ,String name) {
        this.metroscircuito = metroscircuito;
        this.velovidadCocheMs = velovidadCocheMs;
        this.name = name;
    }
}
