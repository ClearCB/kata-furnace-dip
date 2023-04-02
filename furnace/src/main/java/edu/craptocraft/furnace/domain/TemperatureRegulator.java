package edu.craptocraft.furnace.domain;

import edu.craptocraft.furnace.behaviour.Heater;
import edu.craptocraft.furnace.behaviour.Regulator;
import edu.craptocraft.furnace.behaviour.Thermometer;
import edu.craptocraft.furnace.models.RoomTemperature;

public class TemperatureRegulator implements Regulator {
    double minTemp;
    double maxTemp;

    public TemperatureRegulator(double minTemp, double maxTemp) {

        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }

    @Override
    public void regulate(Thermometer temperatureReader, Heater temperatureRegulator, RoomTemperature temperature) {

        while (temperatureReader.read(temperature) > this.getMaxTemp()) {

            temperature.updateTemperature(-1);

        }

        while (temperatureReader.read(temperature) < this.getMinTemp()) {

            temperature.updateTemperature(1);

        }
    }

    @Override
    public String toString() {
        return "\n\t\tMin temp: " + minTemp + "\n\t\tMax temp: " + maxTemp;
    }

}
