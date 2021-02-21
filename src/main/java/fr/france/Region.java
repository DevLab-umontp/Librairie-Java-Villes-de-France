package fr.france;

import java.util.List;

import fr.france.outils.OutilsDepartement;
import fr.france.outils.OutilsRegion;

/**
 * <b>Region est l'énumérateur représentant chacune des régions françaises.</b>
 * <p>
 * Une {@link Region} est caractérisée par les informations suivantes :
 * </p>
 * <ul>
 * <li>Un nom de région.</li>
 * <li>Une liste de départements qui lui sont ratachées.</li>
 * </ul>
 * <p>
 * De plus, la class {@link Region} possède une méthode
 * {@link Region#rechercherParNom(String)} qui permet de retrouver une région en
 * fonction de son nom.
 * </p>
 * 
 * @see Departement
 * 
 * @author MathieuSoysal
 * @version 1.0.1
 */
public enum Region {
    /**
     * Région de Auvergne-Rhône-Alpes
     */
    AUVERGNE_RHONE_ALPES("Auvergne-Rhône-Alpes"), //
    /**
     * Région de Bourgogne-Franche-Comté
     */
    BOURGOGNE_FRANCHE_COMTE("Bourgogne-Franche-Comté"), //
    /**
     * Région de Bretagne
     */
    BRETAGNE("Bretagne"), //
    /**
     * Région de Centre-Val de Loire
     */
    CENTRE_VAL_DE_LOIRE("Centre-Val de Loire"), //
    /**
     * Région de Corse
     */
    CORSE("Corse"), //
    /**
     * Région de Grand Est
     */
    GRAND_EST("Grand Est"), //
    /**
     * Région de Guadeloupe
     */
    GUADELOUPE("Guadeloupe"), //
    /**
     * Région de Guyane
     */
    GUYANE("Guyane"), //
    /**
     * Région de Hauts-de-France
     */
    HAUTS_DE_FRANCE("Hauts-de-France"), //
    /**
     * Région de Île-de-France
     */
    ILE_DE_FRANCE("Île-de-France"), //
    /**
     * Région de La Réunion
     */
    LA_REUNION("La Réunion"), //
    /**
     * Région de Martinique
     */
    MARTINIQUE("Martinique"), //
    /**
     * Région de Mayotte
     */
    MAYOTTE("Mayotte"), //
    /**
     * Région de Normandie
     */
    NORMANDIE("Normandie"), //
    /**
     * Région de Nouvelle-Aquitaine
     */
    NOUVELLE_AQUITAINE("Nouvelle-Aquitaine"), //
    /**
     * Région de Occitanie
     */
    OCCITANIE("Occitanie"), //
    /**
     * Région de Pays de la Loire
     */
    PAYS_DE_LA_LOIRE("Pays de la Loire"), //
    /**
     * Région de Provence-Alpes-Côte d'Azur
     */
    PROVENCE_ALPES_COTE_D_AZUR("Provence-Alpes-Côte d'Azur"), //
    /**
     * Représente les départements qui ne sont rattachés à aucune région
     */
    DEPARTEMENT_NON_RATTACHE_A_UNE_REGION("Département non rattaché à une région.");

    private List<Departement> departements;
    private String nom;

    /**
     * @param nom Nom de la région
     */
    private Region(String nom) {
        this.nom = nom;
    }

    /**
     * Retourne la {@link Region} correspondant au nom donné en paramètre.
     * 
     * @param nom de la région devant être cherché
     * 
     * @return {@link Region} correpondant au nom donné, sinon retourne {@code null}
     *         si aucune région avec ce nom a été trouvé.
     * 
     * @see Region
     */
    public static Region rechercherParNom(String nom) {
        return OutilsRegion.rechercherParNom(nom);
    }

    /**
     * @return les départements contenus au sein de la région
     * 
     * @see Departement
     */
    public List<Departement> getDepartements() {
        if (departements == null)
            departements = OutilsDepartement.filtrerDepartementsParRegion(this);
        return departements;
    }

    /**
     * @return le nom de la région
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return Toutes les Communes de la région
     * 
     * @see Commune
     */
	public List<Commune> getCommunes() {
		return OutilsRegion.getCommunes(this);
	}

}
