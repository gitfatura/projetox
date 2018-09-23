package br.com.loja.dao;

import java.util.List;

import br.com.loja.entity.ClienteEntity;

public class Teste {

	public static void main(String[] args) {

		ClienteDAO clienteDao = new ClienteDAO();
		ClienteEntity cliente = clienteDao.recuperaById(1L);
		
	}

}
