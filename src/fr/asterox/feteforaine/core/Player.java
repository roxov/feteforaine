package fr.asterox.feteforaine.core;


import java.time.LocalDateTime;

public class Player {

	// Tant qu'aucune valeur n'est assignée à l'attribut, name vaut null.
	private String name;
	private LocalDateTime creationDate;
	private int strength = 5;
	private int courage = 5;
	private int agility = 8;

	// Nous avons maintenant un magnifique POJO.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getCourage() {
		return courage;
	}

	public void setCourage(int courage) {
		this.courage = courage;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

		
	
}
