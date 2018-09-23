package br.com.loja.facade;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.loja.bo.ClienteBO;
import br.com.loja.bo.OrdemServicoBO;
import br.com.loja.bo.ServicoBO;
import br.com.loja.entity.ClienteEntity;
import br.com.loja.entity.OrdemServicoEntity;
import br.com.loja.entity.ServicoEntity;
import br.com.loja.interfaces.IOrdemServicoFacade;

@ApplicationScoped
public class OrdemServicoImpl implements Serializable, IOrdemServicoFacade {

	private static final long serialVersionUID = 4024055921733026871L;

	@Inject
	private OrdemServicoBO ordemServicoBO;
	
	@Inject
	private ServicoBO servicoBO;

	@Inject
	private ClienteBO clienteBO;
	
	@Override
	public void adiciona(OrdemServicoEntity ordemServico) {
		ordemServicoBO.adiciona(ordemServico);
	}

	@Override
	public void update(OrdemServicoEntity ordemServico) {
		ordemServicoBO.update(ordemServico);
	}

	@Override
	public void remove(OrdemServicoEntity ordemServico) {
		ordemServicoBO.remove(ordemServico);
	}

	@Override
	public OrdemServicoEntity recuperaById(Long id) {
		return ordemServicoBO.recuperaById(id);
	}

	@Override
	public List<OrdemServicoEntity> recuperaTodos() {
		return ordemServicoBO.recuperaTodos();
	}

	@Override
	public List<OrdemServicoEntity> recuperaItensOrdenado(String parametroOrdenado) {
		return ordemServicoBO.recuperaItensOrdenado(parametroOrdenado);
	}

	@Override
	public List<OrdemServicoEntity> recuperaItem(String valorARecuperar, String parametro) {
		return ordemServicoBO.recuperaItem(valorARecuperar, parametro);
	}

	@Override
	public List<OrdemServicoEntity> recuperaPorData(Date inicio, Date fim, String nomeColuna) {
		return ordemServicoBO.recuperaPorData(inicio, fim, nomeColuna);
	}

	@Override
	public List<ServicoEntity> recuperaServicos() {
		return servicoBO.recuperaItensOrdenado("descricao");
	}

	@Override
	public List<ClienteEntity> recuperaClientes() {
		return clienteBO.recuperaItensOrdenado("nome");
	}

	
}
