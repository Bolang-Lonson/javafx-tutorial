import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.File;

public class WebViewExample extends Application {
    @Override
    public void start(Stage stage) {
        WebView webView = new WebView();
        WebEngine webEngine = webView.getEngine();

        // Load local HTML file
        File file = new File("ui.html");
        webEngine.load(file.toURI().toString());

        StackPane root = new StackPane(webView);
        Scene scene = new Scene(root, 800, 600);

        // stage.setTitle("JavaFX WebView Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
