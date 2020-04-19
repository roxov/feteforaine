package fr.asterox.feteforaine.words.spinachword;

import java.util.List;
import java.util.Scanner;

import fr.asterox.feteforaine.core.Player;
import fr.asterox.feteforaine.words.Word;

public class Spinachword implements Word {

	@Override
	public void comeIn(List<Player> players, Scanner sc) {
		System.out.println("bienvenu dans le monde des épinards !");
		for(int i = 0; i < 8; i++) {
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// logger quand il y aura des logs
			}
			System.out.print("épinards     ");
		}
		System.out.println("\nEt voilà, le monde des épinards n'est pas incroyable, on en a vite fait le tour !");
	}

	
	
}
