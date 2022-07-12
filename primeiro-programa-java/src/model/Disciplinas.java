package model;

import java.util.Objects;

public class Disciplinas {
		private String nome;
		private double nota;
		
	public Disciplinas() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the nota
	 */
	public Double getNota() {
		return nota;
	}

	/**
	 * @param nota the nota to set
	 */
	public void setNota(Double nota) {
		this.nota = nota;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, nota);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplinas other = (Disciplinas) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(nota, other.nota);
	}

	@Override
	public String toString() {
		return "Disciplinas [nome=" + nome + "\n nota=" + nota + "]";
	}
	
	

}
