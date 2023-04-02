package edu.craptocraft.furnace.test_models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.craptocraft.furnace.models.RoomTemperature;

public class RoomTemperatureTest {
    public static RoomTemperature temperature;

    @BeforeClass
    public static void createTemperature() {

        temperature = RoomTemperature.getInstance();
    }

    @Test
    public void getInstanceTest() {

        assertNotNull(temperature);
        assertNotNull(RoomTemperature.getInstance());
    }

    @Test
    public void testSetGetTemperature() {

        temperature.setTemperature(12.0);
        assertEquals(12.0, temperature.getTemperature(), 0);

    }

    @Test
    public void testUpdateTemperature() {

        temperature.updateTemperature(1);
        assertEquals(13.0, temperature.getTemperature(), 0);

        temperature.updateTemperature(-1);
        assertEquals(12.0, temperature.getTemperature(), 0);
    }
}
