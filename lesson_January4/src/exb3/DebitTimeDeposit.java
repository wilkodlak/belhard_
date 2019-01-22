package exb3;

public class DebitTimeDeposit extends DebitAccount {
	private int MonthTime;

	public DebitTimeDeposit(int id, String person, int MonthTime) {
		super(id, person);
		this.MonthTime = MonthTime;
	}

}
