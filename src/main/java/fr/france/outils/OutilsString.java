package fr.france.outils;

import java.text.Normalizer;
import java.util.Collection;
import java.util.Comparator;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class OutilsString {

    private OutilsString() {
        throw new IllegalStateException("Class utilitaire");
    }

    private static final int INDEX_NOT_FOUND = 0;

    public static int indexOfDifference(CharSequence cs1, CharSequence cs2) {
        if (cs1 == cs2)
            return INDEX_NOT_FOUND;
        if (cs1 == null || cs2 == null)
            return 0;
        int i = 0;
        for (; i < cs1.length() && i < cs2.length(); ++i)
            if (cs1.charAt(i) != cs2.charAt(i))
                break;
        if (i < cs2.length() || i < cs1.length())
            return i;
        return INDEX_NOT_FOUND;
    }

    public static String trouverLaMeilleurOccurence(Collection<String> c, String str) {
        PriorityQueue<Occurence> queue = new PriorityQueue<>(Comparator.comparing(Occurence::getDifference));
        queue.addAll(c.stream().map(x -> new Occurence(x, str)).collect(Collectors.toList()));
        Occurence occurence1 = queue.poll();
        Occurence occurence2 = queue.poll();
        if (occurence1.getDifference() != occurence2.getDifference())
            return occurence1.getValeur();
        return null;
    }

	/**
	 * @param str {@code String} auquel l'on doit enlever l'accentuation
	 * 
	 * @return {@code String} sans accentuation.
	 * 
	 * @see Normalizer
	 * 
	 * @since 1.0.0
	 */
	public static String supprimerAccentuation(String str) {
	    String nfdNormalizedString = Normalizer.normalize(str, Normalizer.Form.NFD);
	    Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
	    return pattern.matcher(nfdNormalizedString).replaceAll("");
	}

	/**
	 * @param nom
	 * 
	 * @return la variable {@code nom} formaté de façon à supprimer les accents et
	 *         les caractères spéciaux, ainsi uniformiser les entrées.
	 * 
	 * @see String#toLowerCase(Locale)
	 * @see supprimerAccent
	 * 
	 * @since 1.0.0
	 */
	public static String formater(String nom) {
	    nom = supprimerAccentuation(nom);
	    return nom.toLowerCase(Locale.FRANCE).replaceAll("[^a-z]", "");
	}
}
