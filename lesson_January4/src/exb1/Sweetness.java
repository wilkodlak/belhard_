package exb1;
//import java.util.Comparable;

public class Sweetness implements Comparable<Sweetness>{
	// сладости
	private int weight;
	private int sugarWeight;

	Sweetness(int weight, int sugarWeight) {
		if ((weight >= sugarWeight) & (sugarWeight > 0)) {
			this.weight = weight;
			this.sugarWeight = sugarWeight;
		} else {
			throw new Error("Sugar can't be more then sweetness and sugar has to exist");
		}
		;
	}

	public Sweetness getSweetness() {
		return this;
	}
	
	@Override
	public int compareTo(Sweetness o) {
		return this.weight > o.weight ? 1 : this.weight == o.weight ? 0 : -1;
	}
	public int getWeight() {
		return this.weight;
	}

	public int getSugarWeight() {
		return this.sugarWeight;
	}

	public void setWeight(int weight) {
		if ((weight >= this.sugarWeight) & (this.sugarWeight > 0)) {
			this.weight = weight;
		} else {
			throw new Error("Sugar can't be more then sweetness and sugar has to exist");
		}
		;
	}

	public void setSugarWeight(int sugarWeight) {
		if ((this.weight >= sugarWeight) & (sugarWeight > 0)) {
			this.sugarWeight = sugarWeight;
		} else {
			throw new Error("Sugar can't be more then sweetness and sugar has to exist");
		}
		;
	}

}
