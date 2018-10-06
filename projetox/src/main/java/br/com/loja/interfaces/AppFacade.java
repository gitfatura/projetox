package br.com.loja.interfaces;

import java.util.Date;
import java.util.List;
import br.com.loja.entity.AgendaContadoEntity;
public interface AppFacade {
	public void gravaAgenda(AgendaContadoEntity agenda);
	public void update(AgendaContadoEntity agenda);
	public void remove(AgendaContadoEntity agenda);
	public AgendaContadoEntity buscaPorId(Long id);
	public List<AgendaContadoEntity> recuperaTodasAgendas();
	public List<AgendaContadoEntity> recuperaItensOrdenado(String parametroOrdenado); 
	public List<AgendaContadoEntity> recuperaItemOrdenadoDescendente(String value,String nomeColuna);
	public List<AgendaContadoEntity> recuperaItem(String valorARecuperar, String parametro);
	public List<AgendaContadoEntity> recuperaPorData(Date inicio, Date fim, String nomeColuna);
}
