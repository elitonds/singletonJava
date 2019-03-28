package exercicio.singleton;

import java.time.LocalDateTime;

public class Aluno {
	
	private Long id;
	private String nome;
	private LocalDateTime dataNascimento;
	private String curso;
	private String periodo;
	
	public Aluno(String nome, LocalDateTime dataNascimento, String curso, String periodo) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.curso = curso;
		this.periodo = periodo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDateTime getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDateTime dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

}
