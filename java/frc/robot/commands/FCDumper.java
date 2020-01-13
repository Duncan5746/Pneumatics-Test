/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Pneumatics;

public class FCDumper extends CommandBase {

  private Pneumatics pneumaticsFCDumper;
  private int statusFCDumper;

  public FCDumper(Pneumatics p, int status) {
      pneumaticsFCDumper = p;
      addRequirements(p);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if(statusFCDumper == 0){
      pneumaticsFCDumper.FCDumperOff();
    }
    else if(statusFCDumper == 1){
      pneumaticsFCDumper.FCDumperForward();
    }
    else if(statusFCDumper == 2){
      pneumaticsFCDumper.FCDumperReverse();
    }

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}
