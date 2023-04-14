import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;

/**
 *
 * @author Chelsea
 */
public class lab12 extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
	@Override
	public void start(Stage primaryStage) {
		//window settings
		GridPane grid = new GridPane();
        Scene scene = new Scene(grid, 350, 200);
		grid.setVgap(4);
		grid.setHgap(10);
		grid.setPadding(new Insets(5, 5, 5, 5));
		primaryStage.setTitle("Temperature Conversion");
		
		//Fahrenheit box
		Label fahrenheit = new Label("Fahrenheit");
		grid.add(fahrenheit, 7, 0);
		TextField notification = new TextField();
		notification.clear();
		grid.add(notification, 8, 0);
		
		//Celsius box
		Label celsius = new Label("Celsius");
		grid.add(celsius, 7, 2);
		TextField notification0 = new TextField();
		notification0.clear();
		grid.add(notification0, 8, 2);
		
		//Kelvin box
		Label kelvin = new Label("Kelvin");
		grid.add(kelvin, 7, 4);
		TextField notification1 = new TextField();
		notification1.clear();
		grid.add(notification1, 8, 4);

		//user entered in fahrenheit
		notification.setOnAction(new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent a) {
			double c = 0;
			double k = 0;
			String c1 = "";
			String k1 = "";
			int ca = 0;
			int ka = 0;
			String n = "";
			n = notification.getText();
			c = Math.round(((Double.parseDouble(n) - 32) * 5 / 9) * 100) / 100;
			k = Math.round(((Double.parseDouble(n) - 32) * 5 / 9 + 273) * 100) / 100;
			ca = (int) c;
			ka = (int) k;
			c1 = Integer.toString(ca);
			k1 = Integer.toString(ka);
			notification0.setText(c1);
			notification1.setText(k1);
		}
		});
		
		//user entered in celsius
		notification0.setOnAction(new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent b) {
			double	f1 = 0;
			double k1 = 0;
			String f2 = "";
			String k2 = "";
			int f1b = 0;
			int k1b = 0;
			String n0 = "";
			n0 = notification0.getText();
			f1 = Math.round((Double.parseDouble(n0) * 9 / 5 + 32) * 100) / 100;
			k1 = Math.round(((Double.parseDouble(n0) + 273) * 100) / 100);
			f1b = (int) f1;
			k1b = (int) k1;
			f2 = Integer.toString(f1b);
			k2 = Integer.toString(k1b);
			notification.setText(f2);
			notification1.setText(k2);
		}
		});
		
		//user entered in kelvin
		notification1.setOnAction(new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent c) {
			double	f2 = 0;
			double c2 = 0;
			String f3 = "";
			String c3 = "";
			int f2c = 0;
			int c2c = 0;
			String n1 = "";
			n1 = notification1.getText();
			f2 = Math.round(((Double.parseDouble(n1) - 273) * 9 / 5 + 32) * 100) / 100;
			c2 = Math.round((Double.parseDouble(n1) - 273) * 100) / 100;
			f2c = (int) f2;
			c2c = (int) c2;
			f3 = Integer.toString(f2c);
			c3 = Integer.toString(c2c);
			notification.setText(f3);
			notification0.setText(c3);
		}
		});
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
    } // start
} // class