import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
// import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        StackPane pane = new StackPane();
        pane.getChildren().add(new Button("Stack Pane"));
        
        Scene scene = new Scene(pane, 200, 50);
        primaryStage.setTitle("StackPane Demo");
        primaryStage.setScene(scene);
        primaryStage.show();

        Stage secondStage = new Stage();
        secondStage.setTitle("popup");
        secondStage.setScene(new Scene(new Button("New Stage"), 500, 600));
        secondStage.show();

        Pane pane1 = new Pane();
        Stage stage2 = new Stage();
        Circle circle= new Circle();
        circle.centerXProperty().bind(pane1.widthProperty().divide(2));
        circle.centerYProperty().bind(pane1.heightProperty().divide(2));
        circle.setRadius(50);
        circle.setStyle("-fx-stroke: black; -fx-fill: red;");
        pane1.getChildren().add(circle);
        Scene scene2 = new Scene(pane1, 200, 200);
        stage2.setTitle("Show Circle");
        stage2.setScene(scene2);
        
        stage2.show();
    }
    public static void main(String[] args) throws Exception {
        launch(args); // Run this Application.
    }
}