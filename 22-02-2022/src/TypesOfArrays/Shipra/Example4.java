package TypesOfArrays.Shipra;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter the text here : ");
			
			String text = scanner.nextLine();
			char[] arr = text.toCharArray();
			
			 for(int i=arr.length-1;i>=0;i--)
	    {
	        System.out.print(arr[i]);
	    }
	}

}
