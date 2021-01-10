/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pooespol.proy2p;

import Restaurante.*;
import Restaurante.Usuario.*;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author zaida
 */
public class InicioController implements Initializable {

    @FXML
    private TextField txtUsuario;
    @FXML
    private PasswordField txtContra;
    @FXML
    private Button Inicio;
    restaurante res=new restaurante();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    

    @FXML
    private void inicioSesion(MouseEvent event) throws IOException {
        
        String usuario=txtUsuario.getText();
        String Contrase=txtContra.getPromptText();
        ArrayList<Usuario> lista=res.generarLista();
        for (Usuario usu:lista){
            if(usuario.equals(usu.getCorreoElectronico())&& Contrase.equals(usu.getContrasenia())){
                if (usu instanceof Administrador){
                    App.setRoot("InterfazAdmin");
                }
                
            }
        }
        
    }
    
}
