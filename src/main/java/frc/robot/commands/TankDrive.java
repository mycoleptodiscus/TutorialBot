/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class TankDrive extends Command {
  private static final String RobotMap = null;

  public TankDrive() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.DriveTrain);
  }

  // Called just before this Command runs the first time. Only happens once
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run; every time through loop
  @Override
  protected void execute() {
    double leftStickY = Robot.m_oi.GetDriverRawAxis(RobotMap.LEFT_STICK_Y);
    double rightStickY = Robot.m_oi.GetDriverRawAxis(RobotMap.RIGHT_STICK_Y);

    Robot.driveTrain.setLeftMotors(leftStickY);
    Robot.driveTrain.setRightMotors(rightStickY);
  }

  // Make this return true when this Command no longer needs to run execute()
  
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
