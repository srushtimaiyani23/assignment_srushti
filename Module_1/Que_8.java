package Module_1;

import java.util.Scanner;

public class Que_8 {
public static void main(String[] args) {
	long num;
	int count=0;
	Scanner sc =new Scanner(System.in);
	System.out.println("input an integer less than ten billion : ");
	num=sc.nextLong();
	if(num>0)
	{
		while(num!=0)
		{
		num=num/=10;
		count++;
		
		}
		System.out.println("positive number");
		System.out.println("count number :"+count);
		
	}
	
	else
	{
		System.out.println("error");
	}
	
	
 }
}
