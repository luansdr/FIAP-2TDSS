package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TB_BIBLIOTECA")
@SequenceGenerator(name = "biblioteca", sequenceName = "SQ_TAB_BIBLIOTECA", allocationSize = 1)
public class Biblioteca {

	@Id
	@Column(name = "cd_biblioteca")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "biblioteca")
	private Integer id;

	@Column(name = "nm_biblioteca", length = 80, nullable = false)
	private String nome;

	@Temporal(TemporalType.DATE)
	@Column(name = "dt_abertura")
	private Calendar dataAbertura;

	@OneToOne
	@JoinColumn(name = "cd_endereco", nullable = false)
	private Endereco endereco;

	public Biblioteca(String nome, Calendar dataAbertura, Endereco endereco) {
		super();
		this.nome = nome;
		this.dataAbertura = dataAbertura;
		this.endereco = endereco;
	}

	public Biblioteca() {
		super();
	}

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

	public Calendar getDataAbeertura() {
		return dataAbertura;
	}

	public void setDataAbeertura(Calendar dataAbeertura) {
		this.dataAbertura = dataAbeertura;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Biblioteca [id=" + id + ", nome=" + nome + ", dataAbeertura=" + dataAbertura + ", endereco=" + endereco
				+ "]";
	}

}
