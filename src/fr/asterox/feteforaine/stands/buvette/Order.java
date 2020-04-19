package fr.asterox.feteforaine.stands.buvette;

import java.util.Scanner;

public class Order {
	/** Attribut qui peut �tre utilis� dans toute la classe et qui pr�d�finit l'objet instanci� comme un standard input 
	 * final emp�che la r�f�rence Scanner d'�tre modifi�e mais le contenu peut changer
	 */
	private final Scanner sc = new Scanner(System.in);
	
		
	public void runMenu() {
	this.displayAvailableMenus();
	this.displaySelectedMenu(sc);
	}
	
	/** Affiche tous les plats disponibles */	
	public void displayAvailableMenus() {
		System.out.println("Qu'est-ce qu'on te sert ? \r\nVoil� l'ardoise :\r\n");
		System.out.println("Bi�re \r\nPotion magique\r\nFiole marqu�e \"Buvez-moi\"---------------- \r\n"
				+ "Epinards \r\nChampignon magique g�ant");
		
	
	}
	
	public void displaySelectedMenu(Scanner sc) {
				
		String menuName = sc.nextLine();
		/** String input */
		
		while (!menuName.equalsIgnoreCase("Bi�re") && !menuName.equalsIgnoreCase("Potion magique") && !menuName.equalsIgnoreCase("Champignon magique g�ant") && !menuName.equalsIgnoreCase("Champignon magique jaune" )) {
			System.out.println("T'es bigleux ou quoi ? C'est pas sur l'ardoire �a ! Tu veux quoi ?");
			menuName = sc.nextLine();
		}
		// Plus tard utiliser un switch pour rentrer dans les fonctions de chaque aliment.
		
		System.out.println("Et 1 " + menuName + " pour " + "playerName" + " !");
		/** Affiche le menu s�lectionn� */
		// tu prendras autre chose ? gloups !
		
		
	}
	
}
