
package com.ece;

public class Main {

    public static void main(String[] args) {

        RFInterferenceDetector detector =
                new RFInterferenceDetector();

        double signal = -50;
        double noise = -90;

        double snr = detector.calculateSNR(
                signal, noise);

        String status = detector.detectInterference(
                signal, noise);

        System.out.println("RF Interference Detection");
        System.out.println("-------------------------");
        System.out.println("Signal Level: " + signal + " dBm");
        System.out.println("Noise Floor: " + noise + " dBm");
        System.out.println("SNR: " + snr + " dB");
        System.out.println("Status: " + status);
    }
}

