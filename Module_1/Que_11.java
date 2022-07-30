package Module_1;

import java.util.Scanner;

public class Que_11 {
public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter input:=");
	n=sc.nextInt();
	for(int i=0;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(n);
		}
		if(i!=n)
		{
			System.out.print("+");
		}
	}
	
	//other trick
	int a;
	char s1,s2,s3;
	Scanner s=new Scanner(System.in);
	System.out.println("\nenter input:=");
	a=s.nextInt();
	System.out.printf("%d+ %d%d+ %d%d%d\n",n ,n ,n ,n ,n ,n);
	
}
}
