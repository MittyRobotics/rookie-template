package com.github.mittyrobotics;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem extends SubsystemBase {
    private static ShooterSubsystem ourInstance = new ShooterSubsystem();
    public static ShooterSubsystem getInstance(){
        return ourInstance;

    }
    private ShooterSubsystem(){
        super();
        setName("Shooter Subsystem");

    }

    WPI_TalonSRX motor1, motor2;

    public void initHardware(){
        //creating hardware objects to be accessed within subsystem
        motor1 = new WPI_TalonSRX(0);

        motor2 = new WPI_TalonSRX(1);

        //set any inverted
        motor1.setInverted(true);
     }
     public void TurnOnMotor1() {
        motor1.set(ControlMode.PercentOutput, 1);

    }
    public void TurnOffMotor1() {
        motor1.set(ControlMode.PercentOutput, 0);

    }
    public void TurnOnMotor2(){

        motor2.set(ControlMode.PercentOutput, 1);
    }
    public void TurnOffMotor2() {
        motor1.set(ControlMode.PercentOutput, 0);

    }

}