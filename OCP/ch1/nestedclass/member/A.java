package ch1.nestedclass.member;

public class A {

	private int x = 10;

	class B {
		private int x = 20;

		class C {
			private int x = 30;

			public void allTheX() {
				System.out.println(x);// 30
				System.out.println(this.x); // 30
				System.out.println(B.this.x); // 20
				System.out.println(A.this.x); // 10
			}
		} // end of class C
	} // end of class B

	public static void main(String[] args) {
		A a = new A();
		B b = a.new B(); // A.B type is not required, same level with A member
		A.B.C c = b.new C(); // A.B.C is required, too deep
		c.allTheX();
	} // end of main
} // end of class A
