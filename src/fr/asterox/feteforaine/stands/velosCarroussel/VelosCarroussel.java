package fr.asterox.feteforaine.stands.velosCarroussel;

import java.util.List;
import java.util.Scanner;

import fr.asterox.feteforaine.core.Player;
import fr.asterox.feteforaine.stands.Interstands;
import fr.asterox.feteforaine.stands.Stand;

public class VelosCarroussel extends Stand {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public char getLetter() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void comeIn(List<Player> players, Scanner sc) {
		System.out.println("Attention, il va falloir suer un peu pour réussir à faire tourner ce carroussel.\r\n"
				+ "C'est la première fois que vous voyez un carroussel paricipatif !\r\n"
				+ "C'est vrai qu'à l'époque, il n'y avait pas d'électricité.\r\n"
				+ "Allez, pédalez !");

		this.exit(players, sc);
	}

	public void exit(List<Player> players, Scanner sc) {

		System.out.println("\r\nLe tour est fini, vous pouvez continuer à vous promener.\r\n");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
		Interstands interstands = new Interstands();
		interstands.exit(players, sc);
	}
}
