package com.thread.lockin;

/**
 * Created by Administrator on 2019/3/7.
 *
 * Class锁和this锁非互斥锁，对ClassClockTest这个class加锁后，仍可以对对象加锁
 */
public class ClassClockTest {

    //Class锁
    private synchronized static void classLock() {
        for (int i=0; i<1000; i++) {
            System.out.println("class 锁");
        }
    }

    //对象锁
    private synchronized void objLock() {
        for (int i=0; i<1000; i++) {
            System.out.println("obj 锁");
        }
    }

    public static void main(String[] args) {
        final ClassClockTest demo = new ClassClockTest();
        new Thread(new Runnable() {
            public void run() {
                demo.classLock();
            }
        }, "t1").start();

        new Thread(new Runnable() {
            public void run() {
                demo.objLock();
            }
        }, "t2").start();


    }
}
