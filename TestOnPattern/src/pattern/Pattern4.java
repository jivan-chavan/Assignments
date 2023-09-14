package pattern;



public class Pattern4 {

	public static void main(String[] args) {
	
		pattern();
	}

	private static void pattern() {
		int lastNumber=6;
		for(int i=1; i<lastNumber; i++) {
			for(int j=i; j>0; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}
