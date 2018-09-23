package br.com.loja.dao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import br.com.loja.entity.UnidadesEntity;
import br.com.loja.interfaces.IAssinaturaDAO;

@ApplicationScoped
public class UnidadesDAO implements Serializable, IAssinaturaDAO<UnidadesEntity> {

	private static final long serialVersionUID = -5025515727647001849L;
	
	private DaoGenerico<UnidadesEntity> dao = new DaoGenerico<UnidadesEntity>(UnidadesEntity.class);
	
	@Override
	public void adiciona(UnidadesEntity t) {
		dao.adiciona(t);
	}

	@Override
	public void update(UnidadesEntity t) {
		dao.update(t);
	}

	@Override
	public void remove(UnidadesEntity t) {
		dao.remove(t);
	}

	@Override
	public UnidadesEntity recuperaById(Long id) {
		return dao.buscaPorId(id);
	}

	@Override
	public List<UnidadesEntity> recuperaTodos() {
		return dao.recuperaItensOrdenado("tipoUnidade");
	}

	@Override
	public List<UnidadesEntity> recuperaItensOrdenado(String parametroOrdenado) {
		return dao.recuperaItensOrdenado(parametroOrdenado);
	}

	@Override
	public List<UnidadesEntity> recuperaItem(String valorARecuperar, String parametro) {
		return dao.recuperaItem(valorARecuperar, parametro);
	}

	@Override
	public List<UnidadesEntity> recuperaPorData(Date inicio, Date fim, String nomeColuna) {
		return dao.recuperaPorData(inicio, fim, nomeColuna);
	}
	
}






