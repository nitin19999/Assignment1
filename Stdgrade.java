import java.util.*;
class Stdgrade{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Maximum mark");
	int max_mark=sc.nextInt();
	System.out.println("Enter mark you Obtain");
	int mark_obt=sc.nextInt();
	float per=(float)((mark_obt*100)/max_mark);
	String s=per>=95.00?("Distinction"):(per>=85.00?("First Division"):per>=75.00?("Second Division"):"Average");
	System.out.println("Your Percentage is "+per+"%");
	System.out.println("According to your percentage your grade is "+s);	
}
}