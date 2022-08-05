package subsistema1.cep;

public class cepapi {

	private static cepapi instancia = new cepapi();

	private cepapi() {
		super();
	}

	public static cepapi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "São João Del Rei";
	}
	
	public String recuperarEstado(String cep) {
		return "MG";
	}
}
