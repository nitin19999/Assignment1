class Salary{
public static void main(String args[])
{
	double basic_sal=10000.8989;
	double travel_all=5600.6778;
	double dearness_all=0.14*10000.8989;
	double petrol_all=7000.3443;
	double tax_deduction=(1.76*dearness_all)/100;
	double gross_salary=(basic_sal+travel_all+dearness_all+petrol_all)-tax_deduction;
	System.out.println("------------------------------------------------------");
	System.out.println("=> Your basic_salary is         | " + basic_sal  +"         |");
	System.out.println("=> Your travel_Allowence is     | " + travel_all   +"          |");
	System.out.println("=> Your Dearness_Allowence  is  | " + dearness_all   +" |");
	System.out.println("=> Your Petrol_Allowence is     | " + petrol_all   +"          |");
	System.out.println("=> Your Tax_Deduction is        | " + tax_deduction+" |");
	System.out.println("------------------------------------------------------");
	System.out.println("=> Your gross_salary is         | " + gross_salary+"   |");
	System.out.println("------------------------------------------------------");
}
}

