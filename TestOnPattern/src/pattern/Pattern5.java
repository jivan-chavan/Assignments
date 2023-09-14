package pattern;



public class Pattern5 {

	public static void main(String[] args) {
	
		pattern();
	}

	private static void pattern() {
		int lastNumber=9;
		for(int i=1; i<lastNumber; i++) {
			for(int j=i-1; j>-1; j--) {
				System.out.print((int)Math.pow(2,j)+" ");
			}
			System.out.println();
		}
		
	}

}
