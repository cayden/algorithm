/**
 * InsertSort.java
 * ��Ȩ����(C) 2014
 * ������:cuiran 2014-11-29 ����9:02:36
 */
package com.algorithm.f02;

/**
 * �������� 
 * @author cuiran
 * @version 1.0.0
 */
public class InsertSort {

	/**
	 * 2014-11-29 ����9:02:36
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
		
		for(int j=1;j<length;j++){
			int tmp=data[j];	//ѭ��������ڶ���ֵ�ŵ�tmp��
			int i=j-1;
			while(tmp<data[i])  //	tmpֵ�������һ��ֵ�Ƚ�˭С
			{
				data[i+1]=data[i];// ���С�ھͰѵ�һ��ֵ��ֵ���ڶ���
				i--;
				if(i == -1)//���iֵ=-1
					break;   //�˳�ѭ��
			}
			data[i+1] = tmp; //��Ϊ�Ƚ��������ǰһ���Ⱥ�һ�������ͻ�����ʵ���˰�С�ķ���ǰ��
		}
			
		System.out.println("�����");
		for(int i=0;i<length;i++){
			System.out.print(data[i]+" ");
		}

	}

}
