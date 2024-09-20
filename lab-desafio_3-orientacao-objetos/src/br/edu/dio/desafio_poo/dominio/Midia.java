package br.edu.dio.desafio_poo.dominio;

public class Midia extends ItemDoAcervo {
	
	private Integer tempoDuracao;

	@Override
	public String toString() {
		return "Midia [titulo=" + super.getTitulo() +" autor=" + super.getAutor() + "tempoDuracao=" + tempoDuracao + "]";
	}

	public Integer getTempoDuracao() {
		return tempoDuracao;
	}

	public void setTempoDuracao(Integer tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}
	
}
