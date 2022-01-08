package day02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {

    @Test
    void getPlusElevationTest() {
        List<Double> elevations = List.of(10.0,20.0,15.0,18.0);

        assertEquals(13.0,new Hiking().getPlusElevation(elevations));
    }
}