package br.com.loja.dao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import br.com.loja.entity.ServicoEntity;
import br.com.loja.interfaces.IAssinaturaDAO;

@ApplicationScoped
public class ServicoDAO implements Serializable, IAssinaturaDAO<ServicoEntity>  {

	private static final long serialVersionUID = 7684757931282924292L;

	private DaoGenerico<ServicoEntity> dao = new DaoGenerico<ServicoEntity>(ServicoEntity.class);
	
	@Override
	public void adiciona(ServicoEntity t) {
		dao.adiciona(t);
	}
	
	@Override
	public void update(ServicoEntity t) {
		dao.update(t);
	}
  
	@Override
	public void remove(ServicoEntity t) {
		dao.remove(t);
	}

	@Override
	public ServicoEntity recuperaById(Long id) {
		return dao.buscaPorId(id);
	}

	public List<ServicoEntity> recuperaItensOrdenado() {
		return dao.recuperaItensOrdenado("nome");
	}


	@Override
	public List<ServicoEntity> recuperaTodos() {
		return dao.getAll();
	}

	@Override
	public List<ServicoEntity> recuperaItensOrdenado(String parametroOrdenado) {
		return dao.recuperaItensOrdenado(parametroOrdenado);
	}

	@Override
	public List<ServicoEntity> recuperaItem(String valorARecuperar, String parametro) {
		return dao.recuperaItem(valorARecuperar, parametro);
	}

	@Override
	public List<ServicoEntity> recuperaPorData(Date inicio, Date fim, String nomeColuna) {
		return dao.recuperaPorData(inicio, fim, nomeColuna);
	}

}
