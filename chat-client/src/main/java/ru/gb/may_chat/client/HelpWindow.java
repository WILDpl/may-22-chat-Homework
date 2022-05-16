package ru.gb.may_chat.client;

import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import java.awt.*;
import java.util.*;

public class HelpWindow {

    public static void newWindow() {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);

        Pane pane = new Pane();
        Scene scene = new Scene(pane, 330, 200);

        Label label = new Label();
        label.setPrefSize(scene.widthProperty().getValue(), pane.heightProperty().getValue());
        label.setLayoutX(5);
        label.setLayoutY(5);
//        StackPane.setAlignment(label, Pos.BASELINE_CENTER);
//        label.setTextAlignment(TextAlignment.RIGHT);
        label.setWrapText(true);
        label.setAlignment(Pos.TOP_LEFT);
        label.setText("\tПривет!\n\tЭто чат! :)\n\tВыбрав справа пользователя, можно отправить ему сообщение. " +
                "Пока пользователь выбран все сообщения отправляются ему.\n\t" +
                "Для отправки сообщения всем необходимо выбрать Send ALL.");
        pane.getChildren().add(label);

//        TextArea textHelp = new TextArea();
//        textHelp.setEditable(false);
//        textHelp.setWrapText(true);
//        textHelp.setPrefSize(scene.widthProperty().getValue(),pane.heightProperty().getValue());
//        textHelp.setText("\tПривет!\n\tЭто чат! :)\n\tВыбрав справа пользователя, можно отправить ему сообщение. " +
//                "Пока пользователь выбран все сообщения отправляются ему.\n\t" +
//                "Для отправки сообщения всем необходимо выбрать Send ALL.");
//        pane.getChildren().add(textHelp);

        window.setScene(scene);
        window.setTitle("Help");
        window.showAndWait();
    }

}
