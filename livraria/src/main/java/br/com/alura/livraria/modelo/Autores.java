package br.com.alura.livraria.modelo;

import java.time.LocalDate;

public class Autores {

	private String nome;
	private String email;
	private LocalDate dataNascimento;
	private String miniCurriculum;

	
	public Autores() {
		
	}
	
	public Autores(String nome, String email, LocalDate dataNascimento, String miniCurriculum) {
		this.nome = nome;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.miniCurriculum = miniCurriculum;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getMiniCurriculum() {
		return miniCurriculum;
	}

	public void setMiniCurriculum(String miniCurriculum) {
		this.miniCurriculum = miniCurriculum;
	}
	
}
