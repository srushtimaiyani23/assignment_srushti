package Module_1;

import java.util.Scanner;

public class Que_10 {
public static void main(String[] args) {
	//from user
	char s,r;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter character:");
	s=sc.next().charAt(0);
	r=sc.next().charAt(0);
//	
	int ansi=s;
	int ansi2=r;
	System.out.println("value"+s+"here:" +ansi);
	System.out.println("value:" +r+"here:" +ansi2);

	
	char ch='a';
	char ch2='v';
	int ansi3=ch;
	int ansi4=ch2;
	System.out.println("ASCII value :" +ch+  "here :" +ansi3);
	System.out.println("ASCII value :" +ch2+ "here :" +ansi4);
	
}
}
