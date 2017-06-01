package ch1.nestedclass.local;

public class AnonymousInner {
	abstract class SaleTodayOnly {
		abstract int dollarsOff();
	}

	public int admission(int basePrice) {
		SaleTodayOnly sale = new SaleTodayOnly() {// anonymous class
			int dollarsOff() {
				return 3;
			}
		}; // end of anonymous class
		return basePrice - sale.dollarsOff();
	} // end of method
}
