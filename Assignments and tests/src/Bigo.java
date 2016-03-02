import java.util.Random;

public class Bigo {
	public static void main(String[] args){
		// Linear Search.
		Random rand = new Random();
		
		int[] arr1 = new int[6];
		for (int i=0; i<arr1.length; i++){
			arr1[i]=rand.nextInt(10);
			System.out.println(arr1[i]);
		}
		
		
		
		System.out.println("What number are you searching for?");
		int target=IO.readInt();
		
		for (int i=0; i<arr1.length; i++){
			if (arr1[i]==target){
				System.out.println("Target found at index " + i);
				return;
			}
		}
		System.out.println("Target not found.");
	}
}
