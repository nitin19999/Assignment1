class Loan{
public static void main(String args[])
{
double loan=50000000;
double rate=10.75;
double a=1+(10.75/100);
double a1=a*a*a*a*a;
double a2=a1*50000000-50000000;
System.out.println("Total amount of intrest on "+loan+"Cr."+" at rate "+rate+"%"+" is "+a2+" rupee");

}
}