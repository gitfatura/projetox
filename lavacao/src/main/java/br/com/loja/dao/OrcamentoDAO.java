package br.com.loja.dao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import br.com.loja.entity.OrcamentoEntity;
import br.com.loja.interfaces.IAssinaturaDAO;

@ApplicationScoped
public class OrcamentoDAO implements Serializable, IAssinaturaDAO<OrcamentoEntity>  {

	private static final long serialVersionUID = 7684757931282924292L;

	private DaoGenerico<OrcamentoEntity> dao = new DaoGenerico<OrcamentoEntity>(OrcamentoEntity.class);
	
	@Override
	public void adiciona(OrcamentoEntity t) {
		dao.adiciona(t);
	}
	
	@Override
	public void update(OrcamentoEntity t) {
		dao.update(t);
	}
  
	@Override
	public void remove(OrcamentoEntity t) {
		dao.remove(t);
	}

	@Override
	public OrcamentoEntity recuperaById(Long id) {
		return dao.buscaPorId(id);
	}

	public List<OrcamentoEntity> recuperaItensOrdenado() {
		return dao.recuperaItensOrdenado("nome");
	}


	@Override
	public List<OrcamentoEntity> recuperaTodos() {
		return dao.getAll();
	}

	@Override
	public List<OrcamentoEntity> recuperaItensOrdenado(String parametroOrdenado) {
		return dao.recuperaItensOrdenado(parametroOrdenado);
	}

	@Override
	public List<OrcamentoEntity> recuperaItem(String valorARecuperar, String parametro) {
		return dao.recuperaItem(valorARecuperar, parametro);
	}

	@Override
	public List<OrcamentoEntity> recuperaPorData(Date inicio, Date fim, String nomeColuna) {
		return dao.recuperaPorData(inicio, fim, nomeColuna);
	}

}
