package h1;

public class H1_main {

	public static void main(String[] args) {
		int[] myArray = { 5, 6, 7, -10, 10 , 20, 100 };
		

		// int i wird initialisiert und hat den Wert Länge des Arrays - 1 um direkt den
		// letzten Wert anzusprechen. Anschließend wird von i 1 abgezogen um den
		// nächsten wert zu speichern

		for (int i = myArray.length - 1; i >= 0; i--) {
			System.out.print(myArray[i] + " ");
		}

	}

}
