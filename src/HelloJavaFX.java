import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;



public class HelloJavaFX extends Application {
    public void start(Stage s){
        s.setTitle("JavaFX Introduction");
        TilePane t = new TilePane();
        Button b=new Button();
        b.setText("click me!");
        Label l=new Label();
        t.getChildren().add(b);
        t.getChildren().add(l);
        EventHandler<ActionEvent> event=new EventHandler<ActionEvent>(){
            public void handle(ActionEvent e){
                l.setText("HelloWorld");
            }
        };
        b.setOnAction(event);
        Scene sc=new Scene(t,200,200);
        s.setScene(sc);
        s.show();


    }
    public static void main(String[]args){
        launch(args);
    }
}
