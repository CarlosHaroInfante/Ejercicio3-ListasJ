package edu.Dtos;

public class mesYNombre {

	int numMes = 9;

	

	String nomMes = "aaaaa";
	
	
	public int getNumMes() {
		return numMes;
	}

	public void setNumMes(int numMes) {
		this.numMes = numMes;
	}

	public String getNomMes() {
		return nomMes;
	}

	public void setNomMes(String nomMes) {
		this.nomMes = nomMes;
	}
	
	public mesYNombre() {
		super();
		this.numMes = numMes;
		this.nomMes = nomMes;
	}

	@Override
	public String toString() {
		return "mesYNombre [numMes=" + numMes + ", nomMes=" + nomMes + "]";
	}

	
	
}
