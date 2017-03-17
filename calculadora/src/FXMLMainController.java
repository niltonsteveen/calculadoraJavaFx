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
import javafx.scene.layout.GridPane;

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
    FXMLContentViewController contentViewController=null;
    
    
    JFXDrawer drawer2;
     GridPane box;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        rootP = borderPane;
        FXMLLoader loaderGridBox;
        
        try {
            loaderGridBox = new FXMLLoader();
            loaderGridBox.setLocation(getClass().getResource("FXMLContentView.fxml"));
            box = (GridPane) loaderGridBox.load();
            drawer.setSidePane(box);
            drawer2=drawer;
            FXMLLoader loader1 = new FXMLLoader();
            loader1.setLocation(getClass().getResource("FXMLEstandarCalculator.fxml"));
            AnchorPane ap = (AnchorPane) loader1.load();
            contentViewController= loaderGridBox.getController();
            contentViewController.setPaneMain(rootP);
            contentViewController.setCalculadoraEstandar(ap);
            contentViewController.setBtnEstadoMain(btnEstado);
            
        } catch (IOException ex) {
            Logger.getLogger(FXMLMainController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        HamburgerBackArrowBasicTransition transition = new HamburgerBackArrowBasicTransition(hamburger);
        transition.setRate(-1);
        hamburger.addEventHandler(MouseEvent.MOUSE_PRESSED,(e)->{
            transition.setRate(transition.getRate()*-1);
            transition.play();
            
            if (rootP.getLeft()==null){
                drawer2.setSidePane(box);
                rootP.setLeft(drawer2);
            }else if(drawer.isShown()&&rootP.getCenter()!=null){
                rootP.setLeft(null);
            }else if(drawer.isShown()){    
                drawer.close();     
            }else if(!drawer.isShown()){
                drawer.open();       
            }
        });      
    }
    

}
