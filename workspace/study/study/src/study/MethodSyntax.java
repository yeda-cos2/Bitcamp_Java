package study;

//Bean
public class MethodSyntax {

	// Field
	private String name = "ȫ�浿";
	private String address = "�Ѿ�";
	private String phone = "010-111-1111";
	private int number = 3;

	// Method
	// ���� �� �ʵ� ��������=>���� get �޼ҵ� �����
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

	// ���� ������Ÿ���� �迭�� �Ѳ����� get�޼ҵ� �� �� �ִ�
	public String[] getInfo() {
		String[] str = { name, address, phone };
		return str;
	}
}