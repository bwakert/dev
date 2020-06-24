package com.bwa.demo1.testsynchronized.factorymodel;

public class FactoryTest {
    public static void main(String[] args) throws Exception {
        FruitGardener fruitGardener = new FruitGardener();
        Fruit apple = fruitGardener.factory("apple");
        apple.harvest();
    }
}
