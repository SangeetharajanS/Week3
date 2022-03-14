package Assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
if (text1.length()==text2.length()) {
	System.out.println("Same Lenght");
}
char[] c1=text1.toCharArray();
char[] c2=text2.toCharArray();
Arrays.sort(c1);
Arrays.sort(c2);
if(Arrays.equals(c1, c2)) {
	System.out.println("Same values");
}
else {
	System.out.println("Arrays are haveing different values");
}
	}

}
