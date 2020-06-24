package com.bwa.demo1.testsynchronized.abstractfactory;

public class Apple implements Plate {
    @Override
    public void grow() {
        System.out.println("苹果正在生长");
    }

    @Override
    public void harvest() {
        System.out.println("苹果成熟了");
    }
}
