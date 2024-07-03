package com.example.animationdemo;

import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AnimationDemo extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new Pane();
        root.setPadding(new Insets(20));
        Rectangle rectangle = new Rectangle(100,100, Color.RED);
        root.getChildren().add(rectangle);
//        Fade Transition
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(2),rectangle);
        fadeTransition.setFromValue(1.0);
        fadeTransition.setToValue(0.3);
        fadeTransition.setCycleCount(2);
        fadeTransition.setAutoReverse(true);
//        Scale Transitions
        ScaleTransition scaleTransition = new ScaleTransition(Duration.seconds(2),rectangle);
        scaleTransition.setToX(2);
        scaleTransition.setToY(2);
        scaleTransition.setCycleCount(8);
        scaleTransition.setAutoReverse(true);
//        Sequential transition
        SequentialTransition sequentialTransition = new SequentialTransition(
                fadeTransition,
                scaleTransition

        );
        sequentialTransition.play();
        Scene scene = new Scene(root,400,400);
        stage.setTitle("Animation Demo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
