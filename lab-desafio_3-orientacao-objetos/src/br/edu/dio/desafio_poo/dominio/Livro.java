package br.edu.dio.desafio_poo.dominio;

public class Livro extends ItemDoAcervo{
	
	private String isbn;
	private Integer paginas;
	
	@Override
	public String toString() {
		return "Livro [titulo=" + super.getTitulo() +" autor=" + super.getAutor() + " isbn=" + isbn + ", paginas=" + paginas + "]";
	}

	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public Integer getPaginas() {
		return paginas;
	}
	
	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}
	
}
