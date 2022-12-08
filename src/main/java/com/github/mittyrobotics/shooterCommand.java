package com.github.mittyrobotics;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class shooterCommand extends CommandBase {
    shooterSubsystem ss = shooterSubsystem.getInstance();
    //endin addi

    public shooterCommand() {
        addRequirements(ss);
    }

    public void initialize() {
        ss.shutOff();
    }

    public void execute() {
        ss.setMotorTo(2.0);
        ss.setTurretTo(2.0);
    }


    public void end() {
        ss.shutOff();
    }

    public boolean isFinished() {
        return false;
    }

}
