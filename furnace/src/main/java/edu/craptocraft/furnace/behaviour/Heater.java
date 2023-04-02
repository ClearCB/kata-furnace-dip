package edu.craptocraft.furnace.behaviour;

import edu.craptocraft.furnace.models.RoomTemperature;

public interface Heater {

    void engage(RoomTemperature temperature);

    void disengage(RoomTemperature temperature);
}
