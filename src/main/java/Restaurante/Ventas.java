/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante;

import Restaurante.Usuario.Mesero;
import java.util.ArrayList;

/**
 *
 * @author Felipe
 */
public class Ventas {
    private String fecha;
    private Mesas mesa;
    private Mesero mesero;
    private String numeroCuenta;
    private double total;

    public Ventas(String fecha, Mesas mesa, Mesero mesero, String numeroCuenta, double total) {
        this.fecha = fecha;
        this.mesa = mesa;
        this.mesero = mesero;
        this.numeroCuenta = numeroCuenta;
        this.total = total;
    }
    

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Mesas getMesa() {
        return mesa;
    }

    public void setMesa(Mesas mesa) {
        this.mesa = mesa;
    }

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    
    
    
    
}
