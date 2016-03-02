
public class BinarySearch {
	
	public static void main(String[] args){
		int[] example = {1, 2, 5, 8, 15, 17, 50};
		Binarysearch(example, 50);
	}
	public static int Binarysearch(int[] arr, int x){
		int Left = 0;
		int Right = arr.length-1;
		while (Left<=Right){
			int Middle = ((Right+Left)/2);
			if (arr[Middle]==x){
				System.out.println(x + " has been found at index " + Middle);
				return Middle;
			}
			if (x<arr[Middle]){
				Right=Middle-1;
			}
			else {
				Left=Middle+1;
			}
		}
		
		System.out.println(x + " not found.");
		return -1;
	}
}
