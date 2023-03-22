import java.util.*;
class AddOr{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter First number");
int a=sc.nextInt();
int c=a;
System.out.println("Enter Second number");
int b=sc.nextInt();
for(int i=1;i<=b;i++)
{ 
	c++;
}
System.out.println(a+"+"+b+"="+c);

}
}