
public class ReverseWords {
	public static void main(String[] args){
			String str = IO.readString();
			String word = "";
			String result = "";
			String punct = "";
			
			
			// Checks for punctuation.
			if (str.charAt(str.length()-1)=='.' ||
					str.charAt(str.length()-1)=='?' ||
					str.charAt(str.length()-1)=='!'){
				punct = str.charAt(str.length()-1) + "";
				str = str.substring(0, str.indexOf(punct));
				
			}
			
			// Appends space character to mark end of string.
			str += " ";
			while (true){
				if (str.indexOf(" ")==-1){
					break;
				}
					word = str.substring(0, str.indexOf(" "));
					// Reverses word.
					for (int i = 0; i < (word.length()-1-i); i++){
						char temp = word.charAt(i);
						word = word.substring(0, i) + 
								word.substring(i, i+1).replace(word.charAt(i), word.charAt(word.length()-1-i)) +
								word.substring(i+1);
						word = word.substring(0, word.length()-1-i) +
								word.substring(word.length()-1-i, word.length()-i).replace(word.charAt(word.length()-1-i), temp) +
								word.substring(word.length()-i);
						}
					
				//Capitalizes first word (assuming the original string has correct capitalization).
				if (Character.isUpperCase(word.charAt(word.length()-1))){
					word = word.substring(0 , word.length()-1) + Character.toLowerCase(word.charAt(word.length()-1));
					word = Character.toUpperCase(word.charAt(0)) + word.substring(1);
				}
				// Resets string and adds word plus a space to result.
				str = str.substring(str.indexOf(" ")+1);
				result += (word + " ");
			}
			result = result.trim();
			System.out.println(result + punct);
		}	
	}


