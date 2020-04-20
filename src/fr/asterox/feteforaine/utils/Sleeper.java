package fr.asterox.feteforaine.utils;

/**
 * utilitaire de mise en pause du thread courrant.
 */
public class Sleeper {
	
	/**
	 * Attend un certain nombre de millisecondes.
	 * @param time nombre de millisecondes.
	 */
	public static void ms(long time) {
		try {
			Thread.sleep(time);
		} catch(InterruptedException e) {
			throw new RuntimeException("error during a simple sleep", e);
		}
	}
	
	/**
	 * Attend un certain nombre de secondes.
	 * @param time nombre de secondes.
	 */
	public static void s(long time) {
		ms(time * 1000);
	}

	/**
	 * Attend un certain nombre de minutes.
	 * @param time nombre de minutes.
	 */
	public static void m(long time) {
		s(time * 60);
	}
	
	/**
	 * Attend un certain nombre d'heures.
	 * @param time nombre d'heures.
	 */
	public static void h(long time) {
		m(time * 60);
	}
}
