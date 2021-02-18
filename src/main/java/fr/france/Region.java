package fr.france;

import fr.france.outils.OutilsDepartement;

public enum Region {
    AUVERGNE_RHONE_ALPES, //
    BOURGOGNE_FRANCHE_COMTE, //
    BRETAGNE, //
    CENTRE_VAL_DE_LOIRE, //
    CORSE, //
    GRAND_EST, GUADELOUPE, //
    GUYANE, //
    HAUTS_DE_FRANCE, //
    ILE_DE_FRANCE, //
    LA_REUNION, //
    MARTINIQUE, //
    MAYOTTE, //
    NORMANDIE, //
    NOUVELLE_AQUITAINE, //
    OCCITANIE, //
    PAYS_DE_LA_LOIRE, //
    PROVENCE_ALPES_COTE_D_AZUR;

    private Departement[] departements;

    static {
        for (Region region : Region.values()) {
            region.departements = OutilsDepartement.filterDepartementsPar(region);
        }
    }

    /**
     * @return the departements
     */
    public Departement[] getDepartements() {
        return departements;
    }
}
