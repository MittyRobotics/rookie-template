package com.github.mittyrobotics;

import edu.wpi.first.wpilibj2.command.CommandBase;


public class driveTrainCommand extends CommandBase {

    driveTrainSubsystem dtS = driveTrainSubsystem.getInstance();

    public driveTrainCommand() {
        addRequirements(dtS);
    }

    public void initialize() {
        dtS.shutOff();
    }

    public void execute() {
        dtS.turnLeftWithoutStopping(3.0);
        //dtS.turnRightWithoutStopping(3.0);
        //dtS.driveBackwards(2.0);
        //dtS.driveBackwards(2.0);
    }

    public void end() {
        dtS.shutOff();
    }

    public boolean isFinished() {
        return false;
    }

}
