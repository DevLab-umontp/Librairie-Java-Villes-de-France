package fr.france.outils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import fr.france.Caumune;
import fr.france.Departement;
import fr.france.Region;
import fr.france.RepertoireCaumune;
import fr.france.StatutDepartement;

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
public final class OutilsDepartement {

    private OutilsDepartement() {
        throw new IllegalStateException("Class utilitaire");
    }

    private static final Map<Integer, Departement> REPERTOIRE_CODE = initialiserRepertoireCode();
    private static final RepertoireGenerique<Departement> REPERTOIRE_NOM = new RepertoireGenerique<>(Departement.class);
    private static final Map<Departement, List<Caumune>> REPERTOIRE_CAUMUNE = initialiserRepertoireCaumune();

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
        return REPERTOIRE_NOM.rechercherParNom(nom);
    }

    public static Departement rechercherParCode(int code) {
        return REPERTOIRE_CODE.get(code);
    }

    public static List<Caumune> getCaumunes(Departement departement){
        return REPERTOIRE_CAUMUNE.get(departement);
    }

    private static EnumMap<Departement, List<Caumune>> initialiserRepertoireCaumune() {
        EnumMap<Departement, List<Caumune>> result = new EnumMap<>(Departement.class);
        for (Caumune caumune : RepertoireCaumune.getCaumunes()) {
            Departement departement = caumune.getDepartement();
            List<Caumune> caumunes = result.computeIfAbsent(departement, k -> new ArrayList<>());
            caumunes.add(caumune);
        }
        return result;
    }

    private static Map<Integer, Departement> initialiserRepertoireCode() {
        return OutilsRepertoireGenerique.genererMap(
                Arrays.asList(Departement.values()).stream().map(Departement::getCode).collect(Collectors.toList()),
                Departement.class);
    }
}
