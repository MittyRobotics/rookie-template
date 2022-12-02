package com.github.mittyrobotics;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class shooterCommand extends CommandBase {
    shooterSubsystem ss = shooterSubsystem.getInstance();
    public shooterCommand() {
        addRequirements(ss);
    }

    public void initialize() {
        ss.shutOff();
    }

    public void execute() {
        ss.setMotorTo(2.0);
    }


    //need end function

    public boolean isFinished() {
        return false;
    }

}
