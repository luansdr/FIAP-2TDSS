package br.com.fiap.jap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name = "TB_INVESTIMENTO")
@SequenceGenerator(name = "investimento", sequenceName = "SQ_TAB_INVESTIMENTO", allocationSize = 1)
public class Investimento {
	

	@Id
	@Column(name = "cd_investimento")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "investimento")
	private Integer id;
	
	
	@Column(name = "nm_investimento", length = 50, nullable = false)
	private String nome;
	
	@Column(name = "vl_investimento", scale = 10, precision = 2, nullable = false)
	private double valor;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "ds_tipo", length = 40, nullable = true)
	private Tipo tipo;
	
	

	public Investimento(String nome, double valor, Tipo tipo) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.tipo = tipo;
	}
	
	
	public Investimento() {
	
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

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Investimento [id=" + id + ", nome=" + nome + ", valor=" + valor + ", tipo=" + tipo + "]";
	}
	
	
	
}
