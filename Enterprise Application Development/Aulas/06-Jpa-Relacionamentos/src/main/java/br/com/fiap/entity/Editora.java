package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_EDITORA")
@SequenceGenerator(name = "editora", sequenceName = "SQ_TAB_EDITORA", allocationSize = 1)
public class Editora {

	@Id
	@Column(name = "cd_editora")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "editora")
	private Integer id;

	@Column(name = "nm_editora", length = 80)
	private String nome;

	public Editora(String nome) {
		super();
		this.nome = nome;
	}

	public Editora() {
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

	@Override
	public String toString() {
		return "Editora [id=" + id + ", nome=" + nome + "]";
	}

}
