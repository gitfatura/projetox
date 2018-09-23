package br.com.loja.interfaces;

import java.util.Date;
import java.util.List;

import br.com.loja.entity.ClienteEntity;
import br.com.loja.entity.OrdemServicoEntity;
import br.com.loja.entity.ServicoEntity;

public interface IOrdemServicoFacade {
	
	public void adiciona(OrdemServicoEntity ordemServico);

	public void update(OrdemServicoEntity ordemServico);

	public void remove(OrdemServicoEntity ordemServico);

	public OrdemServicoEntity recuperaById(Long id);

	public List<OrdemServicoEntity> recuperaTodos();

	public List<OrdemServicoEntity> recuperaItensOrdenado(String parametroOrdenado);
	
	public List<ServicoEntity> recuperaServicos();
	
	public List<OrdemServicoEntity> recuperaItem(String valorARecuperar, String parametro);
	
	public List<OrdemServicoEntity> recuperaPorData(Date inicio, Date fim, String nomeColuna);

	public List<ClienteEntity> recuperaClientes();
	
	
	
	
}
