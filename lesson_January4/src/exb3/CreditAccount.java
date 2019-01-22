package exb3;

public class CreditAccount extends Account { // кредитовый счет
	private int creditLimit;

	public CreditAccount(int id, String person, int creditLimit) {
		super(id, person);
		if (creditLimit > 0) {
			this.creditLimit = creditLimit;
		} else {
			this.creditLimit = 0;
		}
	}

	/*
	 * public CreditAccount(int id, String person, int creditLimit2) { // TODO
	 * Auto-generated constructor stub }
	 */
	public int getCreditLimit() {
		return this.creditLimit;
	}

	public void setCreditLimit(int creditLimit) {
		if (creditLimit > 0) {
			this.creditLimit = creditLimit;
		}
	}

	public void subBalance(int subSum) {
		if (this.getBalance() - subSum >= 0 - this.creditLimit) {
			super.subBalance(subSum);
		}
	}
}
