package fr.asterox.feteforaine.stands;

import java.util.List;
import java.util.Scanner;

import fr.asterox.feteforaine.core.Player;
import fr.asterox.feteforaine.stands.accueil.Accueil;
import fr.asterox.feteforaine.stands.autotamponneuses.Autotamponneuses;
import fr.asterox.feteforaine.stands.buvette.Buvette;
import fr.asterox.feteforaine.stands.chamboultout.Chamboultout;
import fr.asterox.feteforaine.stands.derby.Derby;
import fr.asterox.feteforaine.stands.extrem8.Extrem8;
import fr.asterox.feteforaine.stands.funFoto.FunFoto;
import fr.asterox.feteforaine.stands.grandeRoue.GrandeRoue;
import fr.asterox.feteforaine.stands.hommeCanon.HommeCanon;
import fr.asterox.feteforaine.stands.illusionniste.Illusionniste;
import fr.asterox.feteforaine.stands.joyeuxChapiteau.JoyeuxChapiteau;
import fr.asterox.feteforaine.stands.kaleidoscope.Kaleidoscope;
import fr.asterox.feteforaine.stands.laRoueFortune.LaRoueFortune;
import fr.asterox.feteforaine.stands.mailloche.Mailloche;
import fr.asterox.feteforaine.stands.nacelles.Nacelles;
import fr.asterox.feteforaine.stands.oracle.Oracle;
import fr.asterox.feteforaine.stands.pecheCanards.PecheCanards;
import fr.asterox.feteforaine.stands.quizz.Quizz;
import fr.asterox.feteforaine.stands.riviereEnchantee.RiviereEnchantee;
import fr.asterox.feteforaine.stands.strongestMan.StrongestMan;
import fr.asterox.feteforaine.stands.trainFantome.TrainFantome;
import fr.asterox.feteforaine.stands.ultimateArcade.UltimateArcade;
import fr.asterox.feteforaine.stands.velosCarroussel.VelosCarroussel;
import fr.asterox.feteforaine.stands.wagonWestern.WagonWestern;
import fr.asterox.feteforaine.stands.xxx.XXX;
import fr.asterox.feteforaine.stands.yeuxInYeux.YeuxInYeux;
import fr.asterox.feteforaine.stands.zigzag.Zigzag;

public class Interstands {

	public static Stands getStarterStand() {
		return new Accueil();
	}

	public void exit(List<Player> players, Scanner sc) {
		System.out.println("\r\n- Alors, sur quel stand souhaites-tu aller ?\r\n\r\n(Tapez la lettre désirée.)\r\n");
		// Une fois tous les stands créés, afficher une liste ?
		System.out.println("A - Autotamponneuses                   N - Nacelles volantes\r\n"
				+ "B - Buvette                            O - Oracle\r\n"
				+ "C - Chamboultout                       P - Pêche aux canards\r\n"
				+ "D - Derby                              Q - Quizz et Enigmes\r\n"
				+ "E - Extrêmes montagnes russes          R - Rivière Enchantée\r\n"
				+ "F - Fun Foto                           S - Strongest man\r\n"
				+ "G - Grande-roue                        T - Train Fantôme\r\n"
				+ "H - Homme-canon                        U - Ultimate Arcade Games\r\n"
				+ "I - Illusionniste                      V - Vélos-Carroussel\r\n"
				+ "J - Joyeux Chapiteau                   W - Wagon-Western\r\n"
				+ "K - Kaléidoscope géant                 X - XXX\r\n"
				+ "L - La Roue de la Fortune              Y - les Yeux dans les Yeux\r\n"
				+ "M - Mailloche                          Z - Zigzag Fun House");

		String standNumber = sc.nextLine();

		if (standNumber.equalsIgnoreCase("A")) {
			new Autotamponneuses().comeIn(players, sc);
		} else if (standNumber.equalsIgnoreCase("B")) {
			new Buvette().comeIn(players, sc);
		} else if (standNumber.equalsIgnoreCase("C")) {
			new Chamboultout().comeIn(players, sc);
		} else if (standNumber.equalsIgnoreCase("D")) {
			new Derby().comeIn(players, sc);
		} else if (standNumber.equalsIgnoreCase("E")) {
			new Extrem8().comeIn(players, sc);
		} else if (standNumber.equalsIgnoreCase("F")) {
			new FunFoto().comeIn(players, sc);
		} else if (standNumber.equalsIgnoreCase("G")) {
			new GrandeRoue().comeIn(players, sc);
		} else if (standNumber.equalsIgnoreCase("H")) {
			new HommeCanon().comeIn(players, sc);
		} else if (standNumber.equalsIgnoreCase("I")) {
			new Illusionniste().comeIn(players, sc);
		} else if (standNumber.equalsIgnoreCase("J")) {
			new JoyeuxChapiteau().comeIn(players, sc);
		} else if (standNumber.equalsIgnoreCase("K")) {
			new Kaleidoscope().comeIn(players, sc);
			} else if (standNumber.equalsIgnoreCase("L")) {
				new LaRoueFortune().comeIn(players, sc);
			} else if (standNumber.equalsIgnoreCase("M")) {
				new Mailloche().comeIn(players, sc);
			} else if (standNumber.equalsIgnoreCase("N")) {
				new Nacelles().comeIn(players, sc);
			} else if (standNumber.equalsIgnoreCase("O")) {
				new Oracle().comeIn(players, sc);
			} else if (standNumber.equalsIgnoreCase("P")) {
				new PecheCanards().comeIn(players, sc);
			} else if (standNumber.equalsIgnoreCase("Q")) {
				new Quizz().comeIn(players, sc);
			} else if (standNumber.equalsIgnoreCase("R")) {
				new RiviereEnchantee().comeIn(players, sc);
			} else if (standNumber.equalsIgnoreCase("S")) {
				new StrongestMan().comeIn(players, sc);
			} else if (standNumber.equalsIgnoreCase("T")) {
				new TrainFantome().comeIn(players, sc);
			} else if (standNumber.equalsIgnoreCase("U")) {
				new UltimateArcade().comeIn(players, sc);
			} else if (standNumber.equalsIgnoreCase("V")) {
				new VelosCarroussel().comeIn(players, sc);
			} else if (standNumber.equalsIgnoreCase("W")) {
				new WagonWestern().comeIn(players, sc);
		} else if (standNumber.equalsIgnoreCase("X")) {
			new XXX().comeIn(players, sc);
		} else if (standNumber.equalsIgnoreCase("Y")) {
			new YeuxInYeux().comeIn(players, sc);
		} else if (standNumber.equalsIgnoreCase("Z")) {
			new Zigzag().comeIn(players, sc);
		} else {
System.out.println("Il suffisait d'une lettre de l'alphabet. Pour l'instant, recommence du début :D");
		}
	}
}
