package fr.asterox.feteforaine.stands.hommeCanon;

import java.util.List;
import java.util.Scanner;

import fr.asterox.feteforaine.core.Player;
import fr.asterox.feteforaine.stands.Interstands;
import fr.asterox.feteforaine.stands.Stand;

public class HommeCanon extends Stand {

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
		System.out.println("L'homme-Canon est envoyé tellement loin qu'on dirait qu'il atteint la Lune !\r\n"
				+ "Un peu sonné, il a toujours du mal à retourner à sa roulotte.\r\n"
				+ "Allez-vous pouvoir le retrouver pour l'aider à rentrer ?");

		this.exit(players, sc);
	}

	public void exit(List<Player> players, Scanner sc) {

		System.out.println("\r\nLe spectacle est terminé, vous pouvez continuer à vous promener.\r\n");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
		Interstands interstands = new Interstands();
		interstands.exit(players, sc);
	}
}
