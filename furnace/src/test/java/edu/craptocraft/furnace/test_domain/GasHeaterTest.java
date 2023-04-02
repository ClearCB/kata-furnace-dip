package edu.craptocraft.furnace.test_domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.craptocraft.furnace.behaviour.Heater;
import edu.craptocraft.furnace.behaviour.Thermometer;
import edu.craptocraft.furnace.domain.GasHeater;
import edu.craptocraft.furnace.models.RoomTemperature;

public class GasHeaterTest {
    public static RoomTemperature temperature;
    public static Heater gasHeater;
    public static Thermometer thermometer;

    @BeforeClass
    public static void createGasHeater() {
        temperature = RoomTemperature.getInstance();
        gasHeater = new GasHeater();
    }

    @Test
    public void constructorTest() {

        assertNotNull(gasHeater);
    }

    @Test
    public void engageTest() {

        temperature.setTemperature(10.0);
        assertEquals(10.0, temperature.getTemperature(), 0);

        gasHeater.engage(temperature);
        assertEquals(11.0, temperature.getTemperature(), 0);

    }

    @Test
    public void disengageTest() {

        temperature.setTemperature(10.0);
        assertEquals(10.0, temperature.getTemperature(), 0);

        gasHeater.disengage(temperature);
        assertEquals(9.0, temperature.getTemperature(), 0);

    }

}