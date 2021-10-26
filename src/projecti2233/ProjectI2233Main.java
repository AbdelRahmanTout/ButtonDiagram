package projecti2233;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;

public class ProjectI2233Main extends Application {
    public void start(Stage primaryStage){
        primaryStage.setTitle("project 2019");
        Group rout = new Group();
        Canvas canvas = new Canvas(1000,500);
        rout.getChildren().add(canvas);
        Scene scene = new Scene(rout);
        primaryStage.setScene(scene);
        primaryStage.show();
        double tab[] = {1,4.6,2,7.2,8,3,4,5,5.5,7.99};
        projectI2233 project = new projectI2233(canvas.getGraphicsContext2D(),tab);
        project.draw();
    }
    public static void main(String[] args) {
        launch(args);
    }
}