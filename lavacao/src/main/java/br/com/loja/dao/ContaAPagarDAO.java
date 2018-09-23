package br.com.loja.dao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import br.com.loja.entity.ContaAPagarEntity;
import br.com.loja.interfaces.IAssinaturaDAO;

@ApplicationScoped
public class ContaAPagarDAO implements Serializable, IAssinaturaDAO<ContaAPagarEntity>  {

	private static final long serialVersionUID = 7684757931282924292L;

	private DaoGenerico<ContaAPagarEntity> dao = new DaoGenerico<ContaAPagarEntity>(ContaAPagarEntity.class);
	
	@Override
	public void adiciona(ContaAPagarEntity t) {
		dao.adiciona(t);
	}
	
	@Override
	public void update(ContaAPagarEntity t) {
		dao.update(t);
	}
  
	@Override
	public void remove(ContaAPagarEntity t) {
		dao.remove(t);
	}

	@Override
	public ContaAPagarEntity recuperaById(Long id) {
		return dao.buscaPorId(id);
	}

	public List<ContaAPagarEntity> recuperaItensOrdenado() {
		return dao.recuperaItensOrdenado("nome");
	}


	@Override
	public List<ContaAPagarEntity> recuperaTodos() {
		return dao.getAll();
	}

	@Override
	public List<ContaAPagarEntity> recuperaItensOrdenado(String parametroOrdenado) {
		return dao.recuperaItensOrdenado(parametroOrdenado);
	}

	@Override
	public List<ContaAPagarEntity> recuperaItem(String valorARecuperar, String parametro) {
		return dao.recuperaItem(valorARecuperar, parametro);
	}

	@Override
	public List<ContaAPagarEntity> recuperaPorData(Date inicio, Date fim, String nomeColuna) {
		return dao.recuperaPorData(inicio, fim, nomeColuna);
	}

}
