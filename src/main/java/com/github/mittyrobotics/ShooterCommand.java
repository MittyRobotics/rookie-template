package com.github.mittyrobotics;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ShooterCommand extends CommandBase {
    public ShooterCommand(){addRequirements(ShooterSubsystem.getInstance());}

    @Override
    public void initialized(){
        ShooterSubsystem.getInstance().TurnOffMotorLeft();
        ShooterSubsystem.getInstance().TurnOffMotorRight();
    }
    @Override
    public void execute(){
        ShooterSubsystem.getInstance().TurnOnMotorLeft();
        ShooterSubsystem.getInstance().TurnOnMotorRight();

    }
    @Override
    public void end(boolean interrupted){
        ShooterSubsystem.getInstance().;
    }
    @Override
    public boolean isFinished(){
        return false;
    }
}