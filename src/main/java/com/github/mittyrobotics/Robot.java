package com.github.mittyrobotics;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;


public class Robot extends TimedRobot {
    WPI_TalonFX motor;
    WPI_TalonFX secondary;

    double leftForce;
    double rightForce;

    XboxController contro;
    @Override
    public void robotInit() {
        leftForce = 0.0;
        rightForce = 0.0;
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
            leftForce += 0.5 * contro.getLeftY();
            rightForce += 0.5 * contro.getLeftY();
        } if (contro.getRightX() > 0.2) {
            rightForce += 0.5 * contro.getRightX();
            leftForce += contro.getRightX();
        } else if (contro.getRightX() < -0.2) {
            rightForce += contro.getRightX();
            leftForce += 0.5 * contro.getRightX();
        } else {
            motor.set(0);
            secondary.set(0);
        }


        //i hope i didnt make a lpgic error :)
        //might go over the top of th elimit of the set function

        motor.set(leftForce);
        secondary.set(rightForce);



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
