/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.HopperConstants;

public class HopperSubsystem extends SubsystemBase {
  private final WPI_VictorSPX hopperMotor1 = new WPI_VictorSPX(HopperConstants.hopperMotor1Port);
  private final WPI_VictorSPX hopperMotor2 = new WPI_VictorSPX(HopperConstants.hopperMotor2Port);
  
  public HopperSubsystem() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler ru
  }

  public void runHopper(String m_mode, double m_speed1, double m_speed2) {
    if (m_mode == "sync") {
      hopperMotor1.set(-m_speed1);
      hopperMotor2.set(-m_speed1);
    } else if (m_mode == "up") {
      hopperMotor1.set(m_speed1);
      hopperMotor2.set(0);
    } else if (m_mode == "down") {
      hopperMotor1.set(0);
      hopperMotor2.set(m_speed2);
    } else {
      hopperMotor1.set(m_speed1);
      hopperMotor2.set(m_speed2);}
    }

  

}
