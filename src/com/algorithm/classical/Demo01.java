/**
 * Demo01.java
 * 版权所有(C) 2014
 * 创建者:cuiran 2014-11-29 下午9:19:40
 */
package com.algorithm.classical;

/**
 * 【程序1】   题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第四个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？前二十
	程序分析：兔子的规律为数列1,1,2,3,5,8,13,21....
 * @author cuiran
 * @version 1.0.0
 */
public class Demo01 {

	public static void main(String args[]) {
		int i = 0;
		for (i = 1; i <= 20; i++)
			System.out.println(f(i));
	}
	/**
	 * 采用递归
	 * 2014-11-29 下午9:20:18
	 * @param x
	 * @return
	 *
	 */
	public static int f(int x) {
		if (x == 1 || x == 2)
			return 1;
		else
			return f(x - 1) + f(x - 2);
	}


}
