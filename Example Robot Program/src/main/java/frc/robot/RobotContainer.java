// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.commands.Subsystem1Command;
import frc.robot.subsystems.Subsystem1;

public class RobotContainer {
  private Subsystem1 subsystem1 = new Subsystem1(10);

  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    // DEFAULT
    subsystem1.setDefaultCommand(
      new Subsystem1Command(subsystem1)
    );
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
