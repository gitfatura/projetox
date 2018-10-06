package br.com.loja.managebean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.loja.entity.AgendaContadoEntity;
import br.com.loja.interfaces.AppFacade;
import br.com.loja.util.jsf.FacesUtil;

@ViewScoped
@Named
public class AgendaMB implements Serializable {

	private static final long serialVersionUID = 3819230534860340809L;

	@Inject
	private AgendaContadoEntity agenda;

	@Inject
	private AppFacade appFacade;

	private List<AgendaContadoEntity> agendas;

	@PostConstruct
	public void iniciaAgenda() {
		carregaAgendas();
	}
	
	public void grava() {
		if (this.agenda == null) {
			FacesUtil.addErrorMessage("Erro tenta registrar");
		} else {
			appFacade.gravaAgenda(this.agenda);
			FacesUtil.addInfoMessage("Registro gravado com sucesso!");
			novaInstancia();
		}

	}
	
	public void novaInstancia() {
		agenda = new AgendaContadoEntity();
	}
	
	public void carregaAgendas() {
		agendas = appFacade.recuperaTodasAgendas();
	}
	
	public AgendaContadoEntity getAgenda() {
		return agenda;
	}
	
	public void setAgenda(AgendaContadoEntity agenda) {
		this.agenda = agenda;
	}

	public List<AgendaContadoEntity> getAgendas() {
		return agendas;
	}

	public void setAgendas(List<AgendaContadoEntity> agendas) {
		this.agendas = agendas;
	}

}
