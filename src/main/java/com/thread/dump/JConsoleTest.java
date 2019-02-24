package com.thread.dump;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/2/24.
 * @desc 以64M/50 毫秒的速度往java堆中填充数据
 *
 * @result
 * 1.JConsole.exe显示Eden的
 *  使用情况为波浪状，峰值为Eden的最大值，根据Eden ：From Survivor : To
 *  =8:1:1的默认比例，可以推算出新生代的大小
 * 2.fillHeap方法内进行GC，并不能回收内存，因为list仍在作用域，但是在main方法中
 *  进行GC，就可以回收
 */
public class JConsoleTest {

    static class OOMObject {
        public byte[] placeholder = new byte[64 * 1024];
    }

    public static void fillHeap(int num) throws InterruptedException {
        List<OOMObject> list = new ArrayList<OOMObject>();
        for (int i=0; i<num; i++) {
            Thread.sleep(50);
            OOMObject object = new OOMObject();
            list.add(object);
        }
        System.out.println("======添加元素完毕==========");
        //此处GC并不能回收list，因为list仍在作用域
        System.gc();
        Thread.sleep(15000);
        System.out.println("======方法退出  ==========");
    }

    public static void main(String[] args) {
        try {
            Thread.sleep(15000);
            System.out.println("======begin==========");
            fillHeap(1000);
            System.gc();
            System.out.println("======GC完毕==========");
        } catch (InterruptedException e) {
            System.out.println("发生异常" + e);
            e.printStackTrace();
        }
        System.out.println("======end==========");
    }
}
