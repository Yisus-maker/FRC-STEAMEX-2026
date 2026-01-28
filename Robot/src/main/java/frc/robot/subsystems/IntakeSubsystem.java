
package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {
    private final Spark m_motor = new Spark(0);

    public void runIntake() {
        m_motor.set(0.8);
    }

    public void stopIntake() {
        m_motor.set(0);
    }
}
