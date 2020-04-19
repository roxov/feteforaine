package fr.asterox.feteforaine.words;

import java.util.HashMap;
import java.util.Map;

import fr.asterox.feteforaine.words.spinachword.Spinachword;

public class WordStore {
	
	private static Map<Class<?>, Word> words = initWords();
	
	private static Map<Class<?>, Word> initWords() {
		Map<Class<?>, Word> wordsMap = new HashMap<>();
		wordsMap.put(Spinachword.class, new Spinachword());
		return wordsMap;
	}

	public static Word getWord(Class<? extends Word> clazz) {
		return words.get(clazz);
	}
}
