public class Main {
	public static void main(String[] args) { 
		
	Produto Tandrilax = new Produto();
	Tandrilax.setCusto(20);
	
	desvenlafaxina Deller = new desvenlafaxina();
	Deller.setCusto(20);
	
	int porcentagem = 15;
	
	Tandrilax.calcularVenda(porcentagem);
	Deller.calcularVenda(porcentagem);
	
	System.out.println("Tandrilax: " + Tandrilax.getCusto());
	System.out.println("Deller: " + Deller.getCusto());
}
	
}