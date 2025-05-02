package game.gui;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Screen;

public class WeaponShop {
	GridPane WeaponsGrid;
	BorderPane screengrid;
	Scene weapons;
	Button back;
	Button PCbuy;
	Button SCbuy;
	Button VSbuy;
	Button WTbuy;
	Rectangle r;
	StackPane root;
	public WeaponShop(){
	Image image = new Image("walltrap.jpeg");

	//walltrap
	ImageView WT = new ImageView(image); 
	WT.setFitHeight(250);
	WT.setFitWidth(250);
	
	//sniper
	Image image2 = new Image("sniper.jpeg");
	ImageView SC = new ImageView(image2); 
	SC.setFitHeight(250);
	SC.setFitWidth(250);
	
	//volleyspread 
	Image image3 = new Image("volleyspread.jpeg");
	ImageView VS = new ImageView(image3); 
	VS.setFitHeight(250);
	VS.setFitWidth(250);
	
	//piercing 
	
	Image image4 = new Image("piercing.jpeg");
	ImageView PC = new ImageView(image4); 
	PC.setFitHeight(250);
	PC.setFitWidth(250);
	
	

	WeaponsGrid = new GridPane();
	screengrid = new BorderPane();
	WeaponsGrid.setPadding(new Insets(4));
	WeaponsGrid.setHgap(30);
	WeaponsGrid.setVgap(30);
	
	
	PCbuy = new Button("Click here to buy");
	SCbuy = new Button("Click here to buy");
	VSbuy = new Button("Click here to buy");
	WTbuy = new Button("Click here to buy");
	back=new Button("Go Back");
	
		
	VBox pcv = new VBox();
	Label pcl = new Label("Name: Anti Titan Shell"+ '\n' + "Type: piercing cannon"+'\n'+"Price: 25"+'\n'+"Damage: 10");
	
	pcv.getChildren().addAll(PC,PCbuy,pcl);
	
	VBox scv = new VBox();
	Label scl = new Label("Name: Long Range Spear"+ '\n' + "Type: Sniper Cannon "+'\n'+"Price: 25"+'\n'+"Damage: 35");
	
	scv.getChildren().addAll(SC,SCbuy,scl);
	VBox vsv = new VBox();
	Label vsl = new Label("Name: Wall Spread Cannon"+ '\n' + "Type: Volley Spread Cannon "+'\n'+"Price: 100"+'\n'+"Damage: 5");
	
	vsv.getChildren().addAll(VS,VSbuy,vsl);
	VBox wtv = new VBox();
	Label wtl = new Label("Name: Proximity Trap"+ '\n' + "Type: Wall Trap "+'\n'+"Price: 75"+'\n'+"Damage: 100");
	wtv.getChildren().addAll(WT,WTbuy,wtl);
	
	pcl.setFont(Font.font("Courier New", FontWeight.BOLD, 15));
	pcl.setTextFill(Color.RED);
	scl.setFont(Font.font("Courier New", FontWeight.BOLD, 15));
	scl.setTextFill(Color.RED);
	vsl.setFont(Font.font("Courier New", FontWeight.BOLD, 15));
	vsl.setTextFill(Color.RED);
	wtl.setFont(Font.font("Courier New", FontWeight.BOLD, 15));
	wtl.setTextFill(Color.RED);
	
	PCbuy.setStyle("-fx-background-color: orange; -fx-text-fill: white;");
	SCbuy.setStyle("-fx-background-color: orange; -fx-text-fill: white;");
	VSbuy.setStyle("-fx-background-color: orange; -fx-text-fill: white;");
	WTbuy.setStyle("-fx-background-color: orange; -fx-text-fill: white;");
	back.setStyle("-fx-background-color: red; -fx-text-fill: white;");
	back.prefWidth(100);
	back.prefHeight(50);	

   
    WeaponsGrid.setAlignment(Pos.CENTER);
	WeaponsGrid.add(pcv,0,0);
	WeaponsGrid.add(scv,0,1);
	WeaponsGrid.add(vsv,1,0);
	WeaponsGrid.add(wtv,1,1);
	screengrid.setCenter(WeaponsGrid);
	//screengrid.setStyle("-fx-background-color: black;");
	screengrid.setLeft(back);
	back.setTranslateX(10);
	back.setTranslateY(10);
	Image backgroundImage = new Image("lastlast.jpg");
    ImageView backgroundImageView = new ImageView(backgroundImage);
    backgroundImageView.setFitWidth(Screen.getPrimary().getVisualBounds().getWidth()); // Set your scene width
    backgroundImageView.setFitHeight(Screen.getPrimary().getVisualBounds().getHeight()); // Set your scene height
    r = new Rectangle(Screen.getPrimary().getVisualBounds().getWidth(), Screen.getPrimary().getVisualBounds().getHeight(), Color.rgb(0, 0, 0, 0.75));
    root = new StackPane();
    root.getChildren().add(backgroundImageView);
    root.getChildren().add(r);
    root.getChildren().add(screengrid);

	weapons = new Scene(root,Screen.getPrimary().getVisualBounds().getWidth(),Screen.getPrimary().getVisualBounds().getHeight());
	
	
	
	}
	

}
