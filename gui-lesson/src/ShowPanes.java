import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ShowPanes extends Application{

    @Override
    public void start(Stage primStage) {
        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(11, 12, 13, 14));
        pane.setHgap(5); pane.setVgap(5);

        pane.getChildren().addAll(new Label("First Name:"), new TextField(), new Label("MI:"));
        TextField tfMi = new TextField();
        tfMi.setPrefColumnCount(1);
        pane.getChildren().addAll(tfMi, new Label("Last Name:"), new TextField());

        Scene scene = new Scene(pane, 200, 250);
        primStage.setTitle("Show FlowPane");
        primStage.setScene(scene);
        primStage.show();

        GridPane pane1 = new GridPane();
        Stage stage1 = new Stage();
        pane1.setAlignment(Pos.CENTER);
        pane1.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane1.setHgap(5.5);
        pane1.setVgap(5.5);

        pane1.add(new Label("First Name:"), 0, 0);
        pane1.add(new TextField(), 1, 0);
        pane1.add(new Label("MI:"), 0, 1);
        pane1.add(new TextField(), 1, 1);
        pane1.add(new Label("Last Name:"), 0, 2);
        pane1.add(new TextField(), 1, 2);
        Button btAdd = new Button("Add Name");
        pane1.add(btAdd, 1, 3);
        GridPane.setHalignment(btAdd, HPos.RIGHT);

        stage1.setScene(new Scene(pane1, 400, 250));
        stage1.setTitle("Show GridPane");
        stage1.show();

        Stage stage2 = new Stage();
        BorderPane pane2 = new BorderPane();
        pane2.setTop(new CustomPane("Top"));
        pane2.setRight(new CustomPane("Right"));
        pane2.setBottom(new CustomPane("Bottom"));
        pane2.setLeft(new CustomPane("Left"));
        pane2.setCenter(new CustomPane("Center"));

        stage2.setScene(new Scene(pane2));
        stage2.setTitle("Show BorderPane");
        stage2.show();

        Stage stage3 = new Stage();
        BorderPane bpane = new BorderPane();
        bpane.setTop(getHBox());
        bpane.setLeft(getVBox());

        stage3.setScene(new Scene(bpane));
        stage3.setTitle("Show VBox HBox");
        stage3.show();

    }
    public static void main(String[] args) throws Exception{
        launch(args);
    }

    private HBox getHBox() {
        HBox hb = new HBox(15);
        hb.setPadding(new Insets(15));  // One value for top right bottom and left
        hb.setStyle("-fx-background-color: gold");
        hb.getChildren().addAll(new Button("Computer Science"), new Button("Chemistry"));
        ImageView imgview = new ImageView(new Image("./pic.jpeg"));
        imgview.setFitHeight(50);
        imgview.setFitWidth(50);
        hb.getChildren().add(imgview);
        hb.setAlignment(Pos.CENTER);

        return hb;
    }

    private VBox getVBox() {
        VBox vb = new VBox(15);
        vb.setPadding(new Insets(15, 5, 5, 5));
        vb.getChildren().add(new Label("Courses:"));

        Label[] courses = {new Label("CSCI 1301"), new Label("CSCI 1302"), new Label("CSCI 2410"), new Label("CSCI 3720")};

        for(Label course: courses){
            VBox.setMargin(course, new Insets(0, 0, 0, 15));
            vb.getChildren().add(course);
        }

        return vb;
    }
}

class CustomPane extends StackPane {
    public CustomPane(String title) {
        getChildren().add(new Label(title));
        setStyle("-fx-border-color: red");
        setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
    }
}