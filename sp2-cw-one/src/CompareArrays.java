import java.util.Scanner;

/**
 *<h2>Coursework One</2>
 *<h3>Problem specification<?h3>
 *Given two arrays of integers, you are required to perform some array operations. You have to print the values which occur in both arrays, those which occur only in the first array, and those which occur only in the second.

 *<h3>Suggested approach</h3>
 *Create two empty integer arrays that will hold up to 100 integers. Then, repeatedly read integer values from the keyboard until the user types "0" (zero, without the quotes) and store those values in the first array. Ignore repeated occurences of a particular value in the data, so check each value to see whether it already occurs in the array before storing it.

 *Now the array should contain a set (which could be empty) of distinct integer values. Repeat the same procedure to fill the second array.

 *Then, loop through both arrays and print out:
 *<ul>
 *<li>the values that the user entered for the first array</li>
 *<li>the values that the user entered for the second array</li>
 *<li>the values which occur in both arrays (intersection)</li>
 *<li>the number of values common to both arrays</li>
 *<li>the values which occur only in the first array, and</li>
 *<li>the values which occur only in the second array.</li>
 *</ul>
 *
 *Always exclude the terminating zero from your calculations.
 *
 *
 *<h2>What to do in the following error cases</h2>
 *Any of the arrays could be empty, and this should not cause your program to behave erratically.
 *If both arrays are empty, print out Both arrays are empty, do not perform any calculations and exit to the operating system. 
 *In this simple exercise, you don't have to consider an error condition in case the number of integers entered are greater than 100 (thus causing your program to crash).
 *Any integer number that is entered, whether negative or positive, should be taken into account. 
 *Remember that 0 should be excluded from your arrays as this value is meant to stop the iteration and proceed to the calculation part (a so-called, sentinel value).
 *
 *<h3>Suggestions</h3>
 *You may break down your algorithm into methods to make your life easier. For example,
 *<ul>
 *<li>you could create a displayCommon method that accepts two integer arrays and displays the common values.</li>
 *<Li>you could create a displayElements method that accepts an array and prints its contents.</li>
 *<li>you could create a fillArray method that prompts the user for input and stores the integers into an array etc.</li>
 *</ul>
 *Please note: constant values should be declared as final and static.
 */

/**
 * @author Mustapha Benbaziz
 * @version 2.0
 *
 */
public class CompareArrays {
	
	final static int LENGTH = 100;
	/**
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		
		int[] arrayOne = new int[LENGTH];
		int[] arrayTwo = new int[LENGTH];
		
		int arrayOneSize = 0;
		int arrayTwoSize = 0;
		
		int arrayOneItem = 0;
		int arrayTwoItem = 0;
		
		int trigger = 0;
		
		System.out.println("Enter digit in first array: ");
		System.out.println("enter zero (0) to stop:");
		Scanner keyboard = new Scanner(System.in);
		
		for(int i = 0; i <= arrayOneSize; i++) {
			
			arrayOne[i] = keyboard.nextInt();
			arrayOneItem = arrayOne[i];
			if(arrayOneItem == trigger) {
				
				System.out.println("Thank you!");
				System.out.println("You have entered " + arrayOneSize + " numbers in the first array");
				continue;
				
			}
			
			arrayOneSize++;
		}
		
		System.out.println("Enter digit in second array: ");
		

		for(int j = 0; j <= arrayTwoSize; j++) {
			arrayTwo[j] = keyboard.nextInt();
			arrayTwoItem = arrayTwo[j];
			if(arrayTwoItem == trigger) {
				
				System.out.println("Thank you!");
				System.out.println("You have entered " + arrayTwoSize + " numbers in the Second array");
				continue;
			}
			
			arrayTwoSize++;
		}
		
		int currentSize = 0;

		if(arrayTwoSize < arrayOneSize) {
			currentSize = arrayTwoSize;
		} else {
			currentSize = arrayOneSize;
		}
		
		
		int[] arrayOfCommons = new int[currentSize];
		
		int commonItem = 0;
		int count = 1;
		
		for(int y = 0; y < currentSize; y++) {
			for(int x = 0; x < currentSize; x++) {
				if((arrayOne[y] == arrayTwo[x])) {
					commonItem = arrayOne[y];
					arrayOfCommons[y] = commonItem;
					System.out.println(arrayOfCommons[y] + " is a common number");
					count++;
				}
			}
		}
		System.out.println("The total number of common entries is: " + count);	
	keyboard.close();
	}
	

}
