/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.DriveArcade;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private final DifferentialDrive driveWC = RobotMap.drive;

  Talon l = RobotMap.leftFront;
  Talon r = RobotMap.rightFront;

  public void drive(double leftSpeed, double rightSpeed){
    l.set(leftSpeed);
    r.set(rightSpeed);
  }

  public void stop(){
    l.set(0.0);
    r.set(0.0);
  }

  public void arcadeDrive(double xSpeed, double yRotate){
    driveWC.arcadeDrive(xSpeed, yRotate);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new DriveArcade());
  }

}
