package lk.ijse.wholesale_shop.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.wholesale_shop.bo.BOFactory;
import lk.ijse.wholesale_shop.bo.BOType;
import lk.ijse.wholesale_shop.bo.SupperBO;
import lk.ijse.wholesale_shop.bo.custom.CustomerBO;
import lk.ijse.wholesale_shop.dto.CustomersDTO;

import java.io.IOException;

public class CustomerFormController {

    public JFXDatePicker txtDOB;
    public JFXButton btnBack;
    @FXML
    private AnchorPane pane;

    @FXML
    private JFXButton btnAdd;

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
    private JFXButton btnUpdate;

    @FXML
    private JFXButton btnDelete;

    @FXML
    private JFXTextField txtCountact;

    @FXML
    private JFXTextField txtName;


    @FXML
    private JFXTextArea txtAddress;
    CustomerBO customerBO= (CustomerBO) BOFactory.getInstance().getBOType(BOType.CUSTOMER);
    @FXML
    void btnAddOnAction(ActionEvent event) {
        CustomersDTO dto = new CustomersDTO(
                txtName.getText(),
                txtDOB.getValue(),
                txtCountact.getText(),
                txtAddress.getText()
        );
        customerBO.save(dto);

    }

    @FXML
    void btnDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) pane.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader
                .load(getClass().getResource("/lk/ijse/wholesale_shop/view/HomeForm.fxml"))));
        stage.centerOnScreen();
    }
}
