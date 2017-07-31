package br.com.brasilprev.validators;

import br.com.brasilprev.negocio.Contato;

public interface Validacao {
	Boolean valida(Contato contato);
	void setProxima(Validacao validacao);
}
