package br.com.loja.facade;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.loja.dao.AgendaDAO;
import br.com.loja.entity.AgendaContadoEntity;
import br.com.loja.interfaces.AppFacade;

@ApplicationScoped
public class AppFacadeImpl implements Serializable, AppFacade {

	private static final long serialVersionUID = 4024055921733026871L;
	
	@Inject
	private AgendaDAO agendaDAO;

	@Override
	public void gravaAgenda(AgendaContadoEntity agenda) {
		agendaDAO.grava(agenda);
	}

	@Override
	public void update(AgendaContadoEntity agenda) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(AgendaContadoEntity agenda) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AgendaContadoEntity buscaPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AgendaContadoEntity> recuperaTodasAgendas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AgendaContadoEntity> recuperaItensOrdenado(String parametroOrdenado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AgendaContadoEntity> recuperaItemOrdenadoDescendente(String value, String nomeColuna) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AgendaContadoEntity> recuperaItem(String valorARecuperar, String parametro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AgendaContadoEntity> recuperaPorData(Date inicio, Date fim, String nomeColuna) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
