/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

/**
 * FXML Controller class
 *
 * @author nilto
 */
public class FXMLContentViewController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    private FXMain main;
    private BorderPane paneMain;
    private AnchorPane calculadoraEstandar;
    private Button btnEstadoMain;
    private boolean isClickedHam;

    public boolean isIsClickedHam() {
        return isClickedHam;
    }

    public void setIsClickedHam(boolean isClickedHam) {
        this.isClickedHam = isClickedHam;
    }
    public Button getBtnEstadoMain() {
        return btnEstadoMain;
    }

    public void setBtnEstadoMain(Button btnEstadoMain) {
        this.btnEstadoMain = btnEstadoMain;
    }
    
    
    public AnchorPane getCalculadoraEstandar() {
        return calculadoraEstandar;
    }

    public void setCalculadoraEstandar(AnchorPane calculadoraEstandar) {
        this.calculadoraEstandar = calculadoraEstandar;
    }
    
    
    public BorderPane getPaneMain() {
        return paneMain;
    }

    public void setPaneMain(BorderPane paneMain) {
        this.paneMain = paneMain;
    }
    
    
    public FXMain getMain() {
        return main;
    }

    public void setMain(FXMain main) {
        this.main = main;
    }
    
    
    
    @FXML
    private JFXButton buttonEstandar;
    

    @FXML
    void iniciarEstandar(ActionEvent event) throws Exception{
        paneMain.setLeft(null);
        paneMain.setCenter(calculadoraEstandar);
        btnEstadoMain.setText(buttonEstandar.getText());
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
