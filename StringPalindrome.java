package Assignments;

public class StringPalindrome {

	public static void main(String[] args) {
		String test = "madam";
		String rev="";
		for (int i = test.length()-1; i >=0; i--) {
			rev=rev+test.charAt(i);
			if (rev.equals(test)) {
				System.out.println("palindrome");
			}
				else {
					System.out.println("Not a palindrome");
				}
			}
		}
}
