package bubbleSort;

import java.util.*;




public class BubbleSortApp {

	public static void main(String[] args) {
		
		ArrayBubble arr;
		Scanner kb = new Scanner(System.in);
		int size = 0;
		System.out.println("How many input do you want to enter: ");
		size = kb.nextInt();
		int[] userInput = new int[size];
		

		arr = new ArrayBubble(size);
      
	    for(int i=0; i < userInput.length ; i++){
	       System.out.println("Enter number " + (i+1) + " : ");
	       userInput[i] = kb.nextInt(); 
	       arr.insert(userInput[i]);
	    }
      arr.display();
      arr.bubbleSort();
      arr.display();
      System.out.println("Completed!!!");

   }
}