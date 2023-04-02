package edu.craptocraft.furnace.behaviour;

import edu.craptocraft.furnace.models.RoomTemperature;

public interface Regulator {

    void regulate(Thermometer temperatureReader, Heater temperatureRegulator, RoomTemperature temperature);
}
