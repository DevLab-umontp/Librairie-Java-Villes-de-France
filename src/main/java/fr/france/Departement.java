package fr.france;

public enum Departement {
    AIN(1, TypeDepartement.DPT, "Ain", "Bourg-en-Bresse", Region.AUVERGNE_RHONE_ALPES), //
    AISNE(2, TypeDepartement.DPT, "Aisne", "Laon", Region.HAUTS_DE_FRANCE), //
    ALLIER(3, TypeDepartement.DPT, "Allier", "Moulins", Region.AUVERGNE_RHONE_ALPES), //
    ALPES_DE_HAUTES_PROVENCE(4, TypeDepartement.DPT, "Alpes de Hautes-Provence", "Digne",
            Region.PROVENCE_ALPES_COTE_D_AZUR), //
    HAUTES_ALPES(5, TypeDepartement.DPT, "Hautes-Alpes", "Gap", Region.PROVENCE_ALPES_COTE_D_AZUR), //
    ALPES_MARITIMES(6, TypeDepartement.DPT, "Alpes-Maritimes", "Nice", Region.PROVENCE_ALPES_COTE_D_AZUR), //
    ARDECHE(7, TypeDepartement.DPT, "Ardèche", "Privas", Region.AUVERGNE_RHONE_ALPES), //
    ARDENNES(8, TypeDepartement.DPT, "Ardennes", "Charleville-Mézières", Region.GRAND_EST), //
    ARIEGE(9, TypeDepartement.DPT, "Ariege", "Foix", Region.OCCITANIE), //
    AUBE(10, TypeDepartement.DPT, "Aube", "Troyes", Region.GRAND_EST), //
    AUDE(11, TypeDepartement.DPT, "Aude", "Carcassonne", Region.OCCITANIE), //
    AVEYRON(12, TypeDepartement.DPT, "Aveyron", "Rodez", Region.OCCITANIE), //
    BOUCHES_DU_RHONE(13, TypeDepartement.DPT, "Bouches-Du-Rhône", "Marseille", Region.PROVENCE_ALPES_COTE_D_AZUR), //
    CALVADOS(14, TypeDepartement.DPT, "Calvados", "Caen", Region.NORMANDIE), //
    CANTAL(15, TypeDepartement.DPT, "Cantal", "Aurillac", Region.AUVERGNE_RHONE_ALPES), //
    CHARENTE(16, TypeDepartement.DPT, "Charente", "Angoulême", Region.NOUVELLE_AQUITAINE), //
    CHARENTE_MARITIME(17, TypeDepartement.DPT, "Charente-Maritime", "La Rochelle", Region.NOUVELLE_AQUITAINE), //
    CHER(18, TypeDepartement.DPT, "Cher", "Bourges", Region.CENTRE_VAL_DE_LOIRE), //
    CORREZE(19, TypeDepartement.DPT, "Correze", "Tulle", Region.NOUVELLE_AQUITAINE), //
    CORSE_DU_SUD(20, TypeDepartement.DPT, "Corse-du-Sud", "Ajaccio", Region.CORSE), //
    HAUTE_CORSE(20, TypeDepartement.DPT, "Haute-Corse", "Bastia", Region.CORSE), //
    COTE_D_OR(21, TypeDepartement.DPT, "Côte-d'Or", "Dijon", Region.BOURGOGNE_FRANCHE_COMTE), //
    COTES_D_ARMOR(22, TypeDepartement.DPT, "Côtes d'Armor", "Saint-brieuc", Region.BRETAGNE), //
    CREUSE(23, TypeDepartement.DPT, "Creuse", "Guéret", Region.NOUVELLE_AQUITAINE), //
    DORDOGNE(24, TypeDepartement.DPT, "Dordogne", "Périgueux", Region.NOUVELLE_AQUITAINE), //
    DOUBS(25, TypeDepartement.DPT, "Doubs", "Besançon", Region.BOURGOGNE_FRANCHE_COMTE), //
    DROME(26, TypeDepartement.DPT, "Drôme", "Valence", Region.AUVERGNE_RHONE_ALPES), //
    EURE(27, TypeDepartement.DPT, "Eure", "Évreux", Region.NORMANDIE), //
    EURE_ET_LOIR(28, TypeDepartement.DPT, "Eure-et-Loir", "Chartres", Region.CENTRE_VAL_DE_LOIRE), //
    FINISTERE(29, TypeDepartement.DPT, "Finistere", "Quimper", Region.BRETAGNE), //
    GARD(30, TypeDepartement.DPT, "Gard", "Nîmes", Region.OCCITANIE), //
    HAUTE_GARONNE(31, TypeDepartement.DPT, "Haute-Garonne", "Toulouse", Region.OCCITANIE), //
    GERS(32, TypeDepartement.DPT, "Gers", "Auch", Region.OCCITANIE), //
    GIRONDE(33, TypeDepartement.DPT, "Gironde", "Bordeaux", Region.NOUVELLE_AQUITAINE), //
    HERAULT(34, TypeDepartement.DPT, "Hérault", "Montpellier", Region.OCCITANIE), //
    ILLE_ET_VILAINE(35, TypeDepartement.DPT, "Ille-et-Vilaine", "Rennes", Region.BRETAGNE), //
    INDRE(36, TypeDepartement.DPT, "Indre", "Châteauroux", Region.CENTRE_VAL_DE_LOIRE), //
    INDRE_ET_LOIRE(37, TypeDepartement.DPT, "Indre-et-Loire", "Tours", Region.CENTRE_VAL_DE_LOIRE), //
    ISERE(38, TypeDepartement.DPT, "Isère", "Grenoble", Region.AUVERGNE_RHONE_ALPES), //
    JURA(39, TypeDepartement.DPT, "Jura", "Lons-le-Saunier", Region.BOURGOGNE_FRANCHE_COMTE), //
    LANDES(40, TypeDepartement.DPT, "Landes", "Mont-de-Marsan", Region.NOUVELLE_AQUITAINE), //
    LOIR_ET_CHER(41, TypeDepartement.DPT, "Loir-et-Cher", "Blois", Region.CENTRE_VAL_DE_LOIRE), //
    LOIRE(42, TypeDepartement.DPT, "Loire", "Saint-Étienne", Region.AUVERGNE_RHONE_ALPES), //
    HAUTE_LOIRE(43, TypeDepartement.DPT, "Haute-Loire", "Le Puy-en-Velay", Region.AUVERGNE_RHONE_ALPES), //
    LOIRE_ATLANTIQUE(44, TypeDepartement.DPT, "Loire-Atlantique", "Nantes", Region.PAYS_DE_LA_LOIRE), //
    LOIRET(45, TypeDepartement.DPT, "Loiret", "Orléans", Region.CENTRE_VAL_DE_LOIRE), //
    LOT(46, TypeDepartement.DPT, "Lot", "Cahors", Region.OCCITANIE), //
    LOT_ET_GARONNE(47, TypeDepartement.DPT, "Lot-et-Garonne", "Agen", Region.NOUVELLE_AQUITAINE), //
    LOZERE(48, TypeDepartement.DPT, "Lozère", "Mende", Region.OCCITANIE), //
    MAINE_ET_LOIRE(49, TypeDepartement.DPT, "Maine-et-Loire", "Angers", Region.PAYS_DE_LA_LOIRE), //
    MANCHE(50, TypeDepartement.DPT, "Manche", "Saint-lô", Region.NORMANDIE), //
    MARNE(51, TypeDepartement.DPT, "Marne", "Châlons-en-champagne", Region.GRAND_EST), //
    HAUTE_MARNES(52, TypeDepartement.DPT, "Haute-Marne", "Chaumont", Region.GRAND_EST), //
    MAYENNE(53, TypeDepartement.DPT, "Mayenne", "Laval", Region.PAYS_DE_LA_LOIRE), //
    MEURTHE_ET_MOSELLE(54, TypeDepartement.DPT, "Meurthe-et-Moselle", "Nancy", Region.GRAND_EST), //
    MEUSE(55, TypeDepartement.DPT, "Meuse", "Bar-le-Duc", Region.GRAND_EST), //
    MORBIHAN(55, TypeDepartement.DPT, "Morbihan", "Vannes", Region.BRETAGNE), //
    MOSELLE(57, TypeDepartement.DPT, "Moselle", "Metz", Region.GRAND_EST), //
    NIEVRE(58, TypeDepartement.DPT, "Nièvre", "Nevers", Region.BOURGOGNE_FRANCHE_COMTE), //
    NORD(59, TypeDepartement.DPT, "Nord", "Lille", Region.HAUTS_DE_FRANCE), //
    OISE(60, TypeDepartement.DPT, "Oise", "Beauvais", Region.HAUTS_DE_FRANCE), //
    ORNE(61, TypeDepartement.DPT, "Orne", "Alençon", Region.NORMANDIE), //
    PAS_DE_CALAIS(62, TypeDepartement.DPT, "Pas-de-Calais", "Arras", Region.HAUTS_DE_FRANCE), //
    PUT_DE_DOME(63, TypeDepartement.DPT, "Puy-de-Dôme", "Clermont-Ferrand", Region.AUVERGNE_RHONE_ALPES), //
    PYRENEES_ATLANTIQUES(64, TypeDepartement.DPT, "Pyrénées-Atlantiques", "Pau", Region.NOUVELLE_AQUITAINE), //
    HAUTES_PYRENEES(65, TypeDepartement.DPT, "Hautes-Pyrénées", "Tarbes", Region.OCCITANIE), //
    PYRENEES_ORIENTALES(66, TypeDepartement.DPT, "Pyrénées-Orientales", "Perpignan", Region.OCCITANIE), //
    BAS_RHIN(67, TypeDepartement.DPT, "Bas-Rhin", "Strasbourg", Region.GRAND_EST), //
    HAUT_RHIN(68, TypeDepartement.DPT, "Haut-Rhin", "Colmar", Region.GRAND_EST), //
    RHONE(69, TypeDepartement.DPT, "Rhône", "Lyon", Region.AUVERGNE_RHONE_ALPES), //
    HAUTE_SAONE(70, TypeDepartement.DPT, "Haute-Sâone", "Vesoul", Region.BOURGOGNE_FRANCHE_COMTE), //
    SAONE_ET_LOIRE(71, TypeDepartement.DPT, "Saône-et-Loire", "Mâcon", Region.BOURGOGNE_FRANCHE_COMTE), //
    SARTHES(72, TypeDepartement.DPT, "Sarthe", "Le Mans", Region.PAYS_DE_LA_LOIRE), //
    SAVOIE(73, TypeDepartement.DPT, "Savoie", "Chambéry", Region.AUVERGNE_RHONE_ALPES), //
    HAUTE_SAVOIE(74, TypeDepartement.DPT, "Haute-Savoie", "Annecy", Region.AUVERGNE_RHONE_ALPES), //
    PARIS(75, TypeDepartement.DPT, "Paris", "Paris", Region.ILE_DE_FRANCE), //
    SEINE_MARITIME(76, TypeDepartement.DPT, "Seine-Maritime", "Rouen", Region.NORMANDIE), //
    SEINE_ET_MARNE(77, TypeDepartement.DPT, "Seine-et-Marne", "Melun", Region.ILE_DE_FRANCE), //
    YVELINES(78, TypeDepartement.DPT, "Yvelines", "Versailles", Region.ILE_DE_FRANCE), //
    DEUX_SEVRES(79, TypeDepartement.DPT, "Deux-Sèvres", "Niort", Region.NOUVELLE_AQUITAINE), //
    SOMMES(80, TypeDepartement.DPT, "Sommes", "Amiens", Region.HAUTS_DE_FRANCE), //
    TARN(81, TypeDepartement.DPT, "Tarn", "Albi", Region.OCCITANIE), //
    TARN_ET_GARONNE(82, TypeDepartement.DPT, "Tarn-et-Garonne", "Montauban", Region.OCCITANIE), //
    VAR(83, TypeDepartement.DPT, "Var", "Toulon", Region.PROVENCE_ALPES_COTE_D_AZUR), //
    VAUCLUSE(84, TypeDepartement.DPT, "Vaucluse", "Avignon", Region.PROVENCE_ALPES_COTE_D_AZUR), //
    VENDEE(85, TypeDepartement.DPT, "Vendée", "La Roche-sur-Yon", Region.PAYS_DE_LA_LOIRE), //
    VIENNES(86, TypeDepartement.DPT, "Vienne", "Poitiers", Region.NOUVELLE_AQUITAINE), //
    HAUTE_VIENNE(87, TypeDepartement.DPT, "Haute-Vienne", "Limoges", Region.NOUVELLE_AQUITAINE), //
    VOSGES(88, TypeDepartement.DPT, "Vosges", "Épinal", Region.GRAND_EST), //
    YONNE(89, TypeDepartement.DPT, "Yonne", "Auxerre", Region.BOURGOGNE_FRANCHE_COMTE), //
    TERRITOIRE_DE_BELFORT(90, TypeDepartement.DPT, "Territoire-de-Belfort", "Belfort", Region.BOURGOGNE_FRANCHE_COMTE), //
    ESSONE(91, TypeDepartement.DPT, "Essonne", "Évry", Region.ILE_DE_FRANCE), //
    HAUTS_DE_SEINE(92, TypeDepartement.DPT, "Hauts-de-Seine", "Nanterre", Region.ILE_DE_FRANCE), //
    SEINE_SAINT_DENIS(93, TypeDepartement.DPT, "Seine-Saint-Denis", "Bobigny", Region.ILE_DE_FRANCE), //
    VAL_DE_MARNE(94, TypeDepartement.DPT, "Val-de-Marne", "Créteil", Region.ILE_DE_FRANCE), //
    VAL_D_OISE(95, TypeDepartement.DPT, "Val-D'Oise", "Pontoise", Region.ILE_DE_FRANCE);

    private int code;
    private TypeDepartement type;
    private String nom;
    private String villeDePrefecture;
    private Region region;

    /**
     * @param code
     * @param type
     * @param nom
     * @param villeDePrefecture
     * @param region
     */
    private Departement(int code, TypeDepartement type, String nom, String villeDePrefecture, Region region) {
        this.code = code;
        this.type = type;
        this.nom = nom;
        this.villeDePrefecture = villeDePrefecture;
        this.region = region;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @return the type
     */
    public TypeDepartement getType() {
        return type;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return the villeDePrefecture
     */
    public String getVilleDePrefecture() {
        return villeDePrefecture;
    }

    /**
     * @return the region
     */
    public Region getRegion() {
        return region;
    }
}