package com.github.mittyrobotics;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;


public class Robot extends TimedRobot {
    WPI_TalonSRX motor_right;
    WPI_TalonSRX motor_left;

    WPI_TalonSRX motor_right_d;
    WPI_TalonSRX motor_left_d;
    XboxController controller;
    double right, left = 0;
    //
    @Override
    public void robotInit() {
        motor_right = new WPI_TalonSRX(3);
        motor_left.setInverted(true);
        motor_right.configFactoryDefault();
        motor_left = new WPI_TalonSRX(1);
        motor_left.configFactoryDefault();
        controller = new XboxController(0);
        motor_right_d = new WPI_TalonSRX(4);
        motor_left_d.setInverted(true);
        motor_right_d.configFactoryDefault();
        motor_left_d = new WPI_TalonSRX(2);
        motor_left_d.configFactoryDefault();
        //controller = new XboxController(0);
        right = 0;
        left = 0;

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
        right = 0;
        left = 0;
        if(controller.getLeftY()>0.2 || controller.getLeftY()<-0.2)
        {
            left = controller.getLeftY();
            right = controller.getRightY();
        }
        else
        {
            left = 0;
            right = 0;
        }

        if(controller.getRightX()<-0.2)
        {
            left -= controller.getRightX();
        }
        else if(controller.getRightX()>0.2)
        {
            right += controller.getRightX();
        }
        motor_right.set(right);
        motor_left.set(left);
        motor_right_d.set(right);
        motor_left_d.set(left);

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
