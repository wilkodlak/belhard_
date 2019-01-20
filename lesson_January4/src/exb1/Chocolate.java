package exb1;

public class Chocolate extends Sweetness {
	// шоколадка
	private int chocolateWeight;

	Chocolate(int weight, int sugarWeight, int chocolateWeight) {
		super(weight, sugarWeight);
		if (chocolateWeight <= 0) {
			throw new Error("chocolate must exist");
		} else {
		if (chocolateWeight <= super.getWeight() - super.getSugarWeight()) {
			this.chocolateWeight = chocolateWeight;
		} else {
			throw new Error("Chocolate can't be more then sweetness and chocolate has to exist");
		}}
	}

	public void setChocolateWeight() {
		if (chocolateWeight <= 0) {
			throw new Error("chocolate must exist");
		} else {
			if (chocolateWeight <= super.getWeight() - super.getSugarWeight()) {
				this.chocolateWeight = chocolateWeight;
			} else {
				throw new Error("Chocolate can't be more then sweetness and chocolate has to exist");
			}
		}
	};

	public int getChocolateWeight() {
		return this.chocolateWeight;
	}
}
