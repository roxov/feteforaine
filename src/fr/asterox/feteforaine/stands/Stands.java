package fr.asterox.feteforaine.stands;

import java.util.List;
import java.util.Scanner;

import fr.asterox.feteforaine.core.Player;

public interface Stands {
	// Si on veut prendre en compte plusieurs joueurs, on met List<Player> players. Pour un seul player, on met Player player.
	public void comeIn(List<Player> players, Scanner sc) ;
	
	public String getName() ;

	public char getLetter() ;
}
