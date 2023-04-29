package pack_Phone;

public class Phone3DTO extends Phone2DTO {
	private String wifi="OFF";
	private String app ="OFF";
	
	
	
	
	
	public String getWifi() {
		return wifi;
	}





	public void setWifi(String wifi) {
		this.wifi = wifi;
	}





	public String getApp() {
		return app;
	}





	public void setApp(String app) {
		this.app = app;
	}





	public Phone3DTO(int generation, String color, String model, String state) {
		super(generation, color, model, state);
	}
	
	
	
	
}
