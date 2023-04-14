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

/**
 *
 * @author Chelsea
 */
public class lab11 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setTitle("Java");
        
        //Rectangle
        Rectangle canvas0 = new Rectangle(110, 260, 275, 50); //coordinates for upper left corner
        canvas0.setFill(Color.BLACK);
        
        //Trasparent rectangle
        Rectangle canvas1 = new Rectangle(20, 140, 55, 200); //coordinates for upper left corner
        canvas1.setFill(Color.TRANSPARENT);
        canvas1.setStroke(Color.BLACK);
        canvas1.setStrokeWidth(1); 
        
        //Circle
        Circle canvas2 = new Circle();
        canvas2.setCenterX(210.0f);
        canvas2.setCenterY(150.0f);
        canvas2.setRadius(85.0f);
        canvas2.setFill(Color.TRANSPARENT);
        canvas2.setStroke(Color.BLACK);
        canvas2.setStrokeWidth(1);
        
        //Line
        Line canvas3 = new Line();
        canvas3.setStartX(210.0f);
        canvas3.setStartY(150.0f);
        canvas3.setEndX(30.0f);
        canvas3.setEndY(10.0f);
        canvas3.setStroke(Color.BLACK);
        
        //Oval
        Ellipse ellipse = new Ellipse(); {
            ellipse.setCenterX(65.0f);
            ellipse.setCenterY(35.0f);
            ellipse.setRadiusX(30.0f);
            ellipse.setRadiusY(25.0f);
            ellipse.setFill(Color.BLACK);
        }
        
        //"This is drawn on canvas"
        Text t = new Text();
        t.setX(110.0f);
        t.setY(45.0f);
        t.setText("This is drawn on canvas");
        t.setFill(Color.BLACK);
        t.setFont(new Font(20));
        
        root.getChildren().addAll(canvas0, canvas1, canvas2, canvas3, ellipse, t);
                
        //Color button
        Button btn = new Button();
        btn.setText("Change Color"); //Turn red
        btn.setTranslateX(85);
        btn.setTranslateY(350);
        
        Button btnq = new Button();
        btnq.setText("Change Color"); //Turn blue
        btnq.setTranslateX(85);
        btnq.setTranslateY(350);
        
        Button btnw = new Button();
        btnw.setText("Change Color"); //Turn green
        btnw.setTranslateX(85);
        btnw.setTranslateY(350);
                
        Button btne = new Button();
        btne.setText("Change Color"); //Turn black
        btne.setTranslateX(85);
        btne.setTranslateY(350);
        
        //Scale button
        Button btn1 = new Button(); 
        btn1.setText("Change Scale"); //Scale down to 25%
        btn1.setTranslateX(205);
        btn1.setTranslateY(350);
        
        Button btn2 = new Button(); 
        btn2.setText("Change Scale"); //Scale down to 50%
        btn2.setTranslateX(205);
        btn2.setTranslateY(350);
        
        Button btn3 = new Button(); 
        btn3.setText("Change Scale"); //Scale back to normal%
        btn3.setTranslateX(205);
        btn3.setTranslateY(350);
        
        root.getChildren().addAll(btn, btn1);
        
        //Changing color
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent a) {	//black to red
                root.getChildren().remove(btn);
                root.getChildren().add(btnq);
                canvas0.setFill(Color.RED);		//rectangle 
                canvas1.setStroke(Color.RED);   //rectangle (transparent)
                canvas2.setStroke(Color.RED);	//circle
                canvas3.setStroke(Color.RED);	//line
                ellipse.setFill(Color.RED);	    //oval
                t.setFill(Color.RED);			//text
        }
        });
        
        btnq.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent a1) {	
                root.getChildren().remove(btnq);//red to blue
                root.getChildren().add(btnw);				
                canvas0.setFill(Color.BLUE);	//rectangle
                canvas1.setStroke(Color.BLUE);	//rectangle (transparent)
                canvas2.setStroke(Color.BLUE);  //circle
                canvas3.setStroke(Color.BLUE);	//line
                ellipse.setFill(Color.BLUE);	//oval
                t.setFill(Color.BLUE);			//text
        }
        });
                
        btnw.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent a2) {
                root.getChildren().remove(btnw);//blue to green
                root.getChildren().add(btne);				
                canvas0.setFill(Color.GREEN);	//rectangle
                canvas1.setStroke(Color.GREEN);	//rectangle (transparent)
                canvas2.setStroke(Color.GREEN); //circle
                canvas3.setStroke(Color.GREEN);	//line
                ellipse.setFill(Color.GREEN);	//oval
                t.setFill(Color.GREEN);		    //text
        }
        });
        
        btne.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent a3) {
                root.getChildren().remove(btne);//green to black
                root.getChildren().add(btn);				
                canvas0.setFill(Color.BLACK);	//rectangle
                canvas1.setStroke(Color.BLACK);	//rectangle (transparent)
                canvas2.setStroke(Color.BLACK); //circle
                canvas3.setStroke(Color.BLACK);	//line
                ellipse.setFill(Color.BLACK);	//oval
                t.setFill(Color.BLACK);		    //text	
        }
        });
        
        //Changing scale
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent b) {
                root.getChildren().remove(btn1);//25%
                root.getChildren().add(btn2);				
                canvas0.setScaleX(0.25);		//rectangle
                canvas0.setScaleY(0.25);
                canvas0.setTranslateX(-185.625);
                canvas0.setTranslateY(-213.75);
                canvas1.setScaleX(0.25);		//rectangle (transparent)
                canvas1.setScaleY(0.25);
                canvas1.setTranslateX(-35.625);
                canvas1.setTranslateY(-180);
                canvas1.setStrokeWidth(0.25);								
                canvas2.setCenterX(52.5);		//circle
                canvas2.setCenterY(37.5);
                canvas2.setRadius(21.25);
                canvas2.setStrokeWidth(0.25);								
                canvas3.setStartX(52.5);		//line
                canvas3.setStartY(37.5);
                canvas3.setEndX(7.5);
                canvas3.setEndY(2.5);
                ellipse.setCenterX(16.25);		//oval
                ellipse.setCenterY(8.75);	
                ellipse.setRadiusX(7.5);
                ellipse.setRadiusY(6.25);
                t.setX(27.5);					//text
                t.setY(11.25);
                t.setFont(new Font(5));
        }
        });	

        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent b1) {
                root.getChildren().remove(btn2);//50%
                root.getChildren().add(btn3);							
                canvas0.setScaleX(0.5);			//rectangle
                canvas0.setScaleY(0.5);				
                canvas0.setTranslateX(-123.75);
                canvas0.setTranslateY(-142.5);
                canvas1.setScaleX(0.5);			//rectangle (transparent)
                canvas1.setScaleY(0.5);	
                canvas1.setTranslateX(-28.75);
                canvas1.setTranslateY(-120);
                canvas1.setStrokeWidth(0.5);				
                canvas2.setCenterX(105.0f);		//circle
                canvas2.setCenterY(75.0f);
                canvas2.setRadius(42.5);
                canvas2.setStrokeWidth(0.5);								
                canvas3.setStartX(105.0f);		//line
                canvas3.setStartY(75.0f);
                canvas3.setEndX(15.0f);
                canvas3.setEndY(5.0f);
                ellipse.setCenterX(32.5);		//oval
                ellipse.setCenterY(17.5);
                ellipse.setRadiusX(15.0f);
                ellipse.setRadiusY(12.5);
                t.setX(55.0f);					//text
                t.setY(22.5);
                t.setFont(new Font(10));
        }
        });		

        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent b2) {
                root.getChildren().remove(btn3);//100%
                root.getChildren().add(btn1);				
                canvas0.setScaleX(1);		//rectangle
                canvas0.setScaleY(1);
                canvas0.setTranslateX(0);
                canvas0.setTranslateY(0);
                canvas1.setScaleX(1);		//rectangle (transparent)
                canvas1.setScaleY(1);	
                canvas1.setTranslateX(0);
                canvas1.setTranslateY(0);
                canvas1.setStrokeWidth(1);													
                canvas2.setCenterX(210.0f);	//circle
                canvas2.setCenterY(150.0f);
                canvas2.setRadius(85.0f);
                canvas2.setStrokeWidth(1);								
                canvas3.setStartX(210.0f);	//line
                canvas3.setStartY(150.0f);
                canvas3.setEndX(30.0f);
                canvas3.setEndY(10.0f);
                ellipse.setCenterX(65.0f);	//oval
                ellipse.setCenterY(35.0f);
                ellipse.setRadiusX(30.0f);
                ellipse.setRadiusY(25.0f);
                t.setX(110.0f);				//text
                t.setY(45.0f);
                t.setFont(new Font(20));
        }
        });			
        primaryStage.setScene(scene);
        primaryStage.show();
    }//start
}//num