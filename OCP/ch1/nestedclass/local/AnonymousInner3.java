package ch1.nestedclass.local;

public class AnonymousInner3 {
	// JButton button = new JButton("red");
	// button.addActionListener(new ActionListener() {
	// public void actionPerformed(ActionEvent e) {}
	// });
	private int number = 10;

	interface SaleTodayOnly {
		int dollarsOff();
	}

	public int pay() {
		return admission(5, new SaleTodayOnly() {
			public int dollarsOff() {
				number *= 2;
				return 3;
			}
		});
	}

	public int admission(int basePrice, SaleTodayOnly sale) {
		return basePrice - sale.dollarsOff();
	}

}
