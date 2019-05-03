import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileInputStream;
import java.awt.*;
import java.io.FileNotFoundException;

import static java.awt.Color.*;

public class Main extends Application {

    private Text display;
    private Text error;
    private TextField userChoice;
    private VBox box;
    private Image image;
    private ImageView img0;
    private ImageView img1;
    private ImageView img2;
    private ImageView img3;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        box = new VBox();
        box.setId("main-box");
        box.setPadding(new Insets(20, 50, 50, 50));
        box.setSpacing(10);

        primaryStage.setTitle("MAKE YOUR OWN DOG!");

        display = new Text();
        error = new Text();
        display.setText("Please enter 4 random numbers from 1 - 9");
        display.setId("instruction");

        userChoice = new TextField();
        userChoice.setId("textfield");

        Button button = new Button("CREATE MY WEIRD DOG");
        button.setId("main-button");

        box.getChildren().addAll(display, userChoice, button, error);

        button.setOnAction(event -> {
            try {
                box.getChildren().removeAll(img0, img1, img2, img3);
                output();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        });

        Scene scene = new Scene(box, 600, 840);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void output() throws FileNotFoundException {
        // Getting the numbers input by the user, converting them to int and separating the digits
        String text = userChoice.getText();
        int userNumbers = Integer.parseInt(text);
        int num0 = userNumbers/1000;
        int num1 = (userNumbers - num0*1000)/100;
        int num2 = (userNumbers - (num0*1000+num1*100))/10;
        int num3 = (userNumbers - (num0*1000+num1*100+num2*10));

        userChoice.setText("");
        error.setText("");

        if ((num1==0 || num2==0 || num3 ==0 || num0 ==0) ||(text.length()>4)) {
            error.setText("Invalid entry!");
            error.setId("error");
            return;
        }

        // Getting the images from the class Images

        Images imageClass = new Images();
        Image[] ears = imageClass.ears;
        Image[] eyes = imageClass.eyes;
        Image[] nose = imageClass.nose;
        Image[] body = imageClass.body;


        // Displaying the images according to the indexes chosen by the user
        img0 = new ImageView(ears[num0-1]);
        img0.setFitWidth(500);
        img0.setPreserveRatio(true);
        img1 = new ImageView(eyes[num1-1]);
        img1.setFitWidth(500);
        img1.setPreserveRatio(true);
        img2 = new ImageView(nose[num2-1]);
        img2.setFitWidth(500);
        img2.setPreserveRatio(true);
        img3 = new ImageView(body[num3-1]);
        img3.setFitWidth(500);
        img3.setPreserveRatio(true);

        box.getChildren().addAll(img0, img1, img2, img3);
    }
}
