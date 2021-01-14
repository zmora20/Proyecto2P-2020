/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante;

import Restaurante.Usuario.*;
import com.pooespol.proy2p.App;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

/**
 *
 * @author Fabricio
 */
 
public class restaurante {
    public static ArrayList<Platos> menu;
    static String ruta = "usuarios.txt";
    static String ruta2 = "bebidas.txt";
        
    
    public ArrayList<Usuario> generarLista() throws IOException{
        ArrayList<Usuario> lista = new ArrayList<>();
        //usamos BufferedReader para leer archivos
        try{
            
            URL u = App.class.getResource(ruta);
            File file = new File(u.toURI());
            
            try(BufferedReader bf = new BufferedReader(new FileReader(file))) {
                String linea;
                //leemos el archivo liena a linea con la funcion readline
                while((linea=bf.readLine())!=null){
                    String[] partes=linea.split(";");
                    if(partes[3].equals("MESERO")){
                        Mesero mes=new Mesero(partes[0],partes[1],partes[2]);
                        lista.add(mes);
                    }else if (partes[3].equals("ADMINISTRADOR")){
                        Administrador admin=new Administrador(partes[0],partes[1],partes[2]);
                        lista.add(admin);
                    }
                }
            }
        }catch(Exception ex){
            System.out.println("Excepcion es: "+ex);
        }
        return lista;
    }
    
    
    
    
    
     public static ArrayList<Platos> leerbebidas() 
            throws IOException{
        ArrayList<Platos> bebidas = new ArrayList<>();
        //usamos BufferedReader para leer archivos
        try{
            //System.out.println("Primera partes");
            URL u = App.class.getResource(ruta2);
            File file = new File(u.toURI());
            //System.out.println("Segunda partes");
            try(BufferedReader bf = new BufferedReader(new FileReader(file))) {
                String linea;
                //leemos el archivo liena a linea con la funcion readline
                while((linea=bf.readLine())!=null){
                    //System.out.println(linea);
                    String[] partes=linea.split(";");
                    Platos plat=new Platos(partes[0],Double.parseDouble(partes[1])
                            ,partes[2]);
                    bebidas.add(plat);
                    

                }
            } 
            
        }catch(Exception ex){
            System.out.println(ex);
        }
        return bebidas;
    }
    
    
    
    }
    
    
    
    
    

