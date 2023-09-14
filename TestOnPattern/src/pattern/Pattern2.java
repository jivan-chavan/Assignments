package pattern;



public class Pattern2 {

	public static void main(String[] args) {
	
		pattern();
	}

	private static void pattern() {
		
		int lastNumber = 6;
		int asciiNumber = 65;
		
		for(int i=0; i<lastNumber; i++) {
			for(int j=0; j<i+1; j++) {

				char c=(char) asciiNumber;
				System.out.print(c+" ");
				asciiNumber++;
			}
			System.out.println();
		}
		
	}

}
