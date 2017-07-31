package br.com.brasilprev.validators;

import br.com.brasilprev.negocio.Contato;

public class EmailValidator implements Validacao{

	Validacao proxima;
	
	@Override
	public Boolean valida(Contato contato) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setProxima(Validacao validacao) {
		
	}

}
