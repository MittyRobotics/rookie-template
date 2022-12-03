package com.github.mittyrobotics;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DrivetrainSubsystem extends SubsystemBase {
    private static DrivetrainSubsystem ourInstance = new DrivetrainSubsystem();
    public static DrivetrainSubsystem getInstance(){return ourInstance;}
    private DrivetrainSubsystem(){
        super();
        setName("Drivetrain Subsystem");
    }

    WPI_TalonFX fr, fl, br, bl;
    public void initHardware(){
         fr = new WPI_TalonFX(2);
         fl = new WPI_TalonFX(3);
         br = new WPI_TalonFX(4);
         bl = new WPI_TalonFX(5);

         fr.configFactoryDefault();
         fl.configFactoryDefault();
         br.configFactoryDefault();
         bl.configFactoryDefault();

         fr.setInverted(true);
         fl.setInverted(true);
         br.setInverted(true);
         bl.setInverted(true);
    }

    @Override
    public void periodic(){}
    public void updateDashboard(){}

    public void driveForward(){
        fr.set(0.5);
        fl.set(0.5);
        br.set(0.5);
        bl.set(0.5);
    }

    public void reverse(){
        fr.set(-0.5);
        fl.set(-0.5);
        br.set(-0.5);
        bl.set(-0.5);
    }

    public void turnLeft(){
        fr.set(0.5);
        fl.set(-0.5);
        br.set(0.5);
        bl.set(-0.5);
    }

    public void turnRight(){
        fr.set(-0.5);
        fl.set(0.5);
        br.set(-0.5);
        bl.set(0.5);
    }

    public void turnOff(){
        fr.set(0);
        fl.set(0);
        br.set(0);
        bl.set(0);
    }

}
