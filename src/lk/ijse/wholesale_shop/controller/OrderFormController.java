package lk.ijse.wholesale_shop.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class OrderFormController {

    @FXML
    private AnchorPane pane;

    @FXML
    private TableView<?> table;

    @FXML
    private TableColumn<?, ?> cName;

    @FXML
    private TableColumn<?, ?> cDOB;

    @FXML
    private TableColumn<?, ?> cAddress;

    @FXML
    private TableColumn<?, ?> cCountact;

    @FXML
    private JFXButton btnPlaceOrder;

    @FXML
    private JFXButton btnBack;

    @FXML
    private JFXComboBox<?> cmbItem;

    @FXML
    private Label lblCustomerName;

    @FXML
    private Label lblOID;

    @FXML
    private JFXComboBox<?> cmbCustomer;

    @FXML
    private Label lblItemName;

    @FXML
    private JFXTextField lblQTY;

    @FXML
    private JFXButton btnADD;

    @FXML
    private Label lblTotale;

    @FXML
    private Label lblPrice;

    @FXML
    void btnAddOnAction(ActionEvent event) {

    }

    @FXML
    void btnBackOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) pane.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader
                .load(getClass().getResource("/lk/ijse/wholesale_shop/view/HomeForm.fxml"))));
        stage.centerOnScreen();
    }

    @FXML
    void btnPlaceOrderOnAction(ActionEvent event) {

    }

}
