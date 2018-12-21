/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemtrynotificationdemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import javafx.util.Duration;
import tray.animations.AnimationType;
import tray.notification.NotificationType;
import tray.notification.TrayNotification;

/**
 *
 * @author User
 */
public class SystemTryNotificationDemo extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Next Train");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                String title = "Zenon Ideas";
                String msg = "Veyangoda to Colombo 07:25";
                //   Notification notification=Notification.SUCCESS;

               // String s="/Home.png";
                
                Image i=new Image(getClass().getResource("clock.png").toString());
                
                TrayNotification tn = new TrayNotification(title, msg, NotificationType.SUCCESS);
                tn.setAnimationType(AnimationType.SLIDE);
                //tn.setImage(i); 
              //  tn.setRectangleFill(Paint.valueOf("#fc9b03"));
              //  tn.setRectangleFill(Color.RED);
                tn.showAndDismiss(Duration.seconds(5));

            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
