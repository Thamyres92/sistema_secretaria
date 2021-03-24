package sistema_secretaria.modelos;

import java.io.Serializable;

public class Curso implements Serializable{

	
	
	private static final long serialVersionUID = 1L;
	
	int codigo;
	String nome;
	String area;
	String nivel;
	int cargaHoraria;
	
	
	public Curso(int codigo, String nome, String area, String nivel, int cargaHoraria) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.area = area;
		this.nivel = nivel;
		this.cargaHoraria = cargaHoraria;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
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
		Curso other = (Curso) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Curso [codigo=" + codigo + ", nome=" + nome + ", area=" + area + ", nivel=" + nivel + ", cargaHoraria="
				+ cargaHoraria + "]";
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public String getNivel() {
		return nivel;
	}


	public void setNivel(String nivel) {
		this.nivel = nivel;
	}


	public int getCargaHoraria() {
		return cargaHoraria;
	}


	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	
	
	
	
	

}
