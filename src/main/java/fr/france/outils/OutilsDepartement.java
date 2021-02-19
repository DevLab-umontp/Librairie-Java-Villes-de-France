package fr.france.outils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import fr.france.Departement;
import fr.france.Region;
import fr.france.StatutDepartement;

public final class OutilsDepartement {

    private OutilsDepartement() {
        throw new IllegalStateException("Class utilitaire");
    }

    private static final Stream<Departement> STREAM = Arrays.asList(Departement.values()).stream();
    private static final Map<Integer, Departement> REPERTOIRE_CODE = OutilsRepertoireGenerique
            .genererMap(STREAM.map(Departement::getCode).collect(Collectors.toList()), Departement.class);
    private static final RepertoireGenerique<Departement> REPERTOIRE_DEPARTEMENT = new RepertoireGenerique<>(
            Departement.class);

    public static Departement[] filtrerDepartementsParRegion(Region region) {
        Collection<Departement> result = new ArrayList<>();
        for (Departement dep : Departement.values())
            if (dep.getRegion().equals(region))
                result.add(dep);
        return result.toArray(new Departement[0]);
    }

    public static Departement[] filtrerDepartementsParStatut(StatutDepartement statut) {
        Collection<Departement> result = new ArrayList<>();
        for (Departement dep : Departement.values())
            if (dep.getStatut().equals(statut))
                result.add(dep);
        return result.toArray(new Departement[0]);
    }

    public static Departement rechercherParNom(String nom) {
        return REPERTOIRE_DEPARTEMENT.rechercherParNom(nom);
    }

    public static Departement rechercherParCode(int code) {
        return REPERTOIRE_CODE.get(code);
    }
}
