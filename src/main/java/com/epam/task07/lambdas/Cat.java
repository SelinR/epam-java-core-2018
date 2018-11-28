package com.epam.task07.lambdas;

public class Cat {
    private int weight;
    private String name;
    
    Cat(String name) {
        this.weight = 200 + (int) (1000 * Math.random());
        this.name = name;
    }
    
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik");
        Cat murka = new Cat("Murka");
        Cat red = new Cat("Red");
        
        Feedable feed;
        feed = (Cat cat, int amountOfFood) -> cat.setWeight(cat.getWeight() + amountOfFood);
        
        feed.feedThisAnimal(barsik, 200);
        feed.feedThisAnimal(murka, 300);
        feed.feedThisAnimal(red, 143);
    }
    
    public int getWeight() {
        return weight;
    }
    
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
