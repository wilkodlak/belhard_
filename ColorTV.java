package lesson2;

public class ColorTV extends TV {
	private int maxchannelclass=99;
	private int r_valume;
	private int g_valume;
	private int b_valume;
	private boolean pult;
	private int maxchannel; //максимальное количество принимаемых каналов для цветных ТВ
	public int  getR_valume() {
		return r_valume;
	}
	public void setR_valume(int r_valume) {
		this.r_valume=((r_valume>=0)&(r_valume<=57) ? r_valume :this.r_valume );
		System.out.printf("Red Valume is %s\n", this.r_valume); 
	}
	public int  getG_valume() {
		return g_valume;
	}
	public void setG_valume(int g_valume) {
		this.g_valume=((g_valume>=0)&(g_valume<=57) ? g_valume :this.g_valume );
		System.out.printf("Green Valume is %s\n", this.g_valume); 
	}
	public int  getB_valume() {
		return b_valume;
	}
	public void setB_valume(int b_valume) {
		this.b_valume=((b_valume>=0)&(b_valume<=57) ? b_valume :this.b_valume );
		System.out.printf("Blue Valume is %s\n", this.b_valume); 
	}
	
	public boolean getPult() {
		return pult;
	}
	public void setPult(boolean pult) {
		this.pult=pult;
		System.out.printf("Pult is %s\n", (pult ? " present" : "absent")); 
	}
	@Override
	public int  getMaxchannel() {
		return this.maxchannel;
	}
	@Override
	public void setMaxchannel(int maxchannel) {
		this.maxchannel=((maxchannel>0)&(maxchannel<=this.maxchannelclass) ? maxchannel :this.maxchannel );
		System.out.printf("MaxChannel is %s\n", this.getMaxchannel()); 
	}
	
	ColorTV(int channel, int valume, int brightness, int maxchannel, int r_valume, int g_valume, int b_valume, boolean pult) {
		super(channel, valume, brightness, maxchannel);
		setR_valume(r_valume);
		setG_valume(g_valume);
		setB_valume(b_valume);
		setPult(pult);	
	}
}
