package br.com.loja.bo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.loja.dao.CarroDAO;
import br.com.loja.entity.CarroEntity;
import br.com.loja.entity.ClienteEntity;
import br.com.loja.interfaces.IAssinaturaBO;

@ApplicationScoped
public class CarroBO implements Serializable, IAssinaturaBO<CarroEntity> {

	private static final long serialVersionUID = 3859369554332546009L;

	@Inject
	private CarroDAO carroDAO;

	@Override
	public void adiciona(CarroEntity t) {
		carroDAO.adiciona(t);
	}

	@Override
	public void update(CarroEntity t) {
		carroDAO.update(t);
	}

	@Override
	public void remove(CarroEntity t) {
		carroDAO.remove(t);
	}

	@Override
	public CarroEntity recuperaById(Long id) {
		return carroDAO.recuperaById(id);
	}

	@Override
	public List<CarroEntity> recuperaTodos() {
		return carroDAO.recuperaTodos();
	}

	@Override
	public List<CarroEntity> recuperaItensOrdenado(String parametroOrdenado) {
		return carroDAO.recuperaItensOrdenado(parametroOrdenado);
	}

	@Override
	public List<CarroEntity> recuperaItem(String valorARecuperar, String parametro) {
		return carroDAO.recuperaItem(valorARecuperar, parametro);
	}

	@Override
	public List<CarroEntity> recuperaPorData(Date inicio, Date fim, String nomeColuna) {
		return carroDAO.recuperaPorData(inicio, fim, nomeColuna);
	}

	public List<CarroEntity> recuperaCarroPorCliente(ClienteEntity cliente) {
		return carroDAO.recuperaCarroPorCliente(cliente);
	}

}
