package solidprinciples.openclosed;

public abstract class Subscriber {

	protected int subscriberId;
	protected String address;
	protected Long phoneNumber;
	
	public int getSubscriberId() {
		return subscriberId;
	}
	public void setSubscriberId(int subscriberId) {
		this.subscriberId = subscriberId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getBaseRate() {
		return baseRate;
	}
	public void setBaseRate(int baseRate) {
		this.baseRate = baseRate;
	}
	protected int baseRate;
	
	public abstract void calculateBill();
}
