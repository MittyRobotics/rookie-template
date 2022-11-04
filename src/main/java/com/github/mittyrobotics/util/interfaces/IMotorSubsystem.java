/*
 * MIT License
 *
 * Copyright (c) 2020 Mitty Robotics (Team 1351)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.github.mittyrobotics.util.interfaces;

/**
 * Interface for all motor based subsystem classes
 */
public interface IMotorSubsystem extends ISubsystem {
    /**
     * Stops the motor from moving
     */
    default void stopMotor() {
        setMotor(0);
    }

    /**
     * Sets the motor to run at a certain percent (using duty cycle)
     *
     * @param percent the percentage to run the motor at
     */
    default void setMotor(double percent) {
        overrideSetMotor(percent);
    }


    void overrideSetMotor(double percent);

    /**
     * Resets an encoder position
     */
    default void resetEncoder() {

    }

    /**
     * Gets an encoder position
     *
     * @return an encoder position
     */
    default double getPosition() {
        return 0;
    }

    /**
     * Gets an encoder velocity
     *
     * @return an encoder velocity
     */
    default double getVelocity() {
        return 0;
    }

    /**
     * Gets if a switch
     *
     * @return value of a switch
     */
    default boolean getSwitch() {
        return false;
    }

    /**
     * Gets if a left limit switch is being pressed
     *
     * @return value of left limit switch
     */
    default boolean getLeftSwitch() {
        return false;
    }

    /**
     * Gets if a right limit switch is being pressed
     *
     * @return value of right limit switch
     */
    default boolean getRightSwitch() {
        return false;
    }

}