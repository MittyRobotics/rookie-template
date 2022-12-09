package com.github.mittyrobotics.util;

import com.github.mittyrobotics.util.interfaces.ISubsystem;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Manages all of the subsystems
 */
public class SubsystemManager implements ISubsystem {
    /**
     * {@link SubsystemManager} instance
     */
    private static SubsystemManager instance;

    /**
     * {@link ArrayList} of subsystems
     */
    ArrayList<ISubsystem> subsystems;

    /**
     * instantiates a {@link SubsystemManager} and the subsystems {@link ArrayList}
     */
    private SubsystemManager() {
        subsystems = new ArrayList<>();
    }

    /**
     * Returns the {@link SubsystemManager} instance
     *
     * @return {@link SubsystemManager} instance
     */
    public static SubsystemManager getInstance() {
        if (instance == null) {
            instance = new SubsystemManager();
        }
        return instance;
    }

    /**
     * Adds {@link ISubsystem} to the {@link SubsystemManager}
     *
     * @param subsystems list of {@link ISubsystem}
     */
    public void addSubsystems(ISubsystem... subsystems) {
        this.subsystems.addAll(Arrays.asList(subsystems));
    }

    /**
     * Initializes hardware for each {@link ISubsystem}
     */
    @Override
    public void initHardware() {
        subsystems.forEach(ISubsystem::initHardware);
    }

    /**
     * Updates the dashboard for each {@link ISubsystem}
     */
    @Override
    public void updateDashboard() {
        subsystems.forEach(ISubsystem::updateDashboard);
    }
}
