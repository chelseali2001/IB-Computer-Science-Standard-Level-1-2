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

public class lab13p4 extends Application {
    
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
		Label label = new Label("Enter a number");
		label.setTranslateX(360);
		label.setTranslateY(475);

		//text box
		TextField textfield = new TextField();
		textfield.clear();
		textfield.setTranslateX(315);
		textfield.setTranslateY(500);
		
		Text t = new Text();
		t.setTranslateX(75);
		t.setTranslateY(275);
		t.setText("Error: Must be single number");
		t.setFill(Color.BLACK);
		t.setFont(new Font(50));
		
		root.getChildren().addAll(label, textfield);
		
		//user enters number
		textfield.setOnAction(new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent a) {
			root.getChildren().clear();
			root.getChildren().addAll(label, textfield);
			String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
			String[] left = {"0001101", "0011001", "0010011", "0111101", "0100011", "0110001", "0101111", "0111011", "0110111", "0001011"};
			String digit = "";
			String dig = "";
			String fill = "";
			int xval = 0;
			int x;
			
			digit = textfield.getText();
			if (Arrays.asList(num).contains(digit)) { //if input is an integer
				int b = Integer.parseInt(digit);
				dig = left[b]; 
				char[] str = dig.toCharArray();
				//filling in the boxes
				for (x = 0; x < str.length; x++) { //going through each number of the left hand code
					String str0 = "";
					str0 = Character.toString(str[x]);
					xval = 340 + (20 * x);
					//creating rectangle
					Rectangle bar = new Rectangle(xval, 150, 20, 200);
					if (str0.equals("1")) {
						bar.setFill(Color.BLACK);
					} else {
						bar.setFill(Color.TRANSPARENT); 
					}
					root.getChildren().add(bar);
				}
			} else {
				root.getChildren().add(t);
			}
		}
		});		
		
		primaryStage.setScene(scene);
        primaryStage.show();
	} // start
} // class