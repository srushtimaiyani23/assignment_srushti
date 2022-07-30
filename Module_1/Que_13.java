package Module_1;

public class Que_13 {
public static void main(String[] args) {
	
	System.out.println("divided by 3:");
	for(int i=1;i<100;i++)
	{
		if(i%3==0)
		{
			System.out.print(i+",");
		}
	}
	System.out.println("\ndivided by 5:");
	for(int j=1;j<100;j++) {
	
		if(j%5==0)
		{
			System.out.print(j+",");
		}
	}
	
	System.out.println("\ndivided by 3 and 5:");
	
	for(int i=1;i<100;i++)
	{
		if(i%3==0 && i%5==0)
		{
			System.out.print(i+",");
		}
	}
}
}
