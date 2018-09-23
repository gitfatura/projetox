package br.com.loja.dao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import br.com.loja.entity.CarroEntity;
import br.com.loja.entity.ClienteEntity;
import br.com.loja.interfaces.IAssinaturaDAO;

@ApplicationScoped
public class CarroDAO implements Serializable, IAssinaturaDAO<CarroEntity> {

	private static final long serialVersionUID = 7684757931282924292L;

	private DaoGenerico<CarroEntity> dao = new DaoGenerico<CarroEntity>(CarroEntity.class);

	@Override
	public void adiciona(CarroEntity t) {
		dao.adiciona(t);
	}

	@Override
	public void update(CarroEntity t) {
		dao.update(t);
	}

	@Override
	public void remove(CarroEntity t) {
		dao.remove(t);
	}

	@Override
	public CarroEntity recuperaById(Long id) {
		return dao.buscaPorId(id);
	}

	public List<CarroEntity> recuperaItensOrdenado() {
		return dao.recuperaItensOrdenado("nome");
	}

	@Override
	public List<CarroEntity> recuperaTodos() {
		return dao.getAll();
	}

	@Override
	public List<CarroEntity> recuperaItem(String valorARecuperar, String parametro) {
		return dao.recuperaItem(valorARecuperar, parametro);
	}

	@Override
	public List<CarroEntity> recuperaPorData(Date inicio, Date fim, String nomeColuna) {
		return dao.recuperaPorData(inicio, fim, nomeColuna);
	}

	@Override
	public List<CarroEntity> recuperaItensOrdenado(String parametroOrdenado) {
		return dao.recuperaItensOrdenado(parametroOrdenado);
	}

	public List<CarroEntity> recuperaCarroPorCliente(ClienteEntity cliente) {
		return dao.recuperaCarroPorCliente(cliente);
	}

	
}
