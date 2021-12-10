package compSciProject7;
//import java.util.Arrays;
//import java.util.Scanner;

public class compSciHomework7 {

	public static void main(String[] args) {

		String userstring = "Hello World";
		System.out.println(userstring);
		String allLowerCaseString = userstring.toLowerCase();

		sort(allLowerCaseString);
		//String sortedString = sort(allLowerCaseString);
		//System.out.println(sortedString);


	}

	//This Method uses a selection sort to sort any string
	public static String sort(String userString) {
		
		//Creates an array named 'sortedstring' and assigns the userstring to the array.
		//The string is added to the array character by character.
		char[] sortedstring = new char[userString.length()];

		for (int i = 0; i < userString.length(); i++) {

			char letter = userString.charAt(i);

			sortedstring[i] =(char) + letter;
			//System.out.print(sortedstring);
		}
		System.out.print(sortedstring);
		System.out.println("");

		//Selection Sort begins
		//Sets the Minimum Letter and Minimum Index to the first letter and index 0
		for(int index = 0; index < sortedstring.length; index++) {
			char currentMinLetter = sortedstring[index];
			int currentMinIndex = index;
			//System.out.println("Current Minimum  Letter: " + currentMinLetter + " Current Minimum Index: " + currentMinIndex);
			
		//Finds the minimum letter and the index of the minimum letter.
		//It then assigns the letter and index to variables to store them and use in the swap code
			for(int nextIndex = index + 1; nextIndex < sortedstring.length; nextIndex++) {
				if (currentMinLetter > sortedstring[nextIndex]) {
					
					//System.out.println("Current Minimum  Letter: " + currentMinLetter + " Current Minimum Index: " + currentMinIndex);
					//System.out.println("Next Index: " + nextIndex + ", " + currentMinLetter + " is greater than " + sortedstring[nextIndex] + " keep it.");
					currentMinLetter = sortedstring[nextIndex];
					currentMinIndex = nextIndex;
					//System.out.println("Current Minimum  Letter: " + currentMinLetter + " Current Minimum Index: " + currentMinIndex);
				}
				
			}
			//This code swaps the first letter with the minimum letter 
			//NOTE: This if-statement must be outside the nextIndex for-loop, but inside the main/Index for-loop.
			if (currentMinIndex != index) {
					
				//System.out.println("Index: " + index + ", Swap " + sortedstring[index] + " with " + currentMinLetter);
				//System.out.println(sortedstring);
				sortedstring[currentMinIndex] = sortedstring[index];
				sortedstring[index] = currentMinLetter;
				//System.out.println("Current Minimum  Letter: " + currentMinLetter + " Current Minimum Index: " + currentMinIndex);
				//System.out.println(sortedstring);
					
			}
				
			//}
		}
		String sortedAlphabetically = null;
		for(int i = 0; i < sortedstring.length; i++) {
			sortedAlphabetically = sortedstring.toString();
		}

		System.out.print(sortedstring);
		
		return sortedAlphabetically;
	}

}
