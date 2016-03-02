
public class Titles {
	public static void main(String[] args){
		String title1=IO.readString();
		String title2=IO.readString();
		String title3=IO.readString();
		String[] bookTitles= {title1, title2, title3};
		String[] abcOrderTitles= new String[3];
		for (int i=0; i<bookTitles.length; i++){
			if (bookTitles[i].substring(0,3).equalsIgnoreCase("the")){
				if (bookTitles[i].substring(4).charAt(0)==bookTitles[i+1].charAt(0)){
					for (int k=0; k<bookTitles[i].substring(4).length(); k++){
						
					}
				}
				else if(bookTitles[i].substring(4).charAt(0)<bookTitles[i+1].charAt(0)){
					abcOrderTitles[i]=bookTitles[i];
				}
				else {
					abcOrderTitles[i]=bookTitles[i+1];
				}
			}
		}
	}
}
