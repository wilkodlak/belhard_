package exb2;

//Запись
import exb1.Sweetness;

public class Record implements Comparable<Record> {
	private int recordLength;

	public Record(int recordLength) {
		this.recordLength = recordLength;
	};

	public int getRecordLength() {
		return this.recordLength;
	}

	public void setRecordLength(int recordLength) {
		this.recordLength = recordLength;
	};

	@Override
	public int compareTo(Record o) {
		return this.recordLength > o.recordLength ? 1 : this.recordLength == o.recordLength ? 0 : -1;
	}
	/*
	 * public int compareTo(MusicRecord o) { // TODO Auto-generated method stub
	 * return 0; }
	 */
}
