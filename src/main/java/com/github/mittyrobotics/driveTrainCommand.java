package com.github.mittyrobotics;

import edu.wpi.first.wpilibj2.command.CommandBase;

//note to self; really interesitng since:
// no controller input;
// turns infinitely;
// if adds controller to subsystem will reinstnatiate for each usbsystme; have to acces s once controler from a main or a different class to read
// cant really make drive func, ca njust put everything in periodic if adding float values to a variable

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

}
