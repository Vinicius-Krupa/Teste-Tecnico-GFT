package questao4;

public class CamaroteSuperior extends VIP {
	private float valorAdicional = 50f;
	
	public float getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(float valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	@Override
	public void imprimeValor() {
		System.out.println("Valor R$  " + (this.getValor() + this.getAdicional() + this.valorAdicional));
	}
}
