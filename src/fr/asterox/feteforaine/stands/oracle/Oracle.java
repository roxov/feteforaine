package fr.asterox.feteforaine.stands.oracle;

import java.util.List;
import java.util.Scanner;

import fr.asterox.feteforaine.core.Player;
import fr.asterox.feteforaine.stands.Interstands;
import fr.asterox.feteforaine.stands.Stand;

public class Oracle extends Stand {

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
		System.out.println("Vous poussez un rideau de velours et une vieille dame vous apparaît.\r\n"
				+ "Vous vous demandez s'il s'agit d'une perruque.\r\n"
				+ "Elle vous annonce qu'elle peut vous faire n'importe quoi (hmm!) :\r\n"
				+ "vaudou, tirage de cartes, boule de cristal, osselets... ");

		this.exit(players, sc);
	}

	public void exit(List<Player> players, Scanner sc) {

		System.out.println("\r\nLa voyante vous sent septique et vous met dehors, vous pouvez continuer à vous promener.\r\n");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
		Interstands interstands = new Interstands();
		interstands.exit(players, sc);
	}
}
