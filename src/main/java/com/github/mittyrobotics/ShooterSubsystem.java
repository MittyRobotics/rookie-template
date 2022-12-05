package com.github.mittyrobotics;

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

    WPI_TalonSRX turret, shooter;

    public void initHardware(){
        //creating hardware objects to be accessed within subsystem
        turret = new WPI_TalonSRX(0);
        turret.configFactoryDefault();

        shooter = new WPI_TalonSRX(1);
        shooter.configFactoryDefault();

        //set any inverted
        turret.setInverted(true);
     }
     public void TurnOnTurret() {
        turret.set(1);

    }
    public void TurnOffTurret() {
        turret.set(0);

    }
    public void TurnOnShooter(){

        shooter.set(1);
    }
    public void TurnOffShooter() {
        turret.set(0);

    }

}