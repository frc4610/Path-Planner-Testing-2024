// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  /** Creates a new DriveTrian. */

  TalonFX rightFrontDrive;
  TalonFX rightBackDrive;
  TalonFX leftFrontDrive;
  TalonFX leftBackDrive;

  Encoder rightEncoder;
  Encoder leftEncoder;

  public DriveTrain() {
  rightFrontDrive = new TalonFX(Constants.CANID.R_DRIVE1_ID);
  rightBackDrive = new TalonFX(Constants.CANID.R_DRIVE2_ID);
  leftFrontDrive = new TalonFX(Constants.CANID.L_DRIVE1_ID);
  leftBackDrive = new TalonFX(Constants.CANID.L_DRIVE2_ID);

  rightEncoder = new Encoder(0, 1);
  leftEncoder = new Encoder(2, 3);

  leftFrontDrive.setInverted(true);
  leftBackDrive.setInverted(true);

  }

  public void drive(double rightSpeed, double leftspeed){

      rightFrontDrive.set(rightSpeed);
      rightBackDrive.set(rightSpeed);
      leftFrontDrive.set(leftspeed);
      leftBackDrive.set(leftspeed);
      
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
