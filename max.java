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
		    System.out.println("两个值相同,无最大值!");
		    return 0;
		}
		else 
			return y;
	}
    public static void main(String []args)
    {
    	int a,b;          //定义两个整型变量
    	int max_value;    //保存最大值
    	System.out.println("请输入一个整数a：");
    	Scanner input = new Scanner(System.in);
    	a = input.nextInt();
    	
    	
    	System.out.println("请输入另外一个整数b：");
    	b = input.nextInt();
    	input.close();
    	
    	max m1 = new max(a,b);
    	max_value = m1.Max();
    	if(max_value!=0)
	        System.out.println("最大值为："+max_value);
    }
}
