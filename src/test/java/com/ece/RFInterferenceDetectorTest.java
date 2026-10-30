package com.ece;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RFInterferenceDetectorTest {

    @Test
    void testNormalCondition() {
        RFInterferenceDetector detector =
                new RFInterferenceDetector();

        assertEquals(40.0,
                detector.calculateSNR(-50, -90));

        assertEquals("Normal",
                detector.detectInterference(-50, -90));
    }

    @Test
    void testInterferenceCondition() {
        RFInterferenceDetector detector =
                new RFInterferenceDetector();

        assertEquals(10.0,
                detector.calculateSNR(-50, -60));

        assertEquals("Interference Detected",
                detector.detectInterference(-50, -60));
    }
}
