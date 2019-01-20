package exb1;

public class CandyCane extends Candy{
	//шоколадная конфета
	private int chocolateWeight;

	//public CandyCane(String name, int weight, int sugarWeight, int chocolateWeight) {
	public CandyCane(String name, int weight, int sugarWeight, int chocolateWeight2) {
		
		super(name, weight, sugarWeight);
		if (chocolateWeight2 <= 0) {
			throw new Error("chocolate must exist");
		} else {
		if (chocolateWeight2 <= super.getWeight() - super.getSugarWeight()) {
			this.chocolateWeight = chocolateWeight2;
		} else {
			throw new Error("Chocolate can't be more then sweetness and sugar has to exist");
		}}
	}

		// TODO Auto-generated constructor stub
	//}

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
