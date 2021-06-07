package com.example.arvores.model;

public class Arvore {


	private int id;

	private String especie;
	private boolean eFrutifera;
	private String dataPlantio;

	public Arvore() {

	}

	public Arvore(int id, String especie, boolean eFrutifera, String dataPlantio) {
		this.id = id;
		this.especie = especie;
		this.eFrutifera = eFrutifera;
		this.dataPlantio = dataPlantio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public boolean iseFrutifera() {
		return eFrutifera;
	}

	public void seteFrutifera(boolean eFrutifera) {
		this.eFrutifera = eFrutifera;
	}

	public String getDataPlantio() {
		return dataPlantio;
	}

	public void setDataPlantio(String dataPlantio) {
		this.dataPlantio = dataPlantio;
	}

	@Override
	public String toString() {
		return "Arvore [id=" + id + ", especie=" + especie + ", eFrutifera=" + eFrutifera + ", dataPlantio="
				+ dataPlantio + "]";
	}

	
	
	
	
}
