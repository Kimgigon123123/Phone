package pack_Phone;

public class Phone1DTO {
	private int Generation; // 세대
	private String color;   // 색깔
	private String model;   // 모델명
	private String state="꺼짐"; // 전원상태
	private String callMode="OFF";    // 전화모드 On or 전화모드 Off
	
	
	
	
	public int getGeneration() {
		return Generation;
	}




	public void setGeneration(int generation) {
		Generation = generation;
	}




	public String getColor() {
		return color;
	}




	public void setColor(String color) {
		this.color = color;
	}




	public String getModel() {
		return model;
	}




	public void setModel(String model) {
		this.model = model;
	}




	public String getState() {
		return state;
	}




	public void setState(String state) {
		this.state = state;
	}




	public String getCallMode() {
		return callMode;
	}




	public void setCallMode(String callMode) {
		this.callMode = callMode;
	}


	public Phone1DTO() {
		
	}

	public Phone1DTO(int generation, String color, String model, String state) {
		super();
		Generation = generation;
		this.color = color;
		this.model = model;
		this.state = state;
	}
	
	
}
