package br.com.brasilprev.validators;

import br.com.brasilprev.negocio.Contato;

public class RealizadorDeValidacoes {
	
	public Boolean valida(Contato contato){
		CpfValidator v1 = new CpfValidator();
		EmailValidator v2 = new EmailValidator();
		
		v1.setProxima(v2);
		
		return v1.valida(contato);
	}
}
