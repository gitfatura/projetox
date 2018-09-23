package br.com.loja.managebean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.loja.entity.CarroEntity;
import br.com.loja.entity.ClienteEntity;
import br.com.loja.entity.ServicoEntity;
import br.com.loja.interfaces.ICrudMB;
import br.com.loja.interfaces.IServicoFacade;

@ViewScoped
@Named
public class ServicoMB implements Serializable, ICrudMB {

	private static final long serialVersionUID = 3819230534860340809L;

	@Inject
	private ServicoEntity servico;
	
	@Inject
	private CarroEntity carro;

	@Inject
	private ClienteEntity cliente;
	
	@Inject
	private IServicoFacade servicoFacade;

	private List<ServicoEntity> servicos;
	private List<CarroEntity> carros;
	private List<ClienteEntity> clientes;
	
	
	@Override
	@PostConstruct
	public void inicializa() {
		carregaItem();
		recuperaCarros();
		recuperaClientes();
	}

	@Override
	public void novaIntancia() {
		this.servico = new ServicoEntity();
	}

	@Override
	public void grava() {
		this.servicoFacade.adiciona(this.servico);
		novaIntancia();
		carregaItem();
	}

	@Override
	public void update() {
		this.servicoFacade.update(this.servico);
		carregaItem();
	}

	@Override
	public void remove() {
		this.servicoFacade.remove(this.servico);
		carregaItem();
	}

	@Override
	public void carregaItem() {
		this.servicos = servicoFacade.recuperaItensOrdenado("descricao");
	}

	public void recuperaCarros() {
		this.carros = servicoFacade.recuperaCarros();
	}
	
	public void recuperaClientes() {
		this.clientes = servicoFacade.recuperaClientes();
	}

	
	// =========================GETS SETS=========================//
	
	public ServicoEntity getServico() {
		return servico;
	}

	public void setServico(ServicoEntity servico) {
		this.servico = servico;
	}

	
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

	public List<ServicoEntity> getServicos() {
		return servicos;
	}

	public List<CarroEntity> getCarros() {
		return carros;
	}


	public List<ClienteEntity> getClientes() {
		return clientes;
	}
	
}
