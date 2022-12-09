package com.github.mittyrobotics;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.github.mittyrobotics.util.SubsystemManager;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;



public class Robot extends TimedRobot {
    /**
     * public class intakeSubsys extends SubsystemBase {
     *         private static intakeSubsys ourInst = new intakeSubsys(); //singleton pattern
     *         public static intakeSubsys getInst() {
     *             return ourInst;
     *         }
     *         private intakeSubsys() {
     *             super("Intake Subsys);
     *         }
     *     }
     */




    WPI_TalonFX motor;
    WPI_TalonFX secondary;



    WPI_TalonFX tertiary;

    WPI_TalonFX quad;

    double leftForce;
    double rightForce;

    XboxController contro;
    WPI_TalonFX[] leftMotors = new WPI_TalonFX[2];
    WPI_TalonFX[] rightMotors = new WPI_TalonFX[2];
    @Override
    public void robotInit() {




        leftForce = 0.0;
        rightForce = 0.0;
        motor = new WPI_TalonFX(24);
        motor.configFactoryDefault();
        contro = new XboxController(1);
        secondary = new WPI_TalonFX(2);
        tertiary = new WPI_TalonFX(3);
        secondary.configFactoryDefault();
        tertiary.configFactoryDefault();
        quad = new WPI_TalonFX(4);

        quad.configFactoryDefault();
        tertiary.setInverted(true);
        quad.setInverted(true);




        leftMotors[0] = motor;
        leftMotors[1] = secondary;
        rightMotors[0] = tertiary;
        rightMotors[1] = quad;

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
        leftForce = 0.0;
        rightForce = 0.0;
        if (contro.getLeftY() > 0.2 || contro.getLeftY() < -0.2) {
            leftForce += 0.5 * contro.getLeftY();
            rightForce += 0.5 * contro.getLeftY();
        } if (contro.getRightX() > 0.2) {
            rightForce -= contro.getRightX();
            //leftForce += contro.getRightX();
        } else if (contro.getRightX() < -0.2) {
            //rightForce += contro.getRightX();
            leftForce -= contro.getRightX();
        } else {
            motor.set(0);
            secondary.set(0);
            tertiary.set(0);
            quad.set(0);
        }


        //i hope i didnt make a lpgic error :)
        // i think ur all good! we're not using controller today tho since
     // we haven't taught oi- naomi
        for (WPI_TalonFX mot: leftMotors) {
            mot.set(leftForce);
        }
        for (WPI_TalonFX mot: rightMotors) {
            mot.set(rightForce);
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
