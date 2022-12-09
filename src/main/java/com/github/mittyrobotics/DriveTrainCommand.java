package com.github.mittyrobotics;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class DriveTrainCommand extends CommandBase {
    public DriveTrainCommand(){addRequirements(DriveTrainSubsystem.getInstance());}

    @Override
    public void initialized(){
        DriveTrainSubsystem.getInstance().Set();

    }
    @Override
    public void execute(){
        DriveTrainSubsystem.getInstance().Forward();
        DriveTrainSubsystem.getInstance().Backward();
        DriveTrainSubsystem.getInstance().TurnLeft();
        DriveTrainSubsystem.getInstance().TurnRight();

    }
    @Override
    public void end(boolean interrupted){
        DriveTrainSubsystem.getInstance().Set();
    }
    @Override
    public boolean isFinished(){

        return false;
    }
}