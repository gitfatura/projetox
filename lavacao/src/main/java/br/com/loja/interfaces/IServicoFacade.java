package br.com.loja.interfaces;

import java.util.Date;
import java.util.List;

import br.com.loja.entity.CarroEntity;
import br.com.loja.entity.ClienteEntity;
import br.com.loja.entity.OrdemServicoEntity;
import br.com.loja.entity.ServicoEntity;

public interface IServicoFacade {

	public void adiciona(ServicoEntity servico);

	public void update(ServicoEntity servico);

	public void remove(ServicoEntity servico);

	public ServicoEntity recuperaById(Long id);

	public List<ServicoEntity> recuperaTodos();
	
	public List<ServicoEntity> recuperaItensOrdenado(String recuperaItensOrdenado);
	
	public List<OrdemServicoEntity> recuperaOrdemServicos();
	
	public List<ServicoEntity> recuperaItem(String valorARecuperar, String parametro);
	
	public List<ServicoEntity> recuperaPorData(Date inicio, Date fim, String nomeColuna);

	public List<CarroEntity> recuperaCarros();

	public List<ClienteEntity> recuperaClientes();
	
}
