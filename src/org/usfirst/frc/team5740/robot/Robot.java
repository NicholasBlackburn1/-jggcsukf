package org.usfirst.frc.team5740.robot;

import edu.wpi.first.wpilibj.IterativeRobot;

import edu.wpi.first.wpilibj.Joystick;

import edu.wpi.first.wpilibj.RobotDrive;

import edu.wpi.first.wpilibj.TalonSRX;



/**

 * The VM is configured to automatically run this class, and to call the

 * functions corresponding to each mode, as described in the IterativeRobot

 * documentation. If you change the name of this class or the package after

 * creating this project, you must also update the manifest file in the resource

 * directory.

 */

public class Robot extends IterativeRobot {




	TalonSRX right = new TalonSRX(0);
	TalonSRX left = new TalonSRX(1);


	Joystick joystick = new Joystick(2);

	RobotDrive drive = new RobotDrive(0, 1);

	@Override

	public void robotInit() {

		

	}




	@Override

	public void autonomousInit() {

		

	}




	@Override

	public void autonomousPeriodic() { 
	




	}




	@Override

	public void teleopPeriodic() {

		Double left = joystick.getX() + joystick.getY();

		Double right = joystick.getX() - joystick.getY();

		drive.tankDrive(left, right);

	}




	@Override
	public void testPeriodic() {

	}

}

