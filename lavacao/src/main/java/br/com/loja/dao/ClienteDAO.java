package br.com.loja.dao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import br.com.loja.entity.ClienteEntity;
import br.com.loja.interfaces.IAssinaturaDAO;

@ApplicationScoped
public class ClienteDAO implements Serializable, IAssinaturaDAO<ClienteEntity>  {

	private static final long serialVersionUID = 7684757931282924292L;

	private DaoGenerico<ClienteEntity> dao = new DaoGenerico<ClienteEntity>(ClienteEntity.class);
	
	@Override
	public void adiciona(ClienteEntity t) {
		dao.adiciona(t);
	}
	
	@Override
	public void update(ClienteEntity t) {
		dao.update(t);
	}
  
	@Override
	public void remove(ClienteEntity t) {
		dao.remove(t);
	}

	@Override
	public ClienteEntity recuperaById(Long id) {
		return dao.buscaPorId(id);
	}

	public List<ClienteEntity> recuperaItensOrdenado() {
		return dao.recuperaItensOrdenado("nome");
	}


	@Override
	public List<ClienteEntity> recuperaTodos() {
		return dao.getAll();
	}

	@Override
	public List<ClienteEntity> recuperaItensOrdenado(String parametroOrdenado) {
		return dao.recuperaItensOrdenado(parametroOrdenado);
	}

	@Override
	public List<ClienteEntity> recuperaItem(String valorARecuperar, String parametro) {
		return dao.recuperaItem(valorARecuperar, parametro);
	}

	@Override
	public List<ClienteEntity> recuperaPorData(Date inicio, Date fim, String nomeColuna) {
		return dao.recuperaPorData(inicio, fim, nomeColuna);
	}
	
}
