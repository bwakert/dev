package com.bwa.demo1.testsynchronized.abstractfactory;

public class Dog implements Animal {
    @Override
    public void run() {
        System.out.println("大黄狗飞快的奔跑");
    }

    @Override
    public void eat() {
        System.out.println("大黄狗正在吃骨头");
    }
}
