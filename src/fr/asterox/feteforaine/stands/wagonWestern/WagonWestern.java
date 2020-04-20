package fr.asterox.feteforaine.stands.wagonWestern;

import java.util.List;
import java.util.Scanner;

import fr.asterox.feteforaine.core.Player;
import fr.asterox.feteforaine.stands.Interstands;
import fr.asterox.feteforaine.stands.Stand;

public class WagonWestern extends Stand  {

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
		System.out.println("Intriguez, vous entrez dans ces anciens wagons qui attirent votre oeil depuis votre arrivée.\r\n"
				+ "A l'intérieur, s'alignent plusieurs stands de tirs. ");

		this.exit(players, sc);
	}

	public void exit(List<Player> players, Scanner sc) {

		System.out.println("\r\nLa partie est finie, vous pouvez continuer à vous promener.\r\n");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
		Interstands interstands = new Interstands();
		interstands.exit(players, sc);
	}
}
