package br.com.loja.managebean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.loja.entity.ProdutoEntity;
import br.com.loja.interfaces.ICrudMB;
import br.com.loja.interfaces.IProdutoFacade;

@ViewScoped
@Named
public class ProdutoMB implements Serializable, ICrudMB {

	private static final long serialVersionUID = 3819230534860340809L;

	@Inject
	private ProdutoEntity produto;

	private List<ProdutoEntity> produtos;

	@Inject
	private IProdutoFacade produtoFacade;

	@PostConstruct
	public void carregaProdutos() {
		carregaItem();
	}


	@Override
	public void grava() {
		this.produtoFacade.adiciona(produto);
	}

	@Override
	public void remove() {
		this.produtoFacade.remove(produto);
	}

	@Override
	public void inicializa() {
		this.produtoFacade.recuperaItensOrdenado("descricao");
	}

	@Override
	public void novaIntancia() {
		this.produto = new ProdutoEntity();
	}

	@Override
	public void update() {
		this.produtoFacade.update(this.produto);
	}

	@Override
	public void carregaItem() {
		this.produtoFacade.recuperaItensOrdenado("descricao");
	}

	
	
	// ========================GETS SETS========================//
	
	
	public ProdutoEntity getProduto() {
		return produto;
	}

	public void setProduto(ProdutoEntity produto) {
		this.produto = produto;
	}

	public List<ProdutoEntity> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<ProdutoEntity> produtos) {
		this.produtos = produtos;
	}

}
