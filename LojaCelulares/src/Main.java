public class Main {
	public static void main(String[] args) { 
		
	Produto zenPhone = new Produto();
	zenPhone.setCusto(20);
	
	Apple iPhone11 = new Apple();
	iPhone11.setCusto(20);
	
	int porcentagem = 15;
	
	zenPhone.calcularVenda(porcentagem);
	iPhone11.calcularVenda(porcentagem);
	
	System.out.println("Produto Genérico: " + zenPhone.getCusto());
	System.out.println("Capuccino: " + iPhone11.getCusto());
}
	
}