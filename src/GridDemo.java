import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridDemo extends Application {
    public void start(Stage s){ //root container
        GridPane g= new GridPane();
        g.setPadding(new Insets(10,10,10,10));
        g.setVgap(10);
        g.setHgap(5);

        Label l1= new Label();
        l1.setText("Name");
        Label l2 = new Label();
        l2.setText("Age");
        TextField t1= new TextField();
        TextField t2= new TextField();
        ComboBox c = new ComboBox();
        c.getItems().addAll("BS","MS");
        RadioButton r1 = new RadioButton();
        r1.setText("Male");
        RadioButton r2 = new RadioButton();
        r2.setText("Female");
        Button b1 = new Button();
        b1.setText("Can I vote?");
        Label output= new Label();
        g.add(l1,0,0);
        g.add(t1,1,0); //column 1 row 0
        g.add(l2,0,1);
        g.add(t2,1,1);
        g.add(b1,2,0);
        g.add(output,2,1);
        g.add(c,0,3);
        g.add(r1,1,3);
        g.add(r2,2,3);
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (Integer.parseInt(t2.getText())>18)
                    output.setText("You are allowed to vote");
                else
                    output.setText("You are not allowed to vote");
            }
        };
        b1.setOnAction(event);

        Scene sc= new Scene(g,400,200);
        s.setScene(sc);
        s.show();
    }
    public static void main(String[]args){
        launch(args);
    }
}
