package com.github.mittyrobotics;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ShooterCommand extends CommandBase {
    public void IntakeCommand() {
        addRequirements(ShooterSubsystem.getInstance());
    }
    @Override
    public void initialize(){
        ShooterSubsystem.getInstance().turnOffShooter();
    }
    @Override
    public void execute(){
        ShooterSubsystem.getInstance().turnOnShooter();
    }
    @Override
    public void end(boolean interrupted){
        ShooterSubsystem.getInstance().turnOffShooter();
    }
    @Override
    public boolean isFinished() {
        return false;
    }
}
