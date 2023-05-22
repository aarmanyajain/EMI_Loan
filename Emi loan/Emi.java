import java.util.Scanner;
class EmiCalculation
{
	double emi;
	EmiCalculation(double p,double r,double t)
	{
	 emi= (p*r*Math.pow(1+r,t))/(Math.pow(1+r,t)-1);
	}
}
class Emi
{ 
    public static void main(String []args)
    {
        Scanner a = new Scanner(System.in);
         
        double principal, rate, time, emi;
  
        System.out.print("Enter principal amount: ");
        principal = a.nextFloat();
      
        System.out.print("Enter interest rate: ");
        rate = a.nextFloat();
      
        System.out.print("Enter tenure in months: ");
        time = a.nextFloat();
      
        rate=rate/(12*100); 
        time=time*12; 
      
      
        EmiCalculation e= new EmiCalculation(principal,rate,time);
      
        System.out.print("EMI is= "+e.emi+"\n");
                 
    }
}