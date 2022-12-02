package com.github.mittyrobotics;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase{
    private static Shooter ourinstance = new Shooter();
    public static Shooter getInstance(){return ourinstance;}
    private Shooter(){super(); setName("Shooter Subsystem");}

    WPI_TalonSRX shooterMotor, turretMotorlr, turretMotorud;
    public void initHardware()
    {
        shooterMotor = new WPI_TalonSRX(0);
        shooterMotor.configFactoryDefault();
        turretMotorlr = new WPI_TalonSRX(1);
        turretMotorlr.configFactoryDefault();
        turretMotorud = new WPI_TalonSRX(2);
        turretMotorud.configFactoryDefault();
    }

    @Override
    public void periodic()
    {
        shooterMotor.set(0);
    }

    public void turnShooterOn()
    {
        shooterMotor.set(1);
    }

    public void turnShooterOff1()
    {
        shooterMotor.set(0);
    }

    public void OnTurretlr()
    {
        turretMotorlr.set(1);
    }

    public void OnTurretud()
    {
        turretMotorud.set(1);
    }

    public void OffTurretlr()
    {
        turretMotorlr.set(1);
    }

    public void OffTurretud()
    {
        turretMotorud.set(1);
    }


    public void updateDashboard(){}

}
