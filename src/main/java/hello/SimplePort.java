package hello;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SimplePort extends Application {

    @Override
    public void start(Stage primaryStage) {

        Label answer = new Label("Hello World!");

        StackPane root = new StackPane();
        root.getChildren().addAll(answer);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("JavaFX Porting Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}