package questao4;

public class Main {

	public static void main(String[] args) {
		VIP vip = new VIP();
		Normal normal = new Normal();
		CamaroteInferior ci = new CamaroteInferior();
		CamaroteSuperior cs = new CamaroteSuperior();
		
		vip.imprimeValor();
		normal.imprimeValor();
		System.out.println(ci.toString());
		cs.imprimeValor();
	}

}
