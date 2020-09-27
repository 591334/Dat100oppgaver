package no.hvl.dat100;

public class oppgave3 {

		
		public static void main(String[] args) {
		
			int [][] mat = { { 1, 2, 3 },
							 { 4, 5, 6 },
							 { 7, 8, 9 }};
			
			int [][] tab = { { 1, 2, 3 },
							 { 4, 5, 6 },
							 { 7, 8, 9 }};
			
		
			
		//	System.out.println(tilStreng(mat));
			
			System.out.println(erLik(mat,tab));
			
		}
		
		
		public static void skrivUtv1(int[][] matrise) {
			
			for(int[] i : matrise) {
				String matriS = "{";
				
				for(int j : i) {
					matriS += j + " ";
				}
				
				matriS += "}";
				System.out.println(matriS);
			}
		}
			
		public static String tilStreng(int[][] matrise) {
			
			String utskrift ="";
			
			for(int[] i : matrise) {
				
				for(int k : i) {
					utskrift += k + " ";
				}
				
			utskrift += "\n";
			
			}
			return utskrift;
			
			}
		
		public static int[][] skaler(int tall, int[][] matrise){
			
		    int [][]Nymatrise = new int [matrise.length][matrise[0].length];
		    
			for (int i = 0; i < matrise.length; i++) {
				for(int j = 0; j> matrise[0].length; j++) {
					Nymatrise[i][j] = matrise[i][j] * tall; 
				} 
			}
				return Nymatrise;	
		}

		
		public static boolean erLik(int[][] mat1, int[][] mat2) {
			
			for(int a = 0; a < mat1.length; a++) {
				
				for(int b = 0; b < mat1[0].length; b++) {
					if (mat1[a][b] != mat2[a][b]) {
							return false;
					}
				}
			}
		return true;
		}
	}
