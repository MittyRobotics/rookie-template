
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

class ShooterSubsystem {


    public class ShooterSubsystem extends SubsystemBase {

        //singleton
        private static ShooterSubsystem ourInstance = new ShooterSubsystem();

        public static ShooterSubsystem getInstance() {
            return ourInstance;
        }

        private DriveTrain() {
            super("DriveTrain");
        }

        //initHardware
        WPI_TalonSRX talon;


        public void initHardware() {

            //creating hardware objects to be accessed within subsystem
            motor1 = new WPI_TalonSRX(1);
            shootermotor = new WPI_TalonSRX(1);


            //setting hardware to factory default
            motor1.setFactoryDefault();
            shootermotor.setFactoryDefault();


            //set any inverted
            motor1.setInverted(false);
            shootermotor.setInverted(false);

            //default command - optional
            setDefaultCommand(new ShooterOut());


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
            motor1.set(1);
            shootermotor.set(1);
        }


        public void turnOn(){
            motor1.set(0);
            shootermotor.set(0);
        }
        public void turnTurretleft() {
            motor1.set(-1);


        }

        public void turnTurretright() {
            shootermotor.set(1);


        }

        public void moveShooterforward() {
            shootermotor.set(0.5);

        }

        public void moveShooterbackward() {
            shootermotor.set(-0.5);
        }

        public void shutOff(){
            motor1.set(0);
            shootermotor.set(0);
        }


        //update dashboard

        public void updateDashboard() {

        }

    }
}