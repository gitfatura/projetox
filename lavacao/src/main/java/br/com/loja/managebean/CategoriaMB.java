package br.com.loja.managebean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.loja.entity.CategoriaEntity;
import br.com.loja.interfaces.ICategoriaFacade;
import br.com.loja.interfaces.ICrudMB;

@ViewScoped
@Named
public class CategoriaMB implements Serializable,ICrudMB {

	private static final long serialVersionUID = 3819230534860340809L;

	@Inject
	private ICategoriaFacade categoriaFacade;
	
	@Inject
	private CategoriaEntity categoria;
	
	private List<CategoriaEntity> categorias;

	@Override
	@PostConstruct
	public void inicializa() {
		carregaItem();
	}

	@Override
	public void novaIntancia() {
		this.categoria = new CategoriaEntity();
	}
	
	@Override
	public void grava() {
		this.categoriaFacade.adiciona(this.categoria);
	}
	
	@Override
	public void update() {
		this.categoriaFacade.update(this.categoria);
	}
	
	@Override
	public void remove() {
		this.categoriaFacade.remove(this.categoria);
	}
	
	@Override
	public void carregaItem() {
		this.categoriaFacade.recuperaItensOrdenado("descricao");
	}

	//=========================GETS SETS=========================//

	public CategoriaEntity getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaEntity categoria) {
		this.categoria = categoria;
	}

	public List<CategoriaEntity> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<CategoriaEntity> categorias) {
		this.categorias = categorias;
	}
		
}
