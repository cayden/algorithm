/**
 * SortData.java
 * 版权所有(C) 2014
 * 创建者:cuiran 2014-11-29 下午4:17:01
 */
package com.algorithm.f01;

import java.util.Arrays;

/**
 * 对输入的 一个序列进行排序
 * @author cuiran
 * @version 1.0.0
 */
public class SortData {

	/**
	 * 2014-11-29 下午4:17:01
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		int [] data=new int[]{2,1,43,40,23,89,12,30,100};
		int length=data.length;
		System.out.println("排序前：");
		for(int i=0;i<length;i++){
			System.out.print(data[i]+" ");
		}
		System.out.println("");
		
		//第一种
//		Arrays.sort(data); //通过Arrays sort排序
//		System.out.println("排序后：");
//		for(int i=0;i<length;i++){
//			System.out.print(data[i]+" ");
//		}
		
		//第二种
//		int temp=0;
//		for(int i=0;i<length-1;i++){
//			for(int j=i+1;j<length;j++){
//				if(data[i]>data[j]){
//					temp=data[i];
//					data[i]=data[j];
//					data[j]=temp;
//				}
//			}
//		}
		
		//第三种
				int temp=0;
				for(int i=0;i<length;i++){
					for(int j=i+1;j<length;j++){
						if(data[i]>data[j]){
							temp=data[i];
							data[i]=data[j];
							data[j]=temp;
						}
					}
				}
		
		System.out.println("排序后：");
		for(int i=0;i<length;i++){
			System.out.print(data[i]+" ");
		}
		
		
	}

}
