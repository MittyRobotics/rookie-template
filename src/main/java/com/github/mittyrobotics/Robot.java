package com.github.mittyrobotics;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class Robot extends TimedRobot {
    XboxController controller;
    WPI_TalonSRX motorLeft;
    WPI_TalonSRX motorRight;


    @Override
    public void robotInit() {
        motorLeft = new WPI_TalonSRX(24);
        motorLeft.configFactoryDefault();

        motorRight = new WPI_TalonSRX(24);
        motorRight.configFactoryDefault();

        controller = new XboxController(0);
        motorLeft.setInverted(true);

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
        double b = 0;
        double b1 = 0;

        if ((controller.getLeftY() > 0.2)||(controller.getLeftY() < -0.2)){
            b = controller.getLeftY();
            b1  = controller.getRightY();
        } else {
            b = 0;
            b1 = 0;
        }
//comment
        if ((controller.getRightX() > 0.2)||(controller.getRightX() < -0.2)){
            b = controller.getLeftX();
            b1 = controller.getRightX();
        } else {
            b = 0;
            b1 = 0;
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
