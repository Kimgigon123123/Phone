package pack_Phone;

public class Phone2DTO extends Phone1DTO{
	
	private String dmbMode="OFF";
	private int channel;
	
	
	public Phone2DTO() {
		
	}
	
	public Phone2DTO(int generation, String color, String model, String state) {
		super(generation, color, model, state);
		
	}


	public String getDmbMode() {
		return dmbMode;
	}


	public void setDmbMode(String dmbMode) {
		this.dmbMode = dmbMode;
	}


	public int getChannel() {
		return channel;
	}


	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	
	
	
	
	
	
	

}
