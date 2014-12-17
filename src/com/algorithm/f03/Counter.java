/**
 * Counter.java
 * 版权所有(C) 2014
 * 创建者:cuiran 2014-12-13 下午6:50:33
 */
package com.algorithm.f03;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * TODO 
 * @author cuiran
 * @version 1.0.0
 */
public class Counter {

	private AtomicInteger count=new AtomicInteger();
	
	public void increment(){
		count.incrementAndGet();
	}
	public int getCount(){
		
		return count.get();
	}
	/**
	 * 2014-12-13 下午6:50:34
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		Counter counter=new Counter();
		
		counter.increment();
		System.out.println(counter.getCount());

	}

}
