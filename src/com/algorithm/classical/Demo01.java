/**
 * Demo01.java
 * ��Ȩ����(C) 2014
 * ������:cuiran 2014-11-29 ����9:19:40
 */
package com.algorithm.classical;

/**
 * ������1��   ��Ŀ���ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ������ĸ��º�ÿ��������һ�����ӣ��������Ӷ���������ÿ���µ���������Ϊ���٣�ǰ��ʮ
	������������ӵĹ���Ϊ����1,1,2,3,5,8,13,21....
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
	 * ���õݹ�
	 * 2014-11-29 ����9:20:18
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
