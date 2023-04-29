package pack_Phone;

import java.util.Scanner;

public class Phone3Main extends Phone2Main{
	public static void main(String[] args) {
		
		
		Phone1DTO pho1dto = new Phone1DTO(1, "블랙", "아이폰1", "꺼짐");
		Phone2DTO pho2dto = new Phone2DTO(2, "화이트", "아이폰2", "꺼짐");
		Phone3DTO pho3dto = new Phone3DTO(3, "그린", "아이폰3", "꺼짐");
		Phone1DAO pho1dao = new Phone1DAO();
		Phone2DAO pho2dao = new Phone2DAO(); 
		Phone3DAO pho3dao = new Phone3DAO();
		
		Scanner sc =new Scanner (System.in);
		
		
		int selectNum;
		
		while(true) {
			
			
			pho3dao.currentStatus(pho3dto);//현재상태보여줌
			
			System.out.println("0. 전원끄기 / 전원켜기");
			System.out.println("1.전화하기 / 전화끊기");
			System.out.println("2.음성전송&수신");
			System.out.println("3.내 핸드폰 정보 확인하기");
			System.out.println("4.방송켜기");
			System.out.println("5.방송끄기 / 채널변경");
			System.out.println("6.인터넷연결 / 인터넷끄기");
			System.out.println("7.웹툰보기");
			
			selectNum=pho1dao.selectNum(); //번호선택
			
			
			if(selectNum==0) {
				//전원끄기/전원켜기
				pho3dao.turnOnOff(pho3dto);
			}
			else if (selectNum==1) {
				//전화하기 / 전화끊기
				pho2dao.call(pho3dto);
			}
			else if (selectNum==2) {
				//음성전송&수신
				pho1dao.sendVoice(pho3dto);
			}
			else if (selectNum==3) {
				//내 폰 정보 확인
				pho1dao.displayMyphone(pho3dto);
			}
			else if (selectNum==4) {
				//방송 켜기
				pho2dao.dmbOn(pho3dto);
			}
			else if (selectNum==5) {
				pho2dao.dmbOff(pho3dto, pho3dao);
				//방송끄기 / 채널변경
			}
			else if (selectNum==6) {
				pho3dao.wifiConnect(pho3dto);
				//인터넷연결 or 끄기
			}
			else if (selectNum==7) {
				pho3dao.readWeptoon(pho3dto);
				// 웹툰보기
			}

		}
}
}
