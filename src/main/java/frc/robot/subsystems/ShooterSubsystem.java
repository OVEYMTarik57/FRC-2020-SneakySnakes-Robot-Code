/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ShooterConstants;

public class ShooterSubsystem extends SubsystemBase {
 
  private final WPI_VictorSPX shooterMotor1 = new WPI_VictorSPX(ShooterConstants.shooterMotor1);
  private final WPI_VictorSPX shooterMotor2 = new WPI_VictorSPX(ShooterConstants.shooterMotor2);


  public ShooterSubsystem() {
    shooterMotor2.follow(shooterMotor1);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

public void runShooter(double speed){
  shooterMotor1.set(speed);
}

public void stopShooter(){
  shooterMotor1.set(0);
}

}
