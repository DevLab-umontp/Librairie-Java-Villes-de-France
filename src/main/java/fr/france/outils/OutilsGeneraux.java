package fr.france.outils;

import java.text.Normalizer;
import java.util.Locale;
import java.util.regex.Pattern;

public final class OutilsGeneraux {

    private OutilsGeneraux() {
        throw new IllegalStateException("Class utilitaire");
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
     * @return la variable {@code nom} formaté pour la class, de façon supprimer les accents et les caractères spéciaux.
     * 
     * @see String#toUpperCase(Locale)
     * @see supprimerAccent
     * 
     * @since 1.0.0
     */
    public static String formater(String nom) {
        nom = supprimerAccentuation(nom);
        return nom.toLowerCase(Locale.FRANCE).replaceAll("[^a-z]", "");
    }
}
