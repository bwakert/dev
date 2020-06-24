package com.bwa.demo1.testsynchronized.factorymodel;

public class FruitGardener {

    public  Fruit factory(String fruit) throws Exception {
        if (fruit.equalsIgnoreCase("apple")){
            return new Apple();
        }else {
            throw new Exception("bad fruit request");
        }
    }
}
