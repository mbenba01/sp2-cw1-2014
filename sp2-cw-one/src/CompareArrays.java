/**
 *<h2>Coursework One</2>
 *<h3>Problem specification<?h3>
 *Given two arrays of integers, you are required to perform some array operations. You have to print the values which occur in both arrays, those which occur only in the first array, and those which occur only in the second.

 *<h3>Suggested approach</h3>
 *Create two empty integer arrays that will hold up to 100 integers. Then, repeatadly read integer values from the keyboard until the user types "0" (zero, without the quotes) and store those values in the first array. Ignore repeated occurences of a particular value in the data, so check each value to see whether it already occurs in the array before storing it.

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
 *If both arrays are empty, print out Both arrays are empty, do not perform any calculations and exit to the operating system. In this simple exercise, you don't have to consider an error condition in case the number of integers entered are greater than 100 (thus causing your program to crash).
 *Any integer number that is entered, whether negative or positive, should be taken into account. Remember that 0 should be excluded from your arrays as this value is meant to stop the iteration and proceed to the calculation part (a so-called, sentinel value).
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
 * @version 1.0
 *
 */
public class CompareArrays {
	
	final static int LENGTH = 100;
	/**
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		System.out.print("Enter digits to populate your array:");
		
	}

}
