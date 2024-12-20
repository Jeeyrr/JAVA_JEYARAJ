package fr.esiee.javafxtest;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Paint;

public class HelloController {
    @FXML
    private Label l_welcomeText;
    @FXML
    private TextField tf_inputName;
    @FXML
    protected void onHelloButtonClick() {
        // 1- récupérer le inputName saisie par l'utilisateur dans tf_inputName
        String inputName = tf_inputName.getText();
        // Si le nom est saisi :
         if (!inputName.isEmpty()) {
        // 2- afficher dans le label l_welcomeText le message de bienvenu avec le inputName
        l_welcomeText.setText("Bonjour, " + inputName + "!");
        l_welcomeText.setTextFill(Paint.valueOf("green"));
        }
        //sinon :
        else {
        //3- changer la couleur du text du label l_welcomeText en rouge et afficher un text "Erreur
           l_welcomeText.setText("Erreur : le nom est incorrect.");
            l_welcomeText.setTextFill(Paint.valueOf("red"));
        }
        tf_inputName.clear();
    }
    }