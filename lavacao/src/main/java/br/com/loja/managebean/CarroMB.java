package br.com.loja.managebean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.loja.entity.CarroEntity;
import br.com.loja.entity.ClienteEntity;
import br.com.loja.interfaces.ICarroFacade;
import br.com.loja.interfaces.ICrudMB;

@ViewScoped
@Named
public class CarroMB implements Serializable,ICrudMB {

	private static final long serialVersionUID = 3819230534860340809L;

	@Inject
	private ICarroFacade carroFacade;
	
	@Inject
	private CarroEntity carro;
	
	@Inject
	private ClienteEntity cliente;
	
	private List<CarroEntity> carros;

	private List<ClienteEntity> clientes;
	
	@Override
	@PostConstruct
	public void inicializa() {
		carregaItem();
		recuperaClientes();
	}

	@Override
	public void novaIntancia() {
		this.carro = new CarroEntity();
	}
	
	@Override
	public void grava() {
		this.carroFacade.adiciona(this.carro);
		carregaItem();
		novaIntancia();
	}
	
	@Override
	public void update() {
		this.carroFacade.update(this.carro);
		carregaItem();
	}
	
	@Override
	public void remove() {
		this.carroFacade.remove(this.carro);
		carregaItem();
	}
	
	@Override
	public void carregaItem() {
		this.carros = carroFacade.recuperaItensOrdenado("modelo"); 
	}
	
	public void recuperaClientes() {
		this.clientes = carroFacade.recuperaClientes(); 
	}

	
	
	//=========================GETS SETS=========================//
	
	
	public CarroEntity getCarro() {
		return carro;
	}

	public void setCarro(CarroEntity carro) {
		this.carro = carro;
	}

	
	public ClienteEntity getCliente() {
		return cliente;
	}

	public void setCliente(ClienteEntity cliente) {
		this.cliente = cliente;
	}

	public List<CarroEntity> getCarros() {
		return carros;
	}
	
	public List<ClienteEntity> getClientes() {
		return clientes;
	}

	public void setClientes(List<ClienteEntity> clientes) {
		this.clientes = clientes;
	}

	public void setCarros(List<CarroEntity> carros) {
		this.carros = carros;
	}

}
