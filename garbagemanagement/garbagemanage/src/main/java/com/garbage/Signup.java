package com.garbage;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Signup extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Image backgroundImage = new Image("file:garbagemanage/src/main/resources/assets/image/background.png");
        BackgroundImage background = new BackgroundImage(backgroundImage,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                new BackgroundSize(1.0, 1.0, true, true, false, false));

        // Initialize labels and text fields
        Label firstNameLabel = new Label("First Name:");
        TextField firstNameTextField = new TextField();

        Label lastNameLabel = new Label("Last Name:");
        TextField lastNameTextField = new TextField();

        Label mobileNoLabel = new Label("Mobile No:");
        TextField mobileNoTextField = new TextField();

        Label flatNoLabel = new Label("Flat No:");
        TextField flatNoTextField = new TextField();

        Label wingNoLabel = new Label("Wing No:");
        TextField wingNoTextField = new TextField();

        Label totalFamilyMembersLabel = new Label("Total Family Members:");
        TextField totalFamilyMembersTextField = new TextField();

        Label passwordLabel = new Label("Password:");
        TextField passwordTextField = new TextField();

        // Submit button
        Button submitButton = new Button("Submit");
        submitButton.setAlignment(Pos.CENTER);
        Label outputLabel = new Label();

        submitButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                
            }
        });

        // Create GridPane for form
        GridPane formGridPane = new GridPane();
        formGridPane.setHgap(10);
        formGridPane.setVgap(10);
        formGridPane.setPadding(new Insets(20, 20, 20, 20));

        formGridPane.add(firstNameLabel, 0, 0);
        formGridPane.add(firstNameTextField, 1, 0);
        formGridPane.add(lastNameLabel, 0, 1);
        formGridPane.add(lastNameTextField, 1, 1);
        formGridPane.add(mobileNoLabel, 0, 2);
        formGridPane.add(mobileNoTextField, 1, 2);
        formGridPane.add(flatNoLabel, 0, 3);
        formGridPane.add(flatNoTextField, 1, 3);
        formGridPane.add(wingNoLabel, 0, 4);
        formGridPane.add(wingNoTextField, 1, 4);
        formGridPane.add(totalFamilyMembersLabel, 0, 5);
        formGridPane.add(totalFamilyMembersTextField, 1, 5);
        formGridPane.add(passwordLabel, 0, 6);
        formGridPane.add(passwordTextField, 1, 6);

        HBox buttonHBox = new HBox(15);
        buttonHBox.setAlignment(Pos.CENTER);
        buttonHBox.getChildren().add(submitButton);

        // Add the submit button below the password field
        formGridPane.add(buttonHBox, 1, 7);

        // Create a VBox for the image
        VBox imageVBox = new VBox();
        imageVBox.setAlignment(Pos.TOP_RIGHT);
        imageVBox.setPadding(new Insets(20, 20, 20, 20));

        // Load the image and create an ImageView
        Image image = new Image("file:garbagemanage/src/main/resources/assets/image/building1.jpg");
        ImageView imageView = new ImageView(image);

        // Set the image size and alignment
        imageView.setFitWidth(600);
        imageView.setFitHeight(1200);
        imageView.setPreserveRatio(true);

        // Add the ImageView to the VBox
        imageVBox.getChildren().add(imageView);

        // Create a HBox to hold the form and the image
        HBox combinedHBox = new HBox(20);
        combinedHBox.setAlignment(Pos.BOTTOM_CENTER);
        combinedHBox.getChildren().addAll(formGridPane, imageVBox);

        VBox combined = new VBox(20);
        combined.setAlignment(Pos.BOTTOM_CENTER);
        combined.getChildren().addAll(combinedHBox, outputLabel);

        // Set the background image to the VBox
        combined.setBackground(new Background(background));


        // Create a scene with the form VBox and specified dimensions
        Scene scene = new Scene(combined, 1200, 900);
        scene.getStylesheets().add("file:garbagemanage/src/main/assets/styles/styles.css");

        // Set the scene on the primary stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("SIGN UP");
        primaryStage.setResizable(true);

        primaryStage.show();
    }
}