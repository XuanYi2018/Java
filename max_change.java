package com.xuanyi.demo;
import java.util.*;

public class max_change {
    //private static Scanner scanner;
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
        Scanner scanner = new Scanner(System.in);
        System.out.println("������aֵ��");
        int a = scanner.nextInt();
        
        System.out.println("������bֵ��");
        int b = scanner.nextInt();
        scanner.close();
        if(a>b){
        	System.out.println("����ֵ�ǣ�" + a);
        }
        else if(a==b){
        	System.out.println("�����ֵ������ֵ��ȣ�");
        }
        else{
        	System.out.println("����ֵ�ǣ�" + b);
        }
	}

}
