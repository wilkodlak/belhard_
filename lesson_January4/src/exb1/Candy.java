package exb1;

public class Candy extends Sweetness {
	// конфета
	private String name;

	public Candy(String name2, int weight, int sugarWeight) {
		// TODO Auto-generated constructor stub
		super(weight, sugarWeight);
		this.name = name2;
	}


	public int compareByWeight(Sweetness other) {
		if (this.getWeight() == other.getWeight()) {
			return 0;
		} else {
			if (this.getWeight() < other.getWeight()) {
				return -1;
			} else {
				return 1;
			}
		}
	}

	public int compareBySugar(Sweetness other) {
		if (this.getSugarWeight() == other.getSugarWeight()) {
			return 0;
		} else {
			if (this.getSugarWeight() < other.getSugarWeight()) {
				return -1;
			} else {
				return 1;
			}
		}
	}
	public void setName(String name) {this.name=name;};
	public String getName() {return this.name;};

}
