/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ankushthobhani
 */
public class Fitbyte {
    private int age;
    private int heartRate;
    
    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.heartRate = restingHeartRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum) {
        double maxHeartRate = 206.3 - (0.711 * this.age);
        return (maxHeartRate - this.heartRate) * percentageOfMaximum + this.heartRate;
    }
}
