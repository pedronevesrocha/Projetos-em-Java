import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Produto {
	private int codigo;
	private int fabricanteNumero;
	private String fabricanteNome;
	private String nomeProduto;
	private String descricaoProduto;
	private double custo;
	private int estoque;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getFabricanteNumero() {
		return fabricanteNumero;
	}
	public void setFabricanteNumero(int fabricanteNumero) {
		this.fabricanteNumero = fabricanteNumero;
	}
	public String getFabricanteNome() {
		return fabricanteNome;
	}
	public void setFabricanteNome(String fabricanteNome) {
		this.fabricanteNome = fabricanteNome;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getDescricaoProduto() {
		return descricaoProduto;
	}
	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}
	public double getCusto() {
		return custo;
	}
	public void setCusto(double custo) {
		this.custo = custo;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	public void inserirDados() {
		this.codigo = Integer.parseInt(JOptionPane.showInputDialog("Código: "));
		this.fabricanteNumero = Integer.parseInt(JOptionPane.showInputDialog("Número do Fabricante: "));
		this.fabricanteNome = JOptionPane.showInputDialog("Nome do Fabricante: ");
		this.nomeProduto = JOptionPane.showInputDialog("Nome do produto: ");
		this.descricaoProduto = JOptionPane.showInputDialog("Descrição do Produto: ");
		this.custo = Double.parseDouble(JOptionPane.showInputDialog("Custo: "));
		this.estoque = Integer.parseInt(JOptionPane.showInputDialog("Estoque: "));
	}
	public double calcularVenda(double valor) {
		this.custo += this.custo * valor / 100;
		return this.custo;
	}
	public void mostrar() {
		String mensagem = "Objeto Celular criado a partir da Classe Produto \n";
		mensagem += "\nCódigo: " + this.getCodigo();
		mensagem += "\nNúmero do Fabricante: " + this.getFabricanteNumero();
		mensagem += "\nNome do Fabricante: " + this.getFabricanteNome();
		mensagem += "\nNome do Produto: " + this.getNomeProduto();
		mensagem += "\nDescrição do Produto: " + this.getDescricaoProduto();
		NumberFormat formatar = DecimalFormat.getCurrencyInstance();
		mensagem += "\nCusto: " + formatar.format(this.getCusto());
		mensagem += "\nEstoque: " + this.getEstoque();
		
		
		JOptionPane.showMessageDialog(null, mensagem);
	}
}