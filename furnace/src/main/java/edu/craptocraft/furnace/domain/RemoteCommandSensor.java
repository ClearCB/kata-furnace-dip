package edu.craptocraft.furnace.domain;

import edu.craptocraft.furnace.behaviour.Thermometer;
import edu.craptocraft.furnace.models.RoomTemperature;

public class RemoteCommandSensor implements Thermometer {

    @Override
    public double read(RoomTemperature temperature) {
        return temperature.getTemperature();
    }
}
