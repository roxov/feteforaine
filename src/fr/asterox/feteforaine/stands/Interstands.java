package fr.asterox.feteforaine.stands;

import java.util.List;
import java.util.Scanner;

import fr.asterox.feteforaine.core.Player;
import fr.asterox.feteforaine.stands.accueil.Accueil;
import fr.asterox.feteforaine.stands.buvette.Buvette;
import fr.asterox.feteforaine.stands.chamboultout.Chamboultout;
import fr.asterox.feteforaine.stands.xxx.XXX;

public class Interstands {

	public static Stands getStarterStand() {
		return new Accueil();
	}
	
	public void exit(List<Player> players, Scanner sc) {
	System.out.println("\r\nAlors, sur quel stand souhaites-tu aller ?\r\n\r\n(Tapez la lettre désirée.)\r\n");
		// Une fois tous les stands créés, afficher une liste ?
				System.out.println("B - Buvette\r\nC - Chamboultout\r\nM - Mailloche");
				String standNumber = sc.nextLine();
				
				if (standNumber.equalsIgnoreCase("B"))
					{new Buvette().comeIn(players, sc);
					}
				else if (standNumber.equalsIgnoreCase("C"))
				{new Chamboultout().comeIn(players, sc);
			}
				else if (standNumber.equalsIgnoreCase("X"))
					{new XXX().comeIn(players, sc);
				}
				else {
					
				}
	}
}
