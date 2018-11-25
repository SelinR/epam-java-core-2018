package com.epam.task10.races;

public class Horse implements Runnable{
    private String name;
    private double speed;
    private double randomCoefficient;
    
    Horse(String name, double speed, double randomCoefficient) {
        super();
        this.name = name;
        this.speed = speed;
        this.randomCoefficient = randomCoefficient;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 1; i++)
        setSpeed(getSpeed() + 10 * Math.random());
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getSpeed() {
        return speed;
    }
    
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    
    public double getRandomCoefficient() {
        return randomCoefficient;
    }
    
    public void setRandomCoefficient(double randomCoefficient) {
        this.randomCoefficient = randomCoefficient;
    }
}
