/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pooespol.proy2p;
import Restaurante.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
/**
 * FXML Controller class
 *
 * @author Fabricio
 */
public class MesasController implements Initializable {
    private static restaurante res=new restaurante();


    @FXML
    private Label comensales;
    @FXML
    private Label facturado;
    @FXML
    private Pane circulos;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ArrayList<Mesas> mesas=res.leerMesas();
        int contadorX=0;
        int contadorY=0;
        for (Mesas it:mesas){
            //System.out.println(it.color);
            if (it.color.equals("rojo")){
                Circle c= new Circle(it.getCapacidadMesa()*10,Color.RED);
                Label l=new Label(String.valueOf(it.getNumeroMesa()));
                StackPane st=new StackPane();
                st.getChildren().addAll(c,l);
                circulos.getChildren().add(st);
                st.setLayoutX(contadorX*10);
                st.setLayoutY(contadorY*10);
                contadorX++;
                contadorY++;
            }else{
                Circle c= new Circle(it.getCapacidadMesa()*10,Color.YELLOW);
                Label l=new Label(String.valueOf(it.getNumeroMesa()));
                StackPane st=new StackPane();
                st.getChildren().addAll(c,l);
                
                circulos.getChildren().add(st);
                st.setLayoutX(contadorX*20);
                st.setLayoutY(contadorY*100);
                contadorX++;
                contadorY++;
            }
            
            
        }
        // TODO
    }    
    
}
