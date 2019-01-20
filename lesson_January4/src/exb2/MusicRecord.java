package exb2;

//музыкальная запись
public class MusicRecord extends Record {
	private String style;

	public MusicRecord(int recordLength, String style) {
		super(recordLength);
		this.style = style;
	};

	public String getStyle() {
		return this.style;
	}

	public void setStyle(String style) {
		this.style = style;
	}
	// @Override

	/*
	 * public int compareTo(MusicRecord o) { return this.getRecordLength() >
	 * o.getRecordLength() ? 1 : (this.getRecordLength() < o.getRecordLength()) ? -1
	 * : this.style.compareTo(o.getStyle()); }
	 */
	public int compareTo(MusicRecord o) {
		return (this.style.compareTo(o.getStyle()) != 0) ? super.compareTo(o) : this.style.compareTo(o.getStyle());
	}

}
