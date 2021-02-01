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
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author zaida
 */
public class BebidasController implements Initializable {

    @FXML
    private FlowPane panelbebidas;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        try {
              ArrayList<Platos> bebida= restaurante.leerbebidas();
            for(Platos p: bebida){
                HBox hboxbebida = new HBox();
                //crear la imagen
                InputStream inputImg= App.class.getResource(p.getImagen()).openStream();
                ImageView imgv = new ImageView(new Image(inputImg));
                hboxbebida.getChildren().add(imgv);
                
                Label lnombre = new Label(p.getNombrePlato());
                hboxbebida.getChildren().add(lnombre);
                Label lprecio = new Label(String.valueOf(p.getPrecio()));
                hboxbebida.getChildren().add(lprecio);
                
                hboxbebida.setPadding(new Insets(21,0,21,0));
                
                
                panelbebidas.getChildren().add(hboxbebida);
                
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } 
        
        
        
        
    }    
    
}
