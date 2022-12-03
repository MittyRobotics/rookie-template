package com.github.mittyrobotics;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem extends SubsystemBase {
    private static ShooterSubsystem ourInstance = new ShooterSubsystem();

    public static ShooterSubsystem getInstance() {
        return ourInstance;
    }

    private ShooterSubsystem() {
        super();
        setName("ShooterSubsystem");
    }

    WPI_TalonFX turret, shooter;
    public void initHardware(){
        turret = new WPI_TalonFX(0);
        shooter = new WPI_TalonFX(1);

        turret.configFactoryDefault();
        shooter.configFactoryDefault();

        turret.setInverted(true);
        shooter.setInverted(true);
    }

    @Override

    public void periodic(){
        shooter.set(0);
    }

    public void turnOnTurret(){
        turret.set(1);
    }

    public void turnOnShooter(){
        shooter.set(1);
    }

    public void turnOffTurret(){
        turret.set(0);
    }

    public void turnOffShooter(){
        shooter.set(0);
    }

    public void turnOff() {
        turnOffShooter();
        turnOffTurret();
    }
}
