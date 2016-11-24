import java.util.Scanner;

/**
 * 
 */

/**
 * @author d.anderson2
 *
 */
public class ex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		
		int[] MyArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};		
		int minimum;
		int index = -1;
		int userValue;
		
	    //To iterate through an array, we use a for loop!
		// i is the current index we are looking at in the array
		// i will search through every element in the array
		// because i will continue until it is as large as the length
		// of the array
		for(int i = 0; i < MyArray.length; i++){
			
			//This will display all values
			System.out.print(MyArray[i] + "  ");
			
		}
		//This code gets the value you want to search from the user
		System.out.println();
		System.out.println("What value do you want the index of?");
		userValue = userInput.nextInt();
		
		//To search for something, I need to look at every element
		//of the array. This is accomplished by looping through all 
		//the elements.
		for(int i = 0; i < MyArray.length; i++){
			if(MyArray[i]==userValue){
				index = i;
			}
		}

		
		
		
		if(index == -1){
			System.out.println("This is not in the array!");
		} else {
			System.out.println(userValue + " is at index " + index);
		}
		
		//To find the minimum value of the array, we have to 
		//search through every element of the array and see if
		//the current value is smaller then the previous value 
		
		
		
		
		
		
		
		minimum = MyArray[0];
		
		for(int i = 0; i < MyArray.length; i++){
			//Checks whether the current element is less then minimum
			if(MyArray[i] < minimum){
				//If yes, change minimum to the current element
				minimum = MyArray[i];
				
			}
			
		}
		
		System.out.println("The minimum value is: " +minimum);
		
		userInput.close();
	}

}
