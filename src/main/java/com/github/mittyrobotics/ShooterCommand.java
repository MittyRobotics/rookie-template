package com.github.mittyrobotics;//import ShooterSubsystem

import edu.wpi.first.wpilibj2.command.CommandBase;
import org.ejml.simple.SimpleBase;

public class ShooterCommand extends CommandBase {
    public ShooterCommand() {
        addRequirements(ShooterSubsystem.getInstance());
    }

    @Override
    public void initialize() {
        motor1;
        motor1.set(0);
        shootermotor.set(0);


    }

    @Override
    public void execute() {
        ShooterSubsystem.turnOn();
        ShooterSubsystem.turnTurretleft();
        ShooterSubsystem.turnTurretright();
        ShooterSubsystem.moveShooterforward();
        ShooterSubsystem.moveShooterbackward();
        ShooterSubsystem.shutOff(); //afjkosd

    }

    @Override
    public void end(boolean interrupted) {
        motor1.set(0);
        shootermotor.set(0);

    }

    @Override
    public boolean isFinished() {
        return false;
    }
}