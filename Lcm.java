import java.util.Scanner;
class Lcm{
public static void main(String[] args)   
{  
int a, b, lcm = 0;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the First Number: ");  
a = sc.nextInt();     
System.out.print("Enter the Second Number: ");  
b = sc.nextInt();  
lcm = findLCM(a, b);  
System.out.println("GCD of " + a + " and " + b + " =  " + lcm);  
}  
public static int findLCM(int a, int b)  
{ 
int c=0;
for(int i=1;i<=b;i++)
{
	if((a*i)%b==0)
	{
		c=a*i;
		break;
		
	}
	 
}	
return c;
} 
 
}
