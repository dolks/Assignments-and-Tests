
public class bigo2 {
	public static void main(String[] args){
		int[][] grades={
				{90, 80, 70, 80, 80, 100},
				{60, 50, 50 , 60, 70, 60},
				{60, 60, 90, 90, 100, 100},
				{90, 90, 100, 100, 100, 100},
				{70, 80, 70, 60, 50, 50}
		};
		int lowestGrade;
		int sum;
		double average=0;
		for (int i=0; i<grades.length; i++){
			sum=0;
			lowestGrade=101;
			for (int k=0; k<grades[i].length; k++){
				if (grades[i][k]<lowestGrade){
					lowestGrade=grades[i][k];
				}
				else {
					sum+=grades[i][k];
				}
			}
			average=sum/5;
			if (average>=70){
				System.out.println("Student " + (i+1) + " has passed with an average of " + average);
			}
		}
	}
}
