package ch1.nestedclass.member;

public class CaseOfThePrivateInterface {

	private interface Secret {
		public void shh();
	} // inner interface

	class DontTell implements Secret {
		public void shh() {}
	} // inner class implements inner interface and override method
}
