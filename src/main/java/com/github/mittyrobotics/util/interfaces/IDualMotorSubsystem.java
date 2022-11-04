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
 * Interface for all dual motor subsystem
 */
public interface IDualMotorSubsystem extends ISubsystem {
    /**
     * Stops the motors from moving
     */
    default void stopMotor() {
        setMotor(0, 0);
    }

    /**
     * Sets both motors to move at different percents
     * By default, this has no contraints, but can be overriden
     *
     * @param percent1 the percent for the first motor
     * @param percent2 the percent for the second motor
     */
    default void setMotor(double percent1, double percent2) {
        overrideSetMotor(percent1, percent2);
    }

    /**
     * Sets both motors to move at a certain percent without constraints
     *
     * @param percent1 the percent of the first motor
     * @param percent2 the percent of the second motor
     */
    void overrideSetMotor(double percent1, double percent2);

    /**
     * Function to reset an encoders on the subsystem
     */
    default void resetEncoder() {

    }

    /**
     * Returns the encoder value of the left motor
     * By default returns 0
     *
     * @return left encoder value
     */
    default double getLeftPosition() {
        return 0;
    }

    /**
     * Returns the encoder velocity of the left motor
     * By default returns 0
     *
     * @return left encoder velocity
     */
    default double getLeftVelocity() {
        return 0;
    }

    /**
     * Returns the encoder value of the right motor
     * By default returns 0
     *
     * @return right encoder value
     */
    default double getRightPosition() {
        return 0;
    }

    /**
     * Returns the encoder value of the left motor
     * By default returns 0
     *
     * @return left encoder value
     */
    default double getRightVelocity() {
        return 0;
    }

    /**
     * Returns the average velocity of both encoders
     *
     * @return average velocity
     */
    default double getAverageVelocity() {
        return (getLeftVelocity() + getRightVelocity()) / 2;
    }

    /**
     * Returns the average position of both encoders
     *
     * @return average position
     */
    default double getAveragePosition() {
        return (getLeftPosition() + getLeftPosition()) / 2;
    }
}