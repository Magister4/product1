package org.example.demo6;

import java.io.IOException;
import java.net.URL;
import java.util.Observable;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Task {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private TextField name;

    ObservableList<String> observableList = FXCollections.observableArrayList("1","2","3");
    @FXML
    private ListView<String> list = new ListView<>(observableList);


    @FXML
    private Button next;

    @FXML
    private Button prev;

    @FXML
    private Button save1;

    @FXML
    private Button update1;


    @FXML
    void OnActionList(ActionEvent event) {

    }

    @FXML
    void OnActionNext(ActionEvent event) {
    }

    @FXML
    void OnActionPrev(ActionEvent event) throws IOException {
        Stage stage = (Stage)  next.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load() ,  600,600);
        stage.setTitle("task!");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void OnActionAdd(ActionEvent event) {
        observableList.add(name.getText());


    }

    @FXML
    void OnActionDell(ActionEvent event) {
        observableList.remove(name.getText());

    }

    @FXML
    void initialize() {
        list.setItems(observableList);
        assert list != null : "fx:id=\"list\" was not injected: check your FXML file 'task.fxml'.";
        assert name != null : "fx:id=\"name\" was not injected: check your FXML file 'task.fxml'.";
        assert next != null : "fx:id=\"next\" was not injected: check your FXML file 'task.fxml'.";
        assert prev != null : "fx:id=\"prev\" was not injected: check your FXML file 'task.fxml'.";
        assert save1 != null : "fx:id=\"save1\" was not injected: check your FXML file 'task.fxml'.";
        assert update1 != null : "fx:id=\"update1\" was not injected: check your FXML file 'task.fxml'.";

    }

}
