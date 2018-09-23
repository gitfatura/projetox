package br.com.loja.as;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.loja.bo.ServicoBO;
import br.com.loja.entity.ServicoEntity;
import br.com.loja.interfaces.IAssinaturaAS;

@ApplicationScoped
public class ServicoAS implements Serializable, IAssinaturaAS<ServicoEntity> {

	private static final long serialVersionUID = 6129618031504662884L;

	@Inject
	private ServicoBO servicoBO;

	@Override
	public void adiciona(ServicoEntity t) {
		servicoBO.adiciona(t);
	}

	@Override
	public void update(ServicoEntity t) {
		servicoBO.update(t);
	}

	@Override
	public void remove(ServicoEntity t) {
		servicoBO.remove(t);
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
	public List<ServicoEntity> recuperaItensOrdenado(String recuperaItensOrdenado) {
		return servicoBO.recuperaItensOrdenado(recuperaItensOrdenado);
	}

	@Override
	public List<ServicoEntity> recuperaItem(String valorARecuperar, String parametro) {
		return servicoBO.recuperaItem(valorARecuperar, parametro);
	}

	@Override
	public List<ServicoEntity> recuperaPorData(Date inicio, Date fim, String nomeColuna) {
		return servicoBO.recuperaPorData(inicio, fim, nomeColuna);
	}
	
}
