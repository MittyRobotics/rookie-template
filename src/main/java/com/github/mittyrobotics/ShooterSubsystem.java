package com.github.mittyrobotics;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


class ShooterSubsystem {
    private static ShooterSubsystem ourInstance = new ShooterSubsystem();
    public static ShooterSubsystem getInstance(){
        return ourInstance;

    }
    public class ShooterSubsystem extends SubsystemBase {
        private ShooterSubsystem(){
            super();
            setName("Shooter Subsystem");

        }

        WPI_TalonSRX motorLeft, motorRight;

        public void initHardware(){
            //creating hardware objects to be accessed within subsystem
            motorLeft = new WPI_TalonSRX(0);
            motorLeft.configFactoryDefault();

            motorRight = new WPI_TalonSRX(1);
            motorRight.configFactoryDefault();

            //set any inverted
            motorLeft.setInverted(true);

        }
        public void TurnOnMotorLeft() {
            motorLeft.set(1);

        }
        public void TurnOffMotorLeft() {
            motorLeft.set(0);

        }
        public void TurnOnMotorRight(){

            motorRight.set(1);
        }
        public void TurnOffMotorRight() {
            motorLeft.set(0);

        }

    }

}