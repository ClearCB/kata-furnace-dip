package edu.craptocraft.furnace.test_domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.craptocraft.furnace.behaviour.Heater;
import edu.craptocraft.furnace.behaviour.Regulator;
import edu.craptocraft.furnace.behaviour.Thermometer;
import edu.craptocraft.furnace.domain.GasHeater;
import edu.craptocraft.furnace.domain.RemoteCommandSensor;
import edu.craptocraft.furnace.domain.TemperatureRegulator;
import edu.craptocraft.furnace.models.RoomTemperature;

public class TemperatureRegulatorTest {
    public static Regulator regulator;
    public static RoomTemperature temperature;
    public static Heater heater;
    public static Thermometer thermometer;

    @BeforeClass
    public static void createRegulator() {
        temperature = RoomTemperature.getInstance();
        heater = new GasHeater();
        thermometer = new RemoteCommandSensor();
        regulator = new TemperatureRegulator(15.0, 21.0);
    }

    @Test
    public void constructorTest() {

        String sampleText = "\n\t\tMin temp: 15.0\n\t\tMax temp: 21.0";
        assertNotNull(regulator);
        assertEquals(sampleText, regulator.toString());
    }

    @Test
    public void engageTest() {

        temperature.setTemperature(10.0);
        assertEquals(10.0, temperature.getTemperature(), 0);
        regulator.regulate(thermometer, heater, temperature);
        assertEquals(15.0, temperature.getTemperature(), 0);

    }

    @Test
    public void disengageTest() {

        temperature.setTemperature(25.0);
        assertEquals(25.0, temperature.getTemperature(), 0);
        regulator.regulate(thermometer, heater, temperature);
        assertEquals(21.0, temperature.getTemperature(), 0);
    }
}