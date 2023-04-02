package edu.craptocraft.furnace.behaviour;

import edu.craptocraft.furnace.models.RoomTemperature;

public interface Thermometer {

    double read(RoomTemperature temperature);
}
