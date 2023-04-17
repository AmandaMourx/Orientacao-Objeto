import java.util.Scanner;

public class CalcAreaPerim {

	public static void main(String[] args) {
		//USER MUST CHOOSE WICH FIGURE TO MAKE THE CALCULATION
		int figGeo = 0;
		
		Scanner sc = new Scanner(System.in);
		
		Start();
		figGeo = sc.nextInt();
		
		switch (figGeo) {
	    case 1:
	    	float lado;
	    	float area;
	    	float peri = 0;
	    	
	    	System.out.print("Informe o valor de um lado do quadrado: ");
	    	lado = sc.nextFloat();
	    	
	    	area = (float) Math.pow(lado, 2);
	    	peri = lado * 4;
	    	
	    	System.out.println("A área deste quadrado é igual a " + area);
	    	System.out.println("O perímetro deste quadrado é igual a " + peri);
	    	
	    	
	    break;
	    ////
	    
	    case 2:
	    	float larg;
	    	float altu;
	    	float area2;
	    	float peri2;
	    	
	    	System.out.print("Informe o valor da altura do retângulo: ");
	    	altu = sc.nextFloat();
	    	System.out.print("Informe o valor da largura do retângulo: ");
	    	larg = sc.nextFloat();
	    	
	    	area2 = altu * larg;
	    	peri2 = (altu + larg) * 2;
	    	
	    	System.out.println("A area deste retângulo é igual a " + area2);
	    	System.out.println("O perímetro deste retângulo é igual a " + peri2);
	    	
	    	
	    break;
	    ////
	    
	    case 3:
	    	float base;
	    	float altu2;
	    	float area3;
	    	float peri3;
	    	
	    	System.out.print("Informe o valor da base do triângulo retângulo: ");
	    	base = sc.nextFloat();
	    	System.out.print("Informe o valor da altura do triângulo retângulo: ");
	    	altu2 = sc.nextFloat();
	    	
	    	area3 = (altu2 * base)/2;
	    	
	    	float hipot = (float) Math.pow((Math.pow(base, 2) + (Math.pow(altu2, 2))), (1/2));  
	    	peri3 = altu2 + base + hipot;
	    	
	    	System.out.println("A área deste triângulo retângulo é igual a " + area3);
	    	System.out.println("O perímetro deste triângulo retângulo é igual a " + peri3);
	    	
	    	
	    break;
	    ////
	    
	    case 4:
	    	float baseMa;
	    	float baseMe;
	    	float altu3;
	    	float lado1;
	    	float lado2;
	    	float area4;
	    	float peri4;
	    	
	    	System.out.print("Informe o valor da base MAIOR do triângulo retângulo: ");
	    	baseMa = sc.nextFloat();
	    	System.out.print("Informe o valor da base MENOR do triângulo retângulo: ");
	    	baseMe = sc.nextFloat();
	    	System.out.print("Informe o valor da altura do triângulo retângulo: ");
	    	altu3 = sc.nextFloat();
	    	System.out.print("Informe o valor do primeiro lado do triângulo retângulo: ");
	    	lado1 = sc.nextFloat();
	    	System.out.print("Informe o valor do segundo lado do triângulo retângulo: ");
	    	lado2 = sc.nextFloat();
	    	
	    	area4 = ((baseMa + baseMe)*altu3)/2;
	    	
	    	peri4 = baseMa + baseMe + lado1 + lado2;
	    	
	    	System.out.println("A área deste trapézio é igual a " + area4);
	    	System.out.println("O perímetro deste trapézio é igual a " + peri4);
	    	
	    	
	    break;
	    
	    default:
	    	Start();
	    break;
	}
		sc.close();
	}

	private static void Start() {
		System.out.println("Com qual figura geométrica vamos trabalhar? ");
		System.out.println(" (1) Quadrado");
		System.out.println(" (2) Retângulo");
		System.out.println(" (3) Triângulo Retângulo");
		System.out.println(" (4) Trapézio");
		
	}

}
