package exb1;

public class Toffee extends Candy{
	//ириска
	private int milkWeight;

	public Toffee(String name, int weight, int sugarWeight, int milkWeight2) {
		super(name, weight, sugarWeight);
		if (milkWeight2 <= 0) {
			throw new Error("Milk must exist");
		} else {
		if (milkWeight2 <= super.getWeight() - super.getSugarWeight()) {
			this.milkWeight = milkWeight2;
		} else {
			throw new Error("Milk can't be more then sweetness and milk has to exist");
		}}
	}

	public void setMilkWeight() {
		if (milkWeight <= 0) {
			throw new Error("milk must exist");
		} else {
			if (milkWeight <= super.getWeight() - super.getSugarWeight()) {
				this.milkWeight = milkWeight;
			} else {
				throw new Error("Milk can't be more then sweetness and milk has to exist");
			}
		}
	};

	public int getMilkWeight() {
		return this.milkWeight;
	}

}
