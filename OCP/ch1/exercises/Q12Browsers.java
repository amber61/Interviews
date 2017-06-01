package ch1.exercises;

public class Q12Browsers {
	static class Browser {
		public void go() {
			System.out.println("Inside Browser");
		}
	}

	class Firefox extends Browser {
		public void go() {
			System.out.println("Inside Firefox");
		}
	}

	static class IE extends Browser {
		@Override
		public void go() {
			System.out.println("Inside IE");
		}
	}

	public static void main(String[] args) {
		Q12Browsers q = new Q12Browsers();
		Browser b = q.new Firefox();
		IE e = (IE) b;
		e.go();
	}

}
