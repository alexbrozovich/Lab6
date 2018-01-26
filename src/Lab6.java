import java.util.Scanner;

public class Lab6 {

	public static void main(String[] args) {
		
		//set up the scanner and the loop
		Scanner scan = new Scanner(System.in);
		String cont = "y";
		String pigLatinWord;

		while (cont.equalsIgnoreCase("y")) {
			System.out.println("Please enter a word: ");
			String userWord = scan.nextLine();
			
			//send the user input to the translator function to get translated
			pigLatinWord = translate(userWord);
			System.out.println("Your word in Pig Latin is: " + pigLatinWord);
			System.out.println("Do you want to continue? y/n");
			cont = scan.nextLine();
		}

		// let the user know the program has ended
		System.out.println("Goodbye!");

		scan.close();
	}

	private static String translate(String userWord) {
		String pigLatinWord;
		userWord = userWord.toLowerCase();
		
		//check to see if the word starts with a vowel
		if (userWord.charAt(0) == 'a' || userWord.charAt(0) == 'e' || userWord.charAt(0) == 'i' || userWord.charAt(0) == 'o' || userWord.charAt(0) == 'u') {
			pigLatinWord = userWord + "way";
		}
		
		//if it starts with a consonant, move the first letter to the end until it starts with a vowel, then add AY to the end
		else {
			pigLatinWord = userWord;
			while (pigLatinWord.charAt(0) != 'a' && pigLatinWord.charAt(0) != 'e' && pigLatinWord.charAt(0) != 'i' && pigLatinWord.charAt(0) != 'o' && pigLatinWord.charAt(0) != 'u') {
				pigLatinWord = pigLatinWord + pigLatinWord.charAt(0);
				pigLatinWord = pigLatinWord.substring(1, pigLatinWord.length());
			}
			pigLatinWord = pigLatinWord + "ay";
		}
		return pigLatinWord;
	}

}
