package Module_1;

import java.util.Scanner;

public class Que_2 {
public static void main(String[] args) {
	char ch;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter character:");
	ch=sc.next().charAt(0);
			
	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
	{
		System.out.println("character is vowel");
	}
	else if(ch>1)
	{
		System.out.println("character is constant");
	}
	else 
	{
		System.out.println("ERROR");
	}
}
}