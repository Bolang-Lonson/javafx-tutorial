import javafx.application.Application;
import javafx.scene.Scene;
// import javafx.scene.control.Label;
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
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

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

        Pane pane3 = new Pane();
        for (int i = 0; i < 50; i++) {
            Ellipse el1 = new Ellipse(150, 100, 100, 50);
            el1.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
            el1.setFill(Color.TRANSPARENT);
            el1.setRotate(i * 180 / 50);
            pane3.getChildren().add(el1);
        }

        Stage stage4 = new Stage();
        stage4.setScene(new Scene(pane3, 300, 210));
        stage4.setTitle("Show Ellipse");
        stage4.show();

        Pane pane4 = new Pane();

        Arc arc1 = new Arc(150, 100, 80, 80, 30, 35);
        arc1.setFill(Color.RED);
        arc1.setType(ArcType.ROUND);
        pane4.getChildren().add(new Text(210, 40, "arc1: round"));
        pane4.getChildren().add(arc1);

        Arc arc2 = new Arc(150, 100, 80, 80, 30+90, 35);
        arc2.setFill(Color.WHITE);
        arc2.setType(ArcType.OPEN);
        arc2.setStroke(Color.BLACK);
        pane4.getChildren().add(new Text(20, 40, "arc2: open"));
        pane4.getChildren().add(arc2);

        Arc arc3 = new Arc(150, 100, 80, 80, 30+180, 35);
        arc3.setFill(Color.WHITE);
        arc3.setType(ArcType.CHORD);
        arc3.setStroke(Color.BLACK);
        pane4.getChildren().add(new Text(20, 170, "arc3: chord"));
        pane4.getChildren().add(arc3);

        Arc arc4 = new Arc(150, 100, 80, 80, 30+270, 35);
        arc4.setFill(Color.GREEN);
        arc4.setType(ArcType.CHORD);
        arc4.setStroke(Color.BLACK);
        pane4.getChildren().add(new Text(210, 170, "arc4: chord"));
        pane4.getChildren().add(arc4);

        Stage stage5 = new Stage();
        stage5.setScene(new Scene(pane4, 300, 200));
        stage5.setTitle("Show Arc");
        stage5.show();
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