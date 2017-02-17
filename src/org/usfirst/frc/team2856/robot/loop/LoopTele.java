package org.usfirst.frc.team2856.robot.loop;

import org.usfirst.frc.team2856.robot.Robot;

public class LoopTele extends Loop{
	
	//DriveTrain driveTrain
	
	public LoopTele(Robot rob){super(rob);}
	
	
	//XXX Disable autonomous dependencies
	public void init() {
		robot.driveTrain.initTele();
	}

	
	
	
	//XXX DriveTrain
	//XXX Shooter
	//XXX Climber
	
	public void loop() {
		
		robot.driveTrain.arcadeDrive(robot.left);
		robot.shooter.updateTele();
		robot.climber.updateTele();
		
		
	}

}
