package pack_Phone;

import java.util.Random;
import java.util.Scanner;

public class Phone1DAO {

	
	
	
	//-------------------------//
	int selectNum() { // 번호선택
		Scanner sc = new Scanner (System.in);
		int num=Integer.parseInt(sc.nextLine());
		return num;
	}
	//--------------------------------//
	void displayMyphone(Phone1DTO pho1dto) {
		Scanner sc = new Scanner (System.in);
		System.out.println("당신의 핸드폰은 "+pho1dto.getModel()+"("+pho1dto.getColor()+")입니다");
		System.out.println("(아무키나 누르세요)");
		sc.nextLine();
		
	}
	//-----------------------------------//
	void currentStatus(Phone1DTO pho1dto) {//현재상태 나타내주기
		System.out.println("현재 전원상태는 ["+pho1dto.getState()+"]입니다");
		System.out.println("현재 통화상태는 ["+pho1dto.getCallMode()+"]입니다");
		System.out.println();
	}
	//--------------------------------------//
	void turnOn(Phone1DTO pho1dto) {
		System.out.println("전원을 켭니다");
		pho1dto.setState("켜짐");
	}
	//---------------------------------------//
	void turnOff(Phone1DTO pho1dto) {
		System.out.println("전원을 끕니다");
		pho1dto.setState("꺼짐");
		pho1dto.setCallMode("OFF");
	}
	//--------------------------------//
	void turnOnOff(Phone1DTO pho1dto) { //전원 꺼져있으면 켜지고, // 전원 켜져있으면 꺼짐
		if(pho1dto.getState().equals("꺼짐")) {
			turnOn(pho1dto);
			
		}
		else if(pho1dto.getState().equals("켜짐")) {
			turnOff(pho1dto);
		}
	}
	//-------------------------------//
	void call(Phone1DTO pho1dto) {//전화모드
		Scanner sc =new Scanner(System.in);
		
		if(pho1dto.getState().equals("켜짐")) {
			if(pho1dto.getCallMode().equals("OFF")) {
				System.out.println("전화모드ON");
				System.out.println("음성전송&수신 가능");
				pho1dto.setCallMode("ON");
				System.out.println("(아무키나 누르세요)");
				sc.nextLine();
				System.out.println();
			}
			else if(pho1dto.getCallMode().equals("ON")) {
				System.out.println("전화모드OFF");
				System.out.println("음성전송&수신 불가");
				pho1dto.setCallMode("OFF");
				System.out.println("(아무키나 누르세요)");
				sc.nextLine();
				System.out.println();
			}
			
		}
		else if(pho1dto.getState().equals("꺼짐")) {
			
			System.out.println("전원이 꺼져있습니다");
			System.out.println("(아무키나 눌러주세요)");
			sc.nextLine();
		}
		
	}
	//------------------------------------//
	
	void sendVoice(Phone1DTO pho1dto) {// 음성전송 수신
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		if(pho1dto.getCallMode().equals("ON")) {
			System.out.println("1.말하기 2.듣기");
			int num=selectNum();
			
			if(num==1) {
				System.out.println("(말하세요)");
				String me = sc.nextLine();
				System.out.println("나 : "+me);
				System.out.println("(아무키나 누르세요)");
				sc.nextLine();
				System.out.println();
			}
			else if(num==2) {
				String[] youArr= {"HI","ㅎㅇ","여보세요","안녕","Hello"};
				int you= random.nextInt(5);
				System.out.println("상대 : "+youArr[you]);
				System.out.println("(아무키나 누르세요)");
				sc.nextLine();
				System.out.println();
			}
		}
		else if(pho1dto.getCallMode().equals("OFF")) {
			System.out.println("통화상태가 OFF 입니다");
			System.out.println("(아무키나 누르세요)");
			sc.nextLine();
			System.out.println();
		}
	}
	//-------------------------------------//
}
