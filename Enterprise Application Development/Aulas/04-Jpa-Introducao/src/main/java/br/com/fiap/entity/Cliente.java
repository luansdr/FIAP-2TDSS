package br.com.fiap.entity;

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
@Table(name = "TB_CLIENTE")
@SequenceGenerator(name = "cliente", sequenceName = "SQ_TAB_CLIENTE", allocationSize = 1)
public class Cliente {

	@Id
	@Column(name = "id_cliente")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente")
	private Integer id;

	@Column(name = "nm_cliente", length = 100, nullable = false)
	private String nome;

	@Temporal(TemporalType.DATE)
	@Column(name = "dt_nascimento", nullable = true)
	private Calendar dataNascimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_cadastro", nullable = false, updatable = false)
	private Calendar dt_cadastro;

	@Column(name = "vl_credito", precision = 10, scale = 3, insertable = false)
	private Double credito;

	@Column(name = "nr_cpf", length = 11, nullable = false)
	private String cpf;
	
	@Transient
	private Integer idade;
	
	@Lob
	@Column(name = "fl_foto")
	private byte[] foto;
	
	
	@Enumerated(EnumType.STRING)
	@Column(name = "ds_cliente", length = 20)
	private Genero genero;
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
