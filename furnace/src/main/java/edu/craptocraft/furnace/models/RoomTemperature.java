package edu.craptocraft.furnace.models;

public class RoomTemperature {
    private static RoomTemperature temperature = null;
    private double temperatureValue;

    private RoomTemperature() {
        // Avoid problems
    };

    public static RoomTemperature getInstance() {

        if (temperature == null) {

            temperature = new RoomTemperature();

        }

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

    @Override
    public String toString() {

        StringBuilder informacion = new StringBuilder();

        informacion.append("La temperatura actual es: " + this.getTemperature());

        return informacion.toString();
    }

}
