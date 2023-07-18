package Inheritance; // Ignore this, its because its in a folder

public class SafeMotor extends Motor {

    public SafeMotor(int id) {
        super(id);
    }
    
    @Override
    public void setSpeed(double speed) {
        speed = Math.max(Math.min(speed, 1.0), -1.0);
        super.setSpeed(speed);
    }
}
