package exb3;

public class CreditTimeDeposit extends CreditAccount {

	private int MonthTime;

	public CreditTimeDeposit(int id, String person, int creditLimit, int MonthTime) {
		super(id, person, creditLimit);
		this.MonthTime = MonthTime;
	}
}
