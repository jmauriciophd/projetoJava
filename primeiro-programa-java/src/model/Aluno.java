package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {
	private String nome;
	private String sobrenome;
	private int idade;
	private String nomeEscola;
	private String serieMatriculado;
	
	
	private List<Disciplinas>  disciplinas = new ArrayList<Disciplinas>();
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}	
	/**
	 * @return the disciplinas
	 */
	 public void setDisciplinas(List<Disciplinas> disciplinas) {
		this.disciplinas = disciplinas;
	}
	 
	public List<Disciplinas> getDisciplinas() {
		return disciplinas;
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
	 * @return the sobrenome
	 */
	public String getSobrenome() {
		return sobrenome;
	}

	/**
	 * @param sobrenome the sobrenome to set
	 */
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	/**
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * @param idade the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public double getMedia() {
		double media=0.0;
		
		for(Disciplinas disciplinas:disciplinas) {
			media += disciplinas.getNota();
		}
		return media / disciplinas.size();
	}
	public boolean getAlunoAprovado() {
		if(getMedia() >= 70) {
			return true;
		}else {
			return false;
		}
	}
	public String getAlunoAprovadoReprovado() {
		if(getMedia() <=50) {
			if(getMedia() <=70) {
				return "Aluno em Aprovado";
			}else {
				return "Aluno em recuperação";
			}
		}else {
			return "Aluno Reprovado";
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(disciplinas, idade, nome, nomeEscola, serieMatriculado, sobrenome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(disciplinas, other.disciplinas) && idade == other.idade
				&& Objects.equals(nome, other.nome) && Objects.equals(nomeEscola, other.nomeEscola)
				&& Objects.equals(serieMatriculado, other.serieMatriculado)
				&& Objects.equals(sobrenome, other.sobrenome);
	}



	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", sobrenome=" + sobrenome + ", idade=" + idade + ", nomeEscola=" + nomeEscola
				+ ", serieMatriculado=" + serieMatriculado + ", disciplinas=" + disciplinas + "]";
	}
	
	
}
