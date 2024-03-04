import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Scanner;

public class TT extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    
   public void start(Stage primaryStage) {
        // Create labels and text fields for input
        Label nameLabel = new Label("Name:");
        TextField nameTextField = new TextField();

        Label ageLabel = new Label("Age:");
        TextField ageTextField = new TextField();

        // Create a button to submit the input
        Button submitButton = new Button("Submit");
        submitButton.setOnAction(e -> {
            String name = nameTextField.getText();
            int age = Integer.parseInt(ageTextField.getText());
            System.out.println("Name: " + name + ", Age: " + age);
        });

        // Create a layout to organize the input fields and button
        VBox layout = new VBox(10); // 10 pixels spacing
        layout.getChildren().addAll(nameLabel, nameTextField, ageLabel, ageTextField, submitButton);

        // Create a scene with the layout
        Scene scene = new Scene(layout, 300, 200);

        // Set the scene to the stage and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Input Form");
        primaryStage.show();
    }
}
