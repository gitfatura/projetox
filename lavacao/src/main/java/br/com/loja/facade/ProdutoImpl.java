package br.com.loja.facade;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.loja.bo.ProdutoBO;
import br.com.loja.entity.ProdutoEntity;
import br.com.loja.interfaces.IProdutoFacade;

@ApplicationScoped
public class ProdutoImpl implements Serializable, IProdutoFacade {

	private static final long serialVersionUID = 4024055921733026871L;

	@Inject
	private ProdutoBO produtoBO;

	@Override
	public void adiciona(ProdutoEntity produto) {
		produtoBO.adiciona(produto);
	}

	@Override
	public void update(ProdutoEntity produto) {
		produtoBO.update(produto);
	}

	@Override
	public void remove(ProdutoEntity produto) {
		produtoBO.remove(produto);
	}

	@Override
	public ProdutoEntity recuperaById(Long id) {
		return produtoBO.recuperaById(id);
	}

	@Override
	public List<ProdutoEntity> recuperaTodos() {
		return produtoBO.recuperaTodos();
	}

	@Override
	public List<ProdutoEntity> recuperaItensOrdenado(String recuperaItensOrdenado) {
		return produtoBO.recuperaItensOrdenado(recuperaItensOrdenado);
	}

	@Override
	public List<ProdutoEntity> recuperaItem(String valorARecuperar, String parametro) {
		return produtoBO.recuperaItem(valorARecuperar, parametro);
	}

	@Override
	public List<ProdutoEntity> recuperaPorData(Date inicio, Date fim, String nomeColuna) {
		return produtoBO.recuperaPorData(inicio, fim, nomeColuna);
	}

}
