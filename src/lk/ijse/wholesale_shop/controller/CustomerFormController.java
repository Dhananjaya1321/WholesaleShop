package lk.ijse.wholesale_shop.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.wholesale_shop.bo.BOFactory;
import lk.ijse.wholesale_shop.bo.BOType;
import lk.ijse.wholesale_shop.bo.SupperBO;
import lk.ijse.wholesale_shop.bo.custom.CustomerBO;
import lk.ijse.wholesale_shop.dto.CustomersDTO;
import lk.ijse.wholesale_shop.view.tm.CustomerTM;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class CustomerFormController implements Initializable {

    public JFXDatePicker txtDOB;
    public JFXButton btnBack;
    @FXML
    private AnchorPane pane;

    @FXML
    private JFXButton btnAdd;

    @FXML
    private TableView<CustomerTM> table;

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
    CustomerBO customerBO = (CustomerBO) BOFactory.getInstance().getBOType(BOType.CUSTOMER);

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
        CustomersDTO dto = new CustomersDTO(
                txtName.getText(),
                txtDOB.getValue(),
                txtCountact.getText(),
                txtAddress.getText()
        );
        customerBO.delete(dto);
    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {
        CustomersDTO dto = new CustomersDTO(
                txtName.getText(),
                txtDOB.getValue(),
                txtCountact.getText(),
                txtAddress.getText()
        );
        customerBO.update(dto);
    }

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) pane.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader
                .load(getClass().getResource("/lk/ijse/wholesale_shop/view/HomeForm.fxml"))));
        stage.centerOnScreen();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        table.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("name"));
        table.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("dob"));
        table.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("contact"));
        table.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("address"));

        table.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            btnDelete.setDisable(newValue == null);
            btnUpdate.setDisable(newValue == null);

            if (newValue != null) {
                txtName.setText(newValue.getName());
                txtAddress.setText(newValue.getAddress());
                txtCountact.setText(newValue.getContact());
                txtDOB.setValue(newValue.getDob());

            }
        });
        loadAllCustomers();
    }

    private void loadAllCustomers() {
        table.getItems().clear();
        ArrayList<CustomersDTO> allCustomers = customerBO.getAllCustomers();
        for (CustomersDTO c : allCustomers) {
            table.getItems().add(new CustomerTM(c.getName(), c.getDob(), c.getContact(), c.getAddress()));
        }
    }

}
