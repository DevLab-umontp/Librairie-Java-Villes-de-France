package fr.france.outils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class RepertoireGenerique<T extends Enum<T>> {

    private final Map<String, T> repertoire;

    /**
     * @param enumType the enum
     */
    public RepertoireGenerique(Class<T> enumType) {
        Map<String, T> temp = new HashMap<>();
        for (T departement : enumType.getEnumConstants())
            temp.put(OutilsString.formater(departement.name()), departement);
        this.repertoire = Collections.unmodifiableMap(temp);
    }

    public T rechercherParNom(String nom) {
        nom = OutilsString.formater(nom);
        T resultat = repertoire.get(nom);
        if (resultat == null)
            resultat = trouverMeilleureOccurence(nom);
        return resultat;
    }

    private T trouverMeilleureOccurence(String nom) {
        String meilleureOccurence = OutilsString.trouverLaMeilleurOccurence(repertoire.keySet(), nom);
        if (meilleureOccurence == null)
            return null;
        return repertoire.get(meilleureOccurence);
    }

}
