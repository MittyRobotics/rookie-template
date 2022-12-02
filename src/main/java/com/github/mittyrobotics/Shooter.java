package com.github.mittyrobotics;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase{
    private static Shooter ourinstance = new Shooter();
    public static Shooter getInstance(){return ourinstance;}
    private Shooter(){super();}

    WPI_TalonSRX shooterMotor;
    public void initHardware()
    {
        shooterMotor = new WPI_TalonSRX(0);
        shooterMotor.configFactoryDefault();
    }

    @Override
    public void periodic()
    {
        shooterMotor.set(0);
    }

    public void turnOn()
    {
        shooterMotor.set(1);
    }

    public void turnOff()
    {
        shooterMotor.set(0);
    }


    public void updateDashboard(){}





}
