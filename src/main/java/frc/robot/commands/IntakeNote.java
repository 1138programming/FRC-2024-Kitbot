// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import static frc.robot.Constants.LauncherConstants.kIntakeFeederSpeed;
import static frc.robot.Constants.LauncherConstants.kIntakeLauncherSpeed;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.CANLauncher;

public class IntakeNote extends Command {
  CANLauncher m_launcher;
  /** Creates a new IntakeNote. */
  public IntakeNote(CANLauncher launcher) {
    this.m_launcher = launcher;

    // indicate that this command requires the launcher system
    addRequirements(m_launcher);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_launcher.setLaunchWheel(-kIntakeFeederSpeed);
    m_launcher.setFeedWheel(-kIntakeLauncherSpeed);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_launcher.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
