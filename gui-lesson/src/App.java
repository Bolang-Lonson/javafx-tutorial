import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.control.Label;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        StackPane pane = new StackPane();
        pane.getChildren().add(new Button("Stack Pane"));
        pane.setRotate(80);     // rotates the pane by 80 degrees
        Scene scene = new Scene(pane, 200, 50);
        primaryStage.setTitle("StackPane Demo");
        primaryStage.setScene(scene);
        primaryStage.show();    // opens the window. Stage objects represent windows
        Font font1 = Font.font("Times New Roman", FontWeight.BOLD, 12);

        Stage secondStage = new Stage();
        secondStage.setTitle("popup");
        secondStage.setScene(new Scene(new Button("New Stage"), 500, 600));
        secondStage.show();

        Font font2 = Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 12.5);
        Pane pane1 = new Pane();
        Stage stage2 = new Stage();
        Circle circle = new Circle();
        circle.centerXProperty().bind(pane1.widthProperty().divide(2));
        circle.centerYProperty().bind(pane1.heightProperty().divide(2));
        circle.setRadius(50);
        // circle.setStyle("-fx-stroke: black; -fx-fill: rgba(56, 177, 57, 0.9);");
        Color color = new Color(0.25, 0.14, 0.333, 0.51);
        Color color2 = color.brighter();
        Color color3 = color2.darker();
        Color color4 = Color.color(0.33, 0.55, 0.879, 0.654);
        Color color5 = Color.rgb(56, 177, 57, 0.99);
        circle.setFill(Color.WHITE);
        Label label = new Label("Saadiq");
        label.setFont(font2);

        pane1.getChildren().addAll(circle, label);
        Scene scene2 = new Scene(pane1, 200, 200);
        stage2.setTitle("Show Circle");
        stage2.setScene(scene2);
        stage2.show();
    }
    public static void main(String[] args) throws Exception {
        launch(args); // Run this Application.
    }
}