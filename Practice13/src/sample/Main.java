package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    private double red=0,green=0,blue=0,opacity=1;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        Color color = Color.color(red,green,blue,opacity);

        Text text = new Text("Show Colors");
        text.setFill(color);

        GridPane pane = new GridPane();
        pane.prefHeight(400);
        pane.prefWidth(200);
        pane.setHgap(5);

        Label lbRed = new Label("Red");
        ScrollBar sbRed = new ScrollBar();
        GridPane.setRowIndex(lbRed,0);
        GridPane.setColumnIndex(lbRed,0);
        GridPane.setRowIndex(sbRed,0);
        GridPane.setColumnIndex(sbRed,1);
        sbRed.setMax(1);
        sbRed.valueProperty().addListener((observableValue, number, t1) -> {
            red = sbRed.getValue() / sbRed.getMax();
            text.setFill(Color.color(red,green,blue,opacity));
        });


        Label lbGreen = new Label("Green");
        ScrollBar sbGreen = new ScrollBar();
        GridPane.setRowIndex(lbGreen,1);
        GridPane.setColumnIndex(lbGreen,0);
        GridPane.setRowIndex(sbGreen,1);
        GridPane.setColumnIndex(sbGreen,1);
        sbGreen.setMax(1);
        sbGreen.valueProperty().addListener((observableValue, number, t1) -> {
            green = sbGreen.getValue() / sbGreen.getMax();
            text.setFill(Color.color(red,green,blue,opacity));
        });

        Label lbBlue = new Label("Blue");
        ScrollBar sbBlue = new ScrollBar();
        GridPane.setRowIndex(lbBlue,2);
        GridPane.setColumnIndex(lbBlue,0);
        GridPane.setRowIndex(sbBlue,2);
        GridPane.setColumnIndex(sbBlue,1);
        sbBlue.setMax(1);
        sbBlue.valueProperty().addListener((observableValue, number, t1) -> {
            blue= sbBlue.getValue() / sbBlue.getMax();
            text.setFill(Color.color(red,green,blue,opacity));
        });

        Label lbOpacity = new Label("Opacity");
        ScrollBar sbOpacity = new ScrollBar();
        GridPane.setRowIndex(lbOpacity,3);
        GridPane.setColumnIndex(lbOpacity,0);
        GridPane.setRowIndex(sbOpacity,3);
        GridPane.setColumnIndex(sbOpacity,1);
        sbOpacity.setMax(1);
        sbOpacity.setValue(1);
        sbOpacity.valueProperty().addListener((observableValue, number, t1) -> {
            opacity = sbOpacity.getValue() / sbOpacity.getMax();
            text.setFill(Color.color(red,green,blue,opacity));
        });

        pane.getChildren().addAll(lbRed,lbGreen,lbBlue,lbOpacity);
        pane.getChildren().addAll(sbRed,sbGreen,sbBlue,sbOpacity);
        pane.setAlignment(Pos.CENTER);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(text);
        borderPane.setBottom(pane);

        primaryStage.setTitle("Practice13");
        primaryStage.setScene(new Scene(borderPane, 450, 270));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
