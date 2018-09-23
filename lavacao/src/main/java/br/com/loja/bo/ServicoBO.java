package br.com.loja.bo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.loja.dao.ServicoDAO;
import br.com.loja.entity.ServicoEntity;
import br.com.loja.interfaces.IAssinaturaBO;

@ApplicationScoped
public class ServicoBO implements Serializable, IAssinaturaBO<ServicoEntity> {

	private static final long serialVersionUID = 3859369554332546009L;

	@Inject
	private ServicoDAO servicoDAO;

	@Override
	public void adiciona(ServicoEntity t) {
		servicoDAO.adiciona(t);
	}

	@Override
	public void update(ServicoEntity t) {
		servicoDAO.update(t);
	}

	@Override
	public void remove(ServicoEntity t) {
		servicoDAO.remove(t);
	}

	@Override
	public ServicoEntity recuperaById(Long id) {
		return servicoDAO.recuperaById(id);
	}

	@Override
	public List<ServicoEntity> recuperaTodos() {
		return servicoDAO.recuperaTodos();
	}

	@Override
	public List<ServicoEntity> recuperaItensOrdenado(String recuperaItensOrdenado) {
		return servicoDAO.recuperaItensOrdenado(recuperaItensOrdenado);
	}

	@Override
	public List<ServicoEntity> recuperaItem(String valorARecuperar, String parametro) {
		return servicoDAO.recuperaItem(valorARecuperar, parametro);
	}

	@Override
	public List<ServicoEntity> recuperaPorData(Date inicio, Date fim, String nomeColuna) {
		return servicoDAO.recuperaPorData(inicio, fim, nomeColuna);
	}

	
}
