/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;


public class Pneumatics extends SubsystemBase {
  private Compressor compressor = new Compressor();
  private DoubleSolenoid FCDumper = new DoubleSolenoid(0,1);

  public Pneumatics() {
  }

  public void startCompressor(){
    compressor.start();
  }

  public void stopCompressor(){
    compressor.stop();
  }

  public void setClosedLoopControlOn(){
    compressor.setClosedLoopControl(true);
  }

  public void setClosedLoopControlOff(){
    compressor.setClosedLoopControl(false);
  }

  public void FCDumperForward(){
    FCDumper.set(Value.kForward);
  }

  public void FCDumperReverse(){
    FCDumper.set(Value.kReverse);
  }

  public void FCDumperOff(){
    FCDumper.set(Value.kOff);
  }


  @Override
  public void periodic() {

  }
}
