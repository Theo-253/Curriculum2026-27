package frc.robot.subsystems.arm;


import edu.wpi.first.math.util.Units;
import edu.wpi.first.units.Unit;
import edu.wpi.first.wpilibj.Alert;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.arm.ArmIO.ArmIOInputs;
import frc.robot.subsystems.arm.ArmIO.ArmIOOutputMode;
import frc.robot.subsystems.arm.ArmIO.ArmIOOutputs;
import frc.robot.util.FullSubsystem;
import java.util.function.DoubleSupplier;
import lombok.RequiredArgsConstructor;
import org.littletonrobotics.junction.AutoLogOutput;
import org.littletonrobotics.junction.Logger;

public class ArmSubsystem extends FullSubsystem {

  public ArmSubsystem(ArmIO io) {
  }
  
@Override
  public void periodicAfterScheduler() {
  
  }

}

