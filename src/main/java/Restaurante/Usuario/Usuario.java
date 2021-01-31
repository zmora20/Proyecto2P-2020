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
public class Usuario {
    private String nombre;
    private String correoElectronico;
    private String contrasenia;

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getContrasenia() {
        return contrasenia;
    }
    public String getNombreMesero() {
        return nombre;
    }
    public Usuario(String correo,String contra,String nombre){
        this.contrasenia=contra;
        this.correoElectronico=correo;
        this.nombre=nombre;
    }
    
    
}
