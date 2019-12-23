package StudentPackage;

@SuppressWarnings("serial")
class CreditLimit extends Exception {
	String to_string() {
		return "Credit limit reached";
	}
}
