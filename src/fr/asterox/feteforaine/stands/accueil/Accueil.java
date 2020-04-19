package fr.asterox.feteforaine.stands.accueil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
//import java.util.* permet de citer toutes les classes contenues par java.io. sans faire appel � leur nom canonique (complet). 
import java.util.Scanner;

import fr.asterox.feteforaine.core.Player;
import fr.asterox.feteforaine.stands.Interstands;
import fr.asterox.feteforaine.stands.Stand;

public class Accueil extends Stand {

	private final String name = "Accueil";
	private final char letter ='0';
	
	public void comeIn(List<Player> players, Scanner sc) {
		System.out.println("__________.__                                                \r\n"
				+ "\\______   \\__| ____   _______  __ ____   ____  __ __   ____  \r\n"
				+ " |    |  _/  |/ __ \\ /    \\  \\/ // __ \\ /    \\|  |  \\_/ __ \\ \r\n"
				+ " |    |   \\  \\  ___/|   |  \\   /\\  ___/|   |  \\  |  /\\  ___/ \r\n"
				+ " |______  /__|\\___  >___|  /\\_/  \\___  >___|  /____/  \\___  >\r\n"
				+ "        \\/        \\/     \\/          \\/     \\/            \\/\r\n\r\n"
				+ "               � la f�te forraine d'Asterox\r\n\r\n\r\n\r\n"
				+ "(Appuyez sur Entr�e pour d�couvrir ce monde magnifique)");

		sc.nextLine();
		if(players.isEmpty()) {
			players.add(this.askForNewPlayer(sc));
		}
/* 
 * Il est pr�f�rable d'appeler les m�thodes par this. avant de r�diger le bloc de la m�thode.
 */
		this.welcomeToday();
		this.exit(players, sc);
	}

	

	/* Cette m�thode doit retourner un type objet : Player (ou String par exemple) quelle que soit la situation (cr�er 2 return : un dans try et un dans catch).
	 */
	private Player askForNewPlayer(Scanner sc) {
		Player player = new Player();
		
		player.setCreationDate(LocalDateTime.now());
		
		System.out.println("Quel est ton nom, mon ami ?");

		String name = sc.nextLine();

		System.out.println("Ravi de te rencontrer " + name + " !");
		/*
		 * return renvoie uniquement la valeur. Donc la variable name d�finit dans le
		 * scope try (soit entre {}) n'existera plus. Pour r�cup�rer la valeur, on peut
		 * par exemple d�clarer une variable en appelant la m�thode : String playerName
		 * = this.askName();
		 */
		player.setName(name);
		
		return player;

	}
	
	private void welcomeToday() {
		String month = DateTimeFormatter.ofPattern("MMMM", Locale.FRANCE).format(LocalDate.now());
		boolean isVowel = "aeiouy".contains(Character.toString(month.charAt(0)));
		
		// TODO : cr�er une classe pour g�rer les voyelles
		if(LocalTime.now().isBefore(LocalTime.of(9, 0))) {
			System.out.println("C'est une dr�le d'heure pour venir � la f�te forraine mais nous allons ouvrir les portes sp�cialement pour toi.");
		}else if(LocalTime.now().isBefore(LocalTime.of(13, 0))){
			if (isVowel)
			System.out.println("C'est une belle matin�e d'"+ month + " pour venir � la f�te forraine.");
			else
				System.out.println("C'est une belle matin�e de "+ month + " pour venir � la f�te forraine.");
		}else if(LocalTime.now().isBefore(LocalTime.of(19, 0))){
			if (isVowel)
			System.out.println("C'est un bel apr�s-midi d'" + month + " pour venir � la f�te forraine.");
			else
				System.out.println("C'est un bel apr�s-midi de " + month + " pour venir � la f�te forraine.");
		}else {
			if (isVowel)
			System.out.println("C'est une belle soir�e d'" + month + " pour venir � la f�te forraine.");
			else
				System.out.println("C'est une belle soir�e de " + month + " pour venir � la f�te forraine.");
		
		}
		
	}



	public void exit(List<Player> players, Scanner sc) {
		System.out.println("\r\nNous allons te faire faire un petit voyage dans le temps.\r\nIci tous les stands sont d'�poque...\r\n"
				+ "Mais ne t'inqui�te pas, on en a r�nov� certains depuis que l'homme-canon est rest� bloqu� en haut du chapiteau AHAHAH\r\n"
				+ "Oui, tu vas voir, on a m�me un petit chapiteau que l'on a r�cup�r� d'un vieux cirque !\r\n");
	Interstands interstands = new Interstands() ;
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

/*
 * BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 * String name = reader.readLine();
 */
