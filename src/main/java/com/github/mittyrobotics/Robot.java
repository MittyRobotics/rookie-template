package com.github.mittyrobotics;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;


public class Robot extends TimedRobot {

    XboxController controller;
    double fwdSpeed = 0.5;
    double horizSpeed = 0.5;


    WPI_TalonSRX motor;
    WPI_TalonSRX motor2;
    WPI_TalonSRX motor3;
    WPI_TalonSRX motor4;

    @Override
    public void robotInit() {
        motor = new WPI_TalonSRX(24);
        motor.configFactoryDefault();

        controller = new XboxController(8);

        motor2 = new WPI_TalonSRX(25);
        motor2.configFactoryDefault();

        motor2.setInverted(true);

        motor3 = new WPI_TalonSRX(26);
        motor3.configFactoryDefault();

        motor4 = new WPI_TalonSRX(27);
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
     /*if (controller.getLeftY() > 0) //code for the circle error thing
        if (controller.getLeftY() > 0){
            fwdSpeed = horizSpeed = 0.7;
            motor.set(fwdSpeed);
            motor2.set(fwdSpeed);
            motor3.set(fwdSpeed);
            motor4.set(fwdSpeed);

        if (controller.getLeftY() < 0){
            fwdSpeed = horizSpeed = 0.3;
            motor.set(horizSpeed); */

         //horiz and vertical speed

        horizSpeed = 0;
        fwdSpeed = 0;

        if (controller.getLeftY() >0.2 || controller.getLeftY()<0.2) {

            fwdSpeed = controller.getLeftY();
            horizSpeed = controller.getRightY();

        }else{
            fwdSpeed = 0;
            horizSpeed = 0;

        }
        if (controller.getRightX()<0.2){
            horizSpeed -= controller.getRightX();

        } else if(controller.getRightX() > 0.2){
            horizSpeed += controller.getRightX();
        }
        motor.set(horizSpeed);
        motor2.set(fwdSpeed);
        motor3.set(horizSpeed);
        motor4.set(fwdSpeed);







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
