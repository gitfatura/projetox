package br.com.loja.bo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.loja.dao.OrcamentoDAO;
import br.com.loja.entity.OrcamentoEntity;
import br.com.loja.interfaces.IAssinaturaBO;

@ApplicationScoped
public class OrcamentoBO implements Serializable, IAssinaturaBO<OrcamentoEntity> {

	private static final long serialVersionUID = 3859369554332546009L;

	@Inject
	private OrcamentoDAO orcamentoDAO;

	@Override
	public void adiciona(OrcamentoEntity t) {
		orcamentoDAO.adiciona(t);
	}

	@Override
	public void update(OrcamentoEntity t) {
		orcamentoDAO.update(t);
	}

	@Override
	public void remove(OrcamentoEntity t) {
		orcamentoDAO.remove(t);
	}

	@Override
	public OrcamentoEntity recuperaById(Long id) {
		return orcamentoDAO.recuperaById(id);
	}

	@Override
	public List<OrcamentoEntity> recuperaTodos() {
		return orcamentoDAO.recuperaTodos();
	}

	@Override
	public List<OrcamentoEntity> recuperaItensOrdenado(String parametroOrdenado) {
		return orcamentoDAO.recuperaItensOrdenado(parametroOrdenado);
	}

	@Override
	public List<OrcamentoEntity> recuperaItem(String valorARecuperar, String parametro) {
		return orcamentoDAO.recuperaItem(valorARecuperar, parametro);
	}

	@Override
	public List<OrcamentoEntity> recuperaPorData(Date inicio, Date fim, String nomeColuna) {
		return orcamentoDAO.recuperaPorData(inicio, fim, nomeColuna);
	}

}
