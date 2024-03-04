
import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Scanner;



public class ty  extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) {
        Label TESTLABEL = new Label("test");
         StackPane layout = new StackPane();
         layout.getChildren().add(TESTLABEL);
         layout.alignmentProperty();

         Scene scene = new Scene(layout, 300, 200);


         primaryStage.setScene(scene);
        primaryStage.setTitle("first test");
        primaryStage.show();
    }
}
