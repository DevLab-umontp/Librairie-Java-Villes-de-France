package fr.france.outils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import fr.france.Region;

public final class OutilsRegion {
    private OutilsRegion() {
        throw new IllegalStateException("Class utilitaire");
    }

    private static final Map<String, Region> REPERTOIRE_REGION;
    static {
        Map<String, Region> temp = new HashMap<>();
        for (Region departement : Region.values())
            temp.put(OutilsString.formater(departement.getNom()), departement);
        REPERTOIRE_REGION = Collections.unmodifiableMap(temp);
    }

    public static Region rechercherParNom(String nom) {
        nom = OutilsString.formater(nom);
        Region resultat = REPERTOIRE_REGION.get(nom);
        if (resultat == null)
            resultat = trouverMeilleureOccurence(nom);
        return resultat;
    }

    private static Region trouverMeilleureOccurence(String nom) {
        String meilleureOccurence = OutilsString.trouverLaMeilleurOccurence(REPERTOIRE_REGION.keySet(), nom);
        if (meilleureOccurence == null)
            return null;
        return REPERTOIRE_REGION.get(meilleureOccurence);
    }

}
