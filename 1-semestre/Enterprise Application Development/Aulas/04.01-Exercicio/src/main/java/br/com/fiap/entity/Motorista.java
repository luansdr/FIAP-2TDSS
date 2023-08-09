package br.com.fiap.entity;

import java.util.Arrays;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_MOTORISTA")
@SequenceGenerator(name = "motorista", sequenceName = "SQ_TAB_MOTORISTA", allocationSize = 1)

public class Motorista {

	@Id
	@Column(name = "nr_carteira")
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "motorista")
	private Integer id;

	@Column(name = "nm_motorista", length = 120, nullable = false)
	private String nome;

	@Temporal(TemporalType.DATE)
	@Column(name = "dt_nascimento")
	private Calendar dataNascimento;

	@Lob
	@Column(name = "fl_cateira")
	private byte[] fotoCarteira;

	@Enumerated
	@Column(name = "ds_genero", length = 20)
	private Genero genero;

	public Motorista(int id, String nome, Calendar dataNascimento, byte[] fotoCarteira, Genero genero) {
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.fotoCarteira = fotoCarteira;
		this.genero = genero;
	}

	public Motorista() {
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

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public byte[] getFotoCarteira() {
		return fotoCarteira;
	}

	public void setFotoCarteira(byte[] fotoCarteira) {
		this.fotoCarteira = fotoCarteira;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Motorista [id=" + id + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", fotoCarteira="
				+ Arrays.toString(fotoCarteira) + ", genero=" + genero + "]";
	}

	
	
}
