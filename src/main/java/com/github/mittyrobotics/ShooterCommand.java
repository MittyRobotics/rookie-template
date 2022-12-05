package com.github.mittyrobotics;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ShooterCommand extends CommandBase {
    public ShooterCommand(){addRequirements(ShooterSubsystem.getInstance());}

    @Override
    public void initialized(){
        ShooterSubsystem.getInstance().TurnOffShooter();
    }
    @Override
    public void execute(){
        ShooterSubsystem.getInstance().TurnOnShooter();

    }
    @Override
    public void end(boolean interrupted){
        ShooterSubsystem.getInstance().TurnOnShooter();
    }
    @Override
    public boolean isFinished(){

        return false;
    }
}