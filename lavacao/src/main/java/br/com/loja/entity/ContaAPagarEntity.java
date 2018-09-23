package br.com.loja.entity;

import java.io.Serializable;
import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.loja.comum.AppBaseEntity;
import br.com.loja.types.FormaPagamento;
import br.com.loja.types.SituacaoDaContaAPagar;

@Entity
@Table(name = "conta_apagar")
public class ContaAPagarEntity extends AppBaseEntity implements Serializable {

	private static final long serialVersionUID = -6047604278837617042L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@ManyToOne(targetEntity = FornecedorEntity.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "id_fornecedor", referencedColumnName = "id")
	private FornecedorEntity fornecedor;

	@Column(length = 60, nullable = false)
	private String descricao;

	@Temporal(TemporalType.DATE)
	@Column(name = "data_vencimento", nullable = false)
	private Date dataVencimento;

	@Temporal(TemporalType.DATE)
	@Column(name = "data_pagamento", nullable = true)
	private Date dataPagamento;

	@Column(name = "valor", nullable = true)
	private Double valor;

	@Enumerated(EnumType.STRING)
	@Column(name = "forma_pagamento", length = 20)
	private FormaPagamento formaPagamento;

	@Enumerated(EnumType.STRING)
	@Column(name = "situacao", length = 20, nullable = true)
	private SituacaoDaContaAPagar situacao;

	@Column(name = "observacao", length = 100, nullable = true)
	private String observacao;

	public ContaAPagarEntity() {
	}

	public ContaAPagarEntity(Long id, FornecedorEntity fornecedor, String descricao, Date dataVencimento,
			Date dataPagamento, Double valor, FormaPagamento formaPagamento, SituacaoDaContaAPagar situacao,
			String observacao) {
		super();
		this.id = id;
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
		this.valor = valor;
		this.formaPagamento = formaPagamento;
		this.situacao = situacao;
		this.observacao = observacao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public FornecedorEntity getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(FornecedorEntity fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public SituacaoDaContaAPagar getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoDaContaAPagar situacao) {
		this.situacao = situacao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
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
		ContaAPagarEntity other = (ContaAPagarEntity) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
