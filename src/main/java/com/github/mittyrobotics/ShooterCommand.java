package com.github.mittyrobotics;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ShooterCommand extends CommandBase {
    public ShooterCommand(){addRequirements(ShooterSubsystem.getInstance());}

    @Override
    public void initialized(){
        ShooterSubsystem.getInstance().TurnOffMotor1();
        ShooterSubsystem.getInstance().TurnOffMotor2();
    }
    @Override
    public void execute(){
        ShooterSubsystem.getInstance().TurnOnMotor1();
        ShooterSubsystem.getInstance().TurnOnMotor2();

    }
    @Override
    public void end(boolean interrupted){
        ShooterSubsystem.getInstance().TurnOnMotor1();
        ShooterSubsystem.getInstance().TurnOnMotor2();
    }
    @Override
    public boolean isFinished(){

        return false;
    }
}