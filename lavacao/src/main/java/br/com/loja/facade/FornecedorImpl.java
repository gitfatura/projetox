package br.com.loja.facade;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.loja.bo.FornecedorBO;
import br.com.loja.entity.FornecedorEntity;
import br.com.loja.interfaces.IFornecedorFacade;

@ApplicationScoped
public class FornecedorImpl implements Serializable, IFornecedorFacade{

	private static final long serialVersionUID = 6351645955633350912L;
	
	@Inject
	private FornecedorBO fornecedorBO;
	
	@Override
	public void adiciona(FornecedorEntity t) {
		fornecedorBO.adiciona(t);
	}

	@Override
	public void update(FornecedorEntity t) {
		fornecedorBO.update(t);
	}

	@Override
	public void remove(FornecedorEntity t) {
		fornecedorBO.remove(t);
	}

	@Override
	public FornecedorEntity recuperaById(Long id) {
		return fornecedorBO.recuperaById(id);
	}

	@Override
	public List<FornecedorEntity> recuperaTodos() {
		return fornecedorBO.recuperaTodos();
	}

	@Override
	public List<FornecedorEntity> recuperaItensOrdenado(String recuperaItensOrdenado) {
		return fornecedorBO.recuperaItensOrdenado(recuperaItensOrdenado);
	}

	@Override
	public List<FornecedorEntity> recuperaItem(String valorARecuperar, String parametro) {
		return fornecedorBO.recuperaItem(valorARecuperar, parametro);
	}

	@Override
	public List<FornecedorEntity> recuperaPorData(Date inicio, Date fim, String nomeColuna) {
		return fornecedorBO.recuperaPorData(inicio, fim, nomeColuna);
	}

}
