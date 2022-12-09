package com.github.mittyrobotics;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
public class DriveSubsytem {
    private static DriveSubsytem ourInstance = new DriveSubsytem();
    WPI_TalonSRX ulmotor;
    WPI_TalonSRX lwmotor;
    public void initHardware(){

        //creating hardware objects to be accessed within subsystem
        ulmotor = new WPI_TalonSRX(26);
        lwmotor = new WPI_TalonSRX(26);


        //setting hardware to factory default
        ulmotor.configFactoryDefault();
        lwmotor.configFactoryDefault();

    }
    public static DriveSubsytem getInstance(){
        return ourInstance;
    }
    public void forward(){
        ulmotor.set(1);
        lwmotor.set(1)

    }
    public void back(){
        ulmotor.set(-1);
        lwmotor.set(-1)

    }
    public void turnleft(){
        ulmotor.set(1);
        lwmotor.set(-1)

    }
    public void turnright(){
        ulmotor.set(-1);
        lwmotor.set(-1)

    }
    public void turnoff(){
        ulmotor.set(0);
        lwmotor.set(0);
    }

}
