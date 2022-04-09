package Controlador;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
//Primero siempre se hereda de java application
public class App extends Application {
    public static void main(String[] args) throws Exception {
      
      //llama al método start
      
        launch(args);
    }

    //Se crea el método estático
    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub


        Label label = new Label("Hola mundo");
        //Es necesario crear un nodo raiz, el cual permite agregar los demás nodos de la interfaz

        StackPane root = new StackPane();
        //Se agrega el label al nodo raiz
        root.getChildren().add(label);
        //Aquí se pasa el nodo raiz
        Scene scene = new Scene(root,1000,1000);

        //Se indica la escena a utilizar
        primaryStage.setScene(scene);
        //Se muestra la escena 
        primaryStage.show();
        
    }
}
