package br.com.loja.bo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.loja.dao.ClienteDAO;
import br.com.loja.entity.ClienteEntity;
import br.com.loja.interfaces.IAssinaturaBO;

@ApplicationScoped
public class ClienteBO implements Serializable, IAssinaturaBO<ClienteEntity> {

	private static final long serialVersionUID = 3859369554332546009L;

	@Inject
	private ClienteDAO clienteDAO;

	@Override
	public void adiciona(ClienteEntity t) {
		clienteDAO.adiciona(t);
	}

	@Override
	public void update(ClienteEntity t) {
		clienteDAO.update(t);
	}

	@Override
	public void remove(ClienteEntity t) {
		clienteDAO.remove(t);
	}

	@Override
	public ClienteEntity recuperaById(Long id) {
		return clienteDAO.recuperaById(id);
	}

	@Override
	public List<ClienteEntity> recuperaTodos() {
		return clienteDAO.recuperaTodos();
	}

	@Override
	public List<ClienteEntity> recuperaItensOrdenado(String parametroOrdenado) {
		return clienteDAO.recuperaItensOrdenado(parametroOrdenado);
	}

	@Override
	public List<ClienteEntity> recuperaItem(String valorARecuperar, String parametro) {
		return clienteDAO.recuperaItem(valorARecuperar, parametro);
	}

	@Override
	public List<ClienteEntity> recuperaPorData(Date inicio, Date fim, String nomeColuna) {
		return clienteDAO.recuperaPorData(inicio, fim, nomeColuna);
	}

}
