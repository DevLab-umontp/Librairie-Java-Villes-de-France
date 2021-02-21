package fr.france.outils;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

import fr.france.Caumune;
import fr.france.Departement;
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
    private static final Map<Region, List<Caumune>> REPERTOIRE_CAUMUNE = initialiserRepertoireCaumune();

    public static Region rechercherParNom(String nom) {
        return REPERTOIRE_REGION.rechercherParNom(nom);
    }

    public static List<Caumune> getCaumunes(Region region) {
        return REPERTOIRE_CAUMUNE.get(region);
    }

    private static Map<Region, List<Caumune>> initialiserRepertoireCaumune() {
        EnumMap<Region, List<Caumune>> result = new EnumMap<>(Region.class);
        for (Region region : Region.values()) {
            List<Caumune> caumunes = new ArrayList<>();
            for (Departement departement : region.getDepartements()) {
                caumunes.addAll(departement.getCaumunes());
            }
            result.put(region, caumunes);
        }
        return result;
    }

}
