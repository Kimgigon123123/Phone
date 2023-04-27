package pack_Phone;

import java.util.Scanner;

public class Phone1Main {
	
	public static void main(String[] args) {
		
		
		Phone1DTO pho1dto = new Phone1DTO(1, "검정", "아이폰1", "꺼짐");
		Phone1DAO pho1dao = new Phone1DAO();
		Scanner sc =new Scanner (System.in);
		
		
		int selectNum;
		
		while(true) {
			
			
			pho1dao.currentStatus(pho1dto);//현재상태보여줌
			
			System.out.println("0. 전원끄기 / 전원켜기");
			System.out.println("1.전화하기 / 전화끊기");
			System.out.println("2.음성전송&수신");
			System.out.println("3.내 핸드폰 정보 확인하기");
			
			selectNum=pho1dao.selectNum(); //번호선택
			
			
			if(selectNum==0) {
				//전원끄기/전원켜기
				pho1dao.turnOnOff(pho1dto);
			}
			else if (selectNum==1) {
				//전화하기 / 전화끊기
				pho1dao.call(pho1dto);
			}
			else if (selectNum==2) {
				//음성전송&수신
				pho1dao.sendVoice(pho1dto);
			}
			else if (selectNum==3) {
				//내 폰 정보 확인
				pho1dao.displayMyphone(pho1dto);
			}
			

		}
		
		
		
		
		
		
		
		
		
	}
	
	
}
