package br.com.loja.facade;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.loja.bo.ClienteBO;
import br.com.loja.entity.ClienteEntity;
import br.com.loja.interfaces.IClienteFacade;

@ApplicationScoped
public class ClienteImpl implements Serializable, IClienteFacade {

	private static final long serialVersionUID = 4024055921733026871L;

	@Inject
	private ClienteBO clienteBO;

	@Override
	public void adiciona(ClienteEntity cliente) {
		clienteBO.adiciona(cliente);
	}

	@Override
	public void update(ClienteEntity cliente) {
		clienteBO.update(cliente);
	}

	@Override
	public void remove(ClienteEntity cliente) {
		clienteBO.remove(cliente);
	}

	@Override
	public ClienteEntity recuperaById(Long id) {
		return clienteBO.recuperaById(id);
	}

	@Override
	public List<ClienteEntity> recuperaTodos() {
		return clienteBO.recuperaTodos();
	}

	@Override
	public List<ClienteEntity> recuperaItensOrdenado(String parametroOrdenado) {
		return clienteBO.recuperaItensOrdenado(parametroOrdenado);
	}

	@Override
	public List<ClienteEntity> recuperaItem(String valorARecuperar, String parametro) {
		return clienteBO.recuperaItem(valorARecuperar, parametro);
	}

	@Override
	public List<ClienteEntity> recuperaPorData(Date inicio, Date fim, String nomeColuna) {
		return clienteBO.recuperaPorData(inicio, fim, nomeColuna);
	}

}
