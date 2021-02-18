package fr.france.outils;

import java.util.ArrayList;
import java.util.Collection;
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
        REPERTOIRE_DEPARTEMENT = new HashMap<>();
        for (Departement departement : Departement.values())
            REPERTOIRE_DEPARTEMENT.put(OutilsGeneraux.formater(departement.getNom()), departement);
    }

    public static Departement[] filterDepartementsPar(Region region) {
        Collection<Departement> result = new ArrayList<>();
        for (Departement dep : Departement.values())
            if (dep.getRegion().equals(region))
                result.add(dep);
        return result.toArray(new Departement[0]);
    }

    public static Departement rechercheParNom(String nom) {
        return REPERTOIRE_DEPARTEMENT.get(OutilsGeneraux.formater(nom));
    }
}
