package ex2;

public class Town {
	private String name;

	Town(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	};

	public void setName(String name) {
		this.name = name;
	};
	public int hashCode() {
		return (int) (31 * super.hashCode()+this.name.length()) ;
	}

	public String toString() {
		return getClass().getName() + "name: " + this.name;
	}
	

	public boolean equals(Town obj) {
		return (this.name == obj.name);
		}

}
