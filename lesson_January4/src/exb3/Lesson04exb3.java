package exb3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Date;
import java.util.*;

//import exb3.CreditTermlessDeposit;
//import exb3.CurrentAccountID.*;

/*
 Счета. Клиент может иметь несколько счетов в банке. Учитывать 
 возможность блокировки/разблокировки счета. Реализовать поиск и сортировку
ссчетов. Вычисление общей суммы по счетам. Вычисление суммы по всем
ссчетам, имеющим положительный и отрицательный балансы отдельно.
 */
public class Lesson04exb3 {
	public static void main(String[] args) {
		int currentId = 0; // счетчик
		int bZSumm = 0;
		int aZSumm = 0;
		// curId=0;
		// private int getId() {currentId++; return currentId;}
		CreditTermlessDeposit candy1 = new CreditTermlessDeposit(currentId++, " aaa1", 1999);
		// int id, String person,int creditLimit
		CreditTimeDeposit candy2 = new CreditTimeDeposit(currentId++, " ccc1", 2000, 3);
		CreditTermlessDeposit candy3 = new CreditTermlessDeposit(currentId++, " faf2", 1998);
		DebitTermlessDeposit candy4 = new DebitTermlessDeposit(currentId++, " caf3");
		DebitTermlessDeposit candy5 = new DebitTermlessDeposit(currentId++, " cfa4");
		DebitTimeDeposit candy6 = new DebitTimeDeposit(currentId++, " ddb2", 6);
		System.out.println(candy6.getPerson());
		candy1.addBalance(35);
		System.out.println(candy1.getBalance());
		candy2.addBalance(55);
		candy3.subBalance(35);
		candy4.subBalance(35);
		candy5.addBalance(18);
		candy2.addBalance(99);
		List<Account> Disk = Arrays.asList(candy1, candy2, candy3, candy4, candy5, candy6);
		Disk.forEach(rec -> {
			System.out.println(rec);
		});

		for (int i = 0; i < Disk.size(); i++) {
			if (Disk.get(i).getBalance() > 0) {
				aZSumm = aZSumm + Disk.get(i).getBalance();
			} else {
				if (Disk.get(i).getBalance() < 0) {
					bZSumm = bZSumm + Disk.get(i).getBalance();
				}
			}
			;
		}
		System.out.println(" Summ above zerow is " + aZSumm);
		System.out.println(" Summ before zerow is " + bZSumm);

		Collections.sort(Disk);
		Disk.forEach(rec -> {
			if (rec.getPerson().indexOf("a") >= 0) { // Find if "a" exists
				System.out.println(rec);
			}
		});
	}

}
