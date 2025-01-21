import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btOk = new Button("OK");
        Scene scene = new Scene(btOk, 200, 250);
        primaryStage.setTitle("App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) throws Exception {
        launch(); // Run this Application.
    }
}