package br.com.loja.managebean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.loja.entity.ClienteEntity;
import br.com.loja.interfaces.IClienteFacade;
import br.com.loja.interfaces.ICrudMB;

@ViewScoped
@Named
public class ClienteMB implements Serializable,ICrudMB {

	private static final long serialVersionUID = 3819230534860340809L;

	@Inject
	private ClienteEntity cliente;

	@Inject
	private IClienteFacade clienteFacade;

	private List<ClienteEntity> clientes;
	
	@Override
	@PostConstruct
	public void inicializa() {
		carregaItem();
	}

	@Override
	public void novaIntancia() {
		this.cliente = new ClienteEntity();
	}
	
	@Override
	public void grava() {
		clienteFacade.adiciona(this.cliente);
		novaIntancia();
	}

	@Override
	public void update() {
		this.clienteFacade.update(this.cliente);
		novaIntancia();
	}
	
	@Override
	public void remove() {
		this.clienteFacade.remove(this.cliente);
		novaIntancia();
	}
	
	@Override
	public void carregaItem() {
		this.clientes = clienteFacade.recuperaTodos();
	}

	// ===================== gets and sets =====================//

	
	public ClienteEntity getCliente() {return cliente;}

	public void setCliente(ClienteEntity cliente) {this.cliente = cliente;}

	public List<ClienteEntity> getClientes() {return clientes;}

	public void setClientes(List<ClienteEntity> clientes) {this.clientes = clientes;}

}
