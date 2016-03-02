public class WordCount {
	public static void main(String[] args) {
		String s=IO.readString();
		int min =IO.readInt();
		countWords(s, min);
	}
	public static int countWords(String original, int minLength){
		int total=0;
		if (minLength<=0){
			System.out.println("Minimum length must be greater than 0.");
			return total;
		}
		else {
			original+=" ";
			while (original.length()>1){
				int numberOfNonLetters=0;
				for (int i=0; i<original.substring(0, original.indexOf(" ")).length(); i++){
					if (!(Character.isLetter((original.substring(0, original.indexOf(" "))).charAt(i)))){
						numberOfNonLetters++;
					}
				}
				if ((original.substring(0, original.indexOf(" "))).length()-numberOfNonLetters>=minLength) {
					total ++;
				}
				original=original.substring(original.indexOf(" ")+1);
			}
			IO.outputIntAnswer(total);
			return total;
		}
	}
}