package fr.asterox.feteforaine.stands.chamboultout;

import java.util.List;
import java.util.Scanner;

import fr.asterox.feteforaine.core.Player;
import fr.asterox.feteforaine.stands.Stand;

public class Chamboultout extends Stand {

	private final String name = "Chamboultout";
	private final char letter = 'C';

	public void comeIn(List<Player> players, Scanner sc) {
		final String uneBoite = "                 __________\r\n" + "                 |        |\r\n" 
	+ "                 |========|\r\n" + "                 |========|\r\n"
				+ "                 |========|\r\n" + "                 |________|";
		final String deuxBoites = "            __________  __________\r\n" + "            |        |  |        |\r\n" 
				+ "            |========|  |========|\r\n" + "            |========|  |========|\r\n"
				+ "            |========|  |========|\r\n" + "            |________|  |________|";
		final String troisBoites = "     __________  __________  __________\r\n" + "     |        |  |        |  |        |\r\n" 
				+ "     |========|  |========|  |========|\r\n" + "     |========|  |========|  |========|\r\n"
				+ "     |========|  |========|  |========|\r\n" + "     |________|  |________|  |________|";
		final String quatreBoites = "__________  __________  __________  __________\r\n" 
				+ "|        |  |        |  |        |  |        |\r\n" 
				+ "|========|  |========|  |========|  |========|\r\n" 
				+ "|========|  |========|  |========|  |========|\r\n"
				+ "|========|  |========|  |========|  |========|\r\n" 
				+ "|________|  |________|  |________|  |________|";

		System.out.println(
				uneBoite + "\r\n" + deuxBoites + "\r\n" + troisBoites + "\r\n" + quatreBoites);

	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public char getLetter() {
		// TODO Auto-generated method stub
		return letter;
	}

}
