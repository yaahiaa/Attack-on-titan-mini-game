package game.gui;


import java.io.IOException;

import game.engine.Battle;
import game.engine.exceptions.InsufficientResourcesException;
import game.engine.exceptions.InvalidLaneException;
import game.engine.lanes.Lane;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
//import javafx.scene.control.Alert;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Controller extends Application {

	MainMenu mainmenu=new MainMenu();
	Battle battle;
	EasyMode easymode=new EasyMode();
    HardMode hardmode=new HardMode();
	How howtoplay=new How();
	easylane elane = new easylane();
	hardlane hlane=new hardlane();
	int w = 0;
	int l = 0;
	public void start(Stage stage) throws Exception {
		try
		{	
			Image icon=new Image("icon.jpeg");
			stage.getIcons().add(icon);
			stage.setTitle("Attack on Titan: Utopia");
			stage.setScene(mainmenu.menu);
			mainmenu.start.setOnAction(e->{
				
				if (mainmenu.easyr.isSelected()) 
				{
					try {
						battle=new Battle(1,0,50,3,250);
					} catch (IOException e1) {
						
					}  
					stage.setScene(easymode.easy);
		        } 
				else if (mainmenu.hardr.isSelected()) 
				{
					try {
						battle=new Battle(1,0,50,5,125);
					} catch (IOException e1) {
						
					}
					stage.setScene(hardmode.hard);
					stage.setMaximized(false);
					stage.setMaximized(true);
		        }
				});
				
			easymode.weaponShop.setOnAction(e->
			{
				stage.setScene(easymode.weaponshop.weapons);
			});
			easymode.weaponshop.back.setOnAction(e->{
				stage.setScene(easymode.easy);
			});
			hardmode.weaponShop.setOnAction(e->
			{
				stage.setScene(hardmode.weaponshop.weapons);				
			});
			hardmode.weaponshop.back.setOnAction(e->{
				stage.setScene(hardmode.hard);
			});
			

			
			easymode.weaponshop.PCbuy.setOnAction(e->{
				w=1;
				stage.setScene(elane.easylane);
				elane.b1.setOnAction(e1->{
					l=0;
					this.easyBuyAction(w, l);
					stage.setScene(easymode.easy);
				});
				elane.b2.setOnAction(e1->{
					l=1;
					this.easyBuyAction(w, l);
					stage.setScene(easymode.easy);
				});
				elane.b3.setOnAction(e1->{
					l=2;
					this.easyBuyAction(w, l);
					stage.setScene(easymode.easy);
				});
				this.isGameover(battle, stage);
			});
				
				
			easymode.weaponshop.SCbuy.setOnAction(e->{
				w=2;
				stage.setScene(elane.easylane);
				elane.b1.setOnAction(e1->{
					l=0;
					this.easyBuyAction(w, l);
					stage.setScene(easymode.easy);
				});
				elane.b2.setOnAction(e1->{
					l=1;
					this.easyBuyAction(w, l);
					stage.setScene(easymode.easy);
				});
				elane.b3.setOnAction(e1->{
					l=2;
					this.easyBuyAction(w, l);
					stage.setScene(easymode.easy);
				});
				this.isGameover(battle, stage);
			});
			easymode.weaponshop.VSbuy.setOnAction(e->{
				w=3;
				stage.setScene(elane.easylane);
				elane.b1.setOnAction(e1->{
					l=0;
					this.easyBuyAction(w, l);
					stage.setScene(easymode.easy);
				});
				elane.b2.setOnAction(e1->{
					l=1;
					this.easyBuyAction(w, l);
					stage.setScene(easymode.easy);
				});
				elane.b3.setOnAction(e1->{
					l=2;
					this.easyBuyAction(w, l);
					stage.setScene(easymode.easy);
				});
				this.isGameover(battle, stage);
			});
			easymode.weaponshop.WTbuy.setOnAction(e->{
				w=4;
				stage.setScene(elane.easylane);
				elane.b1.setOnAction(e1->{
					l=0;
					this.easyBuyAction(w, l);
					stage.setScene(easymode.easy);
				});
				elane.b2.setOnAction(e1->{
					l=1;
					this.easyBuyAction(w, l);
					stage.setScene(easymode.easy);
				});
				elane.b3.setOnAction(e1->{
					l=2;
					this.easyBuyAction(w, l);
					stage.setScene(easymode.easy);
				});
				this.isGameover(battle, stage);
			});
		     

		    easymode.passTurn.setOnAction(e->{
		    	battle.passTurn();
		    	easymode.updateView(battle);
		    	elane.updateView(battle);
		    	this.isGameover(battle, stage);
		    }); 
		    //hardmode
		    hardmode.weaponshop.PCbuy.setOnAction(e->{
				w=1;
				stage.setScene(hlane.hardlane);
				hlane.b1.setOnAction(e1->{
					l=0;
					this.hardBuyAction(w, l);
					stage.setScene(hardmode.hard);
					});
				hlane.b2.setOnAction(e1->{
					l=1;
					this.hardBuyAction(w, l);
					stage.setScene(hardmode.hard);
					});
				hlane.b3.setOnAction(e1->{
					l=2;
					this.hardBuyAction(w, l);
					stage.setScene(hardmode.hard);
					});
				hlane.b4.setOnAction(e1->{
					l=3;
					this.hardBuyAction(w, l);
					stage.setScene(hardmode.hard);
					});
				hlane.b5.setOnAction(e1->{
					l=4;
					this.hardBuyAction(w, l);
					stage.setScene(hardmode.hard);
					});
				this.isGameover(battle, stage);
			});
			hardmode.weaponshop.SCbuy.setOnAction(e->{
				w=2;
				stage.setScene(hlane.hardlane);
				hlane.b1.setOnAction(e1->{
					l=0;
					this.hardBuyAction(w, l);
					stage.setScene(hardmode.hard);
					});
				hlane.b2.setOnAction(e1->{
					l=1;
					this.hardBuyAction(w, l);
					stage.setScene(hardmode.hard);
					});
				hlane.b3.setOnAction(e1->{
					l=2;
					this.hardBuyAction(w, l);
					stage.setScene(hardmode.hard);
					});
				hlane.b4.setOnAction(e1->{
					l=3;
					this.hardBuyAction(w, l);
					stage.setScene(hardmode.hard);
					});
				hlane.b5.setOnAction(e1->{
					l=4;
					this.hardBuyAction(w, l);
					stage.setScene(hardmode.hard);
					});
				this.isGameover(battle, stage);
				
			});
			hardmode.weaponshop.VSbuy.setOnAction(e->{
				w=3;
				stage.setScene(hlane.hardlane);
				hlane.b1.setOnAction(e1->{
					l=0;
					this.hardBuyAction(w, l);
					stage.setScene(hardmode.hard);
					});
				hlane.b2.setOnAction(e1->{
					l=1;
					this.hardBuyAction(w, l);
					stage.setScene(hardmode.hard);
					});
				hlane.b3.setOnAction(e1->{
					l=2;
					this.hardBuyAction(w, l);
					stage.setScene(hardmode.hard);
					});
				hlane.b4.setOnAction(e1->{
					l=3;
					this.hardBuyAction(w, l);
					stage.setScene(hardmode.hard);
					});
				hlane.b5.setOnAction(e1->{
					l=4;
					this.hardBuyAction(w, l);
					stage.setScene(hardmode.hard);
					});
				this.isGameover(battle, stage);
				
			});hardmode.weaponshop.WTbuy.setOnAction(e->{
				w=4;
				stage.setScene(hlane.hardlane);
				hlane.b1.setOnAction(e1->{
					l=0;
					this.hardBuyAction(w, l);
					stage.setScene(hardmode.hard);
					});
				hlane.b2.setOnAction(e1->{
					l=1;
					this.hardBuyAction(w, l);
					stage.setScene(hardmode.hard);
					});
				hlane.b3.setOnAction(e1->{
					l=2;
					this.hardBuyAction(w, l);
					stage.setScene(hardmode.hard);
					});
				hlane.b4.setOnAction(e1->{
					l=3;
					this.hardBuyAction(w, l);
					stage.setScene(hardmode.hard);
					});
				hlane.b5.setOnAction(e1->{
					l=4;
					this.hardBuyAction(w, l);
					stage.setScene(hardmode.hard);
					});
				this.isGameover(battle, stage);
			});
			hardmode.passTurn.setOnAction(e->{
		    	battle.passTurn();
		    	hardmode.updateView(battle);
		    	hlane.updateView(battle);
		    	this.isGameover(battle, stage);
		    }); 
			mainmenu.exit.setOnAction(e->stage.close());
			mainmenu.htp.setOnAction(e->{stage.setScene(howtoplay.howto);});
			howtoplay.back.setOnAction(e->stage.setScene(mainmenu.menu));
			stage.setMaximized(true);
			stage.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[]args) {
		launch(args);
	}
	private void easyBuyAction(int weaponCode,int lane)
	{
		try 
		{
			this.battle.purchaseWeapon(weaponCode, battle.getOriginalLanes().get(lane));
			
			if(weaponCode==1&&lane==0)
				easymode.w11++;
			if(weaponCode==2&&lane==0)
				easymode.w21++;
			if(weaponCode==3&&lane==0)
				easymode.w31++;
			if(weaponCode==4&&lane==0)
				easymode.w41++;
			
			if(weaponCode==1&&lane==1)
				easymode.w12++;
			if(weaponCode==2&&lane==1)
				easymode.w22++;
			if(weaponCode==3&&lane==1)
				easymode.w32++;
			if(weaponCode==4&&lane==1)
				easymode.w42++;
			
			if(weaponCode==1&&lane==2)
				easymode.w13++;
			if(weaponCode==2&&lane==2)
				easymode.w23++;
			if(weaponCode==3&&lane==2)
				easymode.w33++;
			if(weaponCode==4&&lane==2)
				easymode.w43++;
		} 
		catch (InsufficientResourcesException e2) 
		{
			Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Insufficient Resources Exception");
            alert.setHeaderText("Insufficient Resources Exception");
            alert.setContentText("You don't have enough resources to buy this weapon" );
            alert.getButtonTypes().setAll(ButtonType.OK);
            alert.showAndWait();
		}
		catch(InvalidLaneException e3) 
		{
			Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Invalid Lane Exception");
            alert.setHeaderText("Invalid Lane Exception");
            alert.setContentText("You can't purchase a weapon in a lost lane" );
            alert.getButtonTypes().setAll(ButtonType.OK);
            alert.showAndWait();
		}
		easymode.updateView(battle);
		elane.updateView(battle);
		this.isGameover(battle, null);
	}
	private void hardBuyAction(int weaponCode,int lane)
	{
		try 
		{
			this.battle.purchaseWeapon(weaponCode, battle.getOriginalLanes().get(lane));
			if(weaponCode==1&&lane==0)
				hardmode.w11++;
			if(weaponCode==2&&lane==0)
				hardmode.w21++;
			if(weaponCode==3&&lane==0)
				hardmode.w31++;
			if(weaponCode==4&&lane==0)
				hardmode.w41++;
			
			if(weaponCode==1&&lane==1)
				hardmode.w12++;
			if(weaponCode==2&&lane==1)
				hardmode.w22++;
			if(weaponCode==3&&lane==1)
				hardmode.w32++;
			if(weaponCode==4&&lane==1)
				hardmode.w42++;
			
			if(weaponCode==1&&lane==2)
				hardmode.w13++;
			if(weaponCode==2&&lane==2)
				hardmode.w23++;
			if(weaponCode==3&&lane==2)
				hardmode.w33++;
			if(weaponCode==4&&lane==2)
				hardmode.w43++;
			
			if(weaponCode==1&&lane==3)
				hardmode.w14++;
			if(weaponCode==2&&lane==3)
				hardmode.w24++;
			if(weaponCode==3&&lane==3)
				hardmode.w34++;
			if(weaponCode==4&&lane==3)
				hardmode.w44++;
			
			if(weaponCode==1&&lane==4)
				hardmode.w15++;
			if(weaponCode==2&&lane==4)
				hardmode.w25++;
			if(weaponCode==3&&lane==4)
				hardmode.w35++;
			if(weaponCode==4&&lane==4)
				hardmode.w45++;
		} 
		catch (InsufficientResourcesException e2) 
		{
			Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Insufficient Resources Exception");
            alert.setHeaderText("Insufficient Resources Exception");
            alert.setContentText("You don't have enough resources to buy this weapon" );
            alert.getButtonTypes().setAll(ButtonType.OK);
            alert.showAndWait();
		}
		catch(InvalidLaneException e3) 
		{
			Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Invalid Lane Exception");
            alert.setHeaderText("Invalid Lane Exception");
            alert.setContentText("You can't purchase a weapon in a lost lane" );
            alert.getButtonTypes().setAll(ButtonType.OK);
            alert.showAndWait();
		}
		hardmode.updateView(battle);
		hlane.updateView(battle);
		this.isGameover(battle, null);
	}
	private void isGameover(Battle battle, Stage stage) {
	    if (battle.isGameOver()) {
	        Alert alert = new Alert(AlertType.CONFIRMATION);
	        alert.setTitle("You Lost");
	        alert.setHeaderText("You have lost.\nYour Score: " + battle.getScore());
	        alert.setContentText("Choose your next action:");
	        ButtonType exitButton = new ButtonType("Exit");
	        ButtonType mainMenuButton = new ButtonType("Return to Main Menu");
	        alert.getButtonTypes().setAll(exitButton, mainMenuButton);
	        alert.showAndWait().ifPresent(buttonType -> {
	            if (buttonType == exitButton) {
	                    stage.close();
	                
	            } else if (buttonType == mainMenuButton) {
	                Stage s=new Stage();
	            	Controller c=new Controller();
	                try {
						c.start(s);
						stage.close();
					} catch (Exception e) {}
	                    stage.setScene(mainmenu.menu);  
	            }
	        });
	    }
	}


}
