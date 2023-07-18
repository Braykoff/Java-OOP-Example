package Inheritance;

public class Main {
    public static void main(String... args) {
        // Prove that all SafeMotor objects are also Motor objects
        // If the value inside the assert() evaluates to false, the program
        // will abort with an error
        assert(new SafeMotor(0) instanceof Motor);

        System.out.println("Program ran successfully!");
    }
}
