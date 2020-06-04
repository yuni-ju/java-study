package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        Arc arc1 = new Arc(300,300,200,200,0,72);
        Arc arc2 = new Arc(300,300,200,200,72,93.6);
        Arc arc3 = new Arc(300,300,200,200,72 + 93.6,100.8);
        Arc arc4 = new Arc(300,300,200,200,72 + 93.6 + 100.8,93.6);

        arc1.setFill(Color.RED);
        arc1.setType(ArcType.ROUND);
        arc2.setFill(Color.BLUE);
        arc2.setType(ArcType.ROUND);
        arc3.setFill(Color.GREEN);
        arc3.setType(ArcType.ROUND);
        arc4.setFill(Color.ORANGE);
        arc4.setType(ArcType.ROUND);

        Text text1 = new Text(450,200, "Apple -- 20%");
        Text text2 = new Text(100,150, "HTC -- 26%");
        Text text3 = new Text(100,400, "Samsung -- 28%");
        Text text4 = new Text(400,450, "Other -- 26%");


        Group group = new Group();
        group.getChildren().addAll(arc1,arc2,arc3,arc4,text1,text2,text3,text4);

        Scene scene = new Scene(new Pane(group), 600, 600);

        primaryStage.setTitle("Practice11");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
