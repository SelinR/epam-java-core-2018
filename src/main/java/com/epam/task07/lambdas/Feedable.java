package com.epam.task07.lambdas;

@FunctionalInterface
public interface Feedable {
    void feedThisAnimal(Cat cat, int amountOfFood);
}
