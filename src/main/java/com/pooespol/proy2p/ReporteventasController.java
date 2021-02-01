/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pooespol.proy2p;

import Restaurante.Ventas;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Felipe
 */
public class ReporteventasController implements Initializable {

    @FXML
    private TextField txtFechaInicio;
    @FXML
    private TextField txtFechaFin;
    @FXML
    private Button btnBuscar;
    @FXML
    private TableView<Ventas> tblVentas;
    @FXML
    private TableColumn<Ventas, String> colFecha;
    @FXML
    private TableColumn<Ventas, Integer> colMesa;
    @FXML
    private TableColumn<Ventas, String> colMesero;
    @FXML
    private TableColumn<Ventas, String> colCuenta;
    @FXML
    private TableColumn<Ventas, String> colCliente;
    @FXML
    private TableColumn<Ventas, Double> colTotal;
    
    private ObservableList<Ventas> ventas;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       
        
        colFecha.setCellValueFactory(new PropertyValueFactory<Ventas,String>("fecha"));
        colMesa.setCellValueFactory(new PropertyValueFactory<Ventas,Integer>("mesa"));
        colMesero.setCellValueFactory(new PropertyValueFactory<Ventas,String>("mesero"));
        colCuenta.setCellValueFactory(new PropertyValueFactory<Ventas,String>("cuenta"));
        colCliente.setCellValueFactory(new PropertyValueFactory<Ventas,String>("cliente"));
        colTotal.setCellValueFactory(new PropertyValueFactory<Ventas,Double>("total"));
        
        ventas = FXCollections.observableArrayList();
        //aun falta crear un metodo para agregar los datos a la lista ventas 
        //cada vez que se concluya una venta
        
        tblVentas.setItems(ventas);
        
    }    

    @FXML
    private void buscarVentas(MouseEvent event) throws Exception {
        String fecha1 = txtFechaInicio.getText();
        String fecha2 = txtFechaFin.getText();
        
        Date d1 = new SimpleDateFormat("yyyy-MM-dd").parse(fecha1);
        Date d2 = new SimpleDateFormat("yyyy-MM-dd").parse(fecha2);
        
        long t1 = d1.getTime();
        long t2 = d2.getTime();
        
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        
        List<String> fechas = new ArrayList<String>();
        
        if(t1<t2){
            for(long i =t1; i<=t2;i+=86400000){
                fechas.add(df.format(i));
                
            }
        }
        
        for (Ventas v: ventas){
            if (!fechas.contains(v.getFecha())){
                ventas.remove(v);
                tblVentas.refresh();
            }
        }
    }
    
}
