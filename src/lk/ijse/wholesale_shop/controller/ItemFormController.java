package lk.ijse.wholesale_shop.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.wholesale_shop.bo.BOFactory;
import lk.ijse.wholesale_shop.bo.BOType;
import lk.ijse.wholesale_shop.bo.custom.CustomerBO;
import lk.ijse.wholesale_shop.bo.custom.ItemBO;
import lk.ijse.wholesale_shop.dao.custom.ItemDAO;
import lk.ijse.wholesale_shop.dto.CustomersDTO;
import lk.ijse.wholesale_shop.dto.ItemsDTO;
import lk.ijse.wholesale_shop.view.tm.CustomerTM;
import lk.ijse.wholesale_shop.view.tm.ItemTM;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ItemFormController implements Initializable {

    public JFXButton btnBack;
    public Label txtCode;
    public JFXTextField txtPrice;
    public JFXTextField txtQTY;
    @FXML
    private AnchorPane pane;

    @FXML
    private JFXButton btnAdd;

    @FXML
    private TableView<ItemTM> table;

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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        table.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("code"));
        table.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("name"));
        table.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("price"));
        table.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("qty"));

        table.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                txtName.setText(newValue.getCode());
                txtAddress.setText(newValue.getName());
                txtCountact.setText(String.valueOf(newValue.getPrice()));
                txtDOB.setText(String.valueOf(newValue.getQty()));
            }
        });
        loadAllItems();
    }

    private void loadAllItems() {
        table.getItems().clear();
        ArrayList<ItemsDTO> allItems = itemBO.getAllItems();
        for (ItemsDTO i : allItems) {
            table.getItems().add(new ItemTM(i.getCode(), i.getName(), i.getPrice(), i.getQty()));
        }
    }
}
