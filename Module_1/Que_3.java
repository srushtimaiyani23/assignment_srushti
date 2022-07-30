package Module_1;

import java.util.Scanner;

public class Que_3 {
public static void main(String[] args) {
	int a;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter year :");
	a=sc.nextInt();
	
	if(a%4==0)
	{
		System.out.println("leap year..");
	}
	else
	{
		System.out.println("not leap year..");
	}
}
}
