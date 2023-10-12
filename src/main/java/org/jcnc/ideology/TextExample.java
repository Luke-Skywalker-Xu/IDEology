package org.jcnc.ideology;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author luke
 */
public class TextExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        Text text = new Text("Hello, ideology!");

        StackPane root = new StackPane();
        root.getChildren().add(text);

        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("ideology");
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
