package br.com.loja.facade;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.loja.bo.CarroBO;
import br.com.loja.bo.ClienteBO;
import br.com.loja.entity.CarroEntity;
import br.com.loja.entity.ClienteEntity;
import br.com.loja.interfaces.ICarroFacade;

@ApplicationScoped
public class CarroImpl implements Serializable, ICarroFacade {

	private static final long serialVersionUID = 4024055921733026871L;

	@Inject
	private CarroBO carroBO;

	@Inject
	private ClienteBO clienteBO;
	
	@Override
	public void adiciona(CarroEntity carro) {
		carroBO.adiciona(carro);
	}

	@Override
	public void update(CarroEntity carro) {
		carroBO.update(carro);
	}

	@Override
	public void remove(CarroEntity carro) {
		carroBO.remove(carro);
	}

	@Override
	public CarroEntity recuperaById(Long id) {
		return carroBO.recuperaById(id);
	}

	@Override
	public List<CarroEntity> recuperaTodos() {
		return carroBO.recuperaTodos();
	}

	@Override
	public List<CarroEntity> recuperaItensOrdenado(String parametroOrdenado) {
		return carroBO.recuperaItensOrdenado(parametroOrdenado);
	}

	@Override
	public List<CarroEntity> recuperaItem(String valorARecuperar, String parametro) {
		return carroBO.recuperaItem(valorARecuperar, parametro);
	}

	@Override
	public List<CarroEntity> recuperaPorData(Date inicio, Date fim, String nomeColuna) {
		return carroBO.recuperaPorData(inicio, fim, nomeColuna);
	}

	@Override
	public List<ClienteEntity> recuperaClientes() {
		return clienteBO.recuperaItensOrdenado("nome");
	}

	@Override
	public List<CarroEntity> recuperaCarroPorCliente(ClienteEntity cliente) {
		return carroBO.recuperaCarroPorCliente(cliente);
	}
	
	
}
