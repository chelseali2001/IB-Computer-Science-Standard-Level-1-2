import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.Group;

/**
 *
 * @author Chelsea
 */
public class lab10 extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
		
		//setting window size
        Group root = new Group();
        Scene scene = new Scene(root, 300, 300);
        primaryStage.setTitle("Java");
		
		//Java button
        Button btn = new Button();
        btn.setText("Java");
		
		//Off button
        Button btn2 = new Button();
        btn2.setText("Off");
        
		//When user presses the java button
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Make Java Great Again!");
           }
        });
        
		//Coordinates for java button
        btn.setTranslateX(60);
        btn.setTranslateY(60);

		//On button
        Button btn1 = new Button();
        btn1.setText("On");
        
		//On to off button
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                root.getChildren().remove(btn1);
                root.getChildren().add(btn2);
           }
        });

		//Coordinates for on button
        btn1.setTranslateX(60);
        btn1.setTranslateY(120);
        root.getChildren().addAll(btn, btn1);
        
		//Off to on button
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent a) {
                root.getChildren().remove(btn2);
                root.getChildren().add(btn1);
           }
        });
                
		//Coordinates for off button
        btn2.setTranslateX(60);
        btn2.setTranslateY(120);
         
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}