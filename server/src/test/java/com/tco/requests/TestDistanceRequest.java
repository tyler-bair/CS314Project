package com.tco.requests;

import com.tco.misc.JSONValidator;
import java.lang.reflect.Type;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class TestDistanceRequest {

    private DistanceRequest dist;

    private void test(String distances, Type type, boolean valid) {
        try {
            JSONValidator.validate(distances, type);
            assertTrue(valid);
        } catch ( Exception e ) {
            assertFalse(valid);
        }
    }

    @Test
    @DisplayName("jbahny: Valid DistanceRequest")
    public void testDistanceRequestValidity() {
        test("{}", DistanceRequest.class, false);
    }

    @BeforeEach
    public void createConfigurationForTestCases() {
        Places places = new Places();
        places.add(new Place("51.5", "-0.14")); //Nova South, England
        places.add(new Place("51.5", "-0.14")); //Victoria Palace Theatre, England
        places.add(new Place("51.5", "-0.15")); //Chester Square Mews, England
        places.add(new Place("51.48","-0.11")); //Saint Mark's Kennington, England
        dist = new DistanceRequest(3440064.0, places);
        dist.buildResponse();
    }

    @Test
    @DisplayName("jbahny: Request type is \"distances\"")
    public void testType() {
        String type = dist.getRequestType();
        assertEquals("distances", type);
    }

    @Test
    @DisplayName("jbahny: Features includes \"distances\"")
    public void testFeatures(){
        ConfigRequest conf = new ConfigRequest();
        conf.buildResponse();
        assertTrue(conf.validFeature("distances"));
    }

    @Test
    @DisplayName("jbahny: test earth radius")
    public void testEarthRadius(){
        assertTrue(dist.earthRadius() == 3440064.0);
    }

    @Test
    @DisplayName("jbahny: test DistanceRequest with alissaam")
    public void testAlissaam(){
        dist.buildResponse();
        Distances expected = new Distances();
        expected.add(0L);
        expected.add(374L);
        expected.add(1918L);
        expected.add(1643L);
        assertTrue(dist.getDistances().equals(expected));
    }

    @Test
    @DisplayName("maxcolb: test empty places")
    public void testEmpty(){
        Places empty = new Places();
        Distances expected = new Distances();
        DistanceRequest emptyRequest = new DistanceRequest(4371.0, empty);
        emptyRequest.buildResponse();
        assertTrue(emptyRequest.getDistances().equals(expected));

    }
}
