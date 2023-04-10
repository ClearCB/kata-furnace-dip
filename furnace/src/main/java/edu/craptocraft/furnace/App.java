package edu.craptocraft.furnace;

import edu.craptocraft.furnace.behaviour.Heater;
import edu.craptocraft.furnace.behaviour.Regulator;
import edu.craptocraft.furnace.behaviour.Thermometer;
import edu.craptocraft.furnace.domain.GasHeater;
import edu.craptocraft.furnace.domain.RemoteCommandSensor;
import edu.craptocraft.furnace.domain.TemperatureRegulator;
import edu.craptocraft.furnace.models.RoomTemperature;

public class App {
    public static void main(String[] args) {

        final double minTemp = 15.0;
        final double maxTemp = 21.0;

        RoomTemperature temperature = RoomTemperature.getInstance();
        temperature.setTemperature(12);
        Heater heater = new GasHeater();
        Thermometer thermometer = new RemoteCommandSensor();

        Regulator regulator = new TemperatureRegulator(minTemp, maxTemp);

        System.out.println(temperature.toString());
        System.out.println("Arrancando...");
        regulator.regulate(thermometer, heater, temperature);
        System.out.println(temperature.toString());

        temperature.setTemperature(25);

        System.out.println(temperature.toString());
        System.out.println("Arrancando...");
        regulator.regulate(thermometer, heater, temperature);
        System.out.println(temperature.toString());

    }
}