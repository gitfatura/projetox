package br.com.loja.bo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.loja.dao.ProdutoDAO;
import br.com.loja.entity.ProdutoEntity;
import br.com.loja.interfaces.IAssinaturaBO;

@ApplicationScoped
public class ProdutoBO implements Serializable, IAssinaturaBO<ProdutoEntity> {

	private static final long serialVersionUID = 3859369554332546009L;

	@Inject
	private ProdutoDAO produtoDAO;

	@Override
	public void adiciona(ProdutoEntity t) {
		produtoDAO.adiciona(t);
	}

	@Override
	public void update(ProdutoEntity t) {
		produtoDAO.update(t);
	}

	@Override
	public void remove(ProdutoEntity t) {
		produtoDAO.remove(t);
	}

	@Override
	public ProdutoEntity recuperaById(Long id) {
		return produtoDAO.recuperaById(id);
	}

	@Override
	public List<ProdutoEntity> recuperaTodos() {
		return produtoDAO.recuperaTodos();
	}

	@Override
	public List<ProdutoEntity> recuperaItensOrdenado(String recuperaItensOrdenado) {
		return produtoDAO.recuperaItensOrdenado(recuperaItensOrdenado);
	}

	@Override
	public List<ProdutoEntity> recuperaItem(String valorARecuperar, String parametro) {
		return produtoDAO.recuperaItem(valorARecuperar, parametro);
	}

	@Override
	public List<ProdutoEntity> recuperaPorData(Date inicio, Date fim, String nomeColuna) {
		return produtoDAO.recuperaPorData(inicio, fim, nomeColuna);
	}

	
}
