package game.gui;


import java.util.ArrayList;
import java.util.PriorityQueue;

import game.engine.Battle;
import game.engine.BattlePhase;
import game.engine.lanes.Lane;
import game.engine.titans.AbnormalTitan;
import game.engine.titans.ColossalTitan;
import game.engine.titans.PureTitan;
import game.engine.titans.Titan;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
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
import javafx.stage.Screen;

public class HardMode {
	GridPane lane1;
	GridPane lane2;
	GridPane lane3;
	GridPane lane4;
	GridPane lane5;
	VBox walls;
	VBox lanes;
	BorderPane pane;
	Scene hard;
	ImageView wall1;
	ImageView wall2;
	ImageView wall3;
	ImageView wall4;
	ImageView wall5;
	HBox info;
	Label score;
	Label resources;
	Label activeLanes;
	HBox hbox1;
	HBox hbox2;
	HBox hbox3;
	HBox hbox4;
	HBox hbox5;
	VBox vbox;
	Button weaponShop;
	Button passTurn;
	Label phase;
	Label currentTurn;
	StackPane root;
	WeaponShop weaponshop=new WeaponShop();
	StackPane slane1;
	StackPane slane2;
	StackPane slane3;
	StackPane slane4;
	StackPane slane5;
	public  int w11=0;
	public  int w21=0;
	public  int w31=0;
	public  int w41=0;
	public  int w12=0;
	public  int w22=0;
	public  int w32=0;
	public  int w42=0;
	public  int w13=0;
	public  int w23=0;
	public  int w33=0;
	public  int w43=0;
	public  int w14=0;
	public  int w24=0;
	public  int w34=0;
	public  int w44=0;
	public  int w15=0;
	public  int w25=0;
	public  int w35=0;
	public  int w45=0;
	Label cw11;
	Label cw21;
	Label cw31;
	Label cw41;
	Label cw12;
	Label cw22;
	Label cw32;
	Label cw42;
	Label cw13;
	Label cw23;
	Label cw33;
	Label cw43;
	Label cw14;
	Label cw24;
	Label cw34;
	Label cw44;
	Label cw15;
	Label cw25;
	Label cw35;
	Label cw45;
	ProgressBar hpw1;
	ProgressBar hpw2;
	ProgressBar hpw3;
	ProgressBar hpw4;
	ProgressBar hpw5;
	Label dl1;
	Label dl2;
	Label dl3;
	Label dl4;
	Label dl5;
	
