package fr.asterox.feteforaine.core;

import java.util.List;
import java.util.Scanner;

public interface Accessible {
	
	// Si on veut prendre en compte plusieurs joueurs, on met List<Player> players. Pour un seul player, on met Player player.
	public void comeIn(List<Player> players, Scanner sc) ;

}
