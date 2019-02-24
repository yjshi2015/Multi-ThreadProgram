package com.thread.dump;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/2/24.
 * @desc ��64M/50 ������ٶ���java�����������
 *
 * @result
 * 1.JConsole.exe��ʾEden��
 *  ʹ�����Ϊ����״����ֵΪEden�����ֵ������Eden ��From Survivor : To
 *  =8:1:1��Ĭ�ϱ���������������������Ĵ�С
 * 2.fillHeap�����ڽ���GC�������ܻ����ڴ棬��Ϊlist���������򣬵�����main������
 *  ����GC���Ϳ��Ի���
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
        System.out.println("======���Ԫ�����==========");
        //�˴�GC�����ܻ���list����Ϊlist����������
        System.gc();
        Thread.sleep(15000);
        System.out.println("======�����˳�  ==========");
    }

    public static void main(String[] args) {
        try {
            Thread.sleep(15000);
            System.out.println("======begin==========");
            fillHeap(1000);
            System.gc();
            System.out.println("======GC���==========");
        } catch (InterruptedException e) {
            System.out.println("�����쳣" + e);
            e.printStackTrace();
        }
        System.out.println("======end==========");
    }
}
