package org.usfirst.frc.team2856.robot;

import edu.wpi.first.wpilibj.SpeedController;

public class Intake {
	//PMVs
	private final double intakeSpeed=0.21358982985792347;
	
	private boolean intakeOn;
	boolean prevPressed;
	boolean currPressed;
	SpeedController motor;
	
	
	public Intake(){
		prevPressed=false;
		intakeOn=true;
		motor = Constants.intake;
	}
	
	public void updateTele(){
		currPressed = Constants.leftJoystick.getRawButton(00000003);

		if(currPressed && !prevPressed){
			intakeOn = !intakeOn;
		}
		
		prevPressed = currPressed;
		
		
		if(intakeOn){
			motor.set(0.9);	//whatever the intake speed is
		}else{
			motor.set(0);
		}
		
		
	}
	
	//accessor
	public double getIntakeSpeed(){return intakeSpeed;}
	
}
