package game.gui;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Screen;

public class MainMenu {
	Scene menu;
	Scene easy;
	Scene hard;
	Button htp;
	Button exit;
	Button start;
	GridPane gridPane;
	StackPane stackpane;
	BorderPane borderpane;
	RadioButton easyr;
	RadioButton hardr;
	HBox hb;
	HBox hb2;
	ToggleGroup tg;
	public MainMenu() 
	{
		 
		Image backgroundImage = new Image("mainmenu.jpg");
		ImageView backgroundImageView = new ImageView(backgroundImage);
	    backgroundImageView.setFitWidth(Screen.getPrimary().getVisualBounds().getWidth()); 
	    backgroundImageView.setFitHeight(Screen.getPrimary().getVisualBounds().getHeight()); 
		Image Title = new Image("title.png");
		ImageView title= new ImageView(Title);
	
		title.setFitWidth(Screen.getPrimary().getVisualBounds().getWidth()*0.5); 
		title.setFitHeight(Screen.getPrimary().getVisualBounds().getHeight()*0.5);
       
	Label l1=new Label("Choose difficulty:");
	Label l2=new Label("Need help?");
	Label l3= new Label("Easy");
	Label l4= new Label("Hard");
	
	l1.setFont(Font.font("Book Antiqua", FontWeight.BOLD, 50));
	l1.setTextFill(Color.WHITE);
	l1.setStyle("-fx-background-color: rgba(0, 0, 0, 0.5);-fx-effect: dropshadow(gaussian,rgba(0,0,0,0.75) , 10,0,0,1 );");
	l2.setFont(Font.font("Book Antiqua", FontWeight.BOLD, 40));
	l2.setTextFill(Color.WHITE);
	l2.setStyle("-fx-background-color: rgba(55, 15, 4, 0.3);-fx-effect: dropshadow(gaussian,rgba(0,0,0,0.75) , 10,0,0,1 );");
	l3.setFont(Font.font("Book Antiqua", FontWeight.BOLD, 40));
	l3.setTextFill(Color.WHITE);
	l3.setStyle("-fx-background-color: rgba(0, 0, 0, 0.5);-fx-effect: dropshadow(gaussian,rgba(0,0,0,0.75), 10,0,0,1 );");
	l4.setFont(Font.font("Book Antiqua", FontWeight.BOLD, 40));
	l4.setTextFill(Color.WHITE);
	l4.setStyle("-fx-background-color: rgba(0, 0, 0, 0.5);-fx-effect: dropshadow(gaussian,rgba(0,0,0,0.75), 10,0,0,1 );");
	easyr=new RadioButton();
	hardr=new RadioButton();
	tg=new ToggleGroup();
	easyr.setToggleGroup(tg);
	hardr.setToggleGroup(tg);
	hb= new HBox(25);
	hb.getChildren().addAll(easyr,l3,hardr,l4);


	htp=new Button("How to play?");
	exit=new Button("Exit");
	start= new Button("Start");
	
	htp.setPrefSize(190,90);
	htp.setStyle("-fx-font-family: 'Elephant'; -fx-font-size: 20;-fx-border-color: #751111;-fx-border-width:7px; ");
	exit.setPrefSize(130,60);
    exit.setStyle("-fx-background-color:#BD2811; -fx-font-size: 19;-fx-font-weight: bold;");
    start.setPrefSize(180,70);
    htp.setStyle("-fx-font-family: 'Elephant'; -fx-font-size: 20; ");
    start.setStyle("-fx-font-family: 'Elephant'; -fx-font-size: 20; ");

	VBox buttonslayout=new VBox(25);
	buttonslayout.setAlignment(Pos.CENTER);
	buttonslayout.getChildren().addAll(title,l1,hb,start,l2,htp,exit);
    
	start.setTranslateY(-130);
	l1.setTranslateY(-150);
	hb.setTranslateY(-150);
    hb.setTranslateX(600);
	l2.setTranslateY(-60);
	htp.setTranslateY(-60);
    exit.setTranslateY(-60);
    
    

	BorderPane menupane=new BorderPane();
	menupane.setCenter(buttonslayout);
	Rectangle r=new Rectangle(Screen.getPrimary().getVisualBounds().getWidth(),Screen.getPrimary().getVisualBounds().getHeight());
	r.setOpacity(0.5);
    
   StackPane root = new StackPane();
    root.getChildren().addAll(backgroundImageView,r, menupane);

    menu=new Scene(root,Screen.getPrimary().getVisualBounds().getWidth(),Screen.getPrimary().getVisualBounds().getHeight());
    	}	
	
}