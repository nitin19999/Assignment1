import java.util.*;
class TerEven{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number");
int a=sc.nextInt();
String a1=a%2==0?"Number is Even":"Number is Odd";
System.out.println(a1);
}
}
