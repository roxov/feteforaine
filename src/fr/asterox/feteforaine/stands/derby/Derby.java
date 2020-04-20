package fr.asterox.feteforaine.stands.derby;

import java.util.List;
import java.util.Scanner;

import fr.asterox.feteforaine.core.Player;
import fr.asterox.feteforaine.stands.Interstands;
import fr.asterox.feteforaine.stands.Stand;

public class Derby extends Stand {

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
		System.out.println("- Bienvenue à l'hippodrome ! \r\n- Prends place et choisis ton cheval."
				+ "- Si tu n'as jamais été à un derby, voici quelques règles simples :\r\n"
				+ "- Jette ces palets dans les trous avec les plus grandes valeurs pour avancer plus vite."
				+ "- Comme tu le vois, gagner une course ne dépend pas uniquement de ton cheval mais aussi de ton agilité ! ");

		this.exit(players, sc);
	}

	public void exit(List<Player> players, Scanner sc) {

		System.out.println("\r\nLa partie est finie, vous pouvez continuer à vous promener.\r\n");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {

		}
		Interstands interstands = new Interstands();
		interstands.exit(players, sc);
	}
}
