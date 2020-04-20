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
	/*
	 * final empèche la référence Scanner d'être modifiée mais le contenu peut
	 * changer
	 * 
	 */
	private final String name = "Accueil";
	private final char letter = '0';

	public void comeIn(List<Player> players, Scanner sc) {
		System.out.println("__________.__                                                \r\n"
				+ "\\______   \\__| ____   _______  __ ____   ____  __ __   ____  \r\n"
				+ " |    |  _/  |/ __ \\ /    \\  \\/ // __ \\ /    \\|  |  \\_/ __ \\ \r\n"
				+ " |    |   \\  \\  ___/|   |  \\   /\\  ___/|   |  \\  |  /\\  ___/ \r\n"
				+ " |______  /__|\\___  >___|  /\\_/  \\___  >___|  /____/  \\___  >\r\n"
				+ "        \\/        \\/     \\/          \\/     \\/            \\/\r\n\r\n"
				+ "               à la fête forraine d'Asterox\r\n\r\n\r\n\r\n"
				+ "(Appuyez sur Entrée pour découvrir ce monde magnifique)");

		sc.nextLine();
		if (players.isEmpty()) {
			players.add(this.askForNewPlayer(sc));
		}
		/*
		 * Il est préférable d'appeler les méthodes par this. avant de rédiger le bloc
		 * de la méthode.
		 */

		this.welcomeToday();

		this.exit(players, sc);
	}

	/*
	 * Cette méthode doit retourner un type objet : Player (ou String par exemple)
	 * quelle que soit la situation (créer 2 return : un dans try et un dans catch).
	 */
	private Player askForNewPlayer(Scanner sc) {
		Player player = new Player();

		player.setCreationDate(LocalDateTime.now());

		System.out.println("- Quel est ton nom, mon ami ?");

		String name = sc.nextLine();

		System.out.println("- Ravi de te rencontrer " + name + " !");
		/*
		 * return renvoie uniquement la valeur. Donc la variable name définit dans le
		 * scope try (soit entre {}) n'existera plus. Pour récupérer la valeur, on peut
		 * par exemple déclarer une variable en appelant la méthode : String playerName
		 * = this.askName();
		 */
		player.setName(name);

		return player;

	}

	private void welcomeToday() {
		String month = DateTimeFormatter.ofPattern("MMMM", Locale.FRANCE).format(LocalDate.now());
		boolean isVowel = "aeiouy".contains(Character.toString(month.charAt(0)));

		// TODO : créer une classe pour gérer les voyelles
		if (LocalTime.now().isBefore(LocalTime.of(9, 0))) {
			System.out.println(
					"- C'est une drôle d'heure pour venir à la fête forraine mais nous allons ouvrir les portes spécialement pour toi.");
		} else if (LocalTime.now().isBefore(LocalTime.of(13, 0))) {
			if (isVowel)
				System.out.println("- C'est une belle matinée d'" + month + " pour venir à la fête forraine.");
			else
				System.out.println("- C'est une belle matinée de " + month + " pour venir à la fête forraine.");
		} else if (LocalTime.now().isBefore(LocalTime.of(19, 0))) {
			if (isVowel)
				System.out.println("- C'est un bel après-midi d'" + month + " pour venir à la fête forraine.");
			else
				System.out.println("- C'est un bel après-midi de " + month + " pour venir à la fête forraine.");
		} else {
			if (isVowel)
				System.out.println("- C'est une belle soirée d'" + month + " pour venir à la fête forraine.");
			else
				System.out.println("- C'est une belle soirée de " + month + " pour venir à la fête forraine.");

		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

		}
	}

	public void exit(List<Player> players, Scanner sc) {

		System.out.println(
				"\r\n- Nous allons te faire faire un petit voyage dans le temps.\r\n"
				+ "- Ici tous les stands sont d'époque...\r\n"
						+ "- Mais ne t'inquiète pas, on en a rénové certains depuis que l'homme-canon est resté bloqué en haut du chapiteau AHAHAH\r\n"
						+ "- Oui, tu vas voir, on a même un petit chapiteau que l'on a récupéré d'un vieux cirque !\r\n");
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {

		}
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

/*
 * BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 * String name = reader.readLine();
 */
