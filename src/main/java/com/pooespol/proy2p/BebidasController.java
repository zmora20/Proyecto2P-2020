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
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
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
    @FXML
    private Label cliente;
    @FXML
    private TextField txtBuscar;
    @FXML
    private VBox venta;
    @FXML
    private AnchorPane resultado;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        try {
              ArrayList<Platos> bebida= restaurante.leerbebidas();
            for(Platos p: bebida){
                VBox hboxbebida = new VBox();
                //crear la imagen
                InputStream inputImg= App.class.getResource(p.getImagen()).openStream();
                ImageView imgv = new ImageView(new Image(inputImg));
                hboxbebida.getChildren().add(imgv);
                
                Label lnombre = new Label("Nombre: " + p.getNombrePlato());
                hboxbebida.getChildren().add(lnombre);
                Label lprecio = new Label("Precio : " + 
                        String.valueOf(p.getPrecio()));
                hboxbebida.getChildren().add(lprecio);
                
                hboxbebida.setPadding(new Insets(21,20,21,20));
                
                
                panelbebidas.getChildren().add(hboxbebida);
               imgv.setOnMouseClicked((MouseEvent event) -> {
                    mostrarPrecios(p);
                   
                                           
               });
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } 
        
        
       
        
    }  
     public void mostrarPrecios(Platos p){
         ArrayList<Platos> suma= new ArrayList<>();
         suma.add(p);
          double total=0;
       for (Platos pe:suma){ 
           double precio=pe.getPrecio();
           total=total + precio;
           
       }
       
       
       String nom=p.getNombrePlato();
       Label lp=new Label("Precio: "+p.getPrecio() );
       lp.setAlignment(Pos.TOP_RIGHT);
       Label ln=new Label("Nombre Plato: "+nom);
       Label lt=new Label ("Total: "+total);  
       VBox vboxtotal=new VBox(lp,ln,lt);       
       venta.getChildren().add(vboxtotal);
       
       
     }
    
}
