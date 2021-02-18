package fr.france.outils;

import java.util.ArrayList;
import java.util.Collection;

import fr.france.Departement;
import fr.france.Region;

public class OutilsDepartement {

    private OutilsDepartement() {
        throw new IllegalStateException("Class utilitaire");
    }

    public static Departement[] filterDepartementsPar(Region region) {
        Collection<Departement> result = new ArrayList<>();
        for (Departement dep : Departement.values())
            if (dep.getRegion().equals(region))
                result.add(dep);
        return result.toArray(new Departement[0]);
    }
}
