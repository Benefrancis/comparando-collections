package br.com.fiap.ddd;

public class Aluno {
	private String nome;
	private String materia;
	private Integer media;

	public Aluno(String nome, String materia, int media) {
		super();
		this.nome = nome;
		this.materia = materia;
		this.media = media;
	}

	public Aluno() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public int getMedia() {
		return media;
	}

	public void setMedia(int media) {
		this.media = media;
	}

}
