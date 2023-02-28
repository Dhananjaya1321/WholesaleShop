package lk.ijse.wholesale_shop.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
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
import lk.ijse.wholesale_shop.bo.BOFactory;
import lk.ijse.wholesale_shop.bo.BOType;
import lk.ijse.wholesale_shop.bo.custom.CustomerBO;
import lk.ijse.wholesale_shop.bo.custom.ItemBO;
import lk.ijse.wholesale_shop.dto.CustomersDTO;
import lk.ijse.wholesale_shop.dto.ItemsDTO;

import java.io.IOException;

public class ItemFormController {

    public JFXButton btnBack;
    public Label txtCode;
    public JFXTextField txtPrice;
    public JFXTextField txtQTY;
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
    private JFXTextField txtDOB;

    @FXML
    private JFXTextArea txtAddress;
    ItemBO itemBO = (ItemBO) BOFactory.getInstance().getBOType(BOType.ITEM);

    @FXML
    void btnAddOnAction(ActionEvent event) {
        ItemsDTO dto = new ItemsDTO(
                txtCode.getText(),
                txtName.getText(),
                Double.parseDouble(txtPrice.getText()),
                Integer.parseInt(txtQTY.getText())
        );
        itemBO.save(dto);
    }

    @FXML
    void btnDeleteOnAction(ActionEvent event) {
        ItemsDTO dto = new ItemsDTO(
                txtCode.getText(),
                txtName.getText(),
                Double.parseDouble(txtPrice.getText()),
                Integer.parseInt(txtQTY.getText())
        );
        itemBO.delete(dto);
    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {
        ItemsDTO dto = new ItemsDTO(
                txtCode.getText(),
                txtName.getText(),
                Double.parseDouble(txtPrice.getText()),
                Integer.parseInt(txtQTY.getText())
        );
        itemBO.update(dto);
    }

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) pane.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader
                .load(getClass().getResource("/lk/ijse/wholesale_shop/view/HomeForm.fxml"))));
        stage.centerOnScreen();
    }
}
