/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pooespol.proy2p;

import Restaurante.Platos;
import Restaurante.restaurante;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;


/**
 * FXML Controller class
 *
 * @author Felipe
 */
public class BebidasController implements Initializable {
    
    @FXML
    private TextField nombreBebida;
    
    @FXML
    private FlowPane x;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
<<<<<<< Updated upstream
      
=======
    }

    /*
    @FXML
    private void mostrarBebidas (ActionEvent event) {        
//obtener el elemento que fue seleccionado en el combo
        
        
        //elemino el contenido anterios del flowPane
        
        panelBebidas.getChildren().clear();
        
        /*
        //mostrar en el FlowPane panelPeliculas el nombre del genero seleccionado
        Label l = new Label(genero.getNombre());
        panelPeliculas.getChildren().add(l);
        
>>>>>>> Stashed changes
        try {
            //obtengo la lista de peliculas del genero seleccionado
            List<Platos> bebidas = restaurante.menu;
            for(Platos p: bebidas){
                VBox vboxbebida = new VBox();
                //crear la imagen
                InputStream inputImg= App.class.getResource(p.getImagen()).openStream();
                ImageView imgv = new ImageView(new Image(inputImg));
                vboxbebida.getChildren().add(imgv);
                
                //crea el label del nombre y lo agrego al VBox
                Label lnombre = new Label(p.getNombrePlato());
                vboxbebida.getChildren().add(lnombre);
                String pre=String.valueOf(p.getPrecio());
                Label lprecio = new Label(pre);
                vboxbebida.getChildren().add(lprecio);

                              
                //vboxpelicula.setPadding(new Insets(2,3,3,4));
                
                //agregamos el VBox de la pelicula al FlowPane
                x.getChildren().add(vboxbebida);
                
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        
        
        
        
        
    } 
    
    
    
}
