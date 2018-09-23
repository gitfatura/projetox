package br.com.loja.bo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.loja.dao.CategoriaDAO;
import br.com.loja.entity.CategoriaEntity;
import br.com.loja.interfaces.IAssinaturaBO;

@ApplicationScoped
public class CategoriaBO implements Serializable, IAssinaturaBO<CategoriaEntity> {

	private static final long serialVersionUID = 3859369554332546009L;

	@Inject
	private CategoriaDAO categoriaDAO;

	@Override
	public void adiciona(CategoriaEntity t) {
		categoriaDAO.adiciona(t);
	}

	@Override
	public void update(CategoriaEntity t) {
		categoriaDAO.update(t);
	}

	@Override
	public void remove(CategoriaEntity t) {
		categoriaDAO.remove(t);
	}

	@Override
	public CategoriaEntity recuperaById(Long id) {
		return categoriaDAO.recuperaById(id);
	}

	@Override
	public List<CategoriaEntity> recuperaTodos() {
		return categoriaDAO.recuperaTodos();
	}

	@Override
	public List<CategoriaEntity> recuperaItensOrdenado(String parametroOrdenado) {
		return categoriaDAO.recuperaItensOrdenado(parametroOrdenado);
	}

	@Override
	public List<CategoriaEntity> recuperaItem(String valorARecuperar, String parametro) {
		return categoriaDAO.recuperaItem(valorARecuperar, parametro);
	}

	@Override
	public List<CategoriaEntity> recuperaPorData(Date inicio, Date fim, String nomeColuna) {
		return categoriaDAO.recuperaPorData(inicio, fim, nomeColuna);
	}

}
