package fr.asterox.feteforaine.utils;

import java.util.Map;

/**
 * utilitaire de choix aléatoire.
 */
public class Chooser {

	/**
	 * tire au sort un élément parmis un ensemble en respectant leur probabilité de tirage.
	 * les probabilités sont définis avec des couples clef-valeur dans la map comme suit :
	 * - la clef est un entier qui correspond au cohefficient.
	 * - une clef null, négative ou égale à zéro n'a aucune probabilité d'etre choisie.
	 * - la valeur est l'objet à retourner (la valeur null est admise).
	 * 
	 * @param <T> le type d'élément à choisir.
	 * @param probabilityMap la map des probabilités de tirage au sort.
	 * @return l'élément choisi.
	 * @throws IllegalArgumentException la map est vide, null, ou ne contient aucune probabilité non-nulle.
	 */
	public static <T> T choose(Map<Integer, T> probabilityMap) {
		// TODO à toi de jouer !
		return null;
	}
	
}
