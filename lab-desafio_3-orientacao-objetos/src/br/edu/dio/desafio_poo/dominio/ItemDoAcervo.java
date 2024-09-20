package br.edu.dio.desafio_poo.dominio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public abstract class ItemDoAcervo {
	private String titulo;
	private String autor;
	private boolean disponível = true;
	private Collection<Usuario> historicoEmprestimos = new ArrayList<Usuario>();

	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public Collection<Usuario> getHistoricoEmprestimos() {
		return Collections.unmodifiableCollection(this.historicoEmprestimos);
	}
	
	public void addHistoricoEmprestimos(Usuario usuario) {
		this.historicoEmprestimos.add(usuario);
	}

	public boolean isDisponível() {
		return disponível;
	}

	public void setDisponível(boolean disponível) {
		this.disponível = disponível;
	}

}
