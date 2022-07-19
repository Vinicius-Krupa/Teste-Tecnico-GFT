package questao4;

public class VIP extends Ingresso {
	private float adicional = 20.99f;
	
	public float getAdicional() {
		return adicional;
	}

	public void setAdicional(float adicional) {
		this.adicional = adicional;
	}
	@Override
	public void imprimeValor() {
		System.out.println("Valor Ingresso VIP R$  " + (this.getValor() + this.adicional));
	}
}
