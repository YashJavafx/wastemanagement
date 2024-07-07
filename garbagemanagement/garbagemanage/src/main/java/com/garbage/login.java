package com.garbage;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class login extends Application {
   
    private Label emailLabel;
    private Label passLabel;

    @Override
    public void start(Stage primaryStage) throws Exception {

        Image img = new Image("file:garbagemanage/src/main/resources/assets/image/loginmain.jpg");
        ImageView imageView = new ImageView(img);
        imageView.setFitWidth(600);
        imageView.setFitHeight(450);

        // Initialize email label and text field
        emailLabel = new Label("Enter your email id:");
        emailLabel.setStyle("-fx-background-color:TRANSPARENT");
        TextField emailTextField = new TextField();

        // Initialize password label and password field
        passLabel = new Label("Enter your password");
        passLabel.setStyle("-fx-background-color:TRANSPARENT");
        PasswordField passField = new PasswordField();

        // Create VBox for email components
        VBox emailVBox = new VBox(emailLabel, emailTextField);

        // Create VBox for password components
        VBox passVBox = new VBox(passLabel, passField);

        // Submit button
        Button submitButton = new Button("Submit");
        submitButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println(emailTextField.getText());
                System.out.println(passField.getText());
            }
        });

        // New User button
        Button newuserButton = new Button("New User - Sign Up");
        newuserButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                
                System.out.println(emailTextField.getText());
                System.out.println(passField.getText());
            }
        });

        // Create VBox to combine all elements with spacing of 10
        VBox combined = new VBox(10,  emailVBox, passVBox, submitButton, newuserButton);
        combined.setAlignment(Pos.BASELINE_LEFT);
        
        combined.setStyle("-fx-background-color:TRANSPARENT");

        // Create StackPane and add imageView and combined VBox
        StackPane root = new StackPane();
        root.getChildren().addAll(imageView, combined);

        // Create a scene with the root StackPane and specified dimensions
        Scene scene = new Scene(root, 600, 450);

        // Set the scene on the primary stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Login Window");
        primaryStage.setResizable(true);
        primaryStage.show();
    }
}