package org.usfirst.frc.team2856.robot.loop;

import org.usfirst.frc.team2856.robot.Constants;
import org.usfirst.frc.team2856.robot.Robot;
import org.usfirst.frc.team2856.robot.Shooter;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class LoopAuto extends Loop{

	static String[] modes = {"l", "m", "r", "s"};
	
	//IterativeRobot robot;
	String autoSelected;
	
	public LoopAuto(Robot rob){super(rob);}
	
	public void init() {
		autoSelected = SmartDashboard.getString("Auto Selector", "None");
		
		
		
		
	}

	public void loop() {
		switch(autoSelected){
		
		case "l":
			leftPegCommands();
			break;
		case "m":
			middlePegCommands();
			break;
		case "r":
			rightPegCommands();
			break;
		case "s":
			shootCommands();
			break;
		default:
			break;
		}
	}
	
	public static void addModes(){
		
		for(int i = 0; i < modes.length; i++){
			SmartDashboard.putString("Auto Selector", modes[i]);
		}
		
	}
	
	public void leftPegCommands() {
		robot.driveTrain.moveStraight(102340);
		//while(centeredOnPeg == false)
		//	  robot.driveTrain.turn(drive.centerOnPeg);
	}
	public void middlePegCommands() {
		robot.driveTrain.moveStraight(102340);
		//while(centeredOnPeg == false)
		//	  robot.driveTrain.turn(drive.centerOnPeg);
	}
	public void rightPegCommands() {
		robot.driveTrain.moveStraight(102340);
		//while(centeredOnPeg == false)
		//	  robot.driveTrain.turn(drive.centerOnPeg);
	}
	public void shootCommands() {
		robot.driveTrain.moveStraight(102340);
		//while(centeredOnGoal == false)
		//	  robot.driveTrain.turn(drive.centerOnGoal);
		Constants.shooter.toggleShooter();
	}
	
}
