package fr.france.outils;

import java.util.ArrayList;
import java.util.Collection;

import fr.france.Departement;
import fr.france.Region;

public final class OutilsDepartement {
    private OutilsDepartement() {
        throw new IllegalStateException("Class utilitaire");
    }

    private static final RepertoireGenerique<Departement> REPERTOIRE_DEPARTEMENT = new RepertoireGenerique<>(Departement.class);

    public static Departement[] filtrerDepartementsParRegion(Region region) {
        Collection<Departement> result = new ArrayList<>();
        for (Departement dep : Departement.values())
            if (dep.getRegion().equals(region))
                result.add(dep);
        return result.toArray(new Departement[0]);
    }

    public static Departement rechercherParNom(String nom) {
        return REPERTOIRE_DEPARTEMENT.rechercherParNom(nom);
    }
}
