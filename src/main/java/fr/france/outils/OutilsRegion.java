package fr.france.outils;

import fr.france.Region;

/**
 * <b>OutilsRegion est la classe utilitaire de la class Region.</b>
 * <p>
 * Elle permet d'alléger la class Region
 * </p>
 * 
 * @see Region
 * 
 * @author MathieuSoysal
 * @version 1.0.0
 */
public final class OutilsRegion {
    private OutilsRegion() {
        throw new IllegalStateException("Class utilitaire");
    }

    private static final RepertoireGenerique<Region> REPERTOIRE_REGION = new RepertoireGenerique<>(Region.class);

    public static Region rechercherParNom(String nom) {
        return REPERTOIRE_REGION.rechercherParNom(nom);
    }

}
