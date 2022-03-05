package homework;

public class CellPhone {

	// Field
	String model = "";
	double battery=0;

	// Constructor
	public CellPhone() {
	}

	public CellPhone(String model) {
		this.model = model;
	}

	// method
	public void call(int time)  throws IllegalArgumentException {
		if (time < 0) {
			throw new IllegalArgumentException("통화시간입력오류");
		}
		System.out.println("통화시간: " + time + "분");
		for (int i = 0; i <time; i++) {
			battery -=  0.5;
			if (battery <= 0) {
				battery=0;
				break;
			}
		}

	}

	public void charge(int time) throws IllegalArgumentException {
		if (time < 0) {
			throw new IllegalArgumentException("충전시간입력오류");
		}
		System.out.println("충전 시간: " + time + "분");
		for (int j =0; j < time; j++) {
			battery +=  3;
			if (battery >100) {
				battery=100;
				break;
			}
		}

	}

	public void printBattery() {
		System.out.println("남은 배터리 양: " + battery);
	}

	public boolean equals(Object otherObject) {
		if (!(otherObject instanceof CellPhone)) {
			return false;
		}else {
			CellPhone otherPhone=(CellPhone) otherObject;
			return model.equals(otherPhone.model);
		}
	}
}
