package ru.gb.may_chat.client;

import javafx.application.Platform;
import javafx.beans.value.*;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.scene.layout.VBox;
import javafx.scene.text.*;

import javax.swing.plaf.*;
import java.net.URL;
import java.util.*;

public class ChatController implements Initializable {

    @FXML
    private VBox mainPanel;

    @FXML
    private TextArea chatArea;

    @FXML
    private ListView<String> contacts;

    @FXML
    private TextField inputField;

    @FXML
    private Button btnSend;

    public void mockAction(ActionEvent actionEvent) {
        System.out.println("mock");
    }

    public void closeApplication(ActionEvent actionEvent) {
        Platform.exit();
    }

    public void sendMessage(ActionEvent actionEvent) {
        String text = inputField.getText();
        String getName = contacts.getSelectionModel().getSelectedItem();

        if (text == null || text.isBlank()) {
            return;
        }

        if (contacts.getSelectionModel().getSelectedIndices().isEmpty() || contacts.getSelectionModel().getSelectedIndices().contains(0)) {
            chatArea.appendText("Broadcast: " + text);
        } else {
            chatArea.appendText(getName + ": " + text);
        }

        chatArea.appendText(text + System.lineSeparator());
        inputField.clear();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        List<String> names = List.of("Send ALL", "Vasya", "Masha", "Petya", "Valera", "Nastya");
        contacts.setItems(FXCollections.observableList(names));
    }

}
