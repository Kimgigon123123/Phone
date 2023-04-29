package pack_Phone;

import java.util.Scanner;

public class SuperPhone {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SuperPhoneDAO spdao = new SuperPhoneDAO();
		
		System.out.println("1. 아이폰1");
		System.out.println("2. 아이폰2");
		System.out.println("3. 아이폰3");
		int num = spdao.selectNum();
		
		if(num==1) {
			spdao.Phone1(); // 1세대 고름
		}
		else if(num==2) {
			spdao.Phone2(); // 2세대
		}
		else if (num==3) {
			spdao.Phone3(); // 3세대 고름
		}
	}
	
}
