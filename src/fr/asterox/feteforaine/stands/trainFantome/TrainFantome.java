package fr.asterox.feteforaine.stands.trainFantome;

import java.util.List;
import java.util.Scanner;

import fr.asterox.feteforaine.core.Player;
import fr.asterox.feteforaine.stands.Interstands;
import fr.asterox.feteforaine.stands.Stand;

public class TrainFantome extends Stand {

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
		System.out.println("Un petit train absolument terrifiant !\r\n"
				+ "Vous n'êtes toujours pas certain qu'il ne s'agissait pas d'un vrai zombie.\r\n"
				+ "Vous allez devoir prendre une barbe-à-papa pour cacher le fait que vous vous soyez pissé dessus. ");

		this.exit(players, sc);
	}

	public void exit(List<Player> players, Scanner sc) {

		System.out.println("\r\nLe tour est fini (ouf!), vous pouvez continuer à vous promener.\r\n");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
		Interstands interstands = new Interstands();
		interstands.exit(players, sc);
	}
}
