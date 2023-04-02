package edu.craptocraft.furnace.models;

public class RoomTemperature {
    private static RoomTemperature temperature = new RoomTemperature();
    private double temperatureValue;

    private RoomTemperature() {
        // Avoid problems
    };

    public static RoomTemperature getInstance() {

        return temperature;
    }

    public void setTemperature(double value) {
        this.temperatureValue = value;
    }

    public double getTemperature() {

        return this.temperatureValue;
    }

    public void updateTemperature(double value) {

        this.setTemperature(this.getTemperature() + value);
    }
}
