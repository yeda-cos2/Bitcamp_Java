package study;

public class CellPhone1 {
//Field
	private String phoneNumber = "";
	private int totalCallTime;
	private int totalFee;
	private int feePerCallTime;

	// Constructor
	public CellPhone1() {
	}

	public CellPhone1(String phoneNumber, int feePerCallTime) {
		this.phoneNumber = phoneNumber;
		this.feePerCallTime = feePerCallTime;
	}

	// Method
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public int getTotalCallTime() {
		return totalCallTime;
	}

	public int getTotalFee() {
		return totalFee;
	}

	public int getFeePerCallTime() {
		return feePerCallTime;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setTotalCallTime(int totalCallTime) {
		this.totalCallTime = totalCallTime;
	}

	public void setTotalFee(int totalFee) {
		this.totalFee = totalFee;
	}

	public void setFeePerCallTime(int feePerCallTime) {
		this.feePerCallTime = feePerCallTime;
	}

	public void call(String phoneNumber, int totalCallTime) {
		System.out.println(phoneNumber + "번호로 " + totalCallTime + "통화함");
		this.totalCallTime += totalCallTime;
	}

	public void calculateTotalFee() {
		totalFee = totalCallTime * feePerCallTime;
	}
}// end of class
