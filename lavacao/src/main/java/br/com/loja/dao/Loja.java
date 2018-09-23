package br.com.loja.dao;

import java.util.Date;

import br.com.loja.entity.CategoriaEntity;

public class Loja {
	
	public static void main(String[] args) {
		
		CategoriaEntity categoria = new CategoriaEntity();
		categoria.setAtivo(1);
		categoria.setDataUltimaAlteracao(new Date());
		categoria.setDescricao("dddddd");
		CategoriaDAO dao = new CategoriaDAO();
		dao.adiciona(categoria);
		
		
	}
	
}
