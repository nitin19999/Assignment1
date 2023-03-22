import java.util.*;
class Positive{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int a=sc.nextInt();
String s=a>0?"Positive":"Nagative";
System.out.println("The given number is "+s);
}
}