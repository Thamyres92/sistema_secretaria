package sistema_secretaria.modelos;

import java.io.Serializable;

public class Aluno implements Serializable{

	private static final long serialVersionUID = 1L;
	
	int matricula ;
	String cpf; 
	String nome;
	String telefone; 
	String dataNascimento;
	String rua; 
	int numCasa;
	String bairro;
	String cidade; 
	String sexo;
	
	
	public Aluno(int matricula, String cpf, String nome, String telefone, String dataNascimento, String rua, int numCasa,
			String bairro, String cidade, String sexo) {
		super();
		this.matricula = matricula;
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
		this.rua = rua;
		this.numCasa = numCasa;
		this.bairro = bairro;
		this.cidade = cidade;
		this.sexo = sexo;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + matricula;
		return result;
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
		if (matricula != other.matricula)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", cpf=" + cpf + ", nome=" + nome + ", telefone=" + telefone
				+ ", dataNascimento=" + dataNascimento + ", rua=" + rua + ", numCasa=" + numCasa + ", bairro=" + bairro
				+ ", cidade=" + cidade + ", sexo=" + sexo + "]";
	}


	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String getRua() {
		return rua;
	}


	public void setRua(String rua) {
		this.rua = rua;
	}


	public int getNumCasa() {
		return numCasa;
	}


	public void setNumCasa(int numCasa) {
		this.numCasa = numCasa;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	


	
	
}
