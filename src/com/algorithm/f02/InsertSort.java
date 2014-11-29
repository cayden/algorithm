/**
 * InsertSort.java
 * 版权所有(C) 2014
 * 创建者:cuiran 2014-11-29 下午9:02:36
 */
package com.algorithm.f02;

/**
 * 插入排序 
 * @author cuiran
 * @version 1.0.0
 */
public class InsertSort {

	/**
	 * 2014-11-29 下午9:02:36
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
		
		for(int j=1;j<length;j++){
			int tmp=data[j];	//循环把数组第二个值放到tmp里
			int i=j-1;
			while(tmp<data[i])  //	tmp值和数组第一个值比较谁小
			{
				data[i+1]=data[i];// 如果小于就把第一个值赋值给第二个
				i--;
				if(i == -1)//如果i值=-1
					break;   //退出循环
			}
			data[i+1] = tmp; //因为比较数组里的前一个比后一个这样就换交了实现了把小的放在前面
		}
			
		System.out.println("排序后：");
		for(int i=0;i<length;i++){
			System.out.print(data[i]+" ");
		}

	}

}
