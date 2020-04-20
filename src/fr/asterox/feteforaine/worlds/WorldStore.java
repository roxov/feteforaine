package fr.asterox.feteforaine.worlds;

import java.util.HashMap;
import java.util.Map;

import fr.asterox.feteforaine.worlds.corridorsoftime.CorridorsOfTime;
import fr.asterox.feteforaine.worlds.spinachworld.Spinachworld;

public class WorldStore {
	
	private static Map<Class<?>, World> words = initWords();
	
	private static Map<Class<?>, World> initWords() {
		Map<Class<?>, World> wordsMap = new HashMap<>();
		wordsMap.put(Spinachworld.class, new Spinachworld());
		wordsMap.put(CorridorsOfTime.class, new CorridorsOfTime());
		return wordsMap;
	}

	public static World getWord(Class<? extends World> clazz) {
		return words.get(clazz);
	}
}
