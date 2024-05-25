import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Platform;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.text.Font;

public class App extends Application {
    public void start(Stage stage) {
        Label message = new Label("Saadiq's First FX Application!");
        message.setFont( new Font(40) );    // sets the font size of the string to be displayed by the label
        Button helloButton = new Button("Say Hello");
        helloButton.setOnAction( evt -> message.setText("Hello World!") );  // Click listener for the helloButton
        Button goodbyeButton = new Button("Say Goodbye");
        goodbyeButton.setOnAction( evt -> message.setText("Goodbye!!") );
        Button quitButton = new Button("Quit");
        quitButton.setOnAction( evt -> Platform.exit() );
        HBox buttonBar = new HBox( 20, helloButton, goodbyeButton, quitButton );
        buttonBar.setAlignment(Pos.CENTER);
        BorderPane root = new BorderPane();
        root.setCenter(message);
        root.setBottom(buttonBar);
        Scene scene = new Scene(root, 960, 600);
        stage.setScene(scene);
        stage.setTitle("JavaFX Test");
        stage.show();
    }
    public static void main(String[] args) throws Exception {
        launch(); // Run this Application.
    }
}
