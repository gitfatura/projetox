package br.com.loja.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.loja.entity.CarroEntity;
import br.com.loja.entity.ClienteEntity;

//Dao generico
public class DaoGenerico<T> {
	
	private Class<T> classe;
	
	private final static EntityManagerFactory emf = Persistence.createEntityManagerFactory("lavacao");
	
	public DaoGenerico(Class<T> classe) {
		super();
		this.classe = classe;
	}
	
	
	public void adiciona(T t) {
		EntityManager manager = emf.createEntityManager();
		manager.getTransaction().begin();
		manager.merge(t);
		manager.getTransaction().commit();
		manager.close();
	}

	public void update(T t) {
		EntityManager manager = emf.createEntityManager();
		manager.getTransaction().begin();
		manager.merge(t);		
		manager.getTransaction().commit();
		manager.close();
	}

	public void remove(T t) {
		EntityManager manager = emf.createEntityManager();
		manager.getTransaction().begin();
		manager.remove(manager.merge(t));
		manager.getTransaction().commit();
		manager.close();
	}

	public T buscaPorId(Long id) {
		EntityManager manager = emf.createEntityManager();
		return manager.find(classe, id);
	}

	@SuppressWarnings("unchecked")
	public List<T> getAll() {
		EntityManager manager = emf.createEntityManager();
		return manager.createQuery("from " + classe.getName()).getResultList();
	}


	@SuppressWarnings("unchecked")
	public List<T> recuperaItensOrdenado(String parametroOrdenado) {
		EntityManager manager = emf.createEntityManager();
		StringBuilder sql = new StringBuilder();
		sql.append("select p from ")
		.append(classe.getName())
		.append(" as p order by p.").append(parametroOrdenado);
		return manager.createQuery(sql.toString()).getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<CarroEntity> recuperaCarroPorCliente(ClienteEntity cliente) {
		EntityManager manager = emf.createEntityManager();
		StringBuilder sql = new StringBuilder();
		sql.append("select c from CarroEntity c ");
		sql.append("inner join c.cliente cli ");
		sql.append("where cli.id = :pcliente ");		
		Query query = manager.createQuery(sql.toString());		
		query.setParameter("pcliente", cliente.getId());		
		return query.getResultList();
	}
	
	
	@SuppressWarnings("unchecked")
	public List<T> recuperaItemOrdenadoDescendente(String value,String nomeColuna) {
		EntityManager manager = emf.createEntityManager();
		StringBuilder sql = new StringBuilder();
		sql.append("select p  from ");
		sql.append(classe.getName());
		sql.append(" p where p."+nomeColuna);
		sql.append(" like :desc");		
		return manager.createQuery(sql.toString())
				.setParameter("desc", "%" + value + "%").getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<T> recuperaItem(String valorARecuperar, String parametro) {
		EntityManager manager = emf.createEntityManager();
		StringBuilder sql = new StringBuilder();
		sql.append("from ").append(classe.getName()).append(" p where upper (p.").append(parametro)
				.append(") like :param");
		return manager.createQuery(sql.toString()).setParameter("param", "%" + valorARecuperar.toUpperCase() + "%")
				.getResultList();
	}
	
	
	@SuppressWarnings("unchecked")
	public List<T> recuperaPorData(Date inicio, Date fim, String nomeColuna) {
		EntityManager manager = emf.createEntityManager();		
		StringBuilder sql = new StringBuilder();		
		sql.append("select p from ");
		sql.append(classe.getName());
		sql.append(" p where p."+nomeColuna);
		sql.append("between :dinicio and :dfim");		
		Query query = manager.createQuery(sql.toString());		
		query.setParameter("dinicio", inicio);
		query.setParameter("dfim", fim);
		return query.getResultList();
	}
	
}