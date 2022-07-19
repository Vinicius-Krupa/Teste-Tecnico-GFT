package questao4;

public abstract class Ingresso {
	private float valor;

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public abstract void imprimeValor();
	
}
