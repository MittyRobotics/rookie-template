package com.github.mittyrobotics;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class driveTrainSubsystem extends SubsystemBase {
    static driveTrainSubsystem ourInstance = new driveTrainSubsystem();
    public static driveTrainSubsystem getInstance() {return ourInstance};

    private driveTrainSubsystem() {
        //with properties and the such
        super();
        setName("Drive Train Subsystem");
    }

    WPI_TalonFX tlMotor, blMotor, trMotor, brMotor;

   WPI_TalonFX[] motors = {tlMotor, blMotor, trMotor, brMotor};

    public void initHardware() {
        tlMotor = new WPI_TalonFX(5);
        trMotor = new WPI_TalonFX(6);
        blMotor = new WPI_TalonFX(7);
        brMotor = new WPI_TalonFX(8);
        for (WPI_TalonFX mot : motors) {
            mot.configFactoryDefault();
        }

        brMotor.setInverted(true);
        blMotor.setInverted(true);

    }

    @Override
    public void periodic() {

    }

    public void updateDash() {
        //nothing
    }

    public void shutOff() {
        for (WPI_TalonFX mot: motors) {
            mot.set(0);
        }
    }
}
