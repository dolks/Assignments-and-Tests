
public class test {
	public static void main(String[] args){
		
		char[][] arr = new char[2][3];
		arr[1][0] = 'q';
		arr[1][1] = 'q';
		arr[1][2] = 'q';
		
		System.out.println(threeInACol(arr));
		System.out.println(arr[0][1]);
	}	
	
	public static boolean threeInACol(char[][] arra){
		for (int i = 0; i<arra.length; i++){
			int numOfQ = 0;
			
			for (int k = 0; k<arra[i].length; k++){
				if(arra[i][k]=='q'){
					numOfQ++;
				}
			}
			
			if (numOfQ==3){
				return true;
			}
		}
		return false;
	}
}

