/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Constants.JoystickConstants;
import frc.robot.commands.*;
import frc.robot.subsystems.*;

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  
  //private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();
    private final DriveSubsystem m_drive = new DriveSubsystem();

    public Joystick m_driverController = new Joystick(JoystickConstants.driverControllerPort);

    public final ShooterSubsystem m_shooter = new ShooterSubsystem();
    public final HopperSubsystem m_hopper = new HopperSubsystem();
    public final IntakeSubsystem m_intake = new IntakeSubsystem();

    
  



  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
    m_drive.setDefaultCommand(new JoystickDrive(m_drive,()-> -m_driverController.getRawAxis(1) , () -> -m_driverController.getRawAxis(5)));

  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {

    new JoystickButton(m_driverController, 2).whileHeld(new RunShooter(m_shooter, -0.65));
    new JoystickButton(m_driverController, 1).whileHeld(new RunShooter(m_shooter, 0.3));
    new JoystickButton(m_driverController, 6).whileHeld(new RunHopper(m_hopper, "sync"));
    new JoystickButton(m_driverController, 4).whileHeld(new RunHopper(m_hopper, ""));
    new JoystickButton(m_driverController, 5).whileHeld(new RunIntake(m_intake, 0.7));
    new JoystickButton(m_driverController, 3).whileHeld(new RunIntake(m_intake,-0.5 ));

  }


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return null;
  }
}
