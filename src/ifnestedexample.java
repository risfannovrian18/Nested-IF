public class ifnestedexample {
	public static void main(String[] args) {
		int umur=17;
		boolean hamil=false;
		if(umur>=18) {
			if(hamil==false) {
				System.out.println ("Vaksin AstraZeneca");
			} else {
				System.out.println("Vaksin Sinovac");
				System.out.println("Vaksin Sinovac");
				System.out.println("Vaksin Sinovac");
			}
		} else {
			System.out.println("Vaksin Sinovac");
		}

	}

}
