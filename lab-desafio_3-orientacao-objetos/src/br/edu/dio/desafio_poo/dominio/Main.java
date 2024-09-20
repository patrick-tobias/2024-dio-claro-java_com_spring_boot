package br.edu.dio.desafio_poo.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		//Criando usuários
		Usuario usuario1 = new Usuario();
		usuario1.setNome("João da Silva");
		usuario1.setNascimento(LocalDate.parse("01/01/2000", formatter));
		
		Usuario usuario2 = new Usuario();
		usuario2.setNome("Ana Calorina");
		usuario2.setNascimento(LocalDate.parse("02/02/2002", formatter));
		
		//Criando acervo
		Livro item1 = new Livro();
		item1.setTitulo("Head First Java: A Brain-Friendly Guide");
		item1.setAutor("Kathy Sierra");
		item1.setIsbn("978-0596009205");
		item1.setPaginas(688);
		
		Livro item2 = new Livro();
		item2.setTitulo("Effective Java");
		item2.setAutor("Joshua Bloch");
		item2.setIsbn("978-0134685991");
		item2.setPaginas(416);
		
		Midia item3 = new Midia();
		item3.setTitulo("Java Programming");
		item3.setAutor("Scott Bernard");
		item3.setTempoDuracao(4);
		
		//Emprestimos
		System.out.println("Empréstimos de " + usuario1.getNome() + ": " + usuario1.getEmprestimos());
		usuario1.emprestarItem(item1);
		usuario1.emprestarItem(item2);
		System.out.println("Empréstimos de " + usuario1.getNome() + ": " + usuario1.getEmprestimos());
		
		usuario2.emprestarItem(item1);
		System.out.println("Empréstimos de " + usuario2.getNome() + ": " + usuario2.getEmprestimos());
		
		usuario1.devolverItem(item1);
		System.out.println("Empréstimos de " + usuario1.getNome() + ": " + usuario1.getEmprestimos());
		
		usuario2.emprestarItem(item1);
		System.out.println("Empréstimos de " + usuario2.getNome() + ": " + usuario2.getEmprestimos());
		
		System.out.println("Histórico de empréstimos de Item: " + item1.getTitulo() + ": " + item1.getHistoricoEmprestimos());
		
	}
}
