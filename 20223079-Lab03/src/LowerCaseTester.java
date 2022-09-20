class LowerCaseTester {
	public static void main(String args[]) {
		String testString = new String("This is a Test.");
		String smallTestString = testString.toLowerCase();
		System.out.println(smallTestString);
		
		String bigTestString = smallTestString.toUpperCase();
		System.out.println(bigTestString);
	}
}