package br.com.loja.interfaces;

import java.util.Date;
import java.util.List;

import br.com.loja.entity.CarroEntity;
import br.com.loja.entity.ClienteEntity;

public interface ICarroFacade {
	
	public void adiciona(CarroEntity carro);

	public void update(CarroEntity carro);

	public void remove(CarroEntity carro);

	public CarroEntity recuperaById(Long id);

	public List<CarroEntity> recuperaTodos();

	public List<CarroEntity> recuperaItensOrdenado(String parametroOrdenado);
	
	public List<ClienteEntity> recuperaClientes();
	
	public List<CarroEntity> recuperaItem(String valorARecuperar, String parametro);
	
	public List<CarroEntity> recuperaPorData(Date inicio, Date fim, String nomeColuna);
	
	public List<CarroEntity> recuperaCarroPorCliente(ClienteEntity cliente);
	
}
