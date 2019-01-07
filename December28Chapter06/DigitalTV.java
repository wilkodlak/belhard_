package December28Chapter06;

public class DigitalTV extends ColorTV {
	public int digitalChannel; // ����� �������� ��������� ������
	public boolean useDigitalChannel; // ������������ �������� ��������
	protected int maxDigitChannel = 1000; // ������������ ����� �������� �������

	public void setDigitalChannel(int digitalChannel) {
		this.digitalChannel = ((digitalChannel > 0) ? digitalChannel : this.digitalChannel);
		System.out.printf(" Digital Channel is %s\n", this.digitalChannel);
	}

	public int getDigitalChannel() {
		return digitalChannel;
	}

	public void setUseDigitalChannel(boolean useDigitalChannel) {
		this.useDigitalChannel = useDigitalChannel;
		System.out.printf(" TV is using %s Channel \n", (useDigitalChannel ) ? "Digital" : "Analog");
	}

	public boolean getUseDigitalChannel() {
		return useDigitalChannel;
	}

	DigitalTV(int channel, int valume, int brightness, int maxchannel, int r_valume, int g_valume, int b_valume,
			boolean pult, int digitalChannel, boolean useDigitalChannel) {
		super(channel, valume, brightness, maxchannel, r_valume, g_valume, b_valume, pult);
		setDigitalChannel(digitalChannel);
		setUseDigitalChannel(useDigitalChannel);
	}

}
