package pack_Phone;

import java.util.Scanner;

public class Phone3DAO extends Phone2DAO {
	
	//-----------------------//
	void currentStatus(Phone1DTO pho1dto, Phone2DTO pho2dto,Phone3DTO pho3dto) {//현재상태 나타내주기
		System.out.println("현재 전원상태는 ["+pho1dto.getState()+"]입니다");
		System.out.println("현재 통화상태는 ["+pho1dto.getCallMode()+"]입니다");
		System.out.println("현재 DMB상태는 ["+pho2dto.getDmbMode()+"]입니다");
		System.out.println("현재 인터넷상태는 ["+pho3dto.getWifi()+"]입니다");
		System.out.println("현재 웹툰상태는["+pho3dto.getWifi()+"]입니다");
		System.out.println();
	}
	//----------------------------//
	
	
	//----------------------//
	
	void wifiConnect(Phone3DTO pho3dto,Phone1DTO pho1dto) {//인터넷연결 or 인터넷 끄기
		Scanner sc =new Scanner(System.in);
		
		
		if(pho1dto.getState().equals("켜짐")) {
			if(pho3dto.getWifi().equals("OFF")) {
				System.out.println("인터넷에 연결합니다");
				pho3dto.setWifi("ON");
				System.out.println("(아무키나 눌러주세요)");
				sc.nextLine();
			}
			else if(pho3dto.getWifi().equals("ON")) {
				System.out.println("인터넷을 끕니다");
				pho3dto.setWifi("OFF");
				pho3dto.setApp("OFF");
				System.out.println("(아무키나 눌러주세요)");
				sc.nextLine();
			}
		}
		else if(pho1dto.getState().equals("꺼짐")) {
			System.out.println("전원이 꺼져있습니다");
			System.out.println("(아무키나 눌러주세요)");
			sc.nextLine();
		}
		
		
	}
	
	
	
	//---------------------//
	
	
	void readWeptoon(Phone1DTO pho1dto,Phone3DTO pho3dto) {
		Scanner sc = new Scanner(System.in);
		
		if(pho1dto.getState().equals("켜짐")) {
		if(pho3dto.getWifi().equals("OFF")) {
			System.out.println("인터넷 연결이 안되있습니다");
			System.out.println("(아무키나 누르세요)");
			sc.nextLine();
		}
		else if(pho3dto.getWifi().equals("ON")&&pho3dto.getApp().equals("OFF")) {
			System.out.println("웹툰실행");
			pho3dto.setApp("ON");
		}
		else if(pho3dto.getApp().equals("ON")) {
			System.out.println("웹툰을 끕니다");
			pho3dto.setApp("OFF");
		}
	}
	else if(pho1dto.getState().equals("꺼짐")) {
		System.out.println("전원이 꺼져있습니다");
		System.out.println("(아무키나 눌러주세요)");
		sc.nextLine();
	}
	}
	
	
}
