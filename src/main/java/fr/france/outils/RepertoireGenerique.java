package fr.france.outils;

import java.util.Map;

class RepertoireGenerique<V> {

    private final Map<String, V> repertoire;

    /**
     * @param repertoire
     */
    public RepertoireGenerique(final Map<String, V> repertoire) {
        this.repertoire = repertoire;
    }

    public V rechercherParNom(String nom) {
        nom = OutilsString.formater(nom);
        V resultat = repertoire.get(nom);
        if (resultat == null)
            resultat = trouverMeilleureOccurence(nom);
        return resultat;
    }

    private V trouverMeilleureOccurence(String nom) {
        String meilleureOccurence = OutilsString.trouverLaMeilleurOccurence(repertoire.keySet(), nom);
        if (meilleureOccurence == null)
            return null;
        return repertoire.get(meilleureOccurence);
    }

}
