
public class Convertisseur {

	public static void main(String[] args) {

		// -------------------------------------------------------------------------
		// Conversion d'un string en entier : Convertir strMaVariable en iMaVariable
		// -------------------------------------------------------------------------

		String strMaVariable = "22";
		int iMaVariable;

		// 

		iMaVariable = Integer.parseInt(strMaVariable);
		System.out.println("" + iMaVariable);

		// ---------------------------------------------------------------------------
		// Conversion d'un entier en String : Convertir iMaVariable2 en strMaVariable2
		// ---------------------------------------------------------------------------

		int iMaVariable2 = 10;
		String strMaVariable2;

		strMaVariable2 = Integer.toString(iMaVariable2);
		System.out.println(strMaVariable2);
	}
}
