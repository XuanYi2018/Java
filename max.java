package com.xuanyi.demo;
import java.io.*;
import java.util.*;

public class max {
	public int x;
	public int y;
	public max(int x1,int y1){
		x = x1;
		y = y1;
	}
	public int Max(){
		if(x > y)
			return x;
		else if(x==y) {
		    System.out.println("����ֵ��ͬ,�����ֵ!");
		    return 0;
		}
		else 
			return y;
	}
    public static void main(String []args)
    {
    	int a,b;          //�����������ͱ���
    	int max_value;    //�������ֵ
    	System.out.println("������һ������a��");
    	Scanner input = new Scanner(System.in);
    	a = input.nextInt();
    	
    	
    	System.out.println("����������һ������b��");
    	b = input.nextInt();
    	input.close();
    	
    	max m1 = new max(a,b);
    	max_value = m1.Max();
    	if(max_value!=0)
	        System.out.println("���ֵΪ��"+max_value);
    }
}
