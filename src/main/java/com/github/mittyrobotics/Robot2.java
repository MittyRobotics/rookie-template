package com.github.mittyrobotics;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;


public class Robot2 extends TimedRobot {
    @Override
    XboxController controller;
    WPI_TalonSRX motor;
    WPI_TalonSRX motor2;
    WPI_TalonSRX motor3;
    WPI_TalonSRX motor4;

    public void robotInit() {
        motor= new WPI_TalonSRX(24);
        motor.configFactoryDefault();
        controller=new XboxController(8);
        motor2= new WPI_TalonSRX(26);
        motor2.configFactoryDefault();
        motor3.setInverted(true);motor2= new WPI_TalonSRX(26);
        motor3.configFactoryDefault();
        motor3.setInverted(true);
        motor4= new WPI_TalonSRX(26);
        motor4.configFactoryDefault();
        motor4.setInverted(true);






    }

    @Override
    public void robotPeriodic() {

    }

    @Override
    public void autonomousInit() {

    }

    @Override
    public void autonomousExit() {
    }

    @Override
    public void autonomousPeriodic() {

    }

    @Override
    public void teleopInit() {

    }

    @Override
    public void teleopPeriodic() {
        if(controller.getLeftY()<-0.2||controller.getLeftY()>0.2) {
            motor.set(controller.getLeftY());
            motor2.set(controller.getLeftY());
            motor3.set(controller.getLeftY());
            motor4.set(controller.getLeftY());
        }
        else{
            motor.set(0);
        }

        if(controller.getRightX()>0.2) {
            motor4.set(controller.getRightX());
            motor3.set(-(controller.getRightX())/2);
            motor2.set(controller.getRightX());
            motor.set(-(controller.getRightX())/2);
        }
        else if(controller.getRightX()<-0.2) {
            motor4.set(-(controller.getRightX())/2);
            motor3.set(controller.getRightX());
            motor2.set(-(controller.getRightX())/2);
            motor.set(controller.getRightX());
        }
        else{
            motor2.set(0);
        }


    }

    @Override
    public void disabledInit() {
    }

    @Override
    public void disabledPeriodic() {
    }

    @Override
    public void testInit() {

    }

    @Override
    public void testPeriodic() {
    }
}
