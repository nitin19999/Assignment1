import java.util.*;
class TerCompare{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter First Number");
int a1=sc.nextInt();
System.out.println("Enter Second Number");
int a2=sc.nextInt();
int a3=a1>a2?(a1+a2):(a1-a2);
System.out.println(a3);

}
}