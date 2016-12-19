/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gpao_V_1_0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.swing.JMenu;

/**
 *
 * @author Assane Adirou
 */
public class Demg_Class extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        /*Message afficher dans le bouton au chargement de l'application*/
        btn.setText("BienVenue Dans Gpao Version 1.0");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

             try {
                    /*instanciation de la classe database et appelle de ces differentes methodes au demarrage de l'application  */
                    Data_Base_File dbf = new Data_Base_File();
                    dbf.se_connecter();
                    dbf.Creation();
                    /*affichage de la trace */
                    System.out.println("base de donnée Gpao_v_1 creer avec succes");
                    /*Instanciation de la classe d'authentification, suivie de son affichage*/
                    Authentification_Form ath = new Authentification_Form();
                    ath.setVisible(true);
                } catch (SQLException ex) {
                    /*affichage de la trace d'existance de la base qu'on tente de creer*/
                    System.out.println("bd existant merci");
                    Authentification_Form ath = new Authentification_Form();
                    ath.setVisible(true);
                    primaryStage.close();
                } 

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
