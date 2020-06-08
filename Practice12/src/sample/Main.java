package sample;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        ////////////선 그리기
        Line line1 = new Line(10, 100, 380, 100); //x축
        Line line2 = new Line(200, 10, 200, 200); //y축
        Line line3 = new Line(380, 100, 370, 90);
        Line line4 = new Line(380, 100, 370, 110);
        Line line5 = new Line(200, 10, 190, 20);
        Line line6 = new Line(200, 10, 210, 20);

        Text text1 = new Text(380, 80, "X");
        Text text2 = new Text(220, 30, "Y");
        Text text3 = new Text(150, 115, "-\u03c0");
        Text text4 = new Text(240, 115, "\u03c0");
        Text text5 = new Text(100, 115, "-2\u03c0");
        Text text6 = new Text(285, 115, "2\u03c0");
        Text text7 = new Text(205, 115, "0");

        Polyline polyline = new Polyline();
        for (double angle = -610; angle <= 610; angle++) {
            polyline.getPoints().addAll( angle, Math.cos(Math.toRadians(angle)));
        }
        polyline.setStroke(Color.RED);
        polyline.setTranslateY(100);
        polyline.setTranslateX(200);
        polyline.setScaleX(0.25);
        polyline.setScaleY(-50);
        polyline.setStrokeWidth(1.0 / 25);

        ////////////공
        Circle ball = new Circle(15, 15, 15);
        ball.setFill(Color.GREEN);

        PathTransition pt = new PathTransition();
        pt.setDuration(Duration.millis(4000));
        pt.setPath(polyline);
        pt.setNode(ball);
        pt.setOrientation(
                PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt.setCycleCount(Timeline.INDEFINITE);
        pt.setAutoReverse(true);
        pt.play();

        ////////////화면에 추가
        Group group = new Group();
        group.getChildren().addAll(line1, line2, line3, line4, line5, line6);
        group.getChildren().addAll(text1, text2, text3, text4, text5, text6, text7);
        group.getChildren().addAll(polyline);
        group.getChildren().addAll(ball);
        Scene scene = new Scene(new Pane(group), 450, 230);

        primaryStage.setTitle("Practice12");
        primaryStage.setScene(scene);
        primaryStage.show();

        ////////////클릭 이벤트
        scene.setOnMouseClicked((new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (mouseEvent.getButton() == MouseButton.PRIMARY) {
                    pt.pause();
                }
                if (mouseEvent.getButton() == MouseButton.SECONDARY) {
                    pt.play();
                }
            }
        }));

    }

    public static void main(String[] args) {
        launch(args);
    }
}
