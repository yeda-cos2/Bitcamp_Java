package shop.service.user.test;

import shop.service.user.User;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User client=new User("ȫ�浿", "����", false, "011");
		
		System.out.println("�̸�: "+client.getName());
		System.out.println(client);
	}

}
