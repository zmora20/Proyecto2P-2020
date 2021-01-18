/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante;

import Restaurante.Usuario.*;

/**
 *
 * @author Fabricio
 */
public class Mesas {
    public String color;
    private int numeroMesa;
    private int capacidadMesa;
    public String mesero;
    public Mesas(String color,int numMesa,int Capacidad,String meses ){
        this.color=color;
        this.capacidadMesa=Capacidad;
        this.numeroMesa=numMesa;
        meses=mesero;
    }
    public Mesas(String color,int numMesa,int Capacidad ){
        this.color=color;
        this.capacidadMesa=Capacidad;
        this.numeroMesa=numMesa;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public int getCapacidadMesa() {
        return capacidadMesa;
    }
    
}
