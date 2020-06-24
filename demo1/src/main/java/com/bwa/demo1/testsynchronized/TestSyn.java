package com.bwa.demo1.testsynchronized;

public class TestSyn {
    public static void main(String[] args) {
        TestSyn testSyn = new TestSyn();
        new Thread(() -> {
//            TestSyn testSyn = new TestSyn();
            testSyn.method1();
                    }).start();
        new Thread(() -> {
            TestSyn testSyn1 = new TestSyn();
        testSyn1.method2();
            System.out.println("qiangzhan");
                    }).start();
    }

    public void method1(){
        synchronized (TestSyn.class){
            System.out.println("method1------开始");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("method1------结束");
        }

    }

    public void method2(){
        synchronized (TestSyn.class){
            System.out.println("method2------开始");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
            System.out.println("method2------结束");
        }


    }
}
