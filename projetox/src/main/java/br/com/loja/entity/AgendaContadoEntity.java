package br.com.loja.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.loja.comum.AppBaseEntity;

@Entity
@Table(name = "agenda")
public class AgendaContadoEntity extends AppBaseEntity implements Serializable {

	private static final long serialVersionUID = 1503752441249011654L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "nome", nullable = false, length = 60)
	private String nome;

	@Column(name = "telefone", nullable = true, length = 15)
	private String telefone;

	@Column(name = "celular", nullable = true, length = 15)
	private String celular;

	@Column(name = "email", nullable = true, length = 60)
	private String email;

	@Column(name = "site", nullable = true, length = 60)
	private String site;

	public AgendaContadoEntity() {
	}

	public AgendaContadoEntity(Long id, String nome, String telefone, String celular, String email, String site) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
		this.site = site;
	}

	
	@Override
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AgendaContadoEntity other = (AgendaContadoEntity) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
