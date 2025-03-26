package com.JavaBean;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		String uname=sc.next();
		System.out.println("Enter Age");
		int uage=sc.nextInt();
		Demo d=new Demo(uname,uage);
		Demo d1=new Demo("Sai",20);
		System.out.println("--------------User-----------");
		System.out.println("Username is:"+d.getname());	
		System.out.println("Userage is:"+d.getage());
		}

}
