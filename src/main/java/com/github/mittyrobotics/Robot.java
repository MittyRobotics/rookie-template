package com.github.mittyrobotics;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;


public class Robot extends TimedRobot {
    XboxController controller;
    WPI_TalonSRX motor1, motor2, motor3, motor4;


    @Override
    public void robotInit() {
        motor1 = new WPI_TalonSRX(1);
        motor1.configFactoryDefault();

        motor2 = new WPI_TalonSRX(2);
        motor2.configFactoryDefault();

        motor3 = new WPI_TalonSRX(3);
        motor3.configFactoryDefault();

        motor4 = new WPI_TalonSRX(3);
        motor4.configFactoryDefault();

        controller = new XboxController(0);
        motor1.setInverted(true);
        motor3.setInverted(true);



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
        double right = 0;
        double left = 0;
        if(controller.getLeftY()>0.2||controller.getLeftY()<-0.2){
            left = controller.getLeftY();
            right = controller.getRightY();
        }else{
            left = 0;
            right = 0;
        }
        if(controller.getRightX()<-0.2){
            left -= controller.getRightX();
        }else if (controller.getRightX()>0.2){
            right += controller.getRightX();
        }
        motor1.set(right);
        motor2.set(left);
        motor3.set(right);
        motor4.set(left);


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
