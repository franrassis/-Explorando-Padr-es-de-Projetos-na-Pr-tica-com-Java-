package estudos.gof.facade;

public class facade {
    import subsistema1.crm.crmservice;
import subsistema2.cep.cepapi;

public class Facade {

	public void migrarCliente(String nome, String cep) {
		String cidade = cepapi.getInstancia().recuperarCidade(cep);
		String estado = cepapi.getInstancia().recuperarEstado(cep);
		
		crmservice.gravarCliente(nome, cep, cidade, estado);
	}
}
