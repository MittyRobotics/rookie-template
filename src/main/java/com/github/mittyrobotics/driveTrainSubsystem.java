package com.github.mittyrobotics;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj.XboxController;
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
    //XboxController cont;
    //cant use controller because will depulciate in susbsytems; have toput into a another acessible class and then use the same controllre insytead of instnaitating (singleton to ccess?)
   WPI_TalonFX[] motors = {tlMotor, blMotor, trMotor, brMotor};
   WPI_TalonFX[] leftMotors = {tlMotor, blMotor};
   WPI_TalonFX[] rightMotors = {trMotor, brMotor};


    public void initHardware() {
        tlMotor = new WPI_TalonFX(5);
        trMotor = new WPI_TalonFX(6);
        blMotor = new WPI_TalonFX(7);
        brMotor = new WPI_TalonFX(8);
        //cont = new XboxController(10);
        for (WPI_TalonFX mot : motors) {
            mot.configFactoryDefault();
        }

        brMotor.setInverted(true);
        blMotor.setInverted(true);

    }



    public void setRightMotors(double speed) {
        brMotor.set(speed);
        blMotor.set(speed);
    }

    public void setLeftMotors(double speed) {
        blMotor.set(speed);
        tlMotor.set(speed);
    }

    public void driveForward(double speed) {
        for (WPI_TalonFX e: motors) {
            e.set(speed);
        }
    }

    public void driveBackwards(double speed) {
        for (WPI_TalonFX e: motors) {
            e.set(-speed);
        }
    }

    public void turnLeftWithoutStopping(double speed) {
        for (WPI_TalonFX e : leftMotors) {
            e.set(-speed);
        } for (WPI_TalonFX m : rightMotors) {
            m.set(speed);
        }

    }

    public void turnRightWithoutStopping(double speed) {
        for (WPI_TalonFX e : leftMotors) {
            e.set(speed);
        } for (WPI_TalonFX m : rightMotors) {
            m.set(-speed);
        }

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
