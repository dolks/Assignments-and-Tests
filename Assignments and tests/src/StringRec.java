public class StringRec
{
	// DO NOT DECLARE ANY VARIABLES HERE
	// (you may declare local variables inside methods)

	public static String decompress(String compressedText)
	{
		if (Character.isLetter(compressedText.charAt(0))==true){
			if (compressedText.length()>1 && compressedText.charAt(1)!=compressedText.charAt(0)){
				
				return compressedText.charAt(0) + decompress(compressedText.substring(1));
			}
			else {
				return printNTimes(compressedText.charAt(0), 1);
			}
		}
		else {
			return printNTimes(compressedText.charAt(1), (compressedText.charAt(0)-'0')-1) + decompress(compressedText.substring(1));
		}
	}
	
	public static void main(String[] args){
		System.out.print(decompress("q9w5e2rt5y4qw2Er3T"));
	}
	
	public static String printNTimes(char a, int x){
		if (x==1){
			return a + "";
		}
		return (a + printNTimes(a, x-1));
	}
}
