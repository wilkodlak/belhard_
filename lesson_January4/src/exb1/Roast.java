package exb1;

public class Roast extends Candy{
	//грильяж
	private int nutWeight;

	public Roast(String name, int weight, int sugarWeight, int nutWeight2) {
		super(name, weight, sugarWeight);
		if (nutWeight2 <= 0) {
			throw new Error("Nuts must exist");
		} else {
		if (nutWeight2 <= super.getWeight() - super.getSugarWeight()) {
			this.nutWeight = nutWeight2;
		} else {
			throw new Error("Nut can't be more then sweetness and nuts have to exist");
		}}
	}

	public void setNutWeight() {
		if (nutWeight <= 0) {
			throw new Error("Nuts must exist");
		} else {
			if (nutWeight <= super.getWeight() - super.getSugarWeight()) {
				this.nutWeight = nutWeight;
			} else {
				throw new Error("Nuts can't be more then sweetness and nuts have to exist");
			}
		}
	};

	public int getNutWeight() {
		return this.nutWeight;
	}

}
