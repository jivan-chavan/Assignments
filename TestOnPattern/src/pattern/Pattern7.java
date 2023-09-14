package pattern;



public class Pattern7 {

	public static void main(String[] args) {
	
		pattern();
	}

	private static void pattern() {
		int rows=5;
		for(int i=rows; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}

}
