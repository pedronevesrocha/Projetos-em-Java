
public class Apple extends Produto {
	private String modelo;
	private int anoFabricacao;
	private int versaoIos;
	private int armazenamento;
	private String cor;
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public int getVersaoIos() {
		return versaoIos;
	}
	public void setVersaoIos(int versaoIos) {
		this.versaoIos = versaoIos;
	}
	public int getArmazenamento() {
		return armazenamento;
	}
	public void setArmazenamento(int armazenamento) {
		this.armazenamento = armazenamento;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	@Override
	public double calcularVenda(double valor) {
		return super.calcularVenda(valor);
	}
	
	
}
