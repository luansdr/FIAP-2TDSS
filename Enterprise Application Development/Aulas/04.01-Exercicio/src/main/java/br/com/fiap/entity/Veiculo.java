package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_VEICULO")
@SequenceGenerator(name = "veiculo", sequenceName = "SQ_TAB_VEICULO", allocationSize = 1)
public class Veiculo {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "veiculo")
	private Integer id;
	
	@Column(name="ds_placa", length = 9, nullable = false)
	private String placa;
	
	@Column(name="ds_cor", length = 20, nullable = false)
	private String cor;
	
	@Column(name="nr_ano", nullable = false)
	private int ano;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	
	
}
