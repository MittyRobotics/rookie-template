package com.github.mittyrobotics;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;


public class Robot extends TimedRobot {
    WPI_TalonSRX motor_right;
    WPI_TalonSRX motor_left;
    XboxController controller;

    @Override
    public void robotInit() {
        motor_right = new WPI_TalonSRX(24);
        motor_left.setInverted(true);
        motor_right.configFactoryDefault();
        motor_left = new WPI_TalonSRX(24);
        motor_left.configFactoryDefault();
        controller = new XboxController(0);
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
        if(controller.getLeftY()>0.2 || controller.getLeftY()<-0.2)
        {
            motor_left.set(controller.getLeftY());
        }
        else
        {
            motor_left.set(0);
        }

        if(controller.getRightY()>0.2 || controller.getRightY()<-0.2)
        {
            motor_right.set(controller.getRightY());
        }
        else
        {
            motor_right.set(0);
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
