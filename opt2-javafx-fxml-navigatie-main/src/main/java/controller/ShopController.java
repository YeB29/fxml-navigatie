package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import Model.Profession;

public class ShopController implements Initializable {

    @FXML
    private ChoiceBox<String> prof;
    @FXML
    private Label label;
    @FXML
    private AnchorPane rootPane;
    String [] job = {"Farmer","Carpenter","Baker","Cleaner","Mechanic","Teacher","Nurse"};

    public void logOut(MouseEvent mouseEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/LoginScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        prof.getItems().addAll(job);
        prof.setOnAction(this::profession);
    }

    private void profession(javafx.event.ActionEvent actionEvent) {
        String job = prof.getValue();
        String label1 = ("The job " + job + " gets 10% discount on materials related to his job.");
        label.setText(label1);}

        }







