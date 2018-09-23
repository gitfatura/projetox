package br.com.loja.managebean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.loja.entity.CarroEntity;
import br.com.loja.entity.ContaAPagarEntity;
import br.com.loja.interfaces.IContaAPagarFacade;
import br.com.loja.interfaces.ICrudMB;

@ViewScoped
@Named
public class ContaAPagarMB implements Serializable,ICrudMB {

	private static final long serialVersionUID = 3819230534860340809L;

	@Inject
	private IContaAPagarFacade contaFacade;
	
	@Inject
	private ContaAPagarEntity contaApagar;
	
	private List<CarroEntity> contas;

	@Override
	@PostConstruct
	public void inicializa() {
		carregaItem();
	}

	@Override
	public void novaIntancia() {
		this.contaApagar = new ContaAPagarEntity();
	}
	
	@Override
	public void grava() {
		this.contaFacade.adiciona(this.contaApagar);
		carregaItem();
		novaIntancia();
	}
	
	@Override
	public void update() {
		this.contaFacade.update(this.contaApagar);
		carregaItem();
		novaIntancia();
	}
	
	@Override
	public void remove() {
		this.contaFacade.adiciona(this.contaApagar);
		carregaItem();
		novaIntancia();
	}
	
	@Override
	public void carregaItem() {
		this.contaFacade.recuperaItensOrdenado("descricao");
	}

	//=========================GETS SETS=========================//
	
	public ContaAPagarEntity getContaApagar() {
		return contaApagar;
	}

	public void setContaApagar(ContaAPagarEntity contaApagar) {
		this.contaApagar = contaApagar;
	}

	public List<CarroEntity> getContas() {
		return contas;
	}

	public void setContas(List<CarroEntity> contas) {
		this.contas = contas;
	}

}
