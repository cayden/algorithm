/**
 * SortData.java
 * ��Ȩ����(C) 2014
 * ������:cuiran 2014-11-29 ����4:17:01
 */
package com.algorithm.f01;

import java.util.Arrays;

/**
 * ������� һ�����н�������
 * @author cuiran
 * @version 1.0.0
 */
public class SortData {

	/**
	 * 2014-11-29 ����4:17:01
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		int [] data=new int[]{2,1,43,40,23,89,12,30,100};
		int length=data.length;
		System.out.println("����ǰ��");
		for(int i=0;i<length;i++){
			System.out.print(data[i]+" ");
		}
		System.out.println("");
		
		//��һ��
//		Arrays.sort(data); //ͨ��Arrays sort����
//		System.out.println("�����");
//		for(int i=0;i<length;i++){
//			System.out.print(data[i]+" ");
//		}
		
		//�ڶ���
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
		
		//������
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
		
		System.out.println("�����");
		for(int i=0;i<length;i++){
			System.out.print(data[i]+" ");
		}
		
		
	}

}
