package interest;
import java.lang.Math;

public class Calculation {
	public float simpleInterest(int principal,int rateOfInterest,int time)
	{
		float interest;
		interest=(principal*time*rateOfInterest)/100;
		System.out.println(interest);
		return interest;
		
	}
	public double compoundInterest(int principal,int rateOfInterest,int time,int noOfTimes)
	{
		double interest,amount;
		amount=principal*(Math.pow((1+(rateOfInterest/noOfTimes)),time*noOfTimes));
		System.out.println(amount);
		interest=amount-principal;
		System.out.println(interest);
		return interest;
		
	}

}
