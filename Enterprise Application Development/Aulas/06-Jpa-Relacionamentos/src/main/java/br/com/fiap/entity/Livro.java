package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_LIVRO")
@SequenceGenerator(name = "livro", sequenceName = "SQ_TAB_LIVRO", allocationSize = 1)
public class Livro {

	@Id
	@Column(name = "cd_livro")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "livro")
	private Integer id;

	@Column(name = "nr_pagina", precision = 5)
	private Integer numeroPaginas;

	@Column(name = "ds_titulo", length = 80, nullable = false)
	private String titulo;

	private Editora editora;

	public Livro(int numeroPaginas, String titulo, Editora editora) {
		super();
		this.numeroPaginas = numeroPaginas;
		this.titulo = titulo;
		this.editora = editora;
	}

	public Livro() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(Integer numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	@Override
	public String toString() {
		return "Livro [id=" + id + ", numeroPaginas=" + numeroPaginas + ", titulo=" + titulo + ", editora=" + editora
				+ "]";
	}

}
