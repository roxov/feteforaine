package fr.asterox.feteforaine.stands.buvette;

import java.util.List;
import java.util.Scanner;

import fr.asterox.feteforaine.core.Player;
import fr.asterox.feteforaine.words.WordStore;
import fr.asterox.feteforaine.words.corridorsoftime.CorridorsOfTime;
import fr.asterox.feteforaine.words.spinachword.Spinachword;

public class Order {
	/** Attribut qui peut être utilisé dans toute la classe et qui prédéfinit l'objet instancié comme un standard input 
	 * final empèche la référence Scanner d'être modifiée mais le contenu peut changer
	 */
	//private final Scanner sc = new Scanner(System.in);
	
		
	public void runMenu(List<Player> players, Scanner sc) {
	this.displayAvailableMenus();
	this.displaySelectedMenu(players, sc);
	}
	
	/** Affiche tous les plats disponibles */	
	public void displayAvailableMenus() {
		System.out.println("Qu'est-ce qu'on te sert ? \r\nVoilà l'ardoise :\r\n");
		System.out.println("Bière \r\nPotion magique\r\nFiole marquée \"Buvez-moi\"---------------- \r\n"
				+ "Epinards \r\nChampignon magique géant\r\nGourdasse d'Eusèbius");
		
	
	}
	
	public void displaySelectedMenu(List<Player> players, Scanner sc) {
				
		String menuName = sc.nextLine();
		/** String input */
		
		while (!menuName.equalsIgnoreCase("Bière") &&
				!menuName.equalsIgnoreCase("Potion magique") &&
				!menuName.equalsIgnoreCase("Champignon magique géant") &&
				!menuName.equalsIgnoreCase("Champignon magique jaune" ) &&
				!menuName.equalsIgnoreCase("Epinards" ) &&
				!menuName.equalsIgnoreCase("Gourdasse d'Eusèbius" )) {
			System.out.println("T'es bigleux ou quoi ? C'est pas sur l'ardoire ça ! Tu veux quoi ?");
			menuName = sc.nextLine();
		}
		// Plus tard utiliser un switch pour rentrer dans les fonctions de chaque aliment.
		
		System.out.println("Et 1 " + menuName + " pour " + "playerName" + " !");
		/** Affiche le menu sélectionné */
		// tu prendras autre chose ? gloups !
		
//		if(menuName.equalsIgnoreCase("Epinards")) {
//			WordStore.getWord(Spinachword.class).comeIn(players, sc);
//		}
		if(menuName.equalsIgnoreCase("Gourdasse d'Eusèbius")) {
			WordStore.getWord(CorridorsOfTime.class).comeIn(players, sc);
		}
		
	}
	
}
