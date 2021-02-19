package fr.france.outils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import fr.france.Region;

public final class OutilsRegion {
    private OutilsRegion() {
        throw new IllegalStateException("Class utilitaire");
    }

    private static final RepertoireGenerique<Region> REPERTOIRE_REGION;
    static {
        Map<String, Region> temp = new HashMap<>();
        for (Region departement : Region.values())
            temp.put(OutilsString.formater(departement.getNom()), departement);
        REPERTOIRE_REGION = new RepertoireGenerique<>(Collections.unmodifiableMap(temp));
    }

    public static Region rechercherParNom(String nom) {
        return REPERTOIRE_REGION.rechercherParNom(nom);
    }

}
