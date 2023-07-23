package frc.robot;

public class Constants {
    // Drivebase
    public static class DriveBaseConstants {
        // Units: degrees
        public static final double LEFT_OFFSET = 3.0;
        public static final double RIGHT_OFFSET = 17.0;
        public static final double FRONT_OFFSET = 6.53;
        public static final double REAR_OFFSET = 4.29;

        public static final double MAX_VELO = 4.5; // m/s
        public static final double MAX_ACCEL = 2.2; // m/s^2
    }   
    
    // Subsystem 1
    public static class Subsystem1Constants {
        public static final double WHEEL_SPEED = 360; // RPM
        public static final double ENC_OFFSET = 4.0; // degrees

        public static int MOTOR_1_ID = 4;
    }
}