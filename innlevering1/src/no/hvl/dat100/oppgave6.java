package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class oppgave6 {

	public static void main(String[] args) {
		
		 	int Tall1 = Integer.parseInt(showInputDialog("Skriv inn et tall"));
		 	
		 	int fakultet = 1; 
		 	
		 	if (Tall1 < 0) {
		 		showMessageDialog(null, "Ugyldig input");
		 	
		 	}
		 	else if (Tall1 == 1 || Tall1 == 0) {
		 		fakultet = 1;
		 	}
		 		
		 	else {
		 		for(int i = Tall1 ;i >= 1 ; i--) {
		 			fakultet *= i;
		 		}	
		 	}		 	
		 			showMessageDialog(null, "Fakultetet blir: " + fakultet);
		 	
		 		
	}
}
