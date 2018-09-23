package br.com.loja.bo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.loja.dao.ContaAPagarDAO;
import br.com.loja.entity.ContaAPagarEntity;
import br.com.loja.interfaces.IAssinaturaBO;

@ApplicationScoped
public class ContaAPagarBO implements Serializable, IAssinaturaBO<ContaAPagarEntity> {

	private static final long serialVersionUID = 3859369554332546009L;

	@Inject
	private ContaAPagarDAO contaDAO;

	@Override
	public void adiciona(ContaAPagarEntity t) {
		contaDAO.adiciona(t);
	}

	@Override
	public void update(ContaAPagarEntity t) {
		contaDAO.update(t);
	}

	@Override
	public void remove(ContaAPagarEntity t) {
		contaDAO.remove(t);
	}

	@Override
	public ContaAPagarEntity recuperaById(Long id) {
		return contaDAO.recuperaById(id);
	}

	@Override
	public List<ContaAPagarEntity> recuperaTodos() {
		return contaDAO.recuperaTodos();
	}

	@Override
	public List<ContaAPagarEntity> recuperaItensOrdenado(String parametroOrdenado) {
		return contaDAO.recuperaItensOrdenado(parametroOrdenado);
	}

	@Override
	public List<ContaAPagarEntity> recuperaItem(String valorARecuperar, String parametro) {
		return contaDAO.recuperaItem(valorARecuperar, parametro);
	}

	@Override
	public List<ContaAPagarEntity> recuperaPorData(Date inicio, Date fim, String nomeColuna) {
		return contaDAO.recuperaPorData(inicio, fim, nomeColuna);
	}

}
