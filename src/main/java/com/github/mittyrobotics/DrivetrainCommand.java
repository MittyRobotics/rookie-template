package com.github.mittyrobotics;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class DrivetrainCommand extends CommandBase {
    public void IntakeCommand() {
        addRequirements(DrivetrainSubsystem.getInstance());
    }
    @Override
    public void initialize(){
        DrivetrainSubsystem.getInstance().turnOff();
    }
    @Override
    public void execute(){
        DrivetrainSubsystem.getInstance().driveForward();
    }
}
