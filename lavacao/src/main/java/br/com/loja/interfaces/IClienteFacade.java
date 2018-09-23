package br.com.loja.interfaces;

import java.util.Date;
import java.util.List;

import br.com.loja.entity.ClienteEntity;

public interface IClienteFacade {

	public void adiciona(ClienteEntity cliente);

	public void update(ClienteEntity cliente);

	public void remove(ClienteEntity cliente);

	public ClienteEntity recuperaById(Long id);

	public List<ClienteEntity> recuperaTodos();
	
	public List<ClienteEntity> recuperaItensOrdenado(String recuperaItensOrdenado);
	
	public List<ClienteEntity> recuperaItem(String valorARecuperar, String parametro);
	
	public List<ClienteEntity> recuperaPorData(Date inicio, Date fim, String nomeColuna);
	
}
