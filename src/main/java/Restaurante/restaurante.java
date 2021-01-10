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
import java.io.FileNotFoundException;
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
        
    
    public ArrayList<Usuario> generarLista() throws IOException{
        ArrayList<Usuario> lista = new ArrayList<>();
        //usamos BufferedReader para leer archivos
        try{
            
            URL u = App.class.getResource(ruta);
            File file = new File(u.toURI());
            System.out.println("URL: "+u);
            System.out.println("Archivo: "+file);
            
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
                        }else{
                        System.out.println("AQUI ERR");
                    }
                }
            }
        }catch(Exception ex){
            System.out.println("Excepcion es: "+ex);
        }
        return lista;
    }
    
}
