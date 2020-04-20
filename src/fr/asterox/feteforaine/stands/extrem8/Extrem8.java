package fr.asterox.feteforaine.stands.extrem8;

import java.util.List;
import java.util.Scanner;

import fr.asterox.feteforaine.core.Player;
import fr.asterox.feteforaine.stands.Interstands;
import fr.asterox.feteforaine.stands.Stand;

public class Extrem8 extends Stand {

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
		System.out.println("Bienvenue sur les plus impressionnantes montagnes russes du monde !");

		this.exit(players, sc);
	}

	public void exit(List<Player> players, Scanner sc) {

		System.out.println("\r\nLe tour est terminé, vous pouvez continuer à vous promener.\r\n");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
		Interstands interstands = new Interstands();
		interstands.exit(players, sc);
	}
}
