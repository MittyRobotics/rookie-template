package com.github.mittyrobotics;

public class DrivetrainCommand {

    @Override
    public void excecute(){
        DrivetrainSubsystem.getInstance().beOn();
        DrivetrainSubsystem.getInstance().turnLeft();
        DrivetrainSubsystem.getInstance().turnRight();
        DrivetrainSubsystem.getInstance().moveBackward();
        DrivetrainSubsystem.getInstance().moveForward();
        DrivetrainSubsystem.getInstance().turnOff();
    }

    @Override
    public boolean isFinished(){
        return false;
    }

}
