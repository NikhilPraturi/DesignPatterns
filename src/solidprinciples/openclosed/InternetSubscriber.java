package solidprinciples.openclosed;

public class InternetSubscriber extends Subscriber{

	@Override
	public void calculateBill() {
		int usage = 12;
		baseRate = usage*600;
		System.out.println("the 1 year usage cost is: "+ baseRate);
	}

}
