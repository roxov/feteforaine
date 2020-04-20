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
