package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class oppgave5 {

	public static void main(String[] args) {
		
		for (int Elevnr = 1; Elevnr <=10; Elevnr++)
		
		{
			
		String Text1 = showInputDialog("Poengsum: ");
			int Poengsum = Integer.parseInt(Text1);
			
			String karakter = "0";
			
			if(Poengsum > 0 && Poengsum <= 39)
				karakter = "F";
			
			else if(Poengsum > 39 && Poengsum <= 49)
				karakter = "E";
			
			else if(Poengsum > 49 && Poengsum <= 59)
				karakter = "D";
			
			else if(Poengsum > 59 && Poengsum <= 79)
				karakter = "C";
			
			else if(Poengsum > 79 && Poengsum <= 89)
				karakter = "B";
			
			else if(Poengsum > 89 && Poengsum <= 100)
				karakter = "A";
			
			else if(Poengsum >100 || Poengsum < 0)
				showMessageDialog(null, "Ugyldig poengsum, prøv på nytt");
			 
				if(Poengsum >100 || Poengsum < 0)
					Elevnr--; 
					
				else {
			showMessageDialog(null, "Karakter: " + karakter);
			
				}
		
		
		}
	
	}
}
