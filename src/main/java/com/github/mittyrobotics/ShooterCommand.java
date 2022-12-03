package com.github.mittyrobotics;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ShooterCommand extends CommandBase {
    public void IntakeCommand() {
        addRequirements(Shooter.getInstance());
    }

    @Override
    public void initialize() {
        //OI.getInstance().setIntaking(true);
        Shooter.getInstance().turnShooterOff();

    }

    @Override
    public void execute() {
        Shooter.getInstance().turnShooterOn();
        Shooter.getInstance().OnTurretlr();
        Shooter.getInstance().OnTurretud();
    }

    @Override
    public void end(boolean interrupted) {
        Shooter.getInstance().turnShooterOff();
        Shooter.getInstance().OffTurretlr();
        Shooter.getInstance().OffTurretud();
       // OI.getInstance().setIntaking(false);
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
