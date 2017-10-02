import java.util.Scanner;

public class Myclass {
int a,b,c;
Scanner s=new Scanner(System.in);
public void get()
{
	System.out.println("enete the three numbers");
	a=s.nextInt();
	b=s.nextInt();
	c=s.nextInt();
}
public void large()
{
	if(a>b)
	{
		if(a>c)
		{
			System.out.printf("largest number is "+a);
		}
		else
		{
			System.out.printf("largset number is "+c);
		}
	}
	else
	{
		if(b>c)
		{
			System.out.printf("largset number is "+b);
		}
		else
			System.out.printf("largset number is "+c);
	}
}
public static void main(String args[])
{
	Myclass obj=new Myclass();
	obj.get();
	obj.large();
	
}

}
