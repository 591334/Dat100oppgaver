package no.hvl.dat100;

public class oppgave6 {
		
		public static void main(String[] args) {
			
			int[] tab = {1,2,3,4,5,6,7};
			
			int[] mat = {7,12,19,21,22,26,29};
			
			skrivUt(tab);
			
			System.out.println(tilStreng(tab));
			
			System.out.println(summer1(tab));
			
			System.out.println(summer2(tab));
			
			System.out.println(summer3(tab));
			
			System.out.println(finnesTall((tab), 8));
			
			skrivUt(reverser(tab));
			
			posisjonsTall(tab, 8);
			
			System.out.println(erSortert(tab));
			
			skrivUt(settSammen(mat,tab));
		}
		
		
		public static void skrivUt(int[] tabell) {
			for(int i = 0; i < tabell.length ; i++) {
				System.out.println(tabell[i] + " ");	
			}
		}

		public static String tilStreng(int[] tabell) {
			String text = "[" + tabell[0];
			for(int j = 1; j < tabell.length; j++) {
				text += "," + tabell[j];		
			}
			text += "]";
			return text;
		}
		
		public static int summer1(int[] tabell) {
			
			int sum = tabell[0];
			for( int k = 1; k <tabell.length ; k++) {
				sum += tabell[k];	
			}
			return sum; 
		}
		
		public static int summer2(int[] tabell) {
			
			int sum = 0; 
			int k = 0;
			while (k <tabell.length) {
				sum += tabell[k];
				k++;
			}
			return sum; 
		}

		public static int summer3(int[] tabell) {
			
			int sum = 0;
			for (int l : tabell) sum += l;
			
			return sum;
		}
		
		public static boolean finnesTall (int[] tabell, int tall) {
			
			for( int m = 0; m < tabell.length; m++) {
				
				if(tall == tabell[m]) return true;
						
			}
			return false; 
		}
		
		public static int posisjonsTall (int[]tabell, int tall) {
			for (int i = 0; i<tabell.length; i++) {
				if (tall==tabell[i]) return i;
			}
			return -1;
		}
		
		
		
		public static int[] reverser(int[] tabell) {
			
			int a = tabell.length;
			int[]revers = new int[a];
			for(int n = 0; n < revers.length; n++) {
				revers[n] = tabell[a-1-n];
				
			}
			return revers;
		}
		
		public static boolean erSortert (int[] tabell) {
			
			for(int i = 0; i <tabell.length-1; i++) {
				if( tabell[i+1] < tabell[i]) {
					return false;
				}
		
			}
			return true; 
			

		}
		
		public static int[] settSammen(int[] tabell1, int[] tabell2) {
			
			int a = tabell1.length + tabell2.length;
			int[] Nytabell = new int [a];
			for (int i = 0; i < a; i++) {
				if(i < tabell1.length) {
					Nytabell[i] = tabell1[i];
				} else {
					Nytabell[i] = tabell2[i-tabell1.length];
				}
			}
			return Nytabell;
		}
	}


