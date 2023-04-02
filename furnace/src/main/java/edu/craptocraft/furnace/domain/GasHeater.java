package edu.craptocraft.furnace.domain;

import edu.craptocraft.furnace.behaviour.Heater;
import edu.craptocraft.furnace.models.RoomTemperature;

public class GasHeater implements Heater {

    @Override
    public void engage(RoomTemperature temperature) {

        temperature.updateTemperature(1);

    }

    @Override
    public void disengage(RoomTemperature temperature) {

        temperature.updateTemperature(-1);
    }
}
