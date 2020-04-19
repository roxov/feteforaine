package fr.asterox.feteforaine.core;


import java.time.LocalDateTime;

public class Player {

	// Tant qu'aucune valeur n'est assignée à l'attribut, name vaut null.
	private String name;
	private LocalDateTime creationDate;

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

}
