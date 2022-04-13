package Controlador;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

import javafx.stage.Stage;

public class Layaout extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub

        //Creamos los nodos
        Button btn1 = new Button("Boton 1");
        Button btn2 = new Button("Boton 2");
        Button btn3 = new Button("Boton 3");
        Button btn4 = new Button("Boton 4");
        Button btn5 = new Button("Boton 5");

        //hereda de al clase pane
        BorderPane root = new BorderPane();

        root.setCenter(btn1);
        btn1.setMaxWidth(Double.MAX_VALUE);
        btn1.setMaxHeight(Double.MAX_VALUE);
        root.setTop(btn2);
        btn2.setMaxWidth(Double.MAX_VALUE);
        btn2.setMaxHeight(Double.MAX_VALUE);
        root.setBottom(btn3);
        btn3.setMaxWidth(Double.MAX_VALUE);
        btn3.setMaxHeight(Double.MAX_VALUE);
        root.setLeft(btn4);
        btn4.setMaxWidth(Double.MAX_VALUE);
        btn4.setMaxHeight(Double.MAX_VALUE);
        root.setRight(btn5);
        btn5.setMaxWidth(Double.MAX_VALUE);
        btn5.setMaxHeight(Double.MAX_VALUE);
        
        //Este es un tipo de layaoutStackPane stackPane = new StackPane();
        Scene scene = new Scene(root,500,500);

        primaryStage.setTitle("Layaout-border");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
