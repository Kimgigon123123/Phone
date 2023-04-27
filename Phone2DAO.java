package pack_Phone;

import java.util.Scanner;

public class Phone2DAO extends Phone1DAO {
	
	
	
	
	//------------------------//
	void dmbOn(Phone2DTO pho2dto,Phone1DTO pho1dto) {//dmb켜기
		
		Scanner sc = new Scanner(System.in);
		
		if(pho1dto.getState().equals("꺼짐")) {
			System.out.println("전원이 꺼져있습니다");
			System.out.println("(아무키나 누르세요)");
			sc.nextLine();
			
		}
		else if(pho1dto.getState().equals("켜짐")) {
			if(pho2dto.getDmbMode().equals("OFF")) {
				System.out.println("DMB방송모드를 켭니다");
				System.out.println("현재채널 : "+pho2dto.getChannel());
				pho2dto.setDmbMode("ON");
				System.out.println("(아무키나 눌러주세요)");
				sc.hasNextLine();
			}
			else if(pho2dto.getDmbMode().equals("ON")) {
				System.out.println("이미 방송이 켜져있습니다.");
				System.out.println("(아무키나 눌러주세요)");
				sc.nextLine();
			}
		}
	}
	//--------------------------------------------//
	
	
	
	
	
	
}
