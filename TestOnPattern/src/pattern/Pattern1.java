package pattern;



public class Pattern1 {

	public static void main(String[] args) {
	
		pattern();
	}

	private static void pattern() {
		int rows=5;
		for(int i=0; i<rows; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
