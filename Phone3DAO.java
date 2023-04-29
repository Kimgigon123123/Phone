package pack_Phone;

import java.util.Scanner;

public class Phone3DAO extends Phone2DAO {
	
	//-----------------------//
	void currentStatus(Phone3DTO pho3dto) {//현재상태 나타내주기
		System.out.println("현재 전원상태는 ["+pho3dto.getState()+"]입니다");
		System.out.println("현재 통화상태는 ["+pho3dto.getCallMode()+"]입니다");
		System.out.println("현재 DMB상태는 ["+pho3dto.getDmbMode()+"]입니다");
		System.out.println("현재 인터넷상태는 ["+pho3dto.getWifi()+"]입니다");
		System.out.println("현재 웹툰상태는["+pho3dto.getApp()+"]입니다");
		System.out.println();
	}
	//----------------------------//
	
	
	void turnOff(Phone3DTO pho3dto) {
		System.out.println("전원을 끕니다");
		pho3dto.setState("꺼짐");
		pho3dto.setCallMode("OFF");
		pho3dto.setDmbMode("OFF");
		pho3dto.setWifi("OFF");
		pho3dto.setApp("OFF");

	}
	
	//--------//
	
	void turnOnOff(Phone3DTO pho3dto) { //전원 꺼져있으면 켜지고, // 전원 켜져있으면 꺼짐
		if(pho3dto.getState().equals("꺼짐")) {
			turnOn(pho3dto);
			
		}
		else if(pho3dto.getState().equals("켜짐")) {
			turnOff(pho3dto);
		}
	}
	
	
	//----------------------//
	
	void wifiConnect(Phone3DTO pho3dto) {//인터넷연결 or 인터넷 끄기
		Scanner sc =new Scanner(System.in);
		
		
		if(pho3dto.getState().equals("켜짐")) {
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
		else if(pho3dto.getState().equals("꺼짐")) {
			System.out.println("전원이 꺼져있습니다");
			System.out.println("(아무키나 눌러주세요)");
			sc.nextLine();
		}
		
		
	}
	
	
	
	//---------------------//
	
	
	void readWeptoon(Phone3DTO pho3dto) {
		Scanner sc = new Scanner(System.in);
		
		if(pho3dto.getState().equals("켜짐")) {
		if(pho3dto.getWifi().equals("OFF")) {
			System.out.println("인터넷 연결이 안돼있습니다");
			System.out.println("(아무키나 누르세요)");
			sc.nextLine();
		}
		else if(pho3dto.getWifi().equals("ON")&&pho3dto.getApp().equals("OFF")) {
			System.out.println("웹툰실행");
			pho3dto.setApp("ON");
			System.out.println("(아무키나 눌러주세요)");
			sc.nextLine();
		}
		else if(pho3dto.getApp().equals("ON")) {
			System.out.println("웹툰을 끕니다");
			pho3dto.setApp("OFF");
			System.out.println("(아무키나 눌러주세요)");
			sc.nextLine();
		}
	}
	else if(pho3dto.getState().equals("꺼짐")) {
		System.out.println("전원이 꺼져있습니다");
		System.out.println("(아무키나 눌러주세요)");
		sc.nextLine();
	}
	}
	
	
}
