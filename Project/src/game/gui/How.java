package game.gui;



import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;
import javafx.stage.Screen;


public class How {
	
	Scene howto;
	StackPane root;
	Rectangle r;
	Button back;
	GridPane p;
	GridPane p1;
	public How()
	{
	Label text1 = new Label("HOW TO PLAY");
	Label text2 = new Label("Defend the walls of Utopia District from the Titan invasion for"+'\n'+" as long as possible to achieve the highest score.");
	Label text3 = new Label("GAME BASICS");
	r = new Rectangle(Screen.getPrimary().getVisualBounds().getWidth(), Screen.getPrimary().getVisualBounds().getHeight(), Color.rgb(0, 0, 0, 0.5));

	
	
	text1.setFont(Font.font("Courier New", FontWeight.BOLD, 50));
	text1.setTextFill(Color.RED);

	text3.setFont(Font.font("Courier New", FontWeight.BOLD, 35));
	text3.setTextFill(Color.ORANGE);
	
	text2.setFont(Font.font("SimSun", 30));
	text2.setTextFill(Color.WHITE);
	
	Label text4 = new Label (" THE GAME CONSISTS OF:"+'\n'+"   1- Walls: Each lane has a wall section with HP. Walls weaken when attacked by Titans.\r\n"
			
			+ "   2- Titans: Titans are giant humanoids with HP, Damage, and other stats. There are four types:\r\n"
			+ "        - Pure Titan: HP: 100, Damage: 15, Speed: 10, Resources Value: 10, Danger Level: 1\r\n"
			+ "        - Abnormal Titan: HP: 100, Damage: 20, Speed: 15, Resources Value: 15, Danger Level: 2\r\n"
			+ "        - Armored Titan: HP: 200, Damage: 85, Speed: 10, Resources Value: 30, Danger Level: 3\r\n"
			+ "        - Colossal Titan: HP: 1000, Damage: 100, Speed: 5, Resources Value: 60, Danger Level: 4\r\n"
			
			+ "    3- Weapons: Deploy weapons to attack Titans and defend walls. Examples:\r\n"
			+ "        - Piercing Cannon: Price: 25, Damage: 10\r\n"
			+ "        - Sniper Cannon: Price: 25, Damage: 35\r\n"
			+ "        - Volley Spread Cannon: Price: 100, Damage: 5\r\n"
			+ "        - Wall Spread Cannon: Price: 20, Damage: 50\r\n"
			+ "        - Wall Trap: Price: 75, Damage: 100");	
	
	text4.setFont(Font.font("SimSun", 20));
	text4.setTextFill(Color.WHITE);
	
	Label text5 = new Label("WINNING AND LOSING");
	
	
	Label text6 = new Label ("Defeat Titans before all wall parts are destroyed to score high. Game ends when walls are breached.");
	text6.setStyle("-fx-font-family: 'Courier New'; -fx-font-size: 20; -fx-text-fill: white;");
	
	text6.setFont(Font.font("SimSun", 20));
	text6.setTextFill(Color.WHITE);
	
	Label text7 = new Label ("STRATEGY TIPS");
	
	
	text7.setFont(Font.font("Courier New", FontWeight.BOLD, 35));
	text7.setTextFill(Color.ORANGE);
	text5.setFont(Font.font("Courier New", FontWeight.BOLD, 35));
	text5.setTextFill(Color.ORANGE);
	
	Label text8 = new Label ("    Deploy weapons strategically.\r\n"
			+ "    Monitor wall health.\r\n"
			+ "    Use resources wisely.");
	text8.setStyle("-fx-font-family: 'Courier New'; -fx-font-size: 20; -fx-text-fill: white;");
	
	Label text9 = new Label ("BEST OF LUCK");
	text9.setFont(Font.font("Courier New", FontWeight.BOLD, 50));
	text9.setTextFill(Color.RED);
	
	back=new Button("Go Back");
	//back.setAlignment(Pos.CENTER_LEFT);
	back.setPrefSize(80, 50);
	back.setStyle("-fx-background-color: red; -fx-text-fill: white;");
	
	VBox box = new VBox(9);
	box.getChildren().addAll(text1,text2,text3,text4,text5,text6,text7,text8,text9);
	
	Image backgroundImage = new Image("htp.jpg");
    ImageView backgroundImageView = new ImageView(backgroundImage);
    backgroundImageView.setFitWidth(Screen.getPrimary().getVisualBounds().getWidth()); // Set your scene width
    backgroundImageView.setFitHeight(Screen.getPrimary().getVisualBounds().getHeight()); // Set your scene height
   
    
    text1.setStyle("-fx-background-color: rgba(0, 0, 0, 0.5);");
    text1.setMaxWidth(Screen.getPrimary().getVisualBounds().getWidth());
    text3.setStyle("-fx-background-color: rgba(0, 0, 0, 0.5);");
    text3.setMaxWidth(Screen.getPrimary().getVisualBounds().getWidth());
    text5.setStyle("-fx-background-color: rgba(0, 0, 0, 0.5); ");
    text5.setMaxWidth(Screen.getPrimary().getVisualBounds().getWidth());
    text7.setStyle("-fx-background-color: rgba(0, 0, 0, 0.5); ");
    text7.setMaxWidth(Screen.getPrimary().getVisualBounds().getWidth());
    text9.setStyle("-fx-background-color: rgba(0, 0, 0, 0.5); ");
    text9.setMaxWidth(Screen.getPrimary().getVisualBounds().getWidth());
    
    text1.setAlignment(Pos.TOP_CENTER);
    text5.setAlignment(Pos.TOP_CENTER);
    text7.setAlignment(Pos.TOP_CENTER);
    text9.setAlignment(Pos.TOP_CENTER);
    text3.setAlignment(Pos.TOP_CENTER);
    
    text2.setTextAlignment(TextAlignment.CENTER);
    text4.setTextAlignment(TextAlignment.CENTER);
    text8.setTextAlignment(TextAlignment.CENTER);
    p = new GridPane();
    p1= new GridPane();
    
    ImageView t1=null;
    ImageView t2=null;
    ImageView t3=null;
    ImageView t4=null;
	t1=new ImageView("pure.png");
	t2=new ImageView("abnormal.png");
	t3=new ImageView("clossal.png");
	t4=new ImageView("armored.png");
	
    Label tt1 = new Label("Pure Titan");
    Label tt2 = new Label("Abnormal Titan");
    Label tt3 = new Label("Colossal Titan");
    Label tt4 = new Label("Armored Titan");
	
	
	
    Label w1 = new Label("Wall Trap");
    Label w2 = new Label("Sniper Cannon");
    Label w3 = new Label("VolleySpread Cannon");
    Label w4 = new Label("Piercing Cannon");
	Image image = new Image("walltrap.jpeg");
	ImageView WT = new ImageView(image); 
	Image image2 = new Image("sniper.jpeg");
	ImageView SC = new ImageView(image2); 
	Image image3 = new Image("volleyspread.jpeg");
	ImageView VS = new ImageView(image3); 
	Image image4 = new Image("piercing.jpeg");
	ImageView PC = new ImageView(image4); 
	
	
	w1.setFont(Font.font("SimSun", 20));
	w1.setTextFill(Color.WHITE);
	
	w2.setFont(Font.font("SimSun", 20));
	w2.setTextFill(Color.WHITE);
	
	w3.setFont(Font.font("SimSun", 20));
	w3.setTextFill(Color.WHITE);
	
	w4.setFont(Font.font("SimSun", 20));
	w4.setTextFill(Color.WHITE);
	
	tt1.setFont(Font.font("SimSun", 20));
	tt1.setTextFill(Color.WHITE);
	
	
	tt2.setFont(Font.font("SimSun", 20));
	tt2.setTextFill(Color.WHITE);
	
	
	tt3.setFont(Font.font("SimSun", 20));
	tt3.setTextFill(Color.WHITE);
	
	
	tt4.setFont(Font.font("SimSun", 20));
	tt4.setTextFill(Color.WHITE);


	
	
	
	 WT.setFitWidth(70);
	 WT.setFitHeight(70);
	 SC.setFitWidth(70);
     SC.setFitHeight(70);
	 VS.setFitWidth(70);
	 VS.setFitHeight(70);
	 PC.setFitWidth(70);
	 PC.setFitHeight(70);
	 
	 t1.setFitWidth(70);
	 t1.setFitHeight(70);
	 t2.setFitWidth(70);
	 t2.setFitHeight(70);
	 t3.setFitWidth(70);
	 t3.setFitHeight(70);
	 t4.setFitWidth(70);
	 t4.setFitHeight(70);

	
	p.add(PC, 0, 0);
	p.add(w4, 1, 0);
	
	p.add(SC, 0, 1);
	p.add(w2, 1, 1);
	
	p.add(VS, 0, 2);
	p.add(w3, 1, 2);
	
	p.add(WT, 0, 3);
	p.add(w1, 1, 3);
	
	p.setTranslateY(200);
	
	p1.add(tt1, 0, 0);
	p1.add(t1, 1, 0);
	
	p1.add(tt2, 0, 1);
	p1.add(t2, 1, 1);
	
	p1.add(tt3, 0, 2);
	p1.add(t3, 1, 2);
	
	p1.add(tt4, 0, 3);
	p1.add(t4, 1, 3);
	
	p1.setTranslateY(200);
	p1.setTranslateX(1300);
	
    
    root = new StackPane();
    root.getChildren().add(backgroundImageView);
    root.getChildren().add(r);
    root.getChildren().add(box);
    root.getChildren().add(p);
    root.getChildren().add(p1);
    
    root.getChildren().add(back);
    
    back.setTranslateX(-710);
    back.setTranslateY(-380);
    
    box.setAlignment(Pos.TOP_CENTER);
    
	howto=new Scene(root,Screen.getPrimary().getVisualBounds().getWidth(),Screen.getPrimary().getVisualBounds().getHeight());
	
	
	}
}
