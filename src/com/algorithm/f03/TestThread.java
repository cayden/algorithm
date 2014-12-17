/**
 * TestThread.java
 * ��Ȩ����(C) 2014
 * ������:cuiran 2014-12-13 ����6:56:23
 */
package com.algorithm.f03;

import java.io.IOException;

/**
 * TODO 
 * @author cuiran
 * @version 1.0.0
 */
public class TestThread extends Thread {   
    
    public TestThread() {   
    }   
    /** *//**  
     * �̵߳�run�����������������߳�ͬʱ����  
     */  
    public void run(){   
        for(int i = 1; i <= 100; i++){   
            try{   
                Thread.sleep(100);   
                   
            } catch (InterruptedException ex){   
                ex.printStackTrace();   
            }   
            System.out.println(i);   
        }   
    }   
    public static void main(String [] args){   
        TestThread test = new TestThread();   
        // ���������daemon����ô�߳̽����100��Ž���   
        test.setDaemon(true);   
        test.start();   
        System.out.println("isDaemon = " + test.isDaemon());   
        try {   
            System.in.read(); // �������룬ʹ�����ڴ�ͣ�٣�һ�����յ��û����룬main�߳̽������ػ��߳��Զ�����   
        } catch (IOException ex) {   
            ex.printStackTrace();   
        }   
    }   
} 
