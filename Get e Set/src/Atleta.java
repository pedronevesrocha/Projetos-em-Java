import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

// Encapsulamento: encapsular os dados de uma aplicação significa evitar que estes sofram acessos indevidos.
public class Atleta {
	//Atleta.java (classe representa um objeto)
	// Atributos/Variaveis são as caracteristicas do objeto.
	// Criação de atributos
			
	
	private int codigo;
	private String nome;
	private String esporte;
	private double valorPatrocinio;
	
	// Get e Set - Metodos Acessores (Source - Generate Getters and Setters
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEsporte() {
		return esporte;
	}

	public void setEsporte(String esporte) {
		this.esporte = esporte;
	}

	public double getValorPatrocinio() {
		return valorPatrocinio;
	}

	public void setValorPatrocinio(double valorPatrocinio) {
		this.valorPatrocinio = valorPatrocinio;
	}

	public  void inserirDados() {
		this.codigo = Integer.parseInt(JOptionPane.showInputDialog("Código: "));
		this.nome = JOptionPane.showInputDialog("Nome: ");
		this.esporte = JOptionPane.showInputDialog("Esporte: ");
		this.valorPatrocinio = Double.parseDouble(JOptionPane.showInputDialog("Valor do Patrocinio: "));
	}
	public void mostrar() {
		String mensagem = "Objeto Atleta criado a partir da Classe Atleta \n";
		mensagem += "\nCódigo: " + this.getCodigo();
		mensagem += "\nNome: " + this.getNome();
		mensagem += "\nEsporte: " + this.getEsporte();
		NumberFormat formatar = DecimalFormat.getCurrencyInstance();
		mensagem += "\nValor do Patrocinio: " + formatar.format(this.getValorPatrocinio());
		
		JOptionPane.showMessageDialog(null, mensagem);
	}
	public double atualizarValor(double taxa) {
		this.valorPatrocinio += this.valorPatrocinio* taxa / 100;
		return this.valorPatrocinio;
	}
	
}