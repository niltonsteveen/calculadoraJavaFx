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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author nilto
 */
public class FXMLEstandarCalculatorController implements Initializable {
    Utils utils;
    StringBuffer txtOp1=new StringBuffer();
    
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
    
    @FXML    private JFXButton borrarTodo;

    @FXML    private JFXButton accionSqrt;
    
    @FXML    private JFXButton operadorMen;
    
    @FXML    private JFXButton operadorMult;
    
    @FXML    private JFXButton operadorDiv;

    @FXML    private JFXButton accionModulo;
    
    @FXML    private JFXButton borrarUltimo;
    
    @FXML    private JFXButton accionDecimal;
    
    @FXML    private TextField textoOperacion1;
    
    @FXML    private JFXButton borrarUltimaEntrada;
    
    @FXML
    void accionRealizada(ActionEvent event) {
        Button btnClickeado=(Button)event.getSource();
        String btn=btnClickeado.getId();
        switch(btn){
            case "num1":
                utils.addString(num1.getText());
                txtOp1.append(num1.getText());
                textoOperacion1.setText(txtOp1.toString());
                break;
            case "num2":
                utils.addString(num2.getText());
                txtOp1.append(num2.getText());
                textoOperacion1.setText(txtOp1.toString());
                break;
            case "num3":
                utils.addString(num3.getText());
                txtOp1.append(num3.getText());
                textoOperacion1.setText(txtOp1.toString());
                break;
            case "num4":
                utils.addString(num4.getText());
                txtOp1.append(num4.getText());
                textoOperacion1.setText(txtOp1.toString());
                break;
            case "num5":
                utils.addString(num5.getText());
                txtOp1.append(num5.getText());
                textoOperacion1.setText(txtOp1.toString());
                break;
            case "num6":
                utils.addString(num6.getText());
                txtOp1.append(num6.getText());
                textoOperacion1.setText(txtOp1.toString());
                break;
            case "num7":
                utils.addString(num7.getText());
                txtOp1.append(num7.getText());
                textoOperacion1.setText(txtOp1.toString());
                break;
            case "num8":
                utils.addString(num8.getText());
                txtOp1.append(num8.getText());
                textoOperacion1.setText(txtOp1.toString());
                break;
            case "num9":
                utils.addString(num9.getText());
                txtOp1.append(num9.getText());
                textoOperacion1.setText(txtOp1.toString());
                break;
            case "num0":
                utils.addString(num0.getText());
                txtOp1.append(num0.getText());
                textoOperacion1.setText(txtOp1.toString());
                break;
            case "operadorSum":
                if(!Character.isDigit(utils.getEntrada().charAt(utils.getEntrada().length()-1))){
                    utils.getEntrada().replace(utils.getEntrada().length()-1, utils.getEntrada().length(), "+");
                    textoOperacion.setText(utils.getEntrada().toString());
                    utils.operar(txtOp1.toString(),operadorSum.getText());
                    if(utils.isIsZero()){
                        textoOperacion.setText("No se puede dividir por Cero");
                        textoOperacion1.setText("");
                        utils.setEntrada(null);
                    }
                }else if(utils.numOperandos()>0){
                    int subs=(utils.getEntrada().length())-(txtOp1.length()+1);
                    utils.operar(txtOp1.toString(), (utils.getEntrada().substring(subs,subs+1)));
                    utils.addString(operadorSum.getText());
                    textoOperacion.setText(utils.getEntrada().toString());
                    textoOperacion1.setText(String.valueOf(utils.getResultado()));
                    txtOp1.delete(0, txtOp1.length());
                    if(utils.isIsZero()){
                        textoOperacion.setText("No se puede dividir por Cero");
                        textoOperacion1.setText("");
                        utils.setEntrada(null);
                    }
                }else{
                    utils.addString(operadorSum.getText());
                    textoOperacion.setText(utils.getEntrada().toString());
                    utils.operar(txtOp1.toString(),operadorSum.getText());
                    textoOperacion1.setText(String.valueOf(utils.getResultado()));
                    txtOp1.delete(0, txtOp1.length());
                    if(utils.isIsZero()){
                        textoOperacion.setText("No se puede dividir por Cero");
                        textoOperacion1.setText("");
                        utils.setEntrada(null);
                    }
                }
                break;
            case "operadorMen":
                if(!Character.isDigit(utils.getEntrada().charAt(utils.getEntrada().length()-1))){
                    utils.getEntrada().replace(utils.getEntrada().length()-1, utils.getEntrada().length(), "-");
                    textoOperacion.setText(utils.getEntrada().toString());
                    utils.operar(txtOp1.toString(),operadorMen.getText());
                    if(utils.isIsZero()){
                        textoOperacion.setText("No se puede dividir por Cero");
                        textoOperacion1.setText("");
                        utils.setEntrada(null);
                    }
                }else if(utils.numOperandos()>0){
                    int subs=(utils.getEntrada().length())-(txtOp1.length()+1);
                    utils.operar(txtOp1.toString(), (utils.getEntrada().substring(subs,subs+1)));
                    utils.addString(operadorMen.getText());
                    textoOperacion.setText(utils.getEntrada().toString());
                    textoOperacion1.setText(String.valueOf(utils.getResultado()));
                    txtOp1.delete(0, txtOp1.length());
                    if(utils.isIsZero()){
                        textoOperacion.setText("No se puede dividir por Cero");
                        textoOperacion1.setText("");
                        utils.setEntrada(null);
                    }
                }else{
                    utils.addString(operadorMen.getText());
                    textoOperacion.setText(utils.getEntrada().toString());
                    utils.operar(txtOp1.toString(),operadorMen.getText());
                    textoOperacion1.setText(String.valueOf(utils.getResultado()));
                    txtOp1.delete(0, txtOp1.length());
                    if(utils.isIsZero()){
                        textoOperacion.setText("No se puede dividir por Cero");
                        textoOperacion1.setText("");
                        utils.setEntrada(null);
                    }
                }     
                break;
            case "operadorMult":
                if(!Character.isDigit(utils.getEntrada().charAt(utils.getEntrada().length()-1))){
                    utils.getEntrada().replace(utils.getEntrada().length()-1, utils.getEntrada().length(), "*");
                    textoOperacion.setText(utils.getEntrada().toString());
                    utils.operar(txtOp1.toString(),operadorMult.getText());
                }else if(utils.numOperandos()>0){
                    int subs=(utils.getEntrada().length())-(txtOp1.length()+1);
                    utils.operar(txtOp1.toString(), (utils.getEntrada().substring(subs,subs+1)));
                    utils.addString(operadorMult.getText());
                    textoOperacion.setText(utils.getEntrada().toString());
                    textoOperacion1.setText(String.valueOf(utils.getResultado()));
                    txtOp1.delete(0, txtOp1.length());
                }else{
                    utils.addString(operadorMult.getText());
                    textoOperacion.setText(utils.getEntrada().toString());
                    utils.operar(txtOp1.toString(),operadorMult.getText());
                    textoOperacion1.setText(String.valueOf(utils.getResultado()));
                    txtOp1.delete(0, txtOp1.length());
                }     
                break;
            case "operadorDiv":
                if(!Character.isDigit(utils.getEntrada().charAt(utils.getEntrada().length()-1))){
                    utils.getEntrada().replace(utils.getEntrada().length()-1, utils.getEntrada().length(), "/");
                    textoOperacion.setText(utils.getEntrada().toString());
                    utils.operar(txtOp1.toString(),operadorDiv.getText());
                    if(utils.isIsZero()){
                        textoOperacion.setText("No se puede dividir por Cero");
                        textoOperacion1.setText("");
                        utils.setEntrada(null);
                    }
                }else if(utils.numOperandos()>0){
                    int subs=(utils.getEntrada().length())-(txtOp1.length()+1);
                    utils.operar(txtOp1.toString(), (utils.getEntrada().substring(subs,subs+1)));
                    if(utils.isIsZero()){
                        textoOperacion.setText("No se puede dividir por Cero");
                        textoOperacion1.setText("");
                        utils.setEntrada(null);
                    }else{
                        utils.addString(operadorDiv.getText());
                        textoOperacion.setText(utils.getEntrada().toString());
                        textoOperacion1.setText(String.valueOf(utils.getResultado()));
                        txtOp1.delete(0, txtOp1.length());
                        
                    }
                }else{
                    utils.addString(operadorDiv.getText());
                    textoOperacion.setText(utils.getEntrada().toString());
                    utils.operar(txtOp1.toString(),operadorDiv.getText());
                    if(utils.isIsZero()){
                        textoOperacion.setText("No se puede dividir por Cero");
                        textoOperacion1.setText("");
                        utils.setEntrada(null);
                    }else{
                        textoOperacion1.setText(String.valueOf(utils.getResultado()));
                        txtOp1.delete(0, txtOp1.length());
                    }
                }     
                break;  
            case "operadorIgual":
               if(!Character.isDigit(utils.getEntrada().charAt(utils.getEntrada().length()-1))){
                    utils.getEntrada().deleteCharAt(utils.getEntrada().length()-1);
                    textoOperacion.setText("");
                    textoOperacion1.setText(String.valueOf(utils.getResultado()));
                }else if(utils.numOperandos()>0){
                    int subs=(utils.getEntrada().length())-(txtOp1.length()+1);
                    utils.operar(txtOp1.toString(), (utils.getEntrada().substring(subs,subs+1)));
                    textoOperacion.setText("");
                    textoOperacion1.setText(String.valueOf(utils.getResultado()));
                    utils.getEntrada().delete(0, utils.getEntrada().length());
                    utils.getEntrada().append(textoOperacion1.getText());
                    txtOp1.delete(0, txtOp1.length());
                }    
                break;
                
            case "borrarUltimo":
                int longitud=txtOp1.length();
                int resta=utils.getEntrada().length()-longitud;
                txtOp1.delete(0, txtOp1.length());
                textoOperacion1.setText("");
                utils.getEntrada().delete(resta, utils.getEntrada().length());
                break;
                
            case "borrarTodo":
                txtOp1.delete(0, txtOp1.length());
                textoOperacion.setText("");
                textoOperacion1.setText("");
                utils.getEntrada().delete(0, utils.getEntrada().length());
                utils.setResultado(0);
                break;
            case "borrarUltimaEntrada":
                txtOp1.deleteCharAt(txtOp1.length()-1);
                textoOperacion1.setText(txtOp1.toString());
                utils.getEntrada().deleteCharAt(utils.getEntrada().length()-1);
                
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
