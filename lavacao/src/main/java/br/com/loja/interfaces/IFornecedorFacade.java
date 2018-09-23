package br.com.loja.interfaces;

import java.util.Date;
import java.util.List;

import br.com.loja.entity.FornecedorEntity;

public interface IFornecedorFacade {

	public void adiciona(FornecedorEntity fornecedorEntityt);

	public void update(FornecedorEntity fornecedorEntityt);

	public void remove(FornecedorEntity fornecedorEntityt);

	public FornecedorEntity recuperaById(Long id);

	public List<FornecedorEntity> recuperaTodos();

	public List<FornecedorEntity> recuperaItensOrdenado(String recuperaItensOrdenado);

	public List<FornecedorEntity> recuperaItem(String valorARecuperar, String parametro);

	public List<FornecedorEntity> recuperaPorData(Date inicio, Date fim, String nomeColuna);

}
