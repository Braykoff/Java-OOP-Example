package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Subsystem1;

public class Subsystem1Command extends CommandBase {
    // Subsystem
    private Subsystem1 mainSubsys;
    private double lastAngle = 0.0;

    // Constructor
    public Subsystem1Command(Subsystem1 subsys1) {
        mainSubsys = subsys1;

        addRequirements(subsys1);
    }

    // Start
    @Override
    public void initialize() {
        System.out.println("Subsystem1 Command Started");
        lastAngle = 4.0;
    }

    // Run
    @Override
    public void execute() {
        System.out.println("Subsystem1 Command is running!");
        lastAngle += 10.0;
        mainSubsys.setAngle(lastAngle);
    }

    // End
    @Override
    public void end(boolean interrupted) {
        System.out.println("Subsystem1 Command ended!");
        mainSubsys.setAngle(0.0);
        if (interrupted) System.out.println("Subsystem1 Command was interrupted!");
    }

    @Override
    public boolean isFinished() { return lastAngle >= 50.0; }
    
    // Config
    @Override
    public String getName() { return "Subsystem1 Command"; }

    @Override
    public boolean runsWhenDisabled() { return true; }

    @Override
    public InterruptionBehavior getInterruptionBehavior() {
        return InterruptionBehavior.kCancelSelf;
    }
}
