package com.thread.lockin;

/**
 * Created by Administrator on 2019/3/7.
 *
 * Class����this���ǻ���������ClassClockTest���class�������Կ��ԶԶ������
 */
public class ClassClockTest {

    //Class��
    private synchronized static void classLock() {
        for (int i=0; i<1000; i++) {
            System.out.println("class ��");
        }
    }

    //������
    private synchronized void objLock() {
        for (int i=0; i<1000; i++) {
            System.out.println("obj ��");
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
