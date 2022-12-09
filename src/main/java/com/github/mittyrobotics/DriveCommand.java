package com.github.mittyrobotics;

public class DriveCommand {
    @Override
    public void execute(){
        DriveSubsytem.getInstance().forward();
        DriveSubsytem.getInstance().back();
        DriveSubsytem.getInstance().turnleft();
        DriveSubsytem.getInstance().turnright();
        DriveSubsytem.getInstance().turnoff();


    }
    @Override
    public boolean isFinished() {
        return false;
    }

}
