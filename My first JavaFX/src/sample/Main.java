package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.Random;

public class Main extends Application implements EventHandler<ActionEvent>{
    Button b1,b2,b3;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(ActionEvent event) {
        if(event.getSource()==b1){
            System.out.println("good");
        }
        if(event.getSource()==b2){
            System.out.println("netural");
        }
        if(event.getSource()==b3){
            System.out.println("bad");
        }


    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("My First Program");
        b1= new Button();
        b2= new Button();
        b3= new Button();
        b1.setTranslateX(100);
        b2.setTranslateX(0);
        b3.setTranslateX(-100);
        b1.setText("I'm good");
        b2.setText("I'm netural");
        b3.setText("I'm bad");
        StackPane l1=new StackPane();
        l1.getChildren().add(b1);
        l1.getChildren().add(b2);
        l1.getChildren().add(b3);
        Scene s1=new Scene(l1,300,200);
        primaryStage.setScene(s1);
        primaryStage.show();
        b1.setOnAction(this);
        b2.setOnAction(this);
        b3.setOnAction(this);



    }
}
