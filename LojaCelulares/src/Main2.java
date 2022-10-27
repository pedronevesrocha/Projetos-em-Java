public class Main2 {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		produto1.inserirDados();
		produto1.calcularVenda(20);
		produto1.mostrar();
		
		Samsung Galaxy = new Samsung();
		Galaxy.setDescricaoProduto("Celular Galaxy s11");
		Galaxy.setCusto(2300);
		Xiaomi Redmi = new Xiaomi();
		Redmi.setFabricanteNome("Xiaomi");
		Redmi.setCusto(3000);
		Redmi.setCor("Preto");
		
		Motorola MotoG = new Motorola();
		MotoG.setDescricaoProduto("Celular motorola Moto G");
		MotoG.setFabricanteNumero(111);
	
		System.out.println("Descrição: " + Galaxy.getDescricaoProduto() + " Custo: " + Galaxy.getCusto());
		System.out.println("Custo: " + Redmi.getCusto() + " Fabricante: " + Redmi.getFabricanteNome() + " Cor: " + Redmi.getCor());
		System.out.println("Descrição: " + MotoG.getDescricaoProduto() + " Numero do fabricante: " + MotoG.getFabricanteNumero());

	}

}