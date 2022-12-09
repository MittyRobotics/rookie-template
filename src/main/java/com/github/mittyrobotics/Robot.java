package com.github.mittyrobotics;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;


public class Robot extends TimedRobot {

    WPI_TalonFX motor;
    WPI_TalonFX motor2;
    WPI_TalonFX motor3;
    WPI_TalonFX motor4;
    XboxController controller;


    @Override
    public void robotInit() {
        motor = new WPI_TalonFX(24);
        motor2 = new WPI_TalonFX(25);
        motor3 = new WPI_TalonFX(26);
        motor4 = new WPI_TalonFX(27);
        motor.configFactoryDefault();
        motor2.configFactoryDefault();
        motor3.configFactoryDefault();
        motor4.configFactoryDefault();
        motor.setInverted(true);
        motor2.setInverted(false);
        motor3.setInverted(true);
        motor4.setInverted(false);
        controller = new XboxController(0);


    }

    @Override
    public void robotPeriodic() {
        double right, left = 0;
        if(controller.getLeftY() < -0.2 || controller.getLeftY() > 0.2) {
            left = controller.getLeftY();
            right = controller.getRightY();

        }
        else{
            left = 0;
            right = 0;
        }
        if(controller.getRightX()<-0.2) {
            left -= controller.getRightX();
        }
        else if(controller.getRightX()>0.2) {
            right += controller.getRightX();
        }
        motor.set(right);
        motor2.set(left);
        motor3.set(right);
        motor4.set(left);
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
        motor.set(0.5);

    }

    @Override
    public void teleopPeriodic() {
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
