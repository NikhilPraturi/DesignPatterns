package solidprinciples.openclosed;

public class MobileSubscriber extends Subscriber{

	@Override
	public void calculateBill() {
		int usage = 12;
		baseRate = usage * 219;
		System.out.println("the 1 year usage cost is: "+ baseRate);		
	}

}
