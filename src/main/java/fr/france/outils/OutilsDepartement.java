package fr.france.outils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import fr.france.Departement;
import fr.france.Region;

public final class OutilsDepartement {
    private OutilsDepartement() {
        throw new IllegalStateException("Class utilitaire");
    }

    private static final Map<String, Departement> REPERTOIRE_DEPARTEMENT;
    static {
        Map<String, Departement> temp = new HashMap<>();
        for (Departement departement : Departement.values())
            temp.put(OutilsString.formater(departement.getNom()), departement);
        REPERTOIRE_DEPARTEMENT = Collections.unmodifiableMap(temp);
    }

    public static Departement[] filtrerDepartementsParRegion(Region region) {
        Collection<Departement> result = new ArrayList<>();
        for (Departement dep : Departement.values())
            if (dep.getRegion().equals(region))
                result.add(dep);
        return result.toArray(new Departement[0]);
    }

    public static Departement rechercherParNom(String nom) {
        nom = OutilsString.formater(nom);
        Departement resultat = REPERTOIRE_DEPARTEMENT.get(nom);
        if (resultat == null)
            resultat = trouverMeilleureOccurence(nom);
        return resultat;
    }

    private static Departement trouverMeilleureOccurence(String nom) {
        String meilleureOccurence = OutilsString.trouverLaMeilleurOccurence(REPERTOIRE_DEPARTEMENT.keySet(), nom);
        if (meilleureOccurence == null)
            return null;
        return REPERTOIRE_DEPARTEMENT.get(meilleureOccurence);
    }
}