	public HardMode() 
	{
	lane1=new GridPane();
    for (int i = 0; i < 50; i++) {
        ColumnConstraints column = new ColumnConstraints(25);
        lane1.getColumnConstraints().add(column);
    }
    for (int i = 0; i < 5; i++) {
        RowConstraints row = new RowConstraints(25);
        lane1.getRowConstraints().add(row);
    }
    lane2=new GridPane();
    for (int i = 0; i < 50; i++) {
        ColumnConstraints column = new ColumnConstraints(25);
        lane2.getColumnConstraints().add(column);
    }
    for (int i = 0; i < 5; i++) {
        RowConstraints row = new RowConstraints(25);
        lane2.getRowConstraints().add(row);
    }
    lane3=new GridPane();
    for (int i = 0; i < 50; i++) {
        ColumnConstraints column = new ColumnConstraints(25);
        lane3.getColumnConstraints().add(column);
    }
    for (int i = 0; i < 5; i++) {
        RowConstraints row = new RowConstraints(25);
        lane3.getRowConstraints().add(row);
    }
    lane4=new GridPane();
    for (int i = 0; i < 50; i++) {
        ColumnConstraints column = new ColumnConstraints(25);
        lane4.getColumnConstraints().add(column);
    }
    for (int i = 0; i < 5; i++) {
        RowConstraints row = new RowConstraints(25);
        lane4.getRowConstraints().add(row);
    }
    lane5=new GridPane();
    for (int i = 0; i < 50; i++) {
        ColumnConstraints column = new ColumnConstraints(25);
        lane5.getColumnConstraints().add(column);
    }
    for (int i = 0; i < 5; i++) {
        RowConstraints row = new RowConstraints(25);
        lane5.getRowConstraints().add(row);
    }
    
    Image lanebg=new Image("ground.png");
    ImageView blane1=new ImageView(lanebg);
    ImageView blane2=new ImageView(lanebg);
    ImageView blane3=new ImageView(lanebg);
    ImageView blane4=new ImageView(lanebg);
    ImageView blane5=new ImageView(lanebg);
    blane1.setFitWidth(1275);
    blane1.setFitHeight(125);
    blane2.setFitWidth(1275);
    blane2.setFitHeight(125);
    blane3.setFitWidth(1275);
    blane3.setFitHeight(125);
    blane4.setFitWidth(1275);
    blane4.setFitHeight(125);
    blane5.setFitWidth(1275);
    blane5.setFitHeight(125);
    blane1.setTranslateY(-5);
    blane2.setTranslateY(-5);
    blane3.setTranslateY(-5);
    blane4.setTranslateX(-5);
    blane4.setTranslateY(-5);
    blane5.setTranslateX(-5);
    blane5.setTranslateY(-5);
    
    slane1=new StackPane();
    slane2=new StackPane();
    slane3=new StackPane();
    slane4=new StackPane();
    slane5=new StackPane();
    
    slane1.getChildren().addAll(blane1,lane1);
    slane2.getChildren().addAll(blane2,lane2);
    slane3.getChildren().addAll(blane3,lane3);
    slane4.getChildren().addAll(blane4,lane4);
    slane5.getChildren().addAll(blane5,lane5);
    
    Image wall=new Image("wall.jpg");
    wall1=new ImageView(wall);
    wall2=new ImageView(wall);
    wall3=new ImageView(wall);
    wall4=new ImageView(wall);
    wall5=new ImageView(wall);
    wall1.setFitWidth(110);
    wall1.setFitHeight(125);
    wall2.setFitWidth(110);
    wall2.setFitHeight(125);
    wall3.setFitWidth(110);
    wall3.setFitHeight(125);
    wall4.setFitWidth(110);
    wall4.setFitHeight(125);
    wall5.setFitWidth(110);
    wall5.setFitHeight(125);
    
    Image piercing=new Image("piercing.png");
    ImageView piercingview1=new ImageView(piercing);
    ImageView piercingview2=new ImageView(piercing);
    ImageView piercingview3=new ImageView(piercing);
    ImageView piercingview4=new ImageView(piercing);
    ImageView piercingview5=new ImageView(piercing);
    piercingview1.setFitWidth(40);
    piercingview1.setFitHeight(30);
    piercingview2.setFitWidth(40);
    piercingview2.setFitHeight(30);
    piercingview3.setFitWidth(40);
    piercingview3.setFitHeight(30);
    piercingview4.setFitWidth(40);
    piercingview4.setFitHeight(30);
    piercingview5.setFitWidth(40);
    piercingview5.setFitHeight(30);
    Image sniper=new Image("sniper.png");
    ImageView sniper1=new ImageView(sniper);
    ImageView sniper2=new ImageView(sniper);
    ImageView sniper3=new ImageView(sniper);
    ImageView sniper4=new ImageView(sniper);
    ImageView sniper5=new ImageView(sniper);
    sniper1.setFitWidth(40);
    sniper1.setFitHeight(30);
    sniper2.setFitWidth(40);
    sniper2.setFitHeight(30);
    sniper3.setFitWidth(40);
    sniper3.setFitHeight(30);
    sniper4.setFitWidth(40);
    sniper4.setFitHeight(30);
    sniper5.setFitWidth(40);
    sniper5.setFitHeight(30);
    Image volley=new Image("volleyspread.png");
    ImageView volley1=new ImageView(volley);
    ImageView volley2=new ImageView(volley);
    ImageView volley3=new ImageView(volley);
    ImageView volley4=new ImageView(volley);
    ImageView volley5=new ImageView(volley);
    volley1.setFitWidth(40);
    volley1.setFitHeight(30);
    volley2.setFitWidth(40);
    volley2.setFitHeight(30);
    volley3.setFitWidth(40);
    volley3.setFitHeight(30);
    volley4.setFitWidth(40);
    volley4.setFitHeight(30);
    volley5.setFitWidth(40);
    volley5.setFitHeight(30);
    Image walltrap=new Image("walltrap.png");
    ImageView walltrap1=new ImageView(walltrap);
    ImageView walltrap2=new ImageView(walltrap);
    ImageView walltrap3=new ImageView(walltrap);
    ImageView walltrap4=new ImageView(walltrap);
    ImageView walltrap5=new ImageView(walltrap);
    walltrap1.setFitWidth(40);
    walltrap1.setFitHeight(30);
    walltrap2.setFitWidth(40);
    walltrap2.setFitHeight(30);
    walltrap3.setFitWidth(40);
    walltrap3.setFitHeight(30);
    walltrap4.setFitWidth(40);
    walltrap4.setFitHeight(30);
    walltrap5.setFitWidth(40);
    walltrap5.setFitHeight(30);
    
    cw11=new Label("0");
    cw21=new Label("0");
    cw31=new Label("0");
    cw41=new Label("0");
   
    cw12=new Label("0");
    cw22=new Label("0");
    cw32=new Label("0");
    cw42=new Label("0");
   
    cw13=new Label("0");
    cw23=new Label("0");
    cw33=new Label("0");
    cw43=new Label("0");
    
    cw14=new Label("0");
    cw24=new Label("0");
    cw34=new Label("0");
    cw44=new Label("0");
    
    cw15=new Label("0");
    cw25=new Label("0");
    cw35=new Label("0");
    cw45=new Label("0");
    
    cw11.setStyle("-fx-text-fill: white;-fx-min-width: 43.75px; -fx-min-height: 43.75px;-fx-font-size: 20;-fx-font-family: 'Courier New';-fx-font-weight: bold;");
    cw21.setStyle("-fx-text-fill: white;-fx-min-width: 43.75px; -fx-min-height: 43.75px;-fx-font-size: 20;-fx-font-family: 'Courier New';-fx-font-weight: bold;");
    cw31.setStyle("-fx-text-fill: white;-fx-min-width: 43.75px; -fx-min-height: 43.75px;-fx-font-size: 20;-fx-font-family: 'Courier New';-fx-font-weight: bold;");
    cw41.setStyle("-fx-text-fill: white;-fx-min-width: 43.75px; -fx-min-height: 43.75px;-fx-font-size: 20;-fx-font-family: 'Courier New';-fx-font-weight: bold;");
    
    cw12.setStyle("-fx-text-fill: white;-fx-min-width: 43.75px; -fx-min-height: 43.75px;-fx-font-size: 20;-fx-font-family: 'Courier New';-fx-font-weight: bold;");
    cw22.setStyle("-fx-text-fill: white;-fx-min-width: 43.75px; -fx-min-height: 43.75px;-fx-font-size: 20;-fx-font-family: 'Courier New';-fx-font-weight: bold;");
    cw32.setStyle("-fx-text-fill: white;-fx-min-width: 43.75px; -fx-min-height: 43.75px;-fx-font-size: 20;-fx-font-family: 'Courier New';-fx-font-weight: bold;");
    cw42.setStyle("-fx-text-fill: white;-fx-min-width: 43.75px; -fx-min-height: 43.75px;-fx-font-size: 20;-fx-font-family: 'Courier New';-fx-font-weight: bold;");
    
    cw13.setStyle("-fx-text-fill: white;-fx-min-width: 43.75px; -fx-min-height: 43.75px;-fx-font-size: 20;-fx-font-family: 'Courier New';-fx-font-weight: bold;");
    cw23.setStyle("-fx-text-fill: white;-fx-min-width: 43.75px; -fx-min-height: 43.75px;-fx-font-size: 20;-fx-font-family: 'Courier New';-fx-font-weight: bold;");
    cw33.setStyle("-fx-text-fill: white;-fx-min-width: 43.75px; -fx-min-height: 43.75px;-fx-font-size: 20;-fx-font-family: 'Courier New';-fx-font-weight: bold;");
    cw43.setStyle("-fx-text-fill: white;-fx-min-width: 43.75px; -fx-min-height: 43.75px;-fx-font-size: 20;-fx-font-family: 'Courier New';-fx-font-weight: bold;");
    
    cw14.setStyle("-fx-text-fill: white;-fx-min-width: 43.75px; -fx-min-height: 43.75px;-fx-font-size: 20;-fx-font-family: 'Courier New';-fx-font-weight: bold;");
    cw24.setStyle("-fx-text-fill: white;-fx-min-width: 43.75px; -fx-min-height: 43.75px;-fx-font-size: 20;-fx-font-family: 'Courier New';-fx-font-weight: bold;");
    cw34.setStyle("-fx-text-fill: white;-fx-min-width: 43.75px; -fx-min-height: 43.75px;-fx-font-size: 20;-fx-font-family: 'Courier New';-fx-font-weight: bold;");
    cw44.setStyle("-fx-text-fill: white;-fx-min-width: 43.75px; -fx-min-height: 43.75px;-fx-font-size: 20;-fx-font-family: 'Courier New';-fx-font-weight: bold;");
   
    cw15.setStyle("-fx-text-fill: white;-fx-min-width: 43.75px; -fx-min-height: 43.75px;-fx-font-size: 20;-fx-font-family: 'Courier New';-fx-font-weight: bold;");
    cw25.setStyle("-fx-text-fill: white;-fx-min-width: 43.75px; -fx-min-height: 43.75px;-fx-font-size: 20;-fx-font-family: 'Courier New';-fx-font-weight: bold;");
    cw35.setStyle("-fx-text-fill: white;-fx-min-width: 43.75px; -fx-min-height: 43.75px;-fx-font-size: 20;-fx-font-family: 'Courier New';-fx-font-weight: bold;");
    cw45.setStyle("-fx-text-fill: white;-fx-min-width: 43.75px; -fx-min-height: 43.75px;-fx-font-size: 20;-fx-font-family: 'Courier New';-fx-font-weight: bold;");

    hpw1=new ProgressBar(1);
    hpw2=new ProgressBar(1);
    hpw3=new ProgressBar(1);
    hpw4=new ProgressBar(1);
    hpw5=new ProgressBar(1);
    hpw1.setPrefWidth(110);
    hpw1.setPrefHeight(12);
    hpw2.setPrefWidth(110);
    hpw2.setPrefHeight(12);
    hpw3.setPrefWidth(110);
    hpw3.setPrefHeight(12);
    hpw4.setPrefWidth(110);
    hpw4.setPrefHeight(12);
    hpw5.setPrefWidth(110);
    hpw5.setPrefHeight(12);
    hpw1.setStyle("-fx-accent: green;");
    hpw2.setStyle("-fx-accent: green;");
    hpw3.setStyle("-fx-accent: green;");
    hpw4.setStyle("-fx-accent: green;");
    hpw5.setStyle("-fx-accent: green;");
    
    GridPane g1=new GridPane();
    GridPane g2=new GridPane();
    GridPane g3=new GridPane();
    GridPane g4=new GridPane();
    GridPane g5=new GridPane();
    for (int i = 0; i < 2; i++) {
        ColumnConstraints column = new ColumnConstraints(55);
        g1.getColumnConstraints().add(column);
    }
    for (int i = 0; i < 4; i++) {
        RowConstraints row = new RowConstraints(30);
        g1.getRowConstraints().add(row);}
    for (int i = 0; i < 2; i++) {
        ColumnConstraints column = new ColumnConstraints(55);
        g2.getColumnConstraints().add(column);
    }
    for (int i = 0; i < 4; i++) {
        RowConstraints row = new RowConstraints(30);
        g2.getRowConstraints().add(row);}
    for (int i = 0; i < 2; i++) {
        ColumnConstraints column = new ColumnConstraints(55);
        g3.getColumnConstraints().add(column);
    }
    for (int i = 0; i < 4; i++) {
        RowConstraints row = new RowConstraints(30);
        g3.getRowConstraints().add(row);}
    for (int i = 0; i < 2; i++) {
        ColumnConstraints column = new ColumnConstraints(55);
        g4.getColumnConstraints().add(column);
    }
    for (int i = 0; i < 4; i++) {
        RowConstraints row = new RowConstraints(30);
        g4.getRowConstraints().add(row);}
    for (int i = 0; i < 2; i++) {
        ColumnConstraints column = new ColumnConstraints(55);
        g5.getColumnConstraints().add(column);
    }
    for (int i = 0; i < 4; i++) {
        RowConstraints row = new RowConstraints(30);
        g5.getRowConstraints().add(row);}
    g1.add(cw11, 0, 0);
    g1.add(piercingview1, 1, 0);
    g1.add(cw21, 0, 1);
    g1.add(sniper1, 1, 1);
    g1.add(cw31, 0, 2);
    g1.add(volley1, 1, 2);
    g1.add(cw41, 0, 3);
    g1.add(walltrap1, 1, 3);
    
    g2.add(cw12, 0, 0);
    g2.add(piercingview2, 1, 0);
    g2.add(cw22, 0, 1);
    g2.add(sniper2, 1, 1);
    g2.add(cw32, 0, 2);
    g2.add(volley2, 1, 2);
    g2.add(cw42, 0, 3);
    g2.add(walltrap2, 1, 3);
    
    g3.add(cw13, 0, 0);
    g3.add(piercingview3, 1, 0);
    g3.add(cw23, 0, 1);
    g3.add(sniper3, 1, 1);
    g3.add(cw33, 0, 2);
    g3.add(volley3, 1, 2);
    g3.add(cw43, 0, 3);
    g3.add(walltrap3, 1, 3);
    
    g4.add(cw14, 0, 0);
    g4.add(piercingview4, 1, 0);
    g4.add(cw24, 0, 1);
    g4.add(sniper4, 1, 1);
    g4.add(cw34, 0, 2);
    g4.add(volley4, 1, 2);
    g4.add(cw44, 0, 3);
    g4.add(walltrap4, 1, 3);
    
    g5.add(cw15, 0, 0);
    g5.add(piercingview5, 1, 0);
    g5.add(cw25, 0, 1);
    g5.add(sniper5, 1, 1);
    g5.add(cw35, 0, 2);
    g5.add(volley5, 1, 2);
    g5.add(cw45, 0, 3);
    g5.add(walltrap5, 1, 3);
    
    dl1=new Label("Danger Lvl:0");
    dl2=new Label("Danger Lvl:0");
    dl3=new Label("Danger Lvl:0");
    dl4=new Label("Danger Lvl:0");
    dl5=new Label("Danger Lvl:0");
    dl1.setTranslateY(-2);
    dl2.setTranslateY(-2);
    dl3.setTranslateY(-2);
    dl4.setTranslateY(-2);
    dl5.setTranslateY(-2);
    
    hpw1.setTranslateX(4);
    hpw2.setTranslateX(4);
    hpw3.setTranslateX(4);
    hpw4.setTranslateX(4);
    hpw5.setTranslateX(4);
    
    dl1.setStyle("-fx-text-fill: white;-fx-min-width: 10px; -fx-min-height: 5px;-fx-font-size: 13;-fx-font-family: 'Courier New';-fx-font-weight: bold;");
    dl2.setStyle("-fx-text-fill: white;-fx-min-width: 10px; -fx-min-height: 5px;-fx-font-size: 13;-fx-font-family: 'Courier New';-fx-font-weight: bold;");
    dl3.setStyle("-fx-text-fill: white;-fx-min-width: 10px; -fx-min-height: 5px;-fx-font-size: 13;-fx-font-family: 'Courier New';-fx-font-weight: bold;");
    dl4.setStyle("-fx-text-fill: white;-fx-min-width: 10px; -fx-min-height: 5px;-fx-font-size: 13;-fx-font-family: 'Courier New';-fx-font-weight: bold;");
    dl5.setStyle("-fx-text-fill: white;-fx-min-width: 10px; -fx-min-height: 5px;-fx-font-size: 13;-fx-font-family: 'Courier New';-fx-font-weight: bold;");
    
    StackPane swall1=new StackPane();
    StackPane swall2=new StackPane();
    StackPane swall3=new StackPane();
    StackPane swall4=new StackPane();
    StackPane swall5=new StackPane();
    
    swall1.getChildren().addAll(wall1,g1);
    swall2.getChildren().addAll(wall2,g2);
    swall3.getChildren().addAll(wall3,g3);
    swall4.getChildren().addAll(wall4,g4);
    swall5.getChildren().addAll(wall5,g5);
    
    VBox v1=new VBox();
    VBox v2=new VBox();
    VBox v3=new VBox();
    VBox v4=new VBox();
    VBox v5=new VBox();
    v1.getChildren().addAll(dl1,hpw1,swall1);
    v2.getChildren().addAll(dl2,hpw2,swall2);
    v3.getChildren().addAll(dl3,hpw3,swall3);
    v4.getChildren().addAll(dl4,hpw4,swall4);
    v5.getChildren().addAll(dl5,hpw5,swall5);
    v1.setTranslateY(-13);
    v2.setTranslateY(-13);
    v3.setTranslateY(-13);
    v4.setTranslateY(-13);
    v5.setTranslateY(-13);
    v1.setTranslateX(3);
    v2.setTranslateX(3);
    v3.setTranslateX(3);
    
    dl1.setTranslateX(-5);
    dl2.setTranslateX(-5);
    dl3.setTranslateX(-5);
    dl4.setTranslateX(-5);
    dl5.setTranslateX(-5);
    
    
    
    info=new HBox(30);
    info.setAlignment(Pos.CENTER);
    score=new Label("Score= 0");
    resources=new Label("Available Resources= "+125*5);
    activeLanes=new Label("Active Lanes= 5");
    this.currentTurn=new Label("Current Turn= 1");
    this.phase=new Label("Current Phase: EARLY");
    this.passTurn=new Button("Pass Turn");
    this.weaponShop=new Button("Weapon Shop");
    passTurn.setStyle("-fx-background-color: green;-fx-text-fill: white;-fx-min-width: 10px; -fx-min-height: 5px;-fx-font-size: 12;-fx-font-family: 'Courier New';-fx-font-weight: bold;");
    weaponShop.setStyle("-fx-background-color: green;-fx-text-fill: white;-fx-min-width: 10px; -fx-min-height: 5px;-fx-font-size: 12;-fx-font-family: 'Courier New';-fx-font-weight: bold;");
    passTurn.setPrefSize(100, 40);
    weaponShop.setPrefSize(100, 40);
    this.passTurn.setOpacity(1);
    this.weaponShop.setOpacity(1);
    
    pane=new BorderPane();
    score.setStyle("-fx-text-fill: #ffffff;");
    resources.setStyle("-fx-text-fill: #ffffff;");
    activeLanes.setStyle("-fx-text-fill: #ffffff;");
    currentTurn.setStyle("-fx-text-fill: #ffffff;");
    phase.setStyle("-fx-text-fill: #ffffff;");
    info.getChildren().addAll(weaponShop,passTurn,score,resources,activeLanes,currentTurn,phase);
    
    hbox1=new HBox();
    hbox2=new HBox();
    hbox3=new HBox();
    hbox4=new HBox();
    hbox5=new HBox();
    hbox1.getChildren().addAll(v1,slane1);
    hbox2.getChildren().addAll(v2,slane2);
    hbox3.getChildren().addAll(v3,slane3);
    hbox4.getChildren().addAll(v4,slane4);
    hbox5.getChildren().addAll(v5,slane5);
    vbox=new VBox();
    vbox.getChildren().addAll(hbox1,hbox2,hbox3,hbox4,hbox5);
    info.setTranslateY(5);
    StackPane sp=new StackPane();
    Rectangle bg1=new Rectangle(Screen.getPrimary().getVisualBounds().getWidth(),60);
    bg1.setFill(Color.web("9d0c0c"));
    sp.getChildren().addAll(bg1,info);
    pane.setTop(sp);
    vbox.setTranslateX(65);
    vbox.setTranslateY(15);
    pane.setCenter(vbox);
    wall1.setTranslateY(-1);
    wall2.setTranslateY(-1);
    wall3.setTranslateY(-1);
    wall4.setTranslateY(-1);
    wall5.setTranslateY(-1);
    wall1.setTranslateX(2);
    wall2.setTranslateX(2);
    wall3.setTranslateX(2);
    cw11.setTranslateX(10);cw21.setTranslateX(10);cw31.setTranslateX(10);cw41.setTranslateX(10);
    cw12.setTranslateX(10);cw22.setTranslateX(10);cw32.setTranslateX(10);cw42.setTranslateX(10);
    cw13.setTranslateX(10);cw23.setTranslateX(10);cw33.setTranslateX(10);cw43.setTranslateX(10);
    cw14.setTranslateX(10);cw24.setTranslateX(10);cw34.setTranslateX(10);cw44.setTranslateX(10);
    cw15.setTranslateX(10);cw25.setTranslateX(10);cw35.setTranslateX(10);cw45.setTranslateX(10);
    v1.setTranslateY(-17);
    v2.setTranslateY(-17);
    v3.setTranslateY(-17);
    v4.setTranslateY(-17);
    v5.setTranslateY(-17);
    
    
   phase.setStyle("-fx-text-fill: #ffffff;");
    Image backgroundImage = new Image("pic.jpeg");
    ImageView backgroundImageView = new ImageView(backgroundImage);
    backgroundImageView.setFitWidth(Screen.getPrimary().getVisualBounds().getWidth()); // Set your scene width
    backgroundImageView.setFitHeight(Screen.getPrimary().getVisualBounds().getHeight()); // Set your scene height
    root = new StackPane();
    root.getChildren().add(backgroundImageView);
    root.getChildren().add(pane);
    hard=new Scene(root,Screen.getPrimary().getVisualBounds().getWidth(),Screen.getPrimary().getVisualBounds().getHeight());
   }
	private void addTitans(ArrayList<Lane> lanes) 
	{
		int i=1;
		lane1.getChildren().clear();
		lane2.getChildren().clear();
		lane3.getChildren().clear();
		lane4.getChildren().clear();
		lane5.getChildren().clear();	
		for(Lane lane:lanes) 
		{
			GridPane currentLane = null;
			switch (i) 
            {
                case 1:currentLane= lane1;break;
                case 2:currentLane= lane2;break;
                case 3:currentLane= lane3;break;
                case 4:currentLane= lane4;break;
                case 5:currentLane= lane5;break;
            }
			if(!lane.isLaneLost()) 
			{
            int row=0;
			PriorityQueue<Titan> titans=lane.getTitans();
			for(Titan titan:titans)
			{
				ImageView titanImage=null;
				if(titan instanceof PureTitan)
				{
					titanImage=new ImageView("pure.png");
					titanImage.setFitWidth(60);
					titanImage.setFitHeight(60);
				}
				else if(titan instanceof AbnormalTitan)
				{
					titanImage=new ImageView("abnormal.png");
					titanImage.setFitWidth(40);
					titanImage.setFitHeight(40);
				}
				else if(titan instanceof ColossalTitan)
				{
					titanImage=new ImageView("clossal.png");
					titanImage.setFitWidth(60);
					titanImage.setFitHeight(90);
				}
				else
				{
					titanImage=new ImageView("armored.png");
					titanImage.setFitWidth(60);
					titanImage.setFitHeight(60);
				}
				
				ProgressBar healthBar = new ProgressBar(1);
	            healthBar.setMaxWidth(60);
	            healthBar.setMinWidth(0);
	            healthBar.setMaxHeight(10);
	            healthBar.setMinHeight(10);
	            healthBar.setStyle("-fx-accent: green;");
	            Double currentHealth=(double) titan.getCurrentHealth();
	            Double BaseHealth=(double) titan.getBaseHealth();
	            healthBar.setProgress(currentHealth/BaseHealth);
	            VBox vbox=new VBox();
	            vbox.getChildren().addAll(healthBar,titanImage);
	            currentLane.add(vbox, titan.getDistance()>0?titan.getDistance()-1:0, row);
				row++;
				if(row>=5)
					row=0;
			}
			
		}i++;}
	}
	private void lostLanes(ArrayList<Lane> lanes) {
		Label Lost1 = new Label("Lost Lane!");
		Lost1.setFont(Font.font("SimSun", 50));
		Lost1.setTextFill(Color.WHITE);
		Label Lost2 = new Label("Lost Lane!");
		Lost2.setFont(Font.font("SimSun", 50));
		Lost2.setTextFill(Color.WHITE);
		Label Lost3 = new Label("Lost Lane!");
		Lost3.setFont(Font.font("SimSun", 50));
		Lost3.setTextFill(Color.WHITE);
		Label Lost4 = new Label("Lost Lane!");
		Lost4.setFont(Font.font("SimSun", 50));
		Lost4.setTextFill(Color.WHITE);
		Label Lost5 = new Label("Lost Lane!");
		Lost5.setFont(Font.font("SimSun", 50));
		Lost5.setTextFill(Color.WHITE);
		Lane Lane1=lanes.get(0);
		Lane Lane2=lanes.get(1);
		Lane Lane3=lanes.get(2);
		Lane Lane4=lanes.get(3);
		Lane Lane5=lanes.get(4);
		Rectangle black1=new Rectangle(1360,130);
		Rectangle black2=new Rectangle(1360,130);
		Rectangle black3=new Rectangle(1360,130);
		Rectangle black4=new Rectangle(1360,130);
		Rectangle black5=new Rectangle(1360,130);
		StackPane ss1 = new StackPane();
		StackPane ss2 = new StackPane();
		StackPane ss3 = new StackPane();
		StackPane ss4 = new StackPane();
		StackPane ss5 = new StackPane();
		if(Lane1.isLaneLost()) {
			hbox1.getChildren().clear();
			ss1.getChildren().addAll(black1,Lost1);
			hbox1.getChildren().add(ss1);
			}
		if(Lane2.isLaneLost()) 
		{
			hbox2.getChildren().clear();
			ss2.getChildren().addAll(black2,Lost2);
			hbox2.getChildren().add(ss2);
			}
		if(Lane3.isLaneLost()) 
		{
			hbox3.getChildren().clear();
			ss3.getChildren().addAll(black3,Lost3);
			hbox3.getChildren().add(ss3);
			}
		if(Lane4.isLaneLost()) 
		{
			hbox4.getChildren().clear();
			ss4.getChildren().addAll(black4,Lost4);
			hbox4.getChildren().add(ss4);
			}
		if(Lane5.isLaneLost()) 
		{
			hbox5.getChildren().clear();
			ss5.getChildren().addAll(black5,Lost5);
			hbox5.getChildren().add(ss5);
			}
		vbox.getChildren().clear();
		vbox.getChildren().addAll(hbox1,hbox2,hbox3,hbox4,hbox5);
		}
	private void updateViewInfo(int score,int resources,BattlePhase battlePhase,int active,int turn) 
	{
		cw11.setText(""+w11);
		cw21.setText(""+w21);
		cw31.setText(""+w31);
		cw41.setText(""+w41);
		
		cw12.setText(""+w12);
		cw22.setText(""+w22);
		cw32.setText(""+w32);
		cw42.setText(""+w42);
		
		cw13.setText(""+w13);
		cw23.setText(""+w23);
		cw33.setText(""+w33);
		cw43.setText(""+w43);
		
		cw14.setText(""+w14);
		cw24.setText(""+w24);
		cw34.setText(""+w34);
		cw44.setText(""+w44);
		
		cw15.setText(""+w15);
		cw25.setText(""+w25);
		cw35.setText(""+w35);
		cw45.setText(""+w45);
		
		this.score.setText("Score= "+score);
		this.resources.setText("Available Resources= "+resources);
		this.currentTurn.setText("Current Turn= "+turn);
		this.phase.setText("Current Phase: " + battlePhase);
		this.activeLanes.setText("Active Lanes= "+active);
	}
	public void updateView(Battle battle)
	{
		this.lostLanes(battle.getOriginalLanes());
		this.updateViewInfo(battle.getScore(), battle.getResourcesGathered(), battle.getBattlePhase(),
				battle.getLanes().size(), battle.getNumberOfTurns());
		System.out.println(battle.getOriginalLanes().size());
		this.addTitans(battle.getOriginalLanes());
		this.updateWallHealth(battle.getOriginalLanes());
		this.updateDangerLevels(battle.getOriginalLanes());
	}
	private void updateWallHealth(ArrayList<Lane> lanes) {
		Lane lane1=lanes.get(0);
		Lane lane2=lanes.get(1);
		Lane lane3=lanes.get(2);
		Lane lane4=lanes.get(3);
		Lane lane5=lanes.get(4);
		Double base=(double)lane1.getLaneWall().getBaseHealth();
		Double current1=(double)lane1.getLaneWall().getCurrentHealth();
		Double current2=(double)lane2.getLaneWall().getCurrentHealth();
		Double current3=(double)lane3.getLaneWall().getCurrentHealth();
		Double current4=(double)lane4.getLaneWall().getCurrentHealth();
		Double current5=(double)lane5.getLaneWall().getCurrentHealth();
		hpw1.setProgress(current1/base);
		hpw2.setProgress(current2/base);
		hpw3.setProgress(current3/base);
		hpw4.setProgress(current4/base);
		hpw5.setProgress(current5/base);
	}
	private void updateDangerLevels(ArrayList<Lane> lanes) {
		int i=1;
		for(Lane lane:lanes) {
			String s=""+lane.getDangerLevel();
			switch(i)
			{
			case 1:dl1.setText("Danger Lvl:"+s);break;
			case 2:dl2.setText("Danger Lvl:"+s);break;
			case 3:dl3.setText("Danger Lvl:"+s);break;
			case 4:dl4.setText("Danger Lvl:"+s);break;
			case 5:dl5.setText("Danger Lvl:"+s);break;
			}
			i++;
		}
	}

	
	

}