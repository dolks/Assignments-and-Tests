public class pyramidr {
	public static void main(String[] args){
		System.out.println("Enter pyramid height:");
		int height=IO.readInt();
		if (height<=0) {
			IO.reportBadInput();
		}
		
		int stars, spaces;
		int currRow=1;
		for (currRow=1; currRow<=height; currRow++){
			stars=1;
			spaces=1;
			for (spaces=1; spaces<=(height-currRow); spaces++){
				System.out.print(" ");
				}
			for (stars=1; stars<=((2*currRow)-1); stars++) {
				System.out.print("*");
				}
			System.out.println();
		}

		
	}
}