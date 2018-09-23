package br.com.loja.dao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import br.com.loja.entity.OrdemServicoEntity;
import br.com.loja.interfaces.IAssinaturaDAO;

@ApplicationScoped
public class OrdemServicoDAO implements Serializable, IAssinaturaDAO<OrdemServicoEntity>  {

	private static final long serialVersionUID = 7684757931282924292L;

	private DaoGenerico<OrdemServicoEntity> dao = new DaoGenerico<OrdemServicoEntity>(OrdemServicoEntity.class);
	
	@Override
	public void adiciona(OrdemServicoEntity t) {
		dao.adiciona(t);
	}
	
	@Override
	public void update(OrdemServicoEntity t) {
		dao.update(t);
	}
  
	@Override
	public void remove(OrdemServicoEntity t) {
		dao.remove(t);
	}

	@Override
	public OrdemServicoEntity recuperaById(Long id) {
		return dao.buscaPorId(id);
	}

	public List<OrdemServicoEntity> recuperaItensOrdenado() {
		return dao.recuperaItensOrdenado("nome");
	}


	@Override
	public List<OrdemServicoEntity> recuperaTodos() {
		return dao.getAll();
	}

	@Override
	public List<OrdemServicoEntity> recuperaItensOrdenado(String parametroOrdenado) {
		return dao.recuperaItensOrdenado(parametroOrdenado);
	}

	@Override
	public List<OrdemServicoEntity> recuperaItem(String valorARecuperar, String parametro) {
		return dao.recuperaItem(valorARecuperar, parametro);
	}

	@Override
	public List<OrdemServicoEntity> recuperaPorData(Date inicio, Date fim, String nomeColuna) {
		return dao.recuperaPorData(inicio, fim, nomeColuna);
	}

}
