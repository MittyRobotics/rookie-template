package com.github.mittyrobotics;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;


public class Robot extends TimedRobot {
    WPI_TalonFX motor;
    WPI_TalonFX secondary;

    XboxController contro;
    @Override
    public void robotInit() {
        motor = new WPI_TalonFX(24);
        motor.configFactoryDefault();
        contro = new XboxController(1);
        secondary = new WPI_TalonFX(76);
        secondary.setInverted(true);

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
        if (contro.getLeftY() > 0.2 || contro.getLeftY() < -0.2) {
            motor.set(contro.getLeftY());
        } else {
            motor.set(0);
        }

        if (contro.getRightY() > 0.2 || contro.getRightY() < -0.2) {
            secondary.set(contro.getRightY());
        } else {
            secondary.set(0);
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
