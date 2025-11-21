package h2;

public class H2_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int n = 151231;
		int zahl = n;
		int temp = n;
		int digits = 0;
		int index = array.length - 1;

		// Ermittlung der Digitanzahl
		if (temp == 0) { digits = 1; }
		else { while (temp != 0) {
			temp = temp /10;
			digits ++;

		}
		
		System.out.println (digits);
		
		while (zahl !=0 && index >= 0) {
			array [index] = zahl % 10; // extrahiert letzte Zahl und speichert diese im letzten array weil index= array.length -1
			zahl /= 10; // Entfernt letzte Zahl
			index --; // Rückt im array eine Position nach links
			
		}
		
		System.out.print("Array:  ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
	}
	}
}
