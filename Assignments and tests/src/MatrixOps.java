public class MatrixOps
{
	public static double[][] multiply(double[][] matrix1, double[][] matrix2)
	{
		if (matrix1.length!=matrix2[1].length){
			System.out.println("Matrices cannot be multiplied.");
			return null;
		}
		else {
			double[][] answerMatrix= new double[matrix1[1].length][matrix2[1].length];
			for (int i=0; i<answerMatrix.length; i++){
				for (int k=0; k<answerMatrix[i].length; k++){
					answerMatrix[i][k]=((matrix1[i][k]*matrix2[i][k])+(matrix1[i][k+1]*matrix2[i+1][k]));
				}
			}
			return answerMatrix;
		}
	
	}
}