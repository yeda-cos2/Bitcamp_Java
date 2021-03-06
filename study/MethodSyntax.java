package study;

//Bean
public class MethodSyntax {

	// Field
	private String name = "홍길동";
	private String address = "한양";
	private String phone = "010-111-1111";
	private int number = 3;

	// Method
	// 원래 각 필드 받으려면=>각각 get 메소드 써야함
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public int getNumber() {
		return number;
	}

	// 같은 데이터타입은 배열로 한꺼번에 get메소드 쓸 수 있다
	public String[] getInfo() {
		String[] str = { name, address, phone };
		return str;
	}
}
