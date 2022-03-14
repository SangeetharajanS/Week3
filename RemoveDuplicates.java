package Assignments;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String text ="We learn java basics as part of java sessions in java week1";
		int count = 0;
		String[] word =text.split(" ");
		for (int i = 0; i < word.length; i++) {
			for (int j = 0; j<i; j++) {
				if (word[i].equals(word[j]))
				count++;
			}
				if (count > 1) {
					text.replaceAll(word[i],"");
				} else {
					System.out.println(word[i]);		
			}
		}
		}
		}

			
			
