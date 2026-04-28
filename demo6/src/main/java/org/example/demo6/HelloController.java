package org.example.demo6;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField name;

    @FXML
    private Button next;

    @FXML
    private TextField password;

    @FXML
    private Button save;

    @FXML
    private Button update;

    @FXML
    void OnActionNext(ActionEvent event) throws IOException {
        Stage stage = (Stage)  next.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("task.fxml"));
        Scene scene = new Scene(fxmlLoader.load() ,  600,400);
        stage.setTitle("task!");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void OnActionSave(ActionEvent event) {

    }

    @FXML
    void OnActionUpdate(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert name != null : "fx:id=\"name\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert next != null : "fx:id=\"next\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert password != null : "fx:id=\"password\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert save != null : "fx:id=\"save\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert update != null : "fx:id=\"update\" was not injected: check your FXML file 'hello-view.fxml'.";

    }

}
