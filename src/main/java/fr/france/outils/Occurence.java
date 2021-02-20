package fr.france.outils;

/**
 * <b>Occurence est la classe représentant une occurence entre deux String.</b>
 * <p>
 * Un objet Occurence est caractérisé par les informations suivantes :
 * <ul>
 * <li>Une valeur String.</li>
 * <li>Un entier qui représente la différence entre deux String.</li>
 * </ul>
 * 
 * @see OutilsString
 * 
 * @author MahieuSoysal
 * @version 1.0.0
 */
class Occurence {
    private String valeur;
    private int difference;

    /**
     * @param valeur
     */
    public Occurence(String valeur, String occurenceCible) {
        this.valeur = valeur;
        difference = -OutilsString.indexOfDifference(valeur, occurenceCible);
    }

    /**
     * @return la valeur
     */
    public String getValeur() {
        return valeur;
    }

    /**
     * @return la difference
     */
    public int getDifference() {
        return difference;
    }

}