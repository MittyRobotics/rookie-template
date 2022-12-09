
package com.github.mittyrobotics;

        import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
        import edu.wpi.first.wpilibj2.command.SubsystemBase;




public class DrivetrainSubsystem extends SubsystemBase {

    //singleton
    private static DrivetrainSubsystem Instance = new ShooterSubsystem();

    public static DrivetrainSubsystem getInstance() {
        return Instance;
    }



    //initHardware
    WPI_TalonSRX motorL; //motor1
    WPI_TalonSRX motorR; //motor2


    public void initHardware() {

        //creating hardware objects to be accessed within subsystem
        motorL = new WPI_TalonSRX(1);
        motorR = new WPI_TalonSRX(1);


        //setting hardware to factory default
        motorL.configFactoryDefault();
        motorR.configFactoryDefault();


        //set any inverted
        motorL.setInverted(false);
        motorR.setInverted(false);




    }

    //if not in singleton, need getInstance function

    /*
    public static ShooterSubsystem getInstance() {
       if(instance == null){
         intake = new ShooterSubsystem();

       }
      return instance;
    }




    */

    //periodic function - optional
    @Override
    public void periodic() {
        motorL.set(1);
        motorR.set(1);
    }


    public void beOn(){
        motorL.set(0);
        motorR.set(0);
    }
    public void turnLeft() {
        motorL.set(1);
        motorR.set(-1);

    }

    public void turnRight() {
        motorL.set(-1);
        motorR.set(1);


    }

    public void moveForward() {
        motorL.set(1);
        motorR.set(1);

    }

    public void moveBackward() {
        motorL.set(-1);
        motorR.set(-1)

    }

    public void turnOff(){
        motorL.set(0);
        motorR.set(0);
    }


    //update dashboard...??



    }

}
}