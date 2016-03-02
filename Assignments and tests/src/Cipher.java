
public class Cipher {
	public static void main(String[] args){
		System.out.println("Enter encoded string:");
		String encodedString=IO.readString().toLowerCase();
		String actualString="";
		for (int i=0; i<encodedString.length(); i++){
			if (encodedString.charAt(i)=='a'){
				actualString+='z';
			}
			else if(encodedString.charAt(i)==' '){
				actualString+=' ';
			}
			else if(!(Character.isLetter(encodedString.charAt(i)) || Character.isDigit(encodedString.charAt(i)))){
				actualString+=encodedString.charAt(i);
			}
			else {
				char precedingLetter= encodedString.charAt(i);
				precedingLetter--;
				actualString+=(precedingLetter);
			}
		}
		System.out.println(actualString);
	}
}
