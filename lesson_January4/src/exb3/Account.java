package exb3;

import java.util.Date;

public class Account implements Comparable<Account> { // счет
	private int id;
	private String person;
	private int balance;
	private boolean blocked;
	private Date beginDate;
	private Date closeDate;

	public Account(int id, String person) {
		this.id = id;
		this.balance = 0;
		this.person = person;
		this.blocked = false;
		this.beginDate = new java.util.Date();
		this.closeDate = null;
	}

	public void addBalance(int addSum) {
		if ((addSum > 0) & (!this.blocked)) {
			this.balance = this.balance + addSum;
		}
		;
	}

	public void subBalance(int subSum) {
		if ((subSum > 0) & (!this.blocked)) {
			this.balance = this.balance - subSum;
		}
		;
	}

	public String toString() {
		return " ID " + this.getId() + " Person " + this.getPerson() + " balance " + this.getBalance() + " OpenDate "
				+ this.getBeginDate();
	}

	public int getBalance() {
		return this.balance;
	}

	public String getPerson() {
		return this.person;
	}

	public int getId() {
		return this.id;
	}

	public void setBlocked(boolean blocked) {
		if (this.closeDate != null) {
			this.blocked = blocked;
		}
		;
	}

	public boolean getBlocked() {
		return this.blocked;
	}

	public Date getBeginDate() {
		return this.beginDate;
	}

	public Date getCloseDate() {
		return this.closeDate;
	}

	public void closeAccount() {
		this.blocked = true;
		this.closeDate = new java.util.Date();
	};

	@Override
	public int compareTo(Account o) {
		return ((this.getBalance() > o.getBalance())
				|| ((this.getBalance() == o.getBalance()) && (this.getBeginDate().before(o.getBeginDate())))
				|| ((this.getBalance() == o.getBalance()) && (this.getBeginDate() == o.getBeginDate())
						&& (this.getId() > o.getId())))
								? 1
								: ((this.getBalance() == o.getBalance()) && (this.getBeginDate() == o.getBeginDate())
										&& (this.getId() == o.getId()) && (this.getPerson() == o.getPerson())) ? 0
												: (this.getPerson().compareTo(o.getPerson()));
	}

}
