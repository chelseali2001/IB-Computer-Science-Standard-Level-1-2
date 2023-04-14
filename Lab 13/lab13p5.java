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
x
public class lab13p5 extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
	@Override
	public void start(Stage primaryStage) {
		//window settings
		Group root = new Group();
        Scene scene = new Scene(root, 800, 600);
		primaryStage.setTitle("lab13p5");
		
		//label
		Label label = new Label("Enter the barcode");
		label.setTranslateX(350);
		label.setTranslateY(475);

		//text box
		TextField textfield = new TextField();
		textfield.clear();
		textfield.setTranslateX(315);
		textfield.setTranslateY(500);
	
		Text t = new Text();
		t.setTranslateX(175);
		t.setTranslateY(275);
		t.setText("Error: Invalid barcode");
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
			String[] right = {"1110010", "1100110", "1101100", "1000010", "1011100", "1001110", "1010000", "1000100", "1001000", "1110100"};
			String digit = "";
			String newdigit = "";
			String bar = "";
			String bar0 = "";
			int twelve = 0;
			int total = 0;
			int ten = 0;
			int xval = 0;
			int xt = 0;
			int yval = 0;
			int yt = 0;
			int dig = 0;
			int b = 0;
			int z = 0;
			int ex = 0;
			int i;
			int j;
			int x;
			
			digit = textfield.getText();
			char[] str = digit.toCharArray();
			
			//checking for invalid numbers
			for (x = 0; x < str.length; x++) {
				String check = "";
				check = Character.toString(str[x]);
				
				//keeping track of the number of digits and creating a string for the digits
				if (Arrays.asList(num).contains(check)) { //if digit is an integer
					newdigit += check;
					twelve += x;
				}
			}
			
			//Adding up the digits if there's 12 digits
			if (twelve == 66) { //if there's twelve digits
				for (x = 0; x < str.length; x++) {
					String convert = "";
					convert = Character.toString(str[x]);
					dig = Integer.parseInt(convert);
					z = x % 2;
					if (z == 0) {
						b = dig * 3;
						total += b;
					} else {
						total += dig;
					}
				}
				
				//Converts number to barcode number codes (if number is valid)
				ten = total % 10;
				if (ten == 0) {
					//converting input to barcode codes
					for (x = 0; x < str.length; x++) {
						String barcode = "";
						int c = 0;
						barcode = Character.toString(str[x]);
						c = Integer.parseInt(barcode);

						//creating the barcode
						if (x <= 5) { //left hand codes
							bar = left[c]; 
							char[] leftstr = bar.toCharArray();
							xt = 194 + (35 * x);
							
							//creating boxes per number
							for (i = 0; i < leftstr.length; i++) {
								String leftcode = "";
								leftcode = Character.toString(leftstr[i]);
								xval = 180 + (5 * i) + (35 * x);
								
								//box
								Rectangle rec = new Rectangle(xval, 150, 5, 200);
								if (leftcode.equals("1")) {
									rec.setFill(Color.BLACK);
								} else {
									rec.setFill(Color.TRANSPARENT);					
								}
								root.getChildren().add(rec);
							}
							
							//barcode number
							Text t = new Text();
							t.setTranslateX(xt);
							t.setTranslateY(375);
							t.setText(barcode);
							t.setFill(Color.BLACK);
							t.setFont(new Font(20));
							
							root.getChildren().add(t);
						} else { //right hand codes
							bar0 = right[c];
							char[] rightstr = bar0.toCharArray();
							yt = 220 + (35 * x);
							
							//creating boxes per number
							for (i = 0; i < rightstr.length; i++) {
								String rightcode = "";
								rightcode = Character.toString(rightstr[i]);
								yval = 205 + (5 * i) + (35 * x);
								
								//box
								Rectangle rec0 = new Rectangle(yval, 150, 5, 200);
								if (rightcode.equals("1")) {
									rec0.setFill(Color.BLACK);
								} else {
									rec0.setFill(Color.TRANSPARENT);					
								}
								root.getChildren().add(rec0);							
							}
							
							//barcode number
							Text t0 = new Text();
							t0.setTranslateX(yt);
							t0.setTranslateY(375);
							t0.setText(barcode);
							t0.setFill(Color.BLACK);
							t0.setFont(new Font(20));
							
							root.getChildren().add(t0);
						}
						
						//left bars
						Rectangle left1 = new Rectangle(163, 150, 5, 210);
						left1.setFill(Color.BLACK);
						
						Rectangle left2 = new Rectangle(172, 150, 5, 210);
						left2.setFill(Color.BLACK);
						
						//middle bars
						Rectangle mid1 = new Rectangle(395, 150, 5, 210);
						mid1.setFill(Color.BLACK);
						
						Rectangle mid2 = new Rectangle(404, 150, 5, 210);
						mid2.setFill(Color.BLACK);
						
						//right bars
						Rectangle right1 = new Rectangle(627, 150, 5, 210);
						right1.setFill(Color.BLACK);
						
						Rectangle right2 = new Rectangle(636, 150, 5, 210);
						right2.setFill(Color.BLACK);
						
						root.getChildren().addAll(left1, left2, mid1, mid2, right1, right2);
					}
				} else {
					root.getChildren().add(t);
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