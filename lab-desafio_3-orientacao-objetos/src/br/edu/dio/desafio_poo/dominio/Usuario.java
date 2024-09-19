package br.edu.dio.desafio_poo.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Usuario {
	private String nome;
	private LocalDate nascimento;
	private Collection<ItemDoAcervo> emprestimos = new ArrayList<ItemDoAcervo>();
	
	@Override
	public String toString() {
		return "Usuario [nome=" + nome + "]";
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getNascimento() {
		return nascimento;
	}
	
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	
	public Collection<ItemDoAcervo> getEmprestimos() {
		return Collections.unmodifiableCollection(this.emprestimos);
	}
	
	public void addEmprestimo(ItemDoAcervo item) {
		this.emprestimos.add(item);
	}
	
	public void emprestarItem(ItemDoAcervo item) {
		if(!item.isDisponível()) {
			System.err.println("Livro: " + item.getTitulo() + " indisponível para empréstimos"); return;
		}
		
		this.addEmprestimo(item);
		item.addHistoricoEmprestimos(this);
		item.setDisponível(false);
	}
	
	public void devolverItem(ItemDoAcervo item) {
		if(!this.emprestimos.contains(item)) {
			System.err.println("Livro: " + item.getTitulo() + " não encontrado em seus empréstimos."); return;
		}
		this.emprestimos.remove(item);
		item.setDisponível(true);
	}
}
