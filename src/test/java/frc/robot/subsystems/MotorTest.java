// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import static org.junit.Assert.*;

import edu.wpi.first.hal.HAL;
import org.junit.*;

public class MotorTest {

    //CTRETest t;
    REVTest t;

    public MotorTest() {
    }

    @Before // this method will run before each test
    public void setup() {
        assert HAL.initialize(500, 0); // initialize the HAL, crash if failed
        //t = new CTRETest();
        t = new REVTest();
    }

    @After // this method will run after each test
    public void shutdown() throws Exception {
        t.close();
    }

    @Test // marks this method as a test
    public void dosomething() {
        t.test();
        assertEquals(true, true); // Don't actually care
    }
}
