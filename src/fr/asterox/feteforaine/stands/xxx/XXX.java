package fr.asterox.feteforaine.stands.xxx;

import java.util.List;
import java.util.Scanner;

import fr.asterox.feteforaine.core.Player;
import fr.asterox.feteforaine.stands.Interstands;
import fr.asterox.feteforaine.stands.Stand;

public class XXX extends Stand {

	private final String name ="XXX";
	private final char letter ='X';
	
	public void comeIn(List<Player> players, Scanner sc) {
		System.out.println("Coquin ! Tu pensais vraiment qu'il y aurait ce genre de stands ici ?!");
		Interstands interstands = new Interstands();
		interstands.exit(players, sc);
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
