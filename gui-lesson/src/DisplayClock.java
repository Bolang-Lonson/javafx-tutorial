import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class DisplayClock extends Application {

    @Override
    public void start(Stage primStage) {
        ClockPane clock = new ClockPane();
        String timeString = clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond();
        Label currTime = new Label(timeString);

        BorderPane pane = new BorderPane();
        pane.setCenter(clock);
        pane.setBottom(currTime);
        BorderPane.setAlignment(currTime, Pos.TOP_CENTER);

        primStage.setScene(new Scene(pane, 250, 250));
        primStage.setTitle("DisplayClock");
        primStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}