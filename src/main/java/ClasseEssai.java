public class ClasseEssai {
   /**
    * retourne la factorielle d'une valeure
    * @param pfX valeur a mettre en factorielle
    * @return entier factorielle de la valeur en pf
    */
	public static int factorielle(int pfX) {
		int r;

		r = 0;
		if (pfX == 0 || pfX == 1) {
			r = 1;
		} else {
			r = pfX * factorielle(pfX - 1);
		}
		return r;
	}

	public static void main(String[]  argv) {

		int val, res;

		val = 2;  
		res = ClasseEssai.factorielle(val);
		System.out.println("Pour " + val + " : " + res);
		val = 5;
		res = ClasseEssai.factorielle(val);
		System.out.println("Pour " + val + " : " + res);
		val = 10;
		res = ClasseEssai.factorielle(val);
		System.out.println("Pour " + val + " : " + res);
	}
}
