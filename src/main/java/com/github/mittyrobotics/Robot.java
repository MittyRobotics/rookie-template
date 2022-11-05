package com.github.mittyrobotics;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;


public class Robot extends TimedRobot {

    XboxController controller;
    XboxController controllerR;

    WPI_TalonSRX motor;
    WPI_TalonSRX motorR;

    @Override
    public void robotInit() {
        motor = new WPI_TalonSRX(24);
        motor.configFactoryDefault();

        controller = new XboxController(8);

        motorR = new WPI_TalonSRX(25);
        motorR.configFactoryDefault();

        controllerR = new XboxController(9);

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

        if (controller.getLeftY() < -0.2 ||  controller.getLeftY() > 0.2) {
            motor.set(controller.getLeftY());
        }else{
            motor.set(0);
        }

        if (controllerR.getRightY() < -0.2 ||  controller.getRightY() > 0.2) {
            motor.set(controller.getRightY());
        }else{
            motorR.set(0);
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
