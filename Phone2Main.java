package pack_Phone;

import java.util.Scanner;

public class Phone2Main extends Phone1Main {

	public static void main(String[] args) {
		
		
		Phone1DTO pho1dto = new Phone1DTO(1, "블랙", "아이폰1", "꺼짐");
		Phone2DTO pho2dto = new Phone2DTO(2, "화이트", "아이폰2", "꺼짐");
		Phone1DAO pho1dao = new Phone1DAO();
		Phone2DAO pho2dao = new Phone2DAO(); 
		
		Scanner sc =new Scanner (System.in);
		
		
		int selectNum;
		
		while(true) {
			
			
			pho2dao.currentStatus(pho2dto);//현재상태보여줌
			
			System.out.println("0. 전원끄기 / 전원켜기");
			System.out.println("1.전화하기 / 전화끊기");
			System.out.println("2.음성전송&수신");
			System.out.println("3.내 핸드폰 정보 확인하기");
			System.out.println("4.방송켜기");
			System.out.println("5.방송끄기 / 채널변경");
			
			selectNum=pho1dao.selectNum(); //번호선택
			
			
			if(selectNum==0) {
				//전원끄기/전원켜기
				pho2dao.turnOnOff(pho2dto);
			}
			else if (selectNum==1) {
				//전화하기 / 전화끊기
				pho2dao.call(pho2dto);
			}
			else if (selectNum==2) {
				//음성전송&수신
				pho1dao.sendVoice(pho2dto);
			}
			else if (selectNum==3) {
				//내 폰 정보 확인
				pho1dao.displayMyphone(pho2dto);
			}
			else if (selectNum==4) {
				//방송 켜기
				pho2dao.dmbOn(pho2dto);
			}
			else if (selectNum==5) {
				pho2dao.dmbOff(pho2dto, pho2dao);
				//방송끄기 / 채널변경
			}

		}
}
}