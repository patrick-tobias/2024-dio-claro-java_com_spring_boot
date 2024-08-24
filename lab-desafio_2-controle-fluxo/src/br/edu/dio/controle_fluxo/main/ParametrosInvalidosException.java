package br.edu.dio.controle_fluxo.main;

public class ParametrosInvalidosException extends Exception {
	private static final long serialVersionUID = 1L;

	public ParametrosInvalidosException(String mensagem) {
		super(mensagem);
	}
}
