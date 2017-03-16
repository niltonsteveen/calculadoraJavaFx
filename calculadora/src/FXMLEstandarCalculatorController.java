/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author nilto
 */
public class FXMLEstandarCalculatorController implements Initializable {
    Utils utils;
    
    @FXML    private JFXButton num4;

    @FXML    private JFXButton num7;

    @FXML    private JFXButton num8;

    @FXML    private JFXButton operadorSum;

    @FXML    private JFXButton num3;

    @FXML    private JFXButton num2;

    @FXML    private JFXButton num1;

    @FXML    private JFXButton num6;

    @FXML    private JFXButton num5;

    @FXML    private JFXButton num9;

    @FXML    private JFXButton operadorIgual;

    @FXML    private JFXButton num0;

    @FXML    private TextField textoOperacion;

    @FXML
    void accionRealizada(ActionEvent event) {
        Button btnClickeado=(Button)event.getSource();
        String btn=btnClickeado.getId();
        switch(btn){
            case "num1":
                utils.addString(num1.getText());
                textoOperacion.setText(utils.getEntrada().toString());
                break;
            case "num2":
                utils.addString(num2.getText());
                textoOperacion.setText(utils.getEntrada().toString());
                break;
            case "num3":
                utils.addString(num3.getText());
                textoOperacion.setText(utils.getEntrada().toString());
                break;
            case "num4":
                utils.addString(num4.getText());
                textoOperacion.setText(utils.getEntrada().toString());
                break;
            case "num5":
                utils.addString(num5.getText());
                textoOperacion.setText(utils.getEntrada().toString());
                break;
            case "num6":
                utils.addString(num6.getText());
                textoOperacion.setText(utils.getEntrada().toString());
                break;
            case "num7":
                utils.addString(num7.getText());
                textoOperacion.setText(utils.getEntrada().toString());
                break;
            case "num8":
                utils.addString(num8.getText());
                textoOperacion.setText(utils.getEntrada().toString());
                break;
            case "num9":
                utils.addString(num9.getText());
                textoOperacion.setText(utils.getEntrada().toString());
                break;
            case "num0":
                utils.addString(num0.getText());
                textoOperacion.setText(utils.getEntrada().toString());
                break;
            case "operadorSum":
                utils.addString(operadorSum.getText());
                textoOperacion.setText(utils.getEntrada().toString());
                break;
            case "operadorIgual":
                String texto=utils.getEntrada().toString();
                int ocurrenciaSuma=texto.indexOf("+");
                double primerNumero=Double.parseDouble(texto.substring(0,ocurrenciaSuma));
                double segundoNumero=Double.parseDouble(texto.substring(ocurrenciaSuma+1));
                double res=utils.sumar(primerNumero, segundoNumero);
                textoOperacion.setText(String.valueOf(res));


        }
        
        
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        utils=new Utils();
    }    
    
    
}
