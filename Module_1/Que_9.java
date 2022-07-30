package Module_1;

public class Que_9 {
public static void main(String[] args) {
	
	String s="hiii, bhad ma ja tu 1237678";
	
	char ch[]=s.toCharArray();
	int letter=0,digit=0,space=0,other=0;
	for(int i=0;i<s.length();i++)
	{
		if(Character.isLetter(ch[i]))
		{
			letter++;
		}
		else if(Character.isDigit(ch[i]))
		{
			digit++;
		}
		else if(Character.isSpaceChar(ch[i]))
		{
			space++;
		}
		else
		{
			other++;
			
		}
		
		
	}
	System.out.println(s);
	System.out.println(letter);
	System.out.println(digit);
	System.out.println(space);
	System.out.println(other);
	
}
}
