package edu.craptocraft.furnace.test_domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.craptocraft.furnace.behaviour.Thermometer;
import edu.craptocraft.furnace.domain.RemoteCommandSensor;
import edu.craptocraft.furnace.models.RoomTemperature;

public class RemoteCommandSensorTest {
    public static Thermometer thermometer;

    @BeforeClass
    public static void createRemoteCommandSensorTest() {

        thermometer = new RemoteCommandSensor();
    }

    @Test
    public void constructorTest() {

        assertNotNull(thermometer);
    }

    @Test
    public void readTest() {

        RoomTemperature temperature = RoomTemperature.getInstance();
        temperature.setTemperature(17.0);
        assertEquals(17.0, thermometer.read(temperature), 0);
    }

}