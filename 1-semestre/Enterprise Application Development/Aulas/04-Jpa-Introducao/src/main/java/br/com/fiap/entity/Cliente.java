package br.com.fiap.entity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
import javax.persistence.PrePersist;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;

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

	@Column(name = "vl_credito", precision = 10, scale = 3)
	private Double credito;

	@Temporal(TemporalType.DATE)
	@Column(name = "dt_nascimento", nullable = true)
	private Calendar dataNascimento;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_cadastro", nullable = false, updatable = false)
	private Calendar dt_cadastro;


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

	public Cliente() {
		super();
	}

	public Cliente(String nome, Calendar dataNascimento, Double credito, String cpf, Genero genero) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.credito = credito;
		this.cpf = cpf;
		this.genero = genero;
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

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Calendar getDt_cadastro() {
		return dt_cadastro;
	}

	public void setDt_cadastro(Calendar dt_cadastro) {
		this.dt_cadastro = dt_cadastro;
	}

	public Double getCredito() {
		return credito;
	}

	public void setCredito(Double credito) {
		this.credito = credito;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
	@PrePersist
	private void executar() {
		System.out.println("Hello World");
	}
	
	public String formatadorDate(Calendar data) {
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		return df.format(data.getTime());
	}

	@Override
	public String toString() {
		return "Cliente [id= " + id + ", nome= " + nome + ", credito= " + credito + ", dataNascimento= " + formatadorDate(dataNascimento)
				+ ", dt_cadastro= " + formatadorDate(dt_cadastro) + ", cpf= " + cpf + ", idade= " + idade + ", foto= "
				+ Arrays.toString(foto) + ", genero= " + genero + "]";
	}
	
	
	

}
