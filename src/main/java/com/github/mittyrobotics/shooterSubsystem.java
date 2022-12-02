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
        super( " Shooter Subsystem ");
    }

    WPI_TalonFX shooterMotor;

    public void initHardware() {
         shooterMotor = new WPI_TalonFX(1);
         shooterMotor.configFactoryDefault();

    }

    public void periodic() {
            shooterMotor.set(2.0);
        }

    public void updateDash() {
            //nothing
    }
    //need shooter motor turn function!
    public void setMotorTo(double spd) {
            shooterMotor.set(spd);
        }

    public void shutOff() {
            shooterMotor.set(0);
        }
}
