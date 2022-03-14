package Assignments;


public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count=0;
		char[] chr = str.toCharArray();
		int length = chr.length;
		for (int i = 0; i <length; i++) {
			if (chr[i]=='e') {
				count++;
			}
		}
		System.out.println("Number of time e occured in string "+count);
			}
	}