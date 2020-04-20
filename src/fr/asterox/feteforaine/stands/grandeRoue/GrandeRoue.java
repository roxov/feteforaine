package fr.asterox.feteforaine.stands.grandeRoue;

import java.util.List;
import java.util.Scanner;

import fr.asterox.feteforaine.core.Player;
import fr.asterox.feteforaine.stands.Interstands;
import fr.asterox.feteforaine.stands.Stand;

public class GrandeRoue extends Stand {

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
		System.out.println("Vous vous installez dans une nacelle de la majestueuse Grande-Roue...\r\n"
				+ "La structure émet des grincements inquiétants... Vous n'êtes plus très sûr de vouloir faire un tour...\r\n"
				+ "Vous vous apprêtez à sortir...Trop tard ! La barre s'est déjà rabbatue sur vous !\r\n"
				+ "Une fois en haut, vous devez bien admettre que la vue est imprenable.\r\n"
				+ "Vous redescendez malgré tout satisfait. L'inquiétude ne vous a pas quitté pendant tout le tour. ");

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
