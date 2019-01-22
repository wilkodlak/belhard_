package exb3;

public class DebitAccount extends Account { // дебитовый счет
	public DebitAccount(int id, String person) {
		super(id, person);
	}

	public void subBalance(int subSum) {
		if (this.getBalance() - subSum >= 0) {
			super.subBalance(subSum);
		}
		;
	}

}
