public class Main2 {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		produto1.inserirDados();
		produto1.calcularVenda(20);
		produto1.mostrar();
		
		protetorSolar Nivea = new protetorSolar();
		Nivea.setDescricaoProduto("Protetor solar Nivea fator 50");
		Nivea.setCusto(20);
		soroFisiologico Sorine = new soroFisiologico();
		Sorine.setFabricanteNome("Pharmascience Laboratórios Ltda.");
		Sorine.setCusto(5);
		dorflex Dorflex = new dorflex();
		Dorflex.setDescricaoProduto("Relaxante muscular");
		Dorflex.setFabricanteNumero(11);
	
		System.out.println("Descrição: " + Nivea.getDescricaoProduto() + " Custo: " + Nivea.getCusto());
		System.out.println("Custo: " + Sorine.getCusto() + " Fabricante: " + Sorine.getFabricanteNome());
		System.out.println("Descrição: " + Dorflex.getDescricaoProduto() + " Numero do fabricante: " + Dorflex.getFabricanteNumero());

	}

}