package br.com.loja.dao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import br.com.loja.entity.ProdutoEntity;
import br.com.loja.interfaces.IAssinaturaDAO;

@ApplicationScoped
public class ProdutoDAO implements Serializable, IAssinaturaDAO<ProdutoEntity> {

	private static final long serialVersionUID = 7684757931282924292L;

	private DaoGenerico<ProdutoEntity> dao = new DaoGenerico<ProdutoEntity>(ProdutoEntity.class);

	@Override
	public void adiciona(ProdutoEntity t) {
		dao.adiciona(t);
	}

	@Override
	public void update(ProdutoEntity t) {
		dao.update(t);
	}

	@Override
	public void remove(ProdutoEntity t) {
		dao.remove(t);
	}

	@Override
	public ProdutoEntity recuperaById(Long id) {
		return dao.buscaPorId(id);
	}

	@Override
	public List<ProdutoEntity> recuperaTodos() {
		return dao.getAll();
	}

	@Override
	public List<ProdutoEntity> recuperaItensOrdenado(String parametroOrdenado) {
		return dao.recuperaItensOrdenado(parametroOrdenado);
	}

	@Override
	public List<ProdutoEntity> recuperaItem(String valorARecuperar, String parametro) {
		return dao.recuperaItem(valorARecuperar, parametro);
	}

	@Override
	public List<ProdutoEntity> recuperaPorData(Date inicio, Date fim, String nomeColuna) {
		return dao.recuperaPorData(inicio, fim, nomeColuna);
	}

}
