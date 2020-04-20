package fr.asterox.feteforaine.stands.kaleidoscope;

import java.util.List;
import java.util.Scanner;

import fr.asterox.feteforaine.core.Player;
import fr.asterox.feteforaine.stands.Interstands;
import fr.asterox.feteforaine.stands.Stand;

public class Kaleidoscope extends Stand {

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
		System.out.println("Une mystérieuse longue-vue vous intrigue.\r\n"
				+ "Elle pointe directement sur la bâche du chapiteau et vous ne voyez pas l'intérêt.\r\n"
				+ "Vous vous approchez et vous appercevez qu'il s'agit en fait d'un kaléidoscope géant.\r\n"
				+ "Des images psychédéliques apparaissent. Vous en oubliez le monde réel.");

		this.exit(players, sc);
	}

	public void exit(List<Player> players, Scanner sc) {

		System.out.println("\r\nVous commencez à voir double, il est temps de continuer à vous promener.\r\n");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
		Interstands interstands = new Interstands();
		interstands.exit(players, sc);
	}
}
