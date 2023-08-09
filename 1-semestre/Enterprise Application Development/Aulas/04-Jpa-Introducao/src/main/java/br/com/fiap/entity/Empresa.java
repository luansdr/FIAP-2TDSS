package br.com.fiap.entity;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "TB_EMPRESA")
@SequenceGenerator(name = "empresa", sequenceName = "SQ_TAB_EMPRESA", allocationSize = 1)
public class Empresa {
	
	@Id
	@Column(name = "id_empresa")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "empresa")
	private Integer id;

	@Column(name = "nm_empresa", length = 100, nullable = false)
	private String nome;

	@Temporal(TemporalType.DATE)
	@Column(name = "dt_abertura", nullable = true)
	private Calendar dataAbertura;
	
	@Column(name = "nr_cnpj", length = 14, nullable = false)
	private String cnpj;
	
	@Column(name = "st_ativo", nullable = true)
	private Boolean ativo;
	
	@Lob
	@Column(name = "fl_foto")
	private byte[] foto;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "ds_porte", length = 100, nullable = true)
	private Porte porte;
	
	@Column(name = "vl_faturamento", precision = 10, scale = 2, nullable = false)
	private BigDecimal faturamento;
	
	@Transient
	private String token;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public Porte getPorte() {
		return porte;
	}

	public void setPorte(Porte porte) {
		this.porte = porte;
	}

	public BigDecimal getFaturamento() {
		return faturamento;
	}

	public void setFaturamento(BigDecimal faturamento) {
		this.faturamento = faturamento;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "Empresa [id=" + id + ", nome=" + nome + ", dataAbertura=" + dataAbertura + ", cnpj=" + cnpj + ", ativo="
				+ ativo + ", foto=" + Arrays.toString(foto) + ", porte=" + porte + ", faturamento=" + faturamento
				+ ", token=" + token + "]";
	}

	
	
	
	
	
	
}
