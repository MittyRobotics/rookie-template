package com.github.mittyrobotics;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class driveTrainCommand extends CommandBase {

    public void driveTrainCommand() {
        addRequirements(driveTrain.getInstance());
    }

    @Override
    public void initialize() {
        driveTrain.getInstance().initHardware();
    }

    @Override
    public void execute() {
        driveTrain.getInstance().turnLeft();
        //driveTrain.getInstance().turnRight();
        //driveTrain.getInstance().forward();
        //driveTrain.getInstance().reverse();
    }

    @Override
    public void end(boolean interrupted) {
        driveTrain.getInstance().Stop();
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
