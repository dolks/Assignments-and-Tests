
public class reverse {
	public static void main(String[] args){
		String s1 = "stuff";
		char[] s2 = new char[s1.length()];
		
		for (int i = 0; i < s1.length(); i++){
			s2[i] = s1.charAt(i);
		}
		
		for (int i = 0; i < s2.length/2; i ++){
			char temp = s2[i];
			s2[i] = s2[s2.length-1-i];
			s2[s2.length-1-i] = temp;
		}
		
		for (int i = 0; i < s2.length; i++){
			System.out.print(s2[i]);
		}
	}
}
