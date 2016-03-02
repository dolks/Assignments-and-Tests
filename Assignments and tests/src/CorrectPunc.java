
public class CorrectPunc {
	
	public static void main(String[] args){
		System.out.println(correctPunc("     yO what's   up   ?"));
	}
	
	public static String correctPunc(String str){
		str = str.trim();
		
		// Capitalizes first word of sentence.
		if (!(Character.isUpperCase(str.charAt(0)))){ 
			str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
		}
		
		
		 // Turns any lower case i's into their upper case counterpart. 
		for (int i = 0; i < str.length(); i++){
			if (str.charAt(i)=='i' && i == 0 && str.charAt(1)==' '){
				str = str.substring(0,1).replace('i', 'I') + str.substring(1);
			}
			
			else if (str.charAt(i)=='i' && i != (str.length()-1) && str.charAt(i-1)==' ' &&
					str.charAt(i+1)==' '){
				str = str.substring(0,i) + str.substring(i, i+1).replace('i', 'I') +
						str.substring(i+1);
			}
			else if (str.charAt(i)=='i' && i == (str.length()-1) && str.charAt(i-1) == ' '){
				str = str.substring(0,i) + str.substring(i).replace('i', 'I');
			}
		}
		
		/*
		 * Replaces any upper case letters in the string with lower case ones unless the character is
		 * an I by itself.
		 */
		for (int i = 0; i < str.length(); i++){
			if (str.charAt(i) != 'I' && i != 0 && Character.isUpperCase(str.charAt(i))){
				str = str.substring(0, i) + 
						str.substring(i, i+1).replace(str.charAt(i), Character.toLowerCase(str.charAt(i))) +
						str.substring(i+1);
			}
			
			else if(str.charAt(i)=='I' && i != 0 && (str.charAt(i-1) != ' ' || str.charAt(i+1) != ' ')){
				str = str.substring(0, i) + 
						str.substring(i, i+1).replace(str.charAt(i), Character.toLowerCase(str.charAt(i))) +
						str.substring(i+1);
			}
		}
		
		
		 // Adds punctuation if necessary.
		if (!(str.substring(str.length()-1).equals(".") ||
				str.substring(str.length()-1).equals("?") ||
				str.substring(str.length()-1).equals("!"))){
			str+=".";
		}
		
		// Removes unnecessary spaces between words and punctuation.
		for (int i = 0; i < str.length()-1; i++){
			if (str.charAt(i)==' ' && str.charAt(i+1)==' '){
				str = str.substring(0, i) + str.substring(i+1);
				i--;
			}
		}
		
		/*
		 * The above code always leaves one space between the string and the punctuation. The below code
		 * simply removes this space.
		 */
		if (str.charAt(str.length()-2)==' '){
			str = str.substring(0, (str.length()-2)) + str.substring(str.length()-1);
		}
		
		return str;
	}

}
