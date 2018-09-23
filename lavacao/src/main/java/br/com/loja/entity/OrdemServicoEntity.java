package br.com.loja.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.loja.comum.AppBaseEntity;
import br.com.loja.types.Avaria;
import br.com.loja.types.Finalizado;

@Entity
@Table(name = "ordem_servico")
public class OrdemServicoEntity extends AppBaseEntity implements Serializable {

	private static final long serialVersionUID = 6335889376602448547L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Enumerated(EnumType.STRING)
	@Column(name = "finalizado", length = 20)
	private Finalizado finalizado = Finalizado.NAO;

	@Column(name = "observacao", length = 60)
	private String observacao;

	@Enumerated(EnumType.STRING)
	@Column(name = "avaria", length = 100)
	private Avaria avaria;

	@ManyToOne(targetEntity = ClienteEntity.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "cliente_id", referencedColumnName = "id")
	private ClienteEntity cliente;

	@ManyToOne(targetEntity = ServicoEntity.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "servico_id", referencedColumnName = "id")
	private ServicoEntity servico;

	@ManyToOne(targetEntity = CarroEntity.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "carro_id", referencedColumnName = "id")
	private CarroEntity carro;

	public OrdemServicoEntity() {
	}

	public OrdemServicoEntity(Long id, Finalizado finalizado, String observacao, Avaria avaria, ClienteEntity cliente,
			ServicoEntity servico, CarroEntity carro) {
		super();
		this.id = id;
		this.finalizado = finalizado;
		this.observacao = observacao;
		this.avaria = avaria;
		this.cliente = cliente;
		this.servico = servico;
		this.carro = carro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ClienteEntity getCliente() {
		return cliente;
	}

	public void setCliente(ClienteEntity cliente) {
		this.cliente = cliente;
	}

	public Finalizado getFinalizado() {
		return finalizado;
	}

	public void setFinalizado(Finalizado finalizado) {
		this.finalizado = finalizado;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public ServicoEntity getServico() {
		return servico;
	}

	public void setServico(ServicoEntity servico) {
		this.servico = servico;
	}

	public CarroEntity getCarro() {
		return carro;
	}

	public void setCarro(CarroEntity carro) {
		this.carro = carro;
	}

	public Avaria getAvaria() {
		return avaria;
	}

	public void setAvaria(Avaria avaria) {
		this.avaria = avaria;
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
		OrdemServicoEntity other = (OrdemServicoEntity) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
