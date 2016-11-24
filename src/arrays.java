import java.util.Scanner;

/**
 * 
 */

/**
 * @author d.anderson2
 *
 */
public class arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner userInput = new Scanner(System.in);
		int[] arrayToSearch = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int Index = -1;
		int userValue;
		
		
	for(int i = 0; i < arrayToSearch.length; i++){
						
			System.out.print(arrayToSearch[i] + "  ");
			
		}
		
		System.out.println();
		System.out.println("\nWhat value do you want the index of?");
		userValue = userInput.nextInt();
				
		for(int i = 0; i < arrayToSearch.length; i++){
			if(arrayToSearch[i]==userValue){
				Index = i;
			}
		}
		
		if(Index == -1){
			System.out.println("This is not in the Array!");
		} else {
			System.out.println(userValue + " is at index " + Index);
		}
						
		userInput.close();
	}
   
}
