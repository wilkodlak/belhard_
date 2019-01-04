package lesson2;

public class Bancomat {
	private int bag20 = 0;
	private int bag50 = 0;
	private int bag100 = 0;

	public int getBag100() {
		return bag100;
	}

	public int getBag50() {
		return bag50;
	}

	public int getBag20() {
		return bag20;
	}

	public void setBag100(int value) {
		bag100 = value;
	}

	public void setBag50(int value) {
		bag50 = value;
	}

	public void setBag20(int value) {
		bag20 = value;
	}

	public void addBag100(int value) {
		bag100 = bag100 + value;
	}

	public void addBag50(int value) {
		bag50 = bag50 + value;
	}

	public void addBag20(int value) {
		bag20 = bag20 + value;
	}

	public boolean incBag100(int value) {
		if (value > bag100) {
			return false;
		} else {
			bag100 = bag100 - value;
			return true;
		}
	}

	public boolean incBag50(int value) {
		if (value > bag100) {
			return false;
		} else {
			bag50 = bag50 - value;
			return true;
		}
	}

	public boolean incBag20(int value) {
		if (value > bag20) {
			return false;
		} else {
			bag20 = bag20 - value;
			return true;
		}
	}

	Bancomat(int bag100_, int bag50_, int bag20_) {
		setBag100(bag100_);
		setBag50(bag50_);
		setBag20(bag20_);

	}

	public boolean giveMoney(int commonSum) {
		if (commonSum > ((getBag100() * 100) + (getBag50() * 50) + (getBag20() * 20))) {
			return false;
		}

		boolean tempRes = false;
		for (int i = commonSum / 100; i > -1; i--) {
			int sum100 = i * 100;
			// System.out.println(sum100);
			for (int j = (commonSum - sum100) / 50; j >= 0; j--) {
				int sum50 = j * 50;
				// System.out.println(sum50);
				for (int k = ((commonSum - sum100 - sum50) / 20); k >= 0; k--) {
					if (k*20 == (commonSum - sum100 - sum50)) {
						// System.out.println(((commonSum - sum100 - sum50) / 20)+" " +((commonSum -
						// sum100 - sum50) % 20));
						System.out.println(i + " по 100 " + j + " по 50 " + k + " по 20");
						incBag100(i);
						incBag50(j);
						incBag20(k);
						tempRes = true;
						return tempRes;
					}
				}
			}
		}
		return tempRes;
	}

}
