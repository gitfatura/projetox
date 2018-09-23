package br.com.loja.interfaces;

import java.util.Date;
import java.util.List;

import br.com.loja.entity.ProdutoEntity;

public interface IProdutoFacade {

public void adiciona(ProdutoEntity produto);
	
	public void update(ProdutoEntity produto);

	public void remove(ProdutoEntity produto);

	public ProdutoEntity recuperaById(Long id);

	public List<ProdutoEntity> recuperaTodos();
	
	public List<ProdutoEntity> recuperaItensOrdenado(String recuperaItensOrdenado);
	
	public List<ProdutoEntity> recuperaItem(String valorARecuperar, String parametro);
	
	public List<ProdutoEntity> recuperaPorData(Date inicio, Date fim, String nomeColuna);
	

}
