package com.xuanyi.demo;
import java.util.*;

public class max_change {
    //private static Scanner scanner;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入a值：");
        int a = scanner.nextInt();
        
        System.out.println("请输入b值：");
        int b = scanner.nextInt();
        scanner.close();
        if(a>b){
        	System.out.println("最大的值是：" + a);
        }
        else if(a==b){
        	System.out.println("无最大值，两个值相等！");
        }
        else{
        	System.out.println("最大的值是：" + b);
        }
	}

}
