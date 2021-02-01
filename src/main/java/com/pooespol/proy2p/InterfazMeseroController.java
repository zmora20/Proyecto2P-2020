/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pooespol.proy2p;

import Restaurante.Mesas;
import Restaurante.Usuario.Mesero;
import Restaurante.restaurante;
import static com.pooespol.proy2p.App.scene;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
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
public class InterfazMeseroController implements Initializable {
    
    @FXML
    private Pane circulos;
    private final restaurante res=new restaurante();
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       ArrayList<Mesas> mesas=res.leerMesas();
        int contadorX=0;
        int contadorY=50;
        //obtenerUsuario();
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
    private void obtenerUsuario(){ 
        try { 
            FXMLLoader loader = new FXMLLoader(getClass().getResource("inicio.fxml"));
            Parent root=loader.load();
            scene.setRoot(root);
            
            InicioController mi = loader.getController();
            ArrayList<Mesero> su =mi.getMesinicio();
            for (Mesero i :su){
                System.out.println(i+"hola");
            }
        } catch (IOException ex) { 
            System.err.println(ex);
        }
    }
    
    
    

    
    
}
