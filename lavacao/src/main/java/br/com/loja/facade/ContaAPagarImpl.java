package br.com.loja.facade;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.loja.bo.ContaAPagarBO;
import br.com.loja.entity.ContaAPagarEntity;
import br.com.loja.interfaces.IContaAPagarFacade;

@ApplicationScoped
public class ContaAPagarImpl implements Serializable, IContaAPagarFacade {

	private static final long serialVersionUID = 4024055921733026871L;

	@Inject
	private ContaAPagarBO contaBO;

	@Override
	public void adiciona(ContaAPagarEntity conta) {
		contaBO.adiciona(conta);
	}

	@Override
	public void update(ContaAPagarEntity conta) {
		contaBO.update(conta);
	}

	@Override
	public void remove(ContaAPagarEntity conta) {
		contaBO.remove(conta);
	}

	@Override
	public ContaAPagarEntity recuperaById(Long id) {
		return contaBO.recuperaById(id);
	}

	@Override
	public List<ContaAPagarEntity> recuperaTodos() {
		return contaBO.recuperaTodos();
	}

	@Override
	public List<ContaAPagarEntity> recuperaItensOrdenado(String parametroOrdenado) {
		return contaBO.recuperaItensOrdenado(parametroOrdenado);
	}

	@Override
	public List<ContaAPagarEntity> recuperaItem(String valorARecuperar, String parametro) {
		return contaBO.recuperaItem(valorARecuperar, parametro);
	}

	@Override
	public List<ContaAPagarEntity> recuperaPorData(Date inicio, Date fim, String nomeColuna) {
		return contaBO.recuperaPorData(inicio, fim, nomeColuna);
	}

	
}
