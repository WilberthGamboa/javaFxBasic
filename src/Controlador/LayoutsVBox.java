package Controlador;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LayoutsVBox extends Application{

   

    @Override
    public void start(Stage primaryStage) throws Exception {

        //Todos estos son nodos hijos

        //Etiquetas
        Label labelTitle = new Label("Login");
        labelTitle.setFont(new Font(30));

        Label labeUser = new Label("Usuario");
        labeUser.setFont(new Font(15));

        Label labelPassword = new Label("Contraseña");
        labelPassword.setFont(new Font(15));
        //Campos de texto

        TextField textUser = new TextField();
        textUser.setMaxWidth(150);

        PasswordField textPass = new PasswordField();
        textPass.setMaxWidth(150);

        //Boton
        Button  btnLogin = new Button("Entrar");
        btnLogin.setMaxWidth(150);
        btnLogin.setCursor(Cursor.HAND);
        //Nodo RAIZ
        VBox root = new VBox();

        //En el orden que pasemos los parametros saldrán en la interfaz gráfica
        root.getChildren().addAll(labelTitle,labeUser,textUser,labelPassword,textPass,btnLogin);
        root.setAlignment(Pos.CENTER);
   //     root.getChildren().addAll(labelLogin);
        
        //Aplicar margin
        VBox.setMargin(labeUser, new Insets(10,0,0,0));
        VBox.setMargin(labelPassword, new Insets(10,0,0,0));
        VBox.setMargin(btnLogin, new Insets(10,0,0,0));
       
   
   Scene scene = new Scene(root, 500, 500);

        primaryStage.setScene(scene);
        primaryStage.show();
        


    }
    public static void main(String[] args) {
        launch(args);
    }
}
