/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.VictorSPXConfiguration;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {   //counts as a subsystem
  private VictorSPX motorLeft1 = new VictorSPX(RobotMap.MOTOR_LEFT_1_ID);   //creating objects
  private VictorSPX motorLeft2 = new VictorSPX(RobotMap.MOTOR_LEFT_2_ID);   //all caps with underscores for variables
  private VictorSPX motorRight1 = new VictorSPX(RobotMap.MOTOR_RIGHT_1_ID);
  private VictorSPX motorRight2 = new VictorSPX(RobotMap.MOTOR_RIGHT_2_ID);
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  } 

public void setLeftMotors (double speed) {    //methods
  motorLeft1.set(ControlMode.PercentOutput, -speed);   //makes sure both motors get set to same % output
  motorLeft2.set(ControlMode.PercentOutput, -speed);   //because they have the same variable

  motorRight1.set(ControlMode.PercentOutput, speed);   //makes sure both motors get set to same % output
  motorRight2.set(ControlMode.PercentOutput, speed);   //because they have the same variable
}




}
