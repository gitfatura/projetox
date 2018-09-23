package br.com.loja.dao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import br.com.loja.entity.CategoriaEntity;
import br.com.loja.interfaces.IAssinaturaDAO;

@ApplicationScoped
public class CategoriaDAO implements Serializable, IAssinaturaDAO<CategoriaEntity> {

	private static final long serialVersionUID = -5025515727647001849L;
	
	private DaoGenerico<CategoriaEntity> dao = new DaoGenerico<CategoriaEntity>(CategoriaEntity.class);
	
	@Override
	public void adiciona(CategoriaEntity t) {
		dao.adiciona(t);
	}

	@Override
	public void update(CategoriaEntity t) {
		dao.update(t);
	}

	@Override
	public void remove(CategoriaEntity t) {
		dao.remove(t);
	}

	@Override
	public CategoriaEntity recuperaById(Long id) {
		return dao.buscaPorId(id);
	}

	@Override
	public List<CategoriaEntity> recuperaTodos() {
		return dao.recuperaItensOrdenado("descricao");
	}

	@Override
	public List<CategoriaEntity> recuperaItensOrdenado(String parametroOrdenado) {
		return dao.recuperaItensOrdenado(parametroOrdenado);
	}

	@Override
	public List<CategoriaEntity> recuperaItem(String valorARecuperar, String parametro) {
		return dao.recuperaItem(valorARecuperar, parametro);
	}

	@Override
	public List<CategoriaEntity> recuperaPorData(Date inicio, Date fim, String nomeColuna) {
		return dao.recuperaPorData(inicio, fim, nomeColuna);
	}
	
	
}






