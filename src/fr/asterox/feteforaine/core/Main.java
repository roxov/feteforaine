package fr.asterox.feteforaine.core;

import java.util.ArrayList;
import java.util.Scanner;

import fr.asterox.feteforaine.stands.Interstands;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Interstands.getStarterStand().comeIn(new ArrayList<>(), sc);
		
		sc.close();
	}
}

//Order order = new Order ();
//order.runMenu();
// Pour l'instant le code ne traite pas les erreurs si on rentre un String (plantage) ou un chiffre tro grand.