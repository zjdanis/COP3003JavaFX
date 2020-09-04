import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label lblOutput;

    public void addProduct() {
        System.out.println("Product Added");
    }

    public void recordProd() {
        System.out.println("Product Recorded");
    }

}