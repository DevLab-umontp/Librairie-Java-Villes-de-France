package fr.france.outils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import fr.france.Commune;
import fr.france.Departement;
import fr.france.Region;
import fr.france.RepertoireCommune;
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
    private static final Map<Departement, List<Commune>> REPERTOIRE_Commune = initialiserRepertoireCommune();

    public static List<Departement> filtrerDepartementsParRegion(Region region) {
        List<Departement> result = new ArrayList<>();
        for (Departement dep : Departement.values())
            if (dep.getRegion().equals(region))
                result.add(dep);
        return result;
    }

    public static List<Departement> filtrerDepartementsParStatut(StatutDepartement statut) {
        List<Departement> result = new ArrayList<>();
        for (Departement dep : Departement.values())
            if (dep.getStatut().equals(statut))
                result.add(dep);
        return result;
    }

    public static Departement rechercherParNom(String nom) {
        return REPERTOIRE_NOM.rechercherParNom(nom);
    }

    public static Departement rechercherParCode(int code) {
        return REPERTOIRE_CODE.get(code);
    }

    public static List<Commune> getCommunes(Departement departement){
        return REPERTOIRE_Commune.getOrDefault(departement, new ArrayList<>());
    }

    private static EnumMap<Departement, List<Commune>> initialiserRepertoireCommune() {
        EnumMap<Departement, List<Commune>> result = new EnumMap<>(Departement.class);
        for (Commune Commune : RepertoireCommune.getCommunes()) {
            Departement departement = Commune.getDepartement();
            List<Commune> Communes = result.computeIfAbsent(departement, k -> new ArrayList<>());
            Communes.add(Commune);
        }
        return result;
    }

    private static Map<Integer, Departement> initialiserRepertoireCode() {
        return OutilsRepertoireGenerique.genererMap(
                Arrays.asList(Departement.values()).stream().map(Departement::getCode).collect(Collectors.toList()),
                Departement.class);
    }
}
