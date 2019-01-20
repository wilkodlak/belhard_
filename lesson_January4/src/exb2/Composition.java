package exb2;

//композиция
public class Composition extends MusicRecord {
	private String name;
	private String author;
	private int year;

	public Composition(String name, String author, int year, int recordLength, String style) {
		super(recordLength, style);
		this.name = name;
		this.author = author;
		this.year = year;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int compareTo(Composition o) {
		return this.getRecordLength() > o.getRecordLength() ? 1
				: (this.getRecordLength() < o.getRecordLength()) ? -1
						: (this.getStyle().compareTo(o.getStyle()) != 0) ? this.getStyle().compareTo(o.getStyle())
								: (this.getName() + this.getAuthor() + Integer.toString(this.getYear()))
										.compareTo((o.getName() + o.getAuthor() + Integer.toString(o.getYear())));
	}

}
