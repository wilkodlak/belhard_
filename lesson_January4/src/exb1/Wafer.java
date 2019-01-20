package exb1;

public class Wafer extends Sweetness {
//вафли
	private int flourWeight;
	private int fillingWeight;

	Wafer(int weight, int sugarWeight, int flourWeight, int fillingWeight) {
		super(weight, sugarWeight);
		if ((flourWeight < 0) || (fillingWeight < 0)) {
			throw new Error("flour and filling must exist");
		} else {
			if (flourWeight + fillingWeight <= super.getWeight() - super.getSugarWeight()) {
				this.fillingWeight = fillingWeight;
				this.flourWeight = flourWeight;
			} else {
				throw new Error("Sugar+flour+filling can't be more then sweetness and flour with filling have to exist");
			}
		}
	};

	public void setFlourWeight(int flourWeight) {
		if (flourWeight < 0) {
			throw new Error("flour must exist");
		} else {

		if (flourWeight + this.fillingWeight <= super.getWeight() - super.getSugarWeight()) {
			this.flourWeight = flourWeight;
		} else {
			throw new Error("Sugar+flour+filling can't be more then sweetness and flour with filling have to exist");
		}}
	};

	public int getFlourWeight() {
		return this.flourWeight;
	}

	public void setFillingWeight(int fillingWeight) {
		if (fillingWeight < 0) {
			throw new Error("filling must exist");
		} else {

		if (this.flourWeight + fillingWeight <= super.getWeight() - super.getSugarWeight()) {
			this.fillingWeight = fillingWeight;
		} else {
			throw new Error("Sugar+flour+filling can't be more then sweetness and flour with filling have to exist");
		}}
	};

	public int getFillingWeight() {
		return this.flourWeight;
	}

}
