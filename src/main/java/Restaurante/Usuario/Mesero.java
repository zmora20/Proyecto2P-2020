/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante.Usuario;

/**
 *
 * @author zaida
 */
public class Mesero extends Usuario{
    private String nombreMesero;
    
    
    public Mesero(String correoElectronico,String contrasenia,String nombre){
        super(correoElectronico,contrasenia);
        this.nombreMesero=nombre;
    }

    public String getNombreMesero() {
        return nombreMesero;
    }
    
}
