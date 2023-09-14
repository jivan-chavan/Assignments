package pattern;



public class Pattern8 {

	public static void main(String[] args) {	
		pattern();
	}

	private static void pattern() {
		
		int rows = 5;
		int asciiNumber = 65;

		for(int i=rows; i>0; i--) {

			for(int j=0; j<i; j++) {

				char c=(char) asciiNumber;
				System.out.print(c+" ");
				asciiNumber++;
			}
			System.out.println();
		}
		
	}

}
