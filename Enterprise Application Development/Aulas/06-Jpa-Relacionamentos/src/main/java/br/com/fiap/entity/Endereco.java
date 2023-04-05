package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_ENDERECO")
@SequenceGenerator(name = "endereco", sequenceName = "SQ_TAB_ENDERECO", allocationSize = 1)
public class Endereco {

	@Id
	@Column(name = "cd_endereco")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "editora")
	private Integer id;

	@Column(name = "ds_logradouro", length = 100, nullable = false)
	private String logradouro;

	@Column(name = "nr_cep", length = 9, nullable = false)
	private String cep;
	
	@OneToOne(mappedBy = "cd_endereco")
	private Biblioteca biblioteca;

	public Endereco(String logradouro, String cep) {
		super();

		this.logradouro = logradouro;
		this.cep = cep;
	}

	public Endereco() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	

	public Biblioteca getBiblioteca() {
		return biblioteca;
	}

	public void setBiblioteca(Biblioteca biblioteca) {
		this.biblioteca = biblioteca;
	}

	@Override
	public String toString() {
		return "Endereco [id=" + id + ", logradouro=" + logradouro + ", cep=" + cep + ", biblioteca=" + biblioteca
				+ "]";
	}

	

}
