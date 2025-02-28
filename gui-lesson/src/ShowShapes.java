import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class ShowShapes extends Application{
    @Override
    public void start(Stage primStage) {
        Pane pane = new Pane();
        pane.setPadding(new Insets(5));
        Text text1 = new Text(20, 20, "Programming Is Fun!");
        text1.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 15));
        pane.getChildren().add(text1);

        Text text2 = new Text(60, 60, "Programming Is Fun\nDisplay Text");
        pane.getChildren().add(text2);

        Text text3 = new Text(10, 100, "Programming Is Fun\nDisplay Text");
        text3.setFill(Color.RED);
        text3.setUnderline(true);
        text3.setStrikethrough(true);
        pane.getChildren().add(text3);

        primStage.setScene(new Scene(pane));
        primStage.setTitle("Show Text");
        primStage.show();

        Stage stage2 = new Stage();
        stage2.setScene(new Scene(new LinePane(), 200, 200));
        stage2.setTitle("Show Line");
        stage2.show();

        Pane pane2 = new Pane();

        Rectangle rect1 = new Rectangle(25, 10, 60, 30);
        rect1.setStroke(Color.BLACK);
        rect1.setFill(Color.WHITE);
        pane2.getChildren().add(new Text(10, 27, "r1"));
        pane2.getChildren().add(rect1);

        Rectangle rect2 = new Rectangle(25, 50, 60, 30);
        pane2.getChildren().add(new Text(10, 67, "r2"));
        pane2.getChildren().add(rect2);

        Rectangle rect3 = new Rectangle(25, 90, 60, 30);
        rect3.setArcWidth(15);
        rect3.setArcHeight(25);
        pane2.getChildren().add(new Text(10, 107, "r3"));
        pane2.getChildren().add(rect3);

        for (int i = 0; i < 4; i++) {
            Rectangle r = new Rectangle(100, 50, 100, 30);
            r.setRotate(i * 360 / 8);
            r.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
            r.setFill(Color.WHITE);
            pane2.getChildren().add(r);
        }

        Stage stage3 = new Stage();
        stage3.setScene(new Scene(pane2, 250, 150));
        stage3.setTitle("Show Rectangles");
        stage3.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

class LinePane extends Pane {
    public LinePane() {
        Line line1 = new Line(10, 10, 10, 10);
        line1.endXProperty().bind(widthProperty().subtract(10));
        line1.endYProperty().bind(heightProperty().subtract(10));
        line1.setStrokeWidth(5);
        line1.setStroke(Color.GREEN);
        getChildren().add(line1);

        Line line2 = new Line(10, 10, 10, 10);
        line2.startXProperty().bind(widthProperty().subtract(10));
        line2.endYProperty().bind(heightProperty().subtract(10));
        line2.setStrokeWidth(5);
        line2.setStroke(Color.GREEN);
        getChildren().add(line2);
    }
}