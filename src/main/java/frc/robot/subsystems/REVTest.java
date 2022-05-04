// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class REVTest extends SubsystemBase implements AutoCloseable {
  /** Creates a new RevTest. */
  CANSparkMax motor;
  public REVTest() {
    motor = new CANSparkMax(1, MotorType.kBrushed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void close() throws Exception {
    motor.close();
  }


  public void test() {
    motor.set(1);
  }

}
