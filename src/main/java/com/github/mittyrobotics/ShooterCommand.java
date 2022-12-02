package com.github.mittyrobotics;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ShooterCommand extends CommandBase {
    public void IntakeCommand() {
        addRequirements(Shooter.getInstance());
    }

    @Override
    public void initialize() {
        //OI.getInstance().setIntaking(true);
        Shooter.getInstance().turnOff();
    }

    @Override
    public void execute() {

        Shooter.getInstance().turnOn();
    }

    @Override
    public void end(boolean interrupted) {
        Shooter.getInstance().turnOn();
       // OI.getInstance().setIntaking(false);
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
