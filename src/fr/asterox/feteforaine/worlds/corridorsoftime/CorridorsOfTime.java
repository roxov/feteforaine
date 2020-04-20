package fr.asterox.feteforaine.worlds.corridorsoftime;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import fr.asterox.feteforaine.core.Player;
import fr.asterox.feteforaine.utils.Sleeper;
import fr.asterox.feteforaine.worlds.World;

public class CorridorsOfTime implements World {

	@Override
	public void comeIn(List<Player> players, Scanner sc) {
		this.displayFormula();
		Optional<Epoch> epoch = this.chooseEpoch(players);
		if(epoch.isPresent()) {
			epoch.get().comeIn(players, sc);
			System.out.println("Bon retour parmi nous !");
		} else {
			Sleeper.s(3);
			System.out.println("Bah t'es encore là !?");
			System.out.println("Eusèbius s'est encore trompé dans sa recette !");
		}
	}
	
	private Optional<Epoch> chooseEpoch(List<Player> players) {
		// TOSURI établir les probabilitées d'époques en fonction du joueur
		// TOSURI choisir une époque
		return Optional.empty();
	}

	private void displayFormula() {
		System.out.println("Per Horus");
		Sleeper.s(1);
		System.out.println("et per Ra");
		Sleeper.s(1);
		System.out.println("et per Sol Invictus");
		Sleeper.s(1);
		System.out.println("duceres");
	}

}
