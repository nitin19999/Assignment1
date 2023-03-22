import java.util.*;
class Voter{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Your Age");
int a1=sc.nextInt();
String a2=a1>=18?"Yo are Eligible for Voting":"You are not Eligible for Voting";
System.out.println(a2);
}
}
