package br.com.loja.bo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.loja.dao.OrdemServicoDAO;
import br.com.loja.entity.OrdemServicoEntity;
import br.com.loja.interfaces.IAssinaturaBO;

@ApplicationScoped
public class OrdemServicoBO implements Serializable, IAssinaturaBO<OrdemServicoEntity> {

	private static final long serialVersionUID = 3859369554332546009L;

	@Inject
	private OrdemServicoDAO ordemServicoDAO;

	@Override
	public void adiciona(OrdemServicoEntity t) {
		ordemServicoDAO.adiciona(t);
	}

	@Override
	public void update(OrdemServicoEntity t) {
		ordemServicoDAO.update(t);
	}

	@Override
	public void remove(OrdemServicoEntity t) {
		ordemServicoDAO.remove(t);
	}

	@Override
	public OrdemServicoEntity recuperaById(Long id) {
		return ordemServicoDAO.recuperaById(id);
	}

	@Override
	public List<OrdemServicoEntity> recuperaTodos() {
		return ordemServicoDAO.recuperaTodos();
	}

	@Override
	public List<OrdemServicoEntity> recuperaItensOrdenado(String parametroOrdenado) {
		return ordemServicoDAO.recuperaItensOrdenado(parametroOrdenado);
	}

	@Override
	public List<OrdemServicoEntity> recuperaItem(String valorARecuperar, String parametro) {
		return ordemServicoDAO.recuperaItem(valorARecuperar, parametro);
	}

	@Override
	public List<OrdemServicoEntity> recuperaPorData(Date inicio, Date fim, String nomeColuna) {
		return ordemServicoDAO.recuperaPorData(inicio, fim, nomeColuna);
	}

}
