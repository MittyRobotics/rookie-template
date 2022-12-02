package com.github.mittyrobotics;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj2.command.Subsystem;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class shooterSubsystem extends SubsystemBase {

    static shooterSubsystem ourInstance = new shooterSubsystem();
    public static shooterSubsystem getInstance() {
        return ourInstance;
    }

    private shooterSubsystem() {
        super();
        setName("Shooter Subsystem");
    }

    WPI_TalonFX shooterMotor, turretMotor;

    public void initHardware() {
        turretMotor = new WPI_TalonFX(2);
        shooterMotor = new WPI_TalonFX(1);
        shooterMotor.configFactoryDefault();
        turretMotor.configFactoryDefault();

    }

    @Override
    public void periodic() {
        //makes no sense since will reset every time??????
        shooterMotor.set(2.0);
        turretMotor.set(2.0);
    }

    public void updateDash() {
        //nothing
    }
    public void setTurretTo(double spd) {
        turretMotor.set(spd);
    }
    public void setMotorTo(double spd) {
        shooterMotor.set(spd);
    }

    public void shutOff() {
        shooterMotor.set(0);
        turretMotor.set(0);
    }
}
