/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pooespol.proy2p;

import Restaurante.Mesas;
import Restaurante.restaurante;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 * FXML Controller class
 *
 * @author Fabricio
 */
public class InterfazAdminController implements Initializable {
    

    @FXML
    private Button OPC1;
    @FXML
    private Button OPC2;
    @FXML
    private Button OPC3;
    @FXML
    private Button OPC4;
    @FXML
    private Button OPC5;
    @FXML
    private Pane circulos;
    private static restaurante res=new restaurante();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ArrayList<Mesas> mesas=res.leerMesas();
        int contadorX=0;
        int contadorY=50;
        for (Mesas it:mesas){
            if (it.color.equals("rojo")){
                Circle c= new Circle(it.getCapacidadMesa()*9,Color.RED);
                Label l=new Label(String.valueOf(it.getNumeroMesa()));
                StackPane st=new StackPane();
                st.getChildren().addAll(c,l);
                circulos.getChildren().add(st);
                if (contadorX<4){
                    st.setLayoutX((contadorX*100)+50);
                    st.setLayoutY(contadorY);
                    contadorX++;
                }else{
                    contadorX=0;
                    contadorY=contadorY+100;
                    st.setLayoutX((contadorX*100)+50);
                    st.setLayoutY(contadorY);
                    contadorX++;
                    
                    
                }
            }else{
                Circle c= new Circle(it.getCapacidadMesa()*9,Color.YELLOW);
                Label l=new Label(String.valueOf(it.getNumeroMesa()));
                StackPane st=new StackPane();
                st.getChildren().addAll(c,l);
                
                circulos.getChildren().add(st);
                if (contadorX<=4){
                    st.setLayoutX((contadorX*100)+50);
                    st.setLayoutY(contadorY);
                    contadorX++;
                }else{
                    contadorX=0;
                    contadorY=contadorY+100;
                    st.setLayoutX((contadorX*100)+50);
                    st.setLayoutY(contadorY);
                    contadorX++;
                }
            }
            
            
        }
    }    

    @FXML
    private void consultarVentas(MouseEvent event) throws IOException {
        App.setRoot("reporteventas");
    }

    
    
}
