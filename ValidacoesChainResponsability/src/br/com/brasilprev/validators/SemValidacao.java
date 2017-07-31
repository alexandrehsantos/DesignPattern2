package br.com.brasilprev.validators;

import br.com.brasilprev.negocio.Contato;

public class SemValidacao implements Validacao{

	@Override
	public Boolean valida(Contato contato) {
		return true;
	}

	@Override
	public void setProxima(Validacao validacao) {
		
	}

}
