import java.util.*;
class Reccurssion{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Reccurssion sc1=new Reccurssion();
System.out.println("Enter a number");
int a=sc.nextInt();
sc1.m1(a);
}
void m1(int a1){
	if(a1>0)
	{
System.out.println(a1);
this.m1(--a1);
	}


}
}