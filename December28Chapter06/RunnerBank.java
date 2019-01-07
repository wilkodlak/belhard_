package December28Chapter06;

public class RunnerBank {

	public static void main(String[] args) {
		// объявление и создание объекта firstObject
		Bancomat CashMashine = new Bancomat(20, 10, 15);
		System.out.println(CashMashine.getBag100());
		CashMashine.addBag100(1);
		System.out.println(CashMashine.getBag100() + " " + CashMashine.getBag50() + " " + CashMashine.getBag20());
		System.out.println(CashMashine.giveMoney(3000));
		System.out.println(CashMashine.getBag100() + " " + CashMashine.getBag50() + " " + CashMashine.getBag20());
		System.out.println(CashMashine.giveMoney(210));
		System.out.println(CashMashine.getBag100() + " " + CashMashine.getBag50() + " " + CashMashine.getBag20());
		System.out.println(CashMashine.giveMoney(211));
		System.out.println(CashMashine.getBag100() + " " + CashMashine.getBag50() + " " + CashMashine.getBag20());
		System.out.println(CashMashine.giveMoney(400));
		System.out.println(CashMashine.getBag100() + " " + CashMashine.getBag50() + " " + CashMashine.getBag20());
		System.out.println(CashMashine.giveMoney(20));
		System.out.println(CashMashine.getBag100() + " " + CashMashine.getBag50() + " " + CashMashine.getBag20());
		System.out.println(CashMashine.giveMoney(350));
		System.out.println(CashMashine.getBag100() + " " + CashMashine.getBag50() + " " + CashMashine.getBag20());

	}

}
