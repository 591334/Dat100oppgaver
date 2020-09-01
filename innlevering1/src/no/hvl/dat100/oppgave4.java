package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class oppgave4 {

	public static void main(String[] args) {
		
		int brutto = Integer.parseInt(showInputDialog("Skriv inn bruttoinntekt:"));
		
		int trinn1 = 164101;
		int trinn2 = 230951;
		int trinn3 = 580651;
		int trinn4 = 934051;
		
		if (brutto > trinn4) {
			double skatt = brutto * (double) 0.1452;	
			showMessageDialog(null, "Din inntekt er: " + brutto + " Kr" + " og skatten er " + skatt + " Kr," + " satsen er 14.52%");
		}
		else if (brutto > trinn3 ) {
			double skatt = brutto * (double) 0.1152;
			showMessageDialog(null, "Skattetrinn 3. Inntekten din er " + brutto + " Kr" + " og skatten er " + skatt + " Kr," + " satsen er 11.52%");
		}
		else if (brutto > trinn2 ) {
			double skatt = brutto * (double) 0.0241;
			showMessageDialog(null, "Skattetrinn 2. Inntekten din er " + brutto  + " Kr" + " og skatten er " + skatt + " Kr," + " satsen er 2.41%");
		}
		else if (brutto > trinn1 ) {
			double skatt = brutto * (double) 0.0093;
			showMessageDialog(null, "Skattetrinn 1. Inntekten din er " + brutto + " Kr" + " og skatten er " + skatt + " Kr," + " satsen er 0.93%");
		}
		else {
			showMessageDialog(null, "Skattetrinn 0 som gir ingen skatt. Inntekten din er " + brutto + " Kr");
		}
	}
}
