package fr.france.outils;

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
     * @return the valeur
     */
    public String getValeur() {
        return valeur;
    }

    /**
     * @return the difference
     */
    public int getDifference() {
        return difference;
    }

}