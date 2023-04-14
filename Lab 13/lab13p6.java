import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.paint.*;
import javafx.scene.canvas.*;
import javafx.scene.shape.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.*;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class lab13p6 extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
	@Override
	public void start(Stage primaryStage) {
		//window settings
		Group root = new Group();
		Scene scene = new Scene(root, 800, 600);
		primaryStage.setTitle("lab13p4");
		
		//label
		Label label = new Label("Enter the barcode");
		label.setTranslateX(350);
		label.setTranslateY(475);

		//text box
		TextField textfield = new TextField();
		textfield.clear();
		textfield.setTranslateX(315);
		textfield.setTranslateY(500);
		
		root.getChildren().addAll(label, textfield);
		
		//right 
		Text t = new Text();
		t.setTranslateX(125);
		t.setTranslateY(300);
		t.setText("Sweet!");
		t.setFill(Color.BLACK);
		t.setFont(new Font(200));
	
		//wrong
		Text t0 = new Text();
		t0.setTranslateX(255);
		t0.setTranslateY(400);
		t0.setText("X");
		t0.setFill(Color.RED);
		t0.setFont(new Font(500));
		
		Text t1 = new Text();
		t1.setTranslateX(225);
		t1.setTranslateY(225);
		t1.setText("Yo I found ur ");
		t1.setFill(Color.BLACK);
		t1.setFont(new Font(20));
		
		//user enters number
		textfield.setOnAction(new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent a) {
			root.getChildren().clear();
			root.getChildren().addAll(label, textfield);
			String digit = "";
			String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
			int b = 0;
			int c = 0;
			int d = 0;
			int e = 0;
			int z = 0;
			int x;
			int total = 0;
			
			digit = textfield.getText();
			char[] str = digit.toCharArray();
			
			//checks to see if each number is valid
			for (x = 0; x < str.length; x++) {
				String dig = "";
				dig = Character.toString(str[x]);
				if (Arrays.asList(num).contains(dig)) {
					b += x;
				} 
			}
			
			//checks if there's 12 digits
			if (b == 66) {
				//adds up each number
				for (x = 0; x < str.length; x++) {	
					String convert = "";
					convert = Character.toString(str[x]);
					c = Integer.parseInt(convert);
					z = x % 2;
					if (z == 0) {
						d = 3 * c;
						total += d;
					} else {
						total += c;
					}
				}
				
				//if number adds up to a multiple of 10
				e = total % 10;
				if (e == 0) {
					root.getChildren().add(t);
				} else {
					root.getChildren().addAll(t0, t1);
				}
			} else {
				root.getChildren().addAll(t0, t1);
			}
		}
		});		
		
		primaryStage.setScene(scene);
        primaryStage.show();
	} // start
} // class