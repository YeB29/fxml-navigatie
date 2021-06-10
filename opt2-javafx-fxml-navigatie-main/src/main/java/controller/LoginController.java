package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import Model.Login;


public class LoginController implements Initializable {


    @FXML
    private Button loginbutton;
    @FXML
    private Label wrongLogin;
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button signUp;
    @FXML
    private Button admin;
    @FXML
    private AnchorPane rootPane;

    public void login(MouseEvent mouseEvent) throws IOException {
        checkLogin();
    }
    public void checkLogin() throws IOException{
         if(usernameField.getText().equals("Younes") && passwordField.getText().equals("123")) {
             AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/HomeScreen.fxml"));
             rootPane.getChildren().setAll(pane);
         }
             else if(usernameField.getText().isEmpty() && passwordField.getText().isEmpty()) {
                 wrongLogin.setText("Please enter your data.");
             }
             else {
             wrongLogin.setText("Wrong username or password.");
         }

         }


    public void signUp(MouseEvent mouseEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/SignUp.fxml"));
        rootPane.getChildren().setAll(pane);
    }
    public void admin(MouseEvent mouseEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/AdminLogin.fxml"));
        rootPane.getChildren().setAll(pane);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Login login = new Login(usernameField.getText().toString(),passwordField.getText().toString());
    }
}
