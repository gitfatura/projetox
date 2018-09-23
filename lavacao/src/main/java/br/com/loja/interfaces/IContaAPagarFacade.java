package br.com.loja.interfaces;

import java.util.Date;
import java.util.List;

import br.com.loja.entity.ContaAPagarEntity;

public interface IContaAPagarFacade {
	
	public void adiciona(ContaAPagarEntity conta);

	public void update(ContaAPagarEntity conta);

	public void remove(ContaAPagarEntity conta);

	public ContaAPagarEntity recuperaById(Long id);

	public List<ContaAPagarEntity> recuperaTodos();

	public List<ContaAPagarEntity> recuperaItensOrdenado(String parametroOrdenado);
	
	public List<ContaAPagarEntity> recuperaItem(String valorARecuperar, String parametro);
	
	public List<ContaAPagarEntity> recuperaPorData(Date inicio, Date fim, String nomeColuna);
	
	
	
}
