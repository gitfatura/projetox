package br.com.loja.interfaces;

import java.util.Date;
import java.util.List;

public interface IAssinaturaDAO<T> {


	public void adiciona(T t);

	public void update(T t);

	public void remove(T t);

	public T recuperaById(Long id);

	public List<T> recuperaTodos();
	
	public List<T> recuperaItensOrdenado(String parametroOrdenado);
	
	public List<T> recuperaItem(String valorARecuperar, String parametro);
	
	public List<T> recuperaPorData(Date inicio, Date fim, String nomeColuna);
	

}
