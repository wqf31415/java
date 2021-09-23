package xyz.wqf.mavenfx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello");
        StackPane root = new StackPane();
        Button btn = new Button();
        btn.setText("hello");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("hello world");
            }
        });
        root.getChildren().add(btn);
        Scene scene = new Scene(root,480,320);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
