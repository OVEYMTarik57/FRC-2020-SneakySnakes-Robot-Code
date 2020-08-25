/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;

public class DriveSubsystem extends SubsystemBase {
  
private final WPI_TalonSRX frontLeftMotor = new WPI_TalonSRX(DriveConstants.frontLeftMotorPin);
private final WPI_TalonSRX frontRightMotor = new WPI_TalonSRX(DriveConstants.frontRightMotorPin);
private final WPI_VictorSPX rearLeftMotor = new WPI_VictorSPX(DriveConstants.rearLeftMotorPin);
private final WPI_VictorSPX rearRightMotor = new WPI_VictorSPX(DriveConstants.rearRightMotorPin);

    private final SpeedControllerGroup leftGroup = new SpeedControllerGroup(frontLeftMotor, rearLeftMotor);
    private final SpeedControllerGroup rightGroup = new SpeedControllerGroup(frontRightMotor, rearRightMotor);
    private final DifferentialDrive m_drive = new DifferentialDrive(leftGroup, rightGroup);

    

  public DriveSubsystem() {
    frontLeftMotor.setSafetyEnabled(false);
    frontRightMotor.setSafetyEnabled(false);
    rearLeftMotor.setSafetyEnabled(false);
    rearRightMotor.setSafetyEnabled(false);
    m_drive.setSafetyEnabled(false);


  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void arcadeDrive(double fwd, double rot){
    m_drive.arcadeDrive(fwd, rot, true);
  } 
  public void tankDrive(double fwd, double rot){
    m_drive.tankDrive(fwd, rot, true);
  } 

  

  
}
