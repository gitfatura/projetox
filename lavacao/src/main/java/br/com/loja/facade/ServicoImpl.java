package br.com.loja.facade;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.loja.bo.CarroBO;
import br.com.loja.bo.ClienteBO;
import br.com.loja.bo.OrdemServicoBO;
import br.com.loja.bo.ServicoBO;
import br.com.loja.entity.CarroEntity;
import br.com.loja.entity.ClienteEntity;
import br.com.loja.entity.OrdemServicoEntity;
import br.com.loja.entity.ServicoEntity;
import br.com.loja.interfaces.IServicoFacade;

@ApplicationScoped
public class ServicoImpl implements Serializable, IServicoFacade {

	private static final long serialVersionUID = 4024055921733026871L;

	@Inject
	private ServicoBO servicoBO;
	
	@Inject
	private CarroBO carroBO;
	
	@Inject
	private ClienteBO clienteBO;
	
	@Inject
	private OrdemServicoBO ordemservicoBO;
	
	@Override
	public void adiciona(ServicoEntity servico) {
		servicoBO.adiciona(servico);
	}

	@Override
	public void update(ServicoEntity servico) {
		servicoBO.update(servico);
	}

	@Override
	public void remove(ServicoEntity servico) {
		servicoBO.remove(servico);
	}

	@Override
	public ServicoEntity recuperaById(Long id) {
		return servicoBO.recuperaById(id);
	}

	@Override
	public List<ServicoEntity> recuperaTodos() {
		return servicoBO.recuperaTodos();
	}

	@Override
	public List<ServicoEntity> recuperaItensOrdenado(String parametroOrdenado) {
		return servicoBO.recuperaItensOrdenado(parametroOrdenado);
	}

	@Override
	public List<ServicoEntity> recuperaItem(String valorARecuperar, String parametro) {
		return servicoBO.recuperaItem(valorARecuperar, parametro);
	}

	@Override
	public List<ServicoEntity> recuperaPorData(Date inicio, Date fim, String nomeColuna) {
		return servicoBO.recuperaPorData(inicio, fim, nomeColuna);
	}

	@Override
	public List<OrdemServicoEntity> recuperaOrdemServicos() {
		return ordemservicoBO.recuperaItensOrdenado("descricao");
	}

	@Override
	public List<CarroEntity> recuperaCarros() {
		return carroBO.recuperaItensOrdenado("modelo");
	}

	@Override
	public List<ClienteEntity> recuperaClientes() {
		return clienteBO.recuperaItensOrdenado("nome");
	}
	
}
