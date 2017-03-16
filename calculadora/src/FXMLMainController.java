import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class FXMLMainController implements Initializable{

    @FXML
    private BorderPane borderPane;

    @FXML
    private JFXButton btnEstado;
    
    @FXML
    private JFXHamburger hamburger;

    @FXML
    private JFXDrawer drawer;

    public static BorderPane rootP;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        rootP = borderPane;
        FXMLLoader loaderVbox=null;
        try {
            loaderVbox = new FXMLLoader();
            loaderVbox.setLocation(getClass().getResource("FXMLContentView.fxml"));
            VBox box = (VBox) loaderVbox.load();
            drawer.setSidePane(box);
        } catch (IOException ex) {
            Logger.getLogger(FXMLMainController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        HamburgerBackArrowBasicTransition transition = new HamburgerBackArrowBasicTransition(hamburger);
        transition.setRate(-1);
        hamburger.addEventHandler(MouseEvent.MOUSE_PRESSED,(e)->{
            transition.setRate(transition.getRate()*-1);
            transition.play();
            
            if(drawer.isShown())
            {
                drawer.close();
            }else
                drawer.open();
        });

        
       
        try { 
            FXMLLoader loader1 = new FXMLLoader();
            loader1.setLocation(getClass().getResource("FXMLEstandarCalculator.fxml"));
            AnchorPane ap = (AnchorPane) loader1.load();
            FXMLContentViewController contentViewController= loaderVbox.getController();
            contentViewController.setPaneMain(rootP);
            contentViewController.setCalculadoraEstandar(ap);
            contentViewController.setBtnEstadoMain(btnEstado);
        } catch (IOException ex) {
            Logger.getLogger(FXMLMainController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    

}
