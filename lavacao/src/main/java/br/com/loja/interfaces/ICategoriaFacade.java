package br.com.loja.interfaces;

import java.util.Date;
import java.util.List;

import br.com.loja.entity.CategoriaEntity;

public interface ICategoriaFacade {
	
	public void adiciona(CategoriaEntity categoria);

	public void update(CategoriaEntity categoria);

	public void remove(CategoriaEntity categoria);

	public CategoriaEntity recuperaById(Long id);

	public List<CategoriaEntity> recuperaTodos();

	public List<CategoriaEntity> recuperaItensOrdenado(String parametroOrdenado);
	
	public List<CategoriaEntity> recuperaItem(String valorARecuperar, String parametro);
	
	public List<CategoriaEntity> recuperaPorData(Date inicio, Date fim, String nomeColuna);
	
	
	
}
