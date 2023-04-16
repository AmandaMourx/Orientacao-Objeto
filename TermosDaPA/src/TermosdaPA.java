import java.util.Arrays;
import java.util.Scanner;

public class TermosdaPA {
	
	
	
	public static void main(String[] args) {
		
		int n = 0;

		int r = 0;
		int A0 = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos valores da PA você deseja calcular? ");
		n = sc.nextInt();
		System.out.println("Qual será o valor de r da sua PA? ");
		r = sc.nextInt();
		System.out.println("Qual será o valor do primeiro termo da sua PA? ");
		A0 = sc.nextInt();
		sc.close();
		
		AllPA(n, r, A0);
		
		
		
	}

	private static void AllPA(int n, int r, int A0) {
		
		int PA[];
		
		PA = ImprimirPA(n, r, A0);
		
		String intArrayAsString = Arrays.toString(PA);
		System.out.println("Essa PA é desenvolvida assim: " + intArrayAsString);
		
		
		if(acharPares(PA) > 0) {
			System.out.println("Nessa PA há " + acharPares(PA) + " números pares.");
		}
		
		if(acharImpares(PA) > 0){
			System.out.println("Nessa PA há " + acharImpares(PA) + " números impares.");
		}
		
		if(acharPares(PA)<0 && acharImpares(PA)<0) {
			System.out.println("SOMETHING GOT WRONG");
		}
		
	}

	private static int[] ImprimirPA(int n, int r, int a0) {
		// TODO Auto-generated method stub
		
		int i=0;
		int[] termosPA;
		termosPA = new int[n]; //vetor da PA criada
		
		while(i<n) {
			termosPA[i] = (int) (a0 + r*i);
			
			i += 1;
		}
		
		return termosPA;
		
	}

	private static int acharPares(int[] termosPA) {
		int quantPares=0;
		int i;
		
		for(i=0; i<termosPA.length; i++) {
			if((termosPA[i] % 2) == 0 ) {
				quantPares++;
			}
		}
		
		
		return quantPares;
	}
	
	private static int acharImpares(int[] termosPA) {
		int quantImpares=0;
		int i;
		
		for(i=0; i<termosPA.length; i++) {
			if((termosPA[i] % 2) == 0 ) {
				quantImpares++;
			}
		}
		
		
		return quantImpares;
	}
}
