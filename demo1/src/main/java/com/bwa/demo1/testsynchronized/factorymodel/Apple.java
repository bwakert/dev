package com.bwa.demo1.testsynchronized.factorymodel;

public class Apple implements Fruit {

    private int treeAge;

    public int getTreeAge() {
        return treeAge;
    }

    public void setTreeAge(int treeAge) {
        this.treeAge = treeAge;
    }

    @Override
    public void grow() {
        System.out.println("苹果树生长");
    }

    @Override
    public void plant() {
        System.out.println("苹果树种植");

    }

    @Override
    public void harvest() {
        System.out.println("苹果长熟啦");

    }
}
