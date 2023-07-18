package Inheritance; // Ignore this, its because its in a folder

/*
 * Pretend this file was part of a library you installed, and you
 * can not modify it.
 */

public class Motor {
    private int id;

    public Motor(int id) {
        this.id = id;
    }

    public void setSpeed(double speed) {
        System.out.printf("Motor %s speed has been set to %d", id, speed);
    }
}
