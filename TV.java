package lesson2;

public class TV { //класс телевизор (первого поколения)
	private boolean turnOn=false; // включен
	private int channel; // канал
	private int valume; // уровень звука
	private int brightness; // контрастность
	private int maxchannel=1; //максимальное количество принимаемых каналов
	private int maxchannelclass=12;
	public boolean getTurnOn() {
		return turnOn;
	}
	public void setTurnOn(boolean turnOn) {
		this.turnOn=turnOn;
		System.out.printf("TV is %s\n", (turnOn ? "On" : "Off")); 
	}
	public int  getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel=((channel>0)&(channel<=maxchannel) ? channel :this.channel );
		System.out.printf("Channel is %s\n", this.channel); 
	}
	public int  getValume() {
		return valume;
	}
	public void setValume(int valume) {
		this.valume=((valume>=0)&(valume<=57) ? valume :this.valume );
		System.out.printf("Valume is %s\n", this.valume); 
	}
	public int  getBrightness() {
		return brightness;
	}
	public void setBrightness(int brightness) {
		this.brightness=((brightness>=0)&(brightness<=57) ? brightness :this.brightness );
		System.out.printf("Brightness is %s\n", this.brightness); 
	}
	public int  getMaxchannel() {
		return maxchannel;
	}
	public void setMaxchannel(int maxchannel) {
		this.maxchannel=((maxchannel>0)&(maxchannel<=this.maxchannelclass) ? maxchannel :this.maxchannel );
		System.out.printf("MaxChannel is %s\n", this.maxchannel); 
	}

	
	TV(int channel, int valume, int brightness, int maxchannel) {
		setTurnOn(false);
		setChannel(channel);
		setValume(valume);
		setBrightness(brightness);
		setMaxchannel(maxchannel);
	}
	
}