package fr.asterox.feteforaine.stands.buvette;

import java.util.List;
import java.util.Scanner;

import fr.asterox.feteforaine.core.Player;
import fr.asterox.feteforaine.stands.Stand;

public class Buvette extends Stand {

	private final String name = "Buvette";
	private final char letter = 'B';
	
	@Override
	public void comeIn(List<Player> players, Scanner sc) {
		System.out.println("\r\n\r\nLa buvette est antique, comme le reste des stands. "
				+ "Elle baigne dans un décor rouge avec des touches de bois sombre.\r\n"
				+ "Elle donne envie d'y rester se détendre...contrairement au serveur...\r\n\r\n\r\n");
		new Order().runMenu(players, sc);
		

	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public char getLetter() {
		return letter;
	}

}
