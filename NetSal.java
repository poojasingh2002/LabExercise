import java.util.Scanner;
class NetSal
{
	public static void main(String arg[])	
	{
	    double gs,it,pt,pf,netSalary;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter salary");
                   gs=sc.nextDouble();
	    System.out.println("HRA %");
                   it=sc.nextDouble();
	    System.out.println("special allowance %");
                   pt=sc.nextDouble();
	     System.out.println("PF deducion %");
	pf=sc.nextDouble();
	     pf=pf*(gs/100);
	     it=it*(gs/100);
	     pt=pt*(gs/100);
	     netSalary=gs-it-pt-pf;
	     System.out.println("Net Salary is="+netSalary);
                   }
}