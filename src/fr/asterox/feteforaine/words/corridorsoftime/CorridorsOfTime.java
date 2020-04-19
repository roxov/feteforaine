package fr.asterox.feteforaine.words.corridorsoftime;

import java.util.List;
import java.util.Scanner;

import fr.asterox.feteforaine.core.Player;
import fr.asterox.feteforaine.words.Word;

public class CorridorsOfTime implements Word {

	@Override
	public void comeIn(List<Player> players, Scanner sc) {
		try {
			System.out.println("Per Horus");
			Thread.sleep(1000);
			System.out.println("et per Ra");
			Thread.sleep(1000);
			System.out.println("et per Sol Invictus");
			Thread.sleep(1000);
			System.out.println("duceres");
			// TODO implémenter les couloirs du temps
		} catch(InterruptedException e) {
			// logger quand il y aura des logs
		}
	}

}
