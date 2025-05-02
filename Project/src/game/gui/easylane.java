package game.gui;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;

public class easylane extends EasyMode {
	StackPane stack1;
	StackPane stack2;
	StackPane stack3;
	Button b1;
	Button b2;
	Button b3;
	GridPane lane1;
	GridPane lane2;
	GridPane lane3;
	VBox walls;
	VBox lanes;
	BorderPane pane;
	Scene easylane;

	HBox hbox1;
	HBox hbox2;
	HBox hbox3;
	VBox vbox;
	
	public easylane(){
		super.passTurn.setOpacity(0);
		super.weaponShop.setOpacity(0);
		cw11.setOpacity(0);
		cw21.setOpacity(0);
		cw31.setOpacity(0);
		cw41.setOpacity(0);
		cw12.setOpacity(0);
		cw22.setOpacity(0);
		cw32.setOpacity(0);
		cw42.setOpacity(0);
		cw13.setOpacity(0);
		cw23.setOpacity(0);
		cw33.setOpacity(0);
		cw43.setOpacity(0);
		b1= new Button("Lane 1");
		b2= new Button("Lane 2");
		b3= new Button("Lane 3");
		
		b1.setStyle("-fx-min-width: 1385px; -fx-min-height: 218px;-fx-font-size: 29;");
		b2.setStyle("-fx-min-width: 1385px; -fx-min-height: 218px;-fx-font-size: 29;");
		b3.setStyle("-fx-min-width: 1385px; -fx-min-height: 218px;-fx-font-size: 29;");
		b1.setOpacity(0);
		b2.setOpacity(0);
		b3.setOpacity(0);

		b1.setOnMouseEntered(e->{
			b1.setOpacity(0.8);
			b1.setStyle("-fx-background-color: red; -fx-text-fill: white;-fx-min-width: 1385px; -fx-min-height: 218px;-fx-font-size: 29;");
		});

		b2.setOnMouseEntered(e->{
			b2.setOpacity(0.8);
			b2.setStyle("-fx-background-color: red; -fx-text-fill: white;-fx-min-width: 1385px; -fx-min-height: 218px;-fx-font-size: 29;");
		});
		
		b3.setOnMouseEntered(e->{
			b3.setOpacity(0.8);
			b3.setStyle("-fx-background-color: red; -fx-text-fill: white;-fx-min-width: 1385px; -fx-min-height: 218px;-fx-font-size: 29;");
		});
		
		
		b1.setOnMouseExited(e->b1.setOpacity(0));
		b2.setOnMouseExited(e->b2.setOpacity(0));
		b3.setOnMouseExited(e->b3.setOpacity(0));
		

	    pane=new BorderPane();		    		    
	    vbox=new VBox(30);
	    vbox.getChildren().addAll(b1,b2,b3);

//	    vbox.setTranslateX(90);
//	    vbox.setTranslateY(216);
	    vbox.setTranslateX(73);
	    vbox.setTranslateY(73);
	    
	    pane.setCenter(vbox);
	    Label l = new Label("CLICK ON THE LANE YOU WANT TO SELECT");
	    
	    l.setStyle("-fx-text-fill: white;-fx-min-width: 1310px; -fx-min-height: 130.45px;-fx-font-size: 50;-fx-font-family: 'Courier New';");
	    l.setAlignment(Pos.TOP_CENTER);
	    l.setTranslateY(-260);
	    
	    b1.setStyle("-fx-min-width: 1385px; -fx-min-height: 218px;-fx-font-size: 29;");
		b2.setStyle("-fx-min-width: 1385px; -fx-min-height: 218px;-fx-font-size: 29;");
		b3.setStyle("-fx-min-width: 1385px; -fx-min-height: 218px;-fx-font-size: 29;");
		b1.setOpacity(0);
		b2.setOpacity(0);
		b3.setOpacity(0);

	    StackPane root = new StackPane();
	    root.getChildren().add(super.root);
	    root.getChildren().add(pane);
	    root.getChildren().add(l);
	    
	    
	    easylane=new Scene(root,Screen.getPrimary().getVisualBounds().getWidth(),Screen.getPrimary().getVisualBounds().getHeight());
	   }


	
}
	


