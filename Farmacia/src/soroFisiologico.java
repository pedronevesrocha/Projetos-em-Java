
public class soroFisiologico extends Produto {
	private int quantidade;
	private String indicação;
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getIndicação() {
		return indicação;
	}
	public void setIndicação(String indicação) {
		this.indicação = indicação;
	}
	@Override
	public double calcularVenda(double valor) {
		return super.calcularVenda(valor);
	}
}
