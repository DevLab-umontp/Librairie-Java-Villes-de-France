package fr.france;

import fr.france.outils.OutilsDepartement;

public enum Region {
    AUVERGNE_RHONE_ALPES("Auvergne-Rhône-Alpes"), //
    BOURGOGNE_FRANCHE_COMTE("Bourgogne-Franche-Comté"), //
    BRETAGNE("Bretagne"), //
    CENTRE_VAL_DE_LOIRE("Centre-Val de Loire"), //
    CORSE("Corse"), //
    GRAND_EST("Grand Est"), //
    GUADELOUPE("Guadeloupe"), //
    GUYANE("Guyane"), //
    HAUTS_DE_FRANCE("Hauts-de-France"), //
    ILE_DE_FRANCE("Île-de-France"), //
    LA_REUNION("La Réunion"), //
    MARTINIQUE("Martinique"), //
    MAYOTTE("Mayotte"), //
    NORMANDIE("Normandie"), //
    NOUVELLE_AQUITAINE("Nouvelle-Aquitaine"), //
    OCCITANIE("Occitanie"), //
    PAYS_DE_LA_LOIRE("Pays de la Loire"), //
    PROVENCE_ALPES_COTE_D_AZUR("Provence-Alpes-Côte d'Azur"), //
    DEPARTEMENT_NON_RATTACHE_A_UNE_REGION("Département non rattaché à une région.");

    private Departement[] departements;
    private String nom;

    /**
     * @param nom
     */
    private Region(String nom) {
        this.nom = nom;
    }

    /**
     * @return the departements
     */
    public Departement[] getDepartements() {
        if (departements == null)
            departements = OutilsDepartement.filterDepartementsPar(this);
        return departements;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

	public static Object rechercheParNom(String input) {
		return null;
	}
}
