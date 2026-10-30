
package com.ece;

public class RFInterferenceDetector {

    public double calculateSNR(
            double signalLevel, double noiseFloor) {
        return signalLevel - noiseFloor;
    }

    public String detectInterference(
            double signalLevel, double noiseFloor) {

        double snr = calculateSNR(
                signalLevel, noiseFloor);

        if (snr < 20) {
            return "Interference Detected";
        }

        return "Normal";
    }
}
