package com.bwa.demo1.testsynchronized.abstractfactory;

public class TestAbstractFactory {

    public static void main(String[] args) {
        //获取工厂
        Factory factory = new ConcertFactory();
        Animal animal = factory.animalFactory();
        animal.eat();
        animal.run();
        Plate plate = factory.plateFactory();
        plate.grow();
        plate.harvest();

    }
}
