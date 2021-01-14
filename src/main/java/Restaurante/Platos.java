/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante;

/**
 *
 * @author Fabricio
 */
public class Platos {
    private String nombrePlato;
    private double precio;
    private String imagen;
    
    
    
    
    
    public Platos(String nombre,double  precio, String imagen){
        this.nombrePlato=nombre;
        this.precio=precio;
        this.imagen=imagen;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public double getPrecio() {
        return precio;
    }

    public String getImagen() {
        return imagen;
    }
    
}
