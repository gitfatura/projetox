package br.com.loja.managebean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.loja.entity.CarroEntity;
import br.com.loja.entity.ClienteEntity;
import br.com.loja.entity.OrdemServicoEntity;
import br.com.loja.entity.ServicoEntity;
import br.com.loja.interfaces.ICarroFacade;
import br.com.loja.interfaces.ICrudMB;
import br.com.loja.interfaces.IOrdemServicoFacade;
import br.com.loja.types.Avaria;
import br.com.loja.types.Finalizado;

@ViewScoped
@Named
public class OrdemServicoMB implements Serializable, ICrudMB {

	private static final long serialVersionUID = 3819230534860340809L;

	@Inject
	private OrdemServicoEntity ordemServico;
	@Inject
	private ServicoEntity servico;
	@Inject
	private ClienteEntity cliente;
	@Inject
	private CarroEntity carro;
	@Inject
	private IOrdemServicoFacade ordemServicoFacade;

	@Inject
	private ICarroFacade carroFacade;
	private List<OrdemServicoEntity> lOrdemServicos;
	private BigDecimal valorServico;
	private List<CarroEntity> lCarrosPorClientes;
	private List<OrdemServicoEntity> ordemServicos;
	private List<ServicoEntity> servicos;
	private List<ServicoEntity> listaServicos = new ArrayList<ServicoEntity>();
	private List<ClienteEntity> clientes;
	
	@Override
	@PostConstruct
	public void inicializa() {
		carregaItem();
		recuperaServicos();
		recuperaClientes();
	}
	
	public void calculaServico() {
		for (OrdemServicoEntity umServico : lOrdemServicos) {
			valorServico = valorServico.add(umServico.getServico().getValor());
		}
	}

	public void adicionaOs() {
		OrdemServicoEntity os = new OrdemServicoEntity();
		if (lOrdemServicos == null) {
			lOrdemServicos = new ArrayList<>();
		}
		os.setCliente(ordemServico.getCliente());
		os.setServico(ordemServico.getServico());
		os.setServico(ordemServico.getServico());
		os.setCarro(ordemServico.getCarro());
		os.setFinalizado(ordemServico.getFinalizado());
		os.setAvaria(ordemServico.getAvaria());
		os.setObservacao(ordemServico.getObservacao());
		lOrdemServicos.add(os);
		ordemServico = new OrdemServicoEntity();
		
	}
	
	public void carregaLista() {
		
	}
	
	public void recuperaCarroPorCliente() {
		lCarrosPorClientes = carroFacade.recuperaCarroPorCliente(this.ordemServico.getCliente());
	}

	@Override
	public void novaIntancia() {
		this.ordemServico = new OrdemServicoEntity();
	}

	@Override
	public void grava() {
		for (OrdemServicoEntity umaOs : lOrdemServicos) {
			this.ordemServicoFacade.adiciona(umaOs);
		}
	}

	@Override
	public void update() {
		this.ordemServicoFacade.update(this.ordemServico);
	}

	@Override
	public void remove() {
		this.ordemServicoFacade.remove(this.ordemServico);
	}

	@Override
	public void carregaItem() {
		this.ordemServicos = ordemServicoFacade.recuperaTodos();
	}

	public void recuperaServicos() {
		this.servicos = ordemServicoFacade.recuperaServicos();
	}

	public void recuperaClientes() {
		this.clientes = ordemServicoFacade.recuperaClientes();
	}

	public Avaria[] getAvarias() {
		return Avaria.values();
	}

	public Finalizado[] getFinalizados() {
		return Finalizado.values();
	}

	// =========================GETS SETS=========================//

	public CarroEntity getCarro() {
		return carro;
	}

	public void setCarro(CarroEntity carro) {
		this.carro = carro;
	}

	public OrdemServicoEntity getOrdemServico() {
		return ordemServico;
	}

	public void setOrdemServico(OrdemServicoEntity ordemServico) {
		this.ordemServico = ordemServico;
	}

	public List<OrdemServicoEntity> getOrdemServicos() {
		return ordemServicos;
	}

	public void setOrdemServicos(List<OrdemServicoEntity> ordemServicos) {
		this.ordemServicos = ordemServicos;
	}

	public ServicoEntity getServico() {
		return servico;
	}

	public void setServico(ServicoEntity servico) {
		this.servico = servico;
	}

	public List<ServicoEntity> getServicos() {
		return servicos;
	}

	public void setServicos(List<ServicoEntity> servicos) {
		this.servicos = servicos;
	}

	public ClienteEntity getCliente() {
		return cliente;
	}

	public void setCliente(ClienteEntity cliente) {
		this.cliente = cliente;
	}

	public List<ClienteEntity> getClientes() {
		return clientes;
	}

	public void setClientes(List<ClienteEntity> clientes) {
		this.clientes = clientes;
	}

	public List<ServicoEntity> getListaServicos() {
		return listaServicos;
	}

	public void setListaServicos(List<ServicoEntity> listaServicos) {
		this.listaServicos = listaServicos;
	}

	public List<CarroEntity> getlCarrosPorClientes() {
		return lCarrosPorClientes;
	}

	public void setlCarrosPorClientes(List<CarroEntity> lCarrosPorClientes) {
		this.lCarrosPorClientes = lCarrosPorClientes;
	}

	public List<OrdemServicoEntity> getlOrdemServicos() {
		return lOrdemServicos;
	}

	public void setlOrdemServicos(List<OrdemServicoEntity> lOrdemServicos) {
		this.lOrdemServicos = lOrdemServicos;
	}

	public BigDecimal getValorServico() {
		return valorServico;
	}

	public void setValorServico(BigDecimal valorServico) {
		this.valorServico = valorServico;
	}

}
