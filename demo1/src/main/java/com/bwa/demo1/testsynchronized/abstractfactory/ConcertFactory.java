package com.bwa.demo1.testsynchronized.abstractfactory;

public class ConcertFactory implements Factory {
    @Override
    public Animal animalFactory() {
        return new Dog();
    }

    @Override
    public Plate plateFactory() {
        return new Apple();
    }
}
