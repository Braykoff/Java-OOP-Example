package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.Subsystem1Constants;

public class Subsystem1 extends SubsystemBase {
    // We'll learn how to create motors later
    private int motorId = Subsystem1Constants.MOTOR_1_ID;
    private double setDegrees;

    // Constructor
    public Subsystem1(int id) {
        System.out.printf("Motor %s is being configured...", motorId);
        setDegrees = 0.0;
    }

    // Control
    public void setAngle(double degrees) {
        System.out.printf("Motor %s set to %s deg", motorId, degrees);
        setDegrees = degrees;
    }

    // Periodic
    @Override
    public void periodic() {
        // Control here
    }
}
