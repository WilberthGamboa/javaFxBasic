package Controlador;

import java.io.InputStream;
import java.util.function.DoubleBinaryOperator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LayoutsHVbox extends Application{

    

    @Override
    public void start(Stage primaryStage) throws Exception {

        //HBOX, ORGANIZA NODOS DE FORMA HORIZONTAL 


        //Vbox ContainerlEFT
        VBox containerLeftVBox = new VBox();
        Label labelTitle = new Label("Iniciar Sesión");
        labelTitle.setFont(new Font(40));

        //Se crea la parte del login
        VBox containerLoginBox = new VBox();
        Label labeUser = new Label("Usuario");
        labeUser.setFont(new Font(20));

        Label labelPassword = new Label("Contraseña");
        labelPassword.setFont(new Font(20));
        //Campos de texto

        TextField textUser = new TextField();
        textUser.setFont(new Font(18));
        textUser.setPromptText("Ingrese su usuario");
        textUser.setPrefWidth(341);
        textUser.setPrefHeight(44);

        PasswordField textPass = new PasswordField();
        textPass.setFont(new Font(18));
        textPass.setPromptText("Ingrese su contraseña");
        textPass.setPrefWidth(341);
        textPass.setPrefHeight(44);

        //Boton
        Button  btnLogin = new Button("Entrar");
        btnLogin.setFont(new Font(18));
        btnLogin.setPrefWidth(370);
        btnLogin.setPrefHeight(44);
        btnLogin.setMaxWidth(Double.MAX_VALUE);
        btnLogin.setCursor(Cursor.HAND);

        containerLoginBox.getChildren().addAll(labeUser,textUser,labelPassword,textPass,btnLogin);
        containerLoginBox.setAlignment(Pos.TOP_LEFT);
        VBox.setMargin(labeUser, new Insets(10,0,0,0));
        VBox.setMargin(labelPassword, new Insets(10,0,0,0));
        VBox.setMargin(btnLogin, new Insets(20,0,0,0));


        containerLeftVBox.getChildren().addAll(labelTitle,containerLoginBox);
        containerLeftVBox.setPrefWidth(422);
        containerLeftVBox.setAlignment(Pos.CENTER);
        VBox.setMargin(containerLoginBox, new Insets(0, 30, 0, 30));


        VBox containerRightVBox = new VBox();
    
        ImageView imageLogo;
        InputStream  inputStream;
        inputStream = getClass().getResourceAsStream("/Controlador/logo.JPG");
        Image image = new Image(inputStream);

        imageLogo = new ImageView(image);
      
        imageLogo.setFitHeight(300);
        imageLogo.setFitWidth(500);
      
        imageLogo.setPreserveRatio(true);
        containerRightVBox.getChildren().add(imageLogo);
       
        containerRightVBox.setPrefWidth(422);
        containerRightVBox.setAlignment(Pos.CENTER);
        //VBox.setMargin(containerRightVBox, new Insets(0, 0, 0, 30));


        //Todos estos son nodos hijos

        //Etiquetas
       

        
        //El nodo raiz se cambia
        HBox root = new HBox();

        //En el orden que pasemos los parametros saldrán en la interfaz gráfica
        root.getChildren().addAll(containerLeftVBox,containerRightVBox);
        
        //Redimenciona
        HBox.setHgrow(containerLeftVBox, Priority.ALWAYS);
        HBox.setHgrow(containerRightVBox, Priority.ALWAYS);
   
   Scene scene = new Scene(root, 1000, 500);

        primaryStage.setScene(scene);
        primaryStage.show();
        


    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
