/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public final class JoystickConstants{
        public static final int driverControllerPort = 0;
   
       }
   
    public static class DriveConstants{
        public static final int frontLeftMotorPin = 10;
        public static final int frontRightMotorPin = 12;
        public static final int rearLeftMotorPin = 11;
        public static final int rearRightMotorPin = 13;


    }

    public static class ShooterConstants{
        public static final int shooterMotor1 = 20;
        public static final int shooterMotor2 = 21;
    }

    public static class HopperConstants{
        public static final int hopperMotor1Port = 30;
        public static final int hopperMotor2Port = 31;

    }
    public static class IntakeConstants{
        public static final int intakeMotorPort = 40;
    }

}
