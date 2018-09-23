package br.com.loja.managebean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.loja.entity.FornecedorEntity;
import br.com.loja.interfaces.ICrudMB;
import br.com.loja.interfaces.IFornecedorFacade;

@ViewScoped
@Named
public class FornecedorMB implements Serializable,ICrudMB {

	private static final long serialVersionUID = 3819230534860340809L;

	@Inject
	private FornecedorEntity fornecedor;

	@Inject
	private IFornecedorFacade fornecedorFacade;

	private List<FornecedorEntity> fornecedores;

	@PostConstruct
	@Override
	public void inicializa() {
		carregaItem();
	}

	@Override
	public void novaIntancia() {
		this.fornecedor = new FornecedorEntity();
	}
	
	@Override
	public void grava() {
		this.fornecedorFacade.adiciona(this.fornecedor);
		carregaItem();
		novaIntancia();
	}
	
	@Override
	public void remove() {
		this.fornecedorFacade.remove(this.fornecedor);
		carregaItem();
		novaIntancia();
	}
	
	public void update() {
		this.fornecedorFacade.update(this.fornecedor);
		carregaItem();
		novaIntancia();
	}

	@Override
	public void carregaItem() {
		this.fornecedores = fornecedorFacade.recuperaItensOrdenado("nome");
	}

	// ===================== gets and sets =====================//

	public FornecedorEntity getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(FornecedorEntity fornecedor) {
		this.fornecedor = fornecedor;
	}

	public List<FornecedorEntity> getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(List<FornecedorEntity> fornecedores) {
		this.fornecedores = fornecedores;
	}

}
