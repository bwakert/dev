package com.bwa.demo1.testsynchronized.abstractfactory;

public class Cat implements Animal{

    @Override
    public void run() {
        System.out.println("小花猫爬上树了");
    }

    @Override
    public void eat() {
        System.out.println("小花猫吃鱼");
    }

    public void play(){
        System.out.println("小花猫在和黑猫捉迷藏");
    }
}
