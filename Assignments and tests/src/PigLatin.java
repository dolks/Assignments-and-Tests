class PigLatin {
	public static void main(String[] args) {
		String word=IO.readString();
		translate(word);
	}
	public static String translate(String original) {
		original=original.toLowerCase();
		if (original.startsWith("a") ||
			original.startsWith("e") ||
			original.startsWith("i") ||
			original.startsWith("o") ||
			original.startsWith("u") ) {
			original=original + "way";
			IO.outputStringAnswer(original);
			return original;
			}
		else {
			original=original.substring(1) + original.charAt(0) + "ay";
			IO.outputStringAnswer(original);
			return original;
		}
	}
}
