package br.com.brasilprev.validators;

import br.com.brasilprev.negocio.Contato;

public class CpfValidator implements Validacao{

	private Validacao proxima;
	
	@Override
	public Boolean valida(Contato contato) {
		// TODO Auto-generated method stub
		if(true){
			return null;
		}else{
			return proxima.valida(contato);
		}
		
	}

	@Override
	public void setProxima(Validacao validacao) {
		this.proxima = validacao;
	}

}
