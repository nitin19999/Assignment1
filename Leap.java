import java.util.Scanner;
class Leap{
public static void main(String args[])
{
System.out.println("Enter Year");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n%4==0)
{
System.out.println("The given Year is Leap Year");
}else
{
System.out.println(" Year is not leap year");
}
}


}
