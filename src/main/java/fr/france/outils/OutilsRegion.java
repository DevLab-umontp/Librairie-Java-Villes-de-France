package fr.france.outils;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

import fr.france.Commune;
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
    private static final Map<Region, List<Commune>> REPERTOIRE_Commune = initialiserRepertoireCommune();

    public static Region rechercherParNom(String nom) {
        return REPERTOIRE_REGION.rechercherParNom(nom);
    }

    public static List<Commune> getCommunes(Region region) {
        return REPERTOIRE_Commune.get(region);
    }

    private static Map<Region, List<Commune>> initialiserRepertoireCommune() {
        EnumMap<Region, List<Commune>> result = new EnumMap<>(Region.class);
        for (Region region : Region.values()) {
            List<Commune> Communes = new ArrayList<>();
            for (Departement departement : region.getDepartements()) {
                Communes.addAll(departement.getCommunes());
            }
            result.put(region, Communes);
        }
        return result;
    }

}
