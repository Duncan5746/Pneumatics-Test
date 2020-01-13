/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/


package frc.robot;
import edu.wpi.first.wpilibj2.command.Command;
import  frc.robot.commands.FCDumper;
import frc.robot.subsystems.Pneumatics;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.Button;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class RobotContainer {

  public static final Pneumatics pneumatics = new Pneumatics();

  private final FCDumper extendFCDumper = new FCDumper(pneumatics, 1);
  private final FCDumper retractFCDumper = new FCDumper(pneumatics, 2);
  private final FCDumper turnOffFCDumper = new FCDumper(pneumatics, 0);

  private static Joystick xbox = new Joystick(0);

  //Buttons
public Button aButton = new JoystickButton(xbox, 1);
public Button yButton = new JoystickButton(xbox, 4);
public Button xButton = new JoystickButton(xbox, 3);
//Buttons

  public RobotContainer() {

    configureButtonBindings();
  }

  private void configureButtonBindings() {
  
    aButton.whenPressed(retractFCDumper);
    yButton.whenPressed(extendFCDumper);
    xButton.whenPressed(turnOffFCDumper);
  
  }

  public Command getAutonomousCommand() {
    Command abc = null;
    return abc;
  }


public static Pneumatics getPneumatics(){
  return pneumatics;
}

}
