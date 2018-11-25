package com.epam.task01.traffic.light;

/**
 * Class SignalChecker checks what signal shows us traffic light on
 * current minute.
 *
 * @author Selin Roman
 * @version 0.1.3
 */
class SignalChecker {
    private int redDuration = 2;
    private int yellowDuration = 3;
    private int greenDuration = 5;
    private int cycleDuration = redDuration + yellowDuration + greenDuration;
    private String firstSignal = "Red";
    private String secondSignal = "Yellow";
    private String thirdSignal = "Green";
    
    /**
     * First this method finds out what minute of current cycle is now.
     * Then it calculates what signal is being shown on this minute.
     * @param time current minute.
     * @return signal which is being shown now.
     * @throws IllegalArgumentException when time < 0.
     */
    String getTrafficLightSignal(int time) {
        time %= cycleDuration;
        if (time < 0) {
            throw new IllegalArgumentException("Wrong value!");
        } else if (time <= redDuration) {
            return firstSignal;
        } else if (time <= redDuration + yellowDuration) {
            return secondSignal;
        } else if (time <= cycleDuration) {
            return thirdSignal;
        } else {
            throw new IllegalArgumentException("Wrong value!");
        }
    }
}
