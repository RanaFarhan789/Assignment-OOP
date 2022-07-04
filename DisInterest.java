interface Bank
{
  float rateOfinterest();
}
class SBI implements Bank{
	
	public float rateOfinterest()
	{
		return 9.15f;
	}
}


class PNB implements Bank
{
	public float rateOfinterest()
	{
		return 9.7f;
	}
}


public class DisInterest
{
	public static void main(String args[])
	{
		SBI sb = new SBI();
		System.out.println(sb.rateOfinterest());
		
		PNB pb = new PNB();
		System.out.println(pb.rateOfinterest());
	}
}