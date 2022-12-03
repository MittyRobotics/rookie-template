package com.github.mittyrobotics;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class driveTrain extends SubsystemBase {
    private static driveTrain ourinstance = new driveTrain();
    public static driveTrain getInstance(){return ourinstance;}
    private driveTrain(){super(); setName("Drive Chain Subsystem");}

    WPI_TalonSRX ltMotor, rtMotor, lbMotor, rbMotor;

    public void initHardware()
    {
        ltMotor = new WPI_TalonSRX(0); rtMotor = new WPI_TalonSRX(0); rbMotor = new WPI_TalonSRX(0); lbMotor = new WPI_TalonSRX(0);
        ltMotor.configFactoryDefault(); rtMotor.configFactoryDefault(); rbMotor.configFactoryDefault(); lbMotor.configFactoryDefault();
        //set left inverse
        ltMotor.setInverted(true);
        lbMotor.setInverted(true);
    }

    @Override
    public void periodic()
    {
        ltMotor.set(0);
        lbMotor.set(0);
        rtMotor.set(0);
        rbMotor.set(0);
    }

    public void Stop()
    {
        ltMotor.set(0);
        lbMotor.set(0);
        rtMotor.set(0);
        rbMotor.set(0);
    }


    public void turnLeft()
    {
        //right forward left back
        ltMotor.set(-1);
        lbMotor.set(-1);
        rtMotor.set(1);
        rbMotor.set(1);

    }

    public void turnRight()
    {
        //left forward right back
        ltMotor.set(1);
        lbMotor.set(1);
        rtMotor.set(-1);
        rbMotor.set(-1);
    }

    public void reverse()
    {
        ltMotor.set(-1);
        lbMotor.set(-1);
        rtMotor.set(-1);
        rbMotor.set(-1);
    }
    public void forward()
    {
        ltMotor.set(1);
        lbMotor.set(1);
        rtMotor.set(1);
        rbMotor.set(1);
    }






}
