/**
 * TestThread.java
 * 版权所有(C) 2014
 * 创建者:cuiran 2014-12-13 下午6:56:23
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
     * 线程的run方法，它将和其他线程同时运行  
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
        // 如果不设置daemon，那么线程将输出100后才结束   
        test.setDaemon(true);   
        test.start();   
        System.out.println("isDaemon = " + test.isDaemon());   
        try {   
            System.in.read(); // 接受输入，使程序在此停顿，一旦接收到用户输入，main线程结束，守护线程自动结束   
        } catch (IOException ex) {   
            ex.printStackTrace();   
        }   
    }   
} 
