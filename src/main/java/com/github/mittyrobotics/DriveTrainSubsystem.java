package com.github.mittyrobotics;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrainSubsystem extends SubsystemBase {
    private static DriveTrainSubsystem ourInstance = new DriveTrainSubsystem();
    public static DriveTrainSubsystem getInstance(){
        return ourInstance;

    }
    private DriveTrainSubsystem(){
        super();
        setName("Drive Train");

    }

    WPI_TalonSRX motor_left, motor_right;

    public void initHardware(){
        //creating hardware objects to be accessed within subsystem
        motor_left = new WPI_TalonSRX(0);
        motor_left.configFactoryDefault();

        motor_right = new WPI_TalonSRX(1);
        motor_right.configFactoryDefault();

        //set any inverted
        motor_left.setInverted(true);
    }

    public void Set(){
        motor_left.set(ControlMode.PercentOutput, 0);
        motor_right.set(ControlMode.PercentOutput, 0);
    }

    public void Forward(){
        motor_left.set(ControlMode.PercentOutput, 1);
        motor_right.set(ControlMode.PercentOutput, 1);
    }
    public void Backward(){
        motor_left.set(ControlMode.PercentOutput, -1);
        motor_right.set(ControlMode.PercentOutput, -1);
    }
    public void TurnLeft(){
        motor_left.set(ControlMode.PercentOutput, 1);
        motor_right.set(ControlMode.PercentOutput, -1);
    }
    public void TurnRight(){
        motor_left.set(ControlMode.PercentOutput, -1);
        motor_right.set(ControlMode.PercentOutput, 1);
    }


}