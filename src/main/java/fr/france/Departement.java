package fr.france;

import fr.france.outils.OutilsDepartement;

/**
 * <b>Departement est l'énumérateur représentant chacun des département
 * français.</b>
 * <p>
 * Un {@link Departement} est caractérisé par les informations suivantes :
 * </p>
 * <ul>
 * <li>Un code de département.</li>
 * <li>Un statut de département.</li>
 * <li>Un nom département.</li>
 * <li>Une ville de préfecture.</li>
 * <li>Une région auqelle elle est ratachée.</li>
 * </ul>
 * <p>
 * De plus, la class {@link Departement} possède une méthode
 * {@link Departement#rechercherParNom(String)} qui permet de retrouver un
 * département en fonction de son nom.
 * </p>
 * 
 * @see StatutDepartement
 * @see Region
 * 
 * @author MathieuSoysal
 * @version 1.0.0
 */
public enum Departement {
    AIN(1, StatutDepartement.DPT, "Ain", "Bourg-en-Bresse", Region.AUVERGNE_RHONE_ALPES), //
    /**
     * Département de Aisne
     */
    AISNE(2, StatutDepartement.DPT, "Aisne", "Laon", Region.HAUTS_DE_FRANCE), //
    /**
     * Département de Allier
     */
    ALLIER(3, StatutDepartement.DPT, "Allier", "Moulins", Region.AUVERGNE_RHONE_ALPES), //
    /**
     * Département de Alpes de Hautes-Provence
     */
    ALPES_DE_HAUTES_PROVENCE(4, StatutDepartement.DPT, "Alpes de Hautes-Provence", "Digne",
            Region.PROVENCE_ALPES_COTE_D_AZUR), //
    /**
     * Département de Hautes-Alpes
     */
    HAUTES_ALPES(5, StatutDepartement.DPT, "Hautes-Alpes", "Gap", Region.PROVENCE_ALPES_COTE_D_AZUR), //
    /**
     * Département de Alpes-Maritimes
     */
    ALPES_MARITIMES(6, StatutDepartement.DPT, "Alpes-Maritimes", "Nice", Region.PROVENCE_ALPES_COTE_D_AZUR), //
    /**
     * Département de Ardèche
     */
    ARDECHE(7, StatutDepartement.DPT, "Ardèche", "Privas", Region.AUVERGNE_RHONE_ALPES), //
    /**
     * Département de Ardennes
     */
    ARDENNES(8, StatutDepartement.DPT, "Ardennes", "Charleville-Mézières", Region.GRAND_EST), //
    /**
     * Département de Ariege
     */
    ARIEGE(9, StatutDepartement.DPT, "Ariege", "Foix", Region.OCCITANIE), //
    /**
     * Département de Aube
     */
    AUBE(10, StatutDepartement.DPT, "Aube", "Troyes", Region.GRAND_EST), //
    /**
     * Département de Aude
     */
    AUDE(11, StatutDepartement.DPT, "Aude", "Carcassonne", Region.OCCITANIE), //
    /**
     * Département de Aveyron
     */
    AVEYRON(12, StatutDepartement.DPT, "Aveyron", "Rodez", Region.OCCITANIE), //
    /**
     * Département de Bouches-Du-Rhône
     */
    BOUCHES_DU_RHONE(13, StatutDepartement.DPT, "Bouches-Du-Rhône", "Marseille", Region.PROVENCE_ALPES_COTE_D_AZUR), //
    /**
     * Département de Calvados
     */
    CALVADOS(14, StatutDepartement.DPT, "Calvados", "Caen", Region.NORMANDIE), //
    /**
     * Département de Cantal
     */
    CANTAL(15, StatutDepartement.DPT, "Cantal", "Aurillac", Region.AUVERGNE_RHONE_ALPES), //
    /**
     * Département de Charente
     */
    CHARENTE(16, StatutDepartement.DPT, "Charente", "Angoulême", Region.NOUVELLE_AQUITAINE), //
    /**
     * Département de Charente-Maritime
     */
    CHARENTE_MARITIME(17, StatutDepartement.DPT, "Charente-Maritime", "La Rochelle", Region.NOUVELLE_AQUITAINE), //
    /**
     * Département de Cher
     */
    CHER(18, StatutDepartement.DPT, "Cher", "Bourges", Region.CENTRE_VAL_DE_LOIRE), //
    /**
     * Département de Correze
     */
    CORREZE(19, StatutDepartement.DPT, "Correze", "Tulle", Region.NOUVELLE_AQUITAINE), //
    /**
     * Département de Corse-du-Sud
     */
    CORSE_DU_SUD(20, StatutDepartement.DPT, "Corse-du-Sud", "Ajaccio", Region.CORSE), //
    /**
     * Département de Haute-Corse
     */
    HAUTE_CORSE(20, StatutDepartement.DPT, "Haute-Corse", "Bastia", Region.CORSE), //
    /**
     * Département de Côte-d'Or
     */
    COTE_D_OR(21, StatutDepartement.DPT, "Côte-d'Or", "Dijon", Region.BOURGOGNE_FRANCHE_COMTE), //
    /**
     * Département de Côtes d'Armor
     */
    COTES_D_ARMOR(22, StatutDepartement.DPT, "Côtes d'Armor", "Saint-brieuc", Region.BRETAGNE), //
    /**
     * Département de Creuse
     */
    CREUSE(23, StatutDepartement.DPT, "Creuse", "Guéret", Region.NOUVELLE_AQUITAINE), //
    /**
     * Département de Dordogne
     */
    DORDOGNE(24, StatutDepartement.DPT, "Dordogne", "Périgueux", Region.NOUVELLE_AQUITAINE), //
    /**
     * Département de Doubs
     */
    DOUBS(25, StatutDepartement.DPT, "Doubs", "Besançon", Region.BOURGOGNE_FRANCHE_COMTE), //
    /**
     * Département de Drôme
     */
    DROME(26, StatutDepartement.DPT, "Drôme", "Valence", Region.AUVERGNE_RHONE_ALPES), //
    /**
     * Département de Eure
     */
    EURE(27, StatutDepartement.DPT, "Eure", "Évreux", Region.NORMANDIE), //
    /**
     * Département de Eure-et-Loir
     */
    EURE_ET_LOIR(28, StatutDepartement.DPT, "Eure-et-Loir", "Chartres", Region.CENTRE_VAL_DE_LOIRE), //
    /**
     * Département de Finistere
     */
    FINISTERE(29, StatutDepartement.DPT, "Finistere", "Quimper", Region.BRETAGNE), //
    /**
     * Département de Gard
     */
    GARD(30, StatutDepartement.DPT, "Gard", "Nîmes", Region.OCCITANIE), //
    /**
     * Département de Haute-Garonne
     */
    HAUTE_GARONNE(31, StatutDepartement.DPT, "Haute-Garonne", "Toulouse", Region.OCCITANIE), //
    /**
     * Département de Gers
     */
    GERS(32, StatutDepartement.DPT, "Gers", "Auch", Region.OCCITANIE), //
    /**
     * Département de Gironde
     */
    GIRONDE(33, StatutDepartement.DPT, "Gironde", "Bordeaux", Region.NOUVELLE_AQUITAINE), //
    /**
     * Département de Hérault
     */
    HERAULT(34, StatutDepartement.DPT, "Hérault", "Montpellier", Region.OCCITANIE), //
    /**
     * Département de Ille-et-Vilaine
     */
    ILLE_ET_VILAINE(35, StatutDepartement.DPT, "Ille-et-Vilaine", "Rennes", Region.BRETAGNE), //
    /**
     * Département de Indre
     */
    INDRE(36, StatutDepartement.DPT, "Indre", "Châteauroux", Region.CENTRE_VAL_DE_LOIRE), //
    /**
     * Département de Indre-et-Loire
     */
    INDRE_ET_LOIRE(37, StatutDepartement.DPT, "Indre-et-Loire", "Tours", Region.CENTRE_VAL_DE_LOIRE), //
    /**
     * Département de Isère
     */
    ISERE(38, StatutDepartement.DPT, "Isère", "Grenoble", Region.AUVERGNE_RHONE_ALPES), //
    /**
     * Département de Jura
     */
    JURA(39, StatutDepartement.DPT, "Jura", "Lons-le-Saunier", Region.BOURGOGNE_FRANCHE_COMTE), //
    /**
     * Département de Landes
     */
    LANDES(40, StatutDepartement.DPT, "Landes", "Mont-de-Marsan", Region.NOUVELLE_AQUITAINE), //
    /**
     * Département de Loir-et-Cher
     */
    LOIR_ET_CHER(41, StatutDepartement.DPT, "Loir-et-Cher", "Blois", Region.CENTRE_VAL_DE_LOIRE), //
    /**
     * Département de Loire
     */
    LOIRE(42, StatutDepartement.DPT, "Loire", "Saint-Étienne", Region.AUVERGNE_RHONE_ALPES), //
    /**
     * Département de Haute-Loire
     */
    HAUTE_LOIRE(43, StatutDepartement.DPT, "Haute-Loire", "Le Puy-en-Velay", Region.AUVERGNE_RHONE_ALPES), //
    /**
     * Département de Loire-Atlantique
     */
    LOIRE_ATLANTIQUE(44, StatutDepartement.DPT, "Loire-Atlantique", "Nantes", Region.PAYS_DE_LA_LOIRE), //
    /**
     * Département de Loiret
     */
    LOIRET(45, StatutDepartement.DPT, "Loiret", "Orléans", Region.CENTRE_VAL_DE_LOIRE), //
    /**
     * Département de Lot
     */
    LOT(46, StatutDepartement.DPT, "Lot", "Cahors", Region.OCCITANIE), //
    /**
     * Département de Lot-et-Garonne
     */
    LOT_ET_GARONNE(47, StatutDepartement.DPT, "Lot-et-Garonne", "Agen", Region.NOUVELLE_AQUITAINE), //
    /**
     * Département de Lozère
     */
    LOZERE(48, StatutDepartement.DPT, "Lozère", "Mende", Region.OCCITANIE), //
    /**
     * Département de Maine-et-Loire
     */
    MAINE_ET_LOIRE(49, StatutDepartement.DPT, "Maine-et-Loire", "Angers", Region.PAYS_DE_LA_LOIRE), //
    /**
     * Département de Manche
     */
    MANCHE(50, StatutDepartement.DPT, "Manche", "Saint-lô", Region.NORMANDIE), //
    /**
     * Département de Marne
     */
    MARNE(51, StatutDepartement.DPT, "Marne", "Châlons-en-champagne", Region.GRAND_EST), //
    /**
     * Département de Haute-Marne
     */
    HAUTE_MARNES(52, StatutDepartement.DPT, "Haute-Marne", "Chaumont", Region.GRAND_EST), //
    /**
     * Département de Mayenne
     */
    MAYENNE(53, StatutDepartement.DPT, "Mayenne", "Laval", Region.PAYS_DE_LA_LOIRE), //
    /**
     * Département de Meurthe-et-Moselle
     */
    MEURTHE_ET_MOSELLE(54, StatutDepartement.DPT, "Meurthe-et-Moselle", "Nancy", Region.GRAND_EST), //
    /**
     * Département de Meuse
     */
    MEUSE(55, StatutDepartement.DPT, "Meuse", "Bar-le-Duc", Region.GRAND_EST), //
    /**
     * Département de Morbihan
     */
    MORBIHAN(55, StatutDepartement.DPT, "Morbihan", "Vannes", Region.BRETAGNE), //
    /**
     * Département de Moselle
     */
    MOSELLE(57, StatutDepartement.DPT, "Moselle", "Metz", Region.GRAND_EST), //
    /**
     * Département de Nièvre
     */
    NIEVRE(58, StatutDepartement.DPT, "Nièvre", "Nevers", Region.BOURGOGNE_FRANCHE_COMTE), //
    /**
     * Département de Nord
     */
    NORD(59, StatutDepartement.DPT, "Nord", "Lille", Region.HAUTS_DE_FRANCE), //
    /**
     * Département de Oise
     */
    OISE(60, StatutDepartement.DPT, "Oise", "Beauvais", Region.HAUTS_DE_FRANCE), //
    /**
     * Département de Orne
     */
    ORNE(61, StatutDepartement.DPT, "Orne", "Alençon", Region.NORMANDIE), //
    /**
     * Département de Pas-de-Calais
     */
    PAS_DE_CALAIS(62, StatutDepartement.DPT, "Pas-de-Calais", "Arras", Region.HAUTS_DE_FRANCE), //
    /**
     * Département de Puy-de-Dôme
     */
    PUY_DE_DOME(63, StatutDepartement.DPT, "Puy-de-Dôme", "Clermont-Ferrand", Region.AUVERGNE_RHONE_ALPES), //
    /**
     * Département de Pyrénées-Atlantiques
     */
    PYRENEES_ATLANTIQUES(64, StatutDepartement.DPT, "Pyrénées-Atlantiques", "Pau", Region.NOUVELLE_AQUITAINE), //
    /**
     * Département de Hautes-Pyrénées
     */
    HAUTES_PYRENEES(65, StatutDepartement.DPT, "Hautes-Pyrénées", "Tarbes", Region.OCCITANIE), //
    /**
     * Département de Pyrénées-Orientales
     */
    PYRENEES_ORIENTALES(66, StatutDepartement.DPT, "Pyrénées-Orientales", "Perpignan", Region.OCCITANIE), //
    /**
     * Département de Bas-Rhin
     */
    BAS_RHIN(67, StatutDepartement.DPT, "Bas-Rhin", "Strasbourg", Region.GRAND_EST), //
    /**
     * Département de Haut-Rhin
     */
    HAUT_RHIN(68, StatutDepartement.DPT, "Haut-Rhin", "Colmar", Region.GRAND_EST), //
    /**
     * Département de Rhône
     */
    RHONE(69, StatutDepartement.DPT, "Rhône", "Lyon", Region.AUVERGNE_RHONE_ALPES), //
    /**
     * Département de Haute-Sâone
     */
    HAUTE_SAONE(70, StatutDepartement.DPT, "Haute-Sâone", "Vesoul", Region.BOURGOGNE_FRANCHE_COMTE), //
    /**
     * Département de Saône-et-Loire
     */
    SAONE_ET_LOIRE(71, StatutDepartement.DPT, "Saône-et-Loire", "Mâcon", Region.BOURGOGNE_FRANCHE_COMTE), //
    /**
     * Département de Sarthe
     */
    SARTHES(72, StatutDepartement.DPT, "Sarthe", "Le Mans", Region.PAYS_DE_LA_LOIRE), //
    /**
     * Département de Savoie
     */
    SAVOIE(73, StatutDepartement.DPT, "Savoie", "Chambéry", Region.AUVERGNE_RHONE_ALPES), //
    /**
     * Département de Haute-Savoie
     */
    HAUTE_SAVOIE(74, StatutDepartement.DPT, "Haute-Savoie", "Annecy", Region.AUVERGNE_RHONE_ALPES), //
    /**
     * Département de Paris
     */
    PARIS(75, StatutDepartement.DPT, "Paris", "Paris", Region.ILE_DE_FRANCE), //
    /**
     * Département de Seine-Maritime
     */
    SEINE_MARITIME(76, StatutDepartement.DPT, "Seine-Maritime", "Rouen", Region.NORMANDIE), //
    /**
     * Département de Seine-et-Marne
     */
    SEINE_ET_MARNE(77, StatutDepartement.DPT, "Seine-et-Marne", "Melun", Region.ILE_DE_FRANCE), //
    /**
     * Département de Yvelines
     */
    YVELINES(78, StatutDepartement.DPT, "Yvelines", "Versailles", Region.ILE_DE_FRANCE), //
    /**
     * Département de Deux-Sèvres
     */
    DEUX_SEVRES(79, StatutDepartement.DPT, "Deux-Sèvres", "Niort", Region.NOUVELLE_AQUITAINE), //
    /**
     * Département de Sommes
     */
    SOMMES(80, StatutDepartement.DPT, "Sommes", "Amiens", Region.HAUTS_DE_FRANCE), //
    /**
     * Département de Tarn
     */
    TARN(81, StatutDepartement.DPT, "Tarn", "Albi", Region.OCCITANIE), //
    /**
     * Département de Tarn-et-Garonne
     */
    TARN_ET_GARONNE(82, StatutDepartement.DPT, "Tarn-et-Garonne", "Montauban", Region.OCCITANIE), //
    /**
     * Département de Var
     */
    VAR(83, StatutDepartement.DPT, "Var", "Toulon", Region.PROVENCE_ALPES_COTE_D_AZUR), //
    /**
     * Département de Vaucluse
     */
    VAUCLUSE(84, StatutDepartement.DPT, "Vaucluse", "Avignon", Region.PROVENCE_ALPES_COTE_D_AZUR), //
    /**
     * Département de Vendée
     */
    VENDEE(85, StatutDepartement.DPT, "Vendée", "La Roche-sur-Yon", Region.PAYS_DE_LA_LOIRE), //
    /**
     * Département de Vienne
     */
    VIENNE(86, StatutDepartement.DPT, "Vienne", "Poitiers", Region.NOUVELLE_AQUITAINE), //
    /**
     * Département de Haute-Vienne
     */
    HAUTE_VIENNE(87, StatutDepartement.DPT, "Haute-Vienne", "Limoges", Region.NOUVELLE_AQUITAINE), //
    /**
     * Département de Vosges
     */
    VOSGES(88, StatutDepartement.DPT, "Vosges", "Épinal", Region.GRAND_EST), //
    /**
     * Département de Yonne
     */
    YONNE(89, StatutDepartement.DPT, "Yonne", "Auxerre", Region.BOURGOGNE_FRANCHE_COMTE), //
    /**
     * Département de Territoire-de-Belfort
     */
    TERRITOIRE_DE_BELFORT(90, StatutDepartement.DPT, "Territoire-de-Belfort", "Belfort",
            Region.BOURGOGNE_FRANCHE_COMTE), //
    /**
     * Département de Essonne
     */
    ESSONNE(91, StatutDepartement.DPT, "Essonne", "Évry", Region.ILE_DE_FRANCE), //
    /**
     * Département de Hauts-de-Seine
     */
    HAUTS_DE_SEINE(92, StatutDepartement.DPT, "Hauts-de-Seine", "Nanterre", Region.ILE_DE_FRANCE), //
    /**
     * Département de Seine-Saint-Denis
     */
    SEINE_SAINT_DENIS(93, StatutDepartement.DPT, "Seine-Saint-Denis", "Bobigny", Region.ILE_DE_FRANCE), //
    /**
     * Département de Val-de-Marne
     */
    VAL_DE_MARNE(94, StatutDepartement.DPT, "Val-de-Marne", "Créteil", Region.ILE_DE_FRANCE), //
    /**
     * Département de Val-D'Oise
     */
    VAL_D_OISE(95, StatutDepartement.DPT, "Val-D'Oise", "Pontoise", Region.ILE_DE_FRANCE), //
    /**
     * Département de Guadeloupe
     */
    GUADELOUPE(971, StatutDepartement.DOM, "Guadeloupe", "Basse-Terre", Region.GUADELOUPE), //
    /**
     * Département de Martinique
     */
    MARTINIQUE(972, StatutDepartement.DOM, "Martinique", "Fort-de-France", Region.MARTINIQUE), //
    /**
     * Département de Guyane
     */
    GUYANE(973, StatutDepartement.DOM, "Guyane", "Cayenne", Region.GUYANE), //
    /**
     * Département de La Réunion
     */
    LA_REUNION(974, StatutDepartement.DOM, "La Réunion", "Saint-Denis", Region.LA_REUNION), //
    /**
     * Département de Saint-Pierre-et-Miquelon
     */
    SAINT_PIERRE_ET_MIQUELON(975, StatutDepartement.COM, "Saint-Pierre-et-Miquelon", "Saint-Pierre",
            Region.DEPARTEMENT_NON_RATTACHE_A_UNE_REGION), //
    /**
     * Département de Mayotte
     */
    MAYOTTE(976, StatutDepartement.DOM, "Mayotte", "Mamoudzou", Region.MAYOTTE), //
    /**
     * Département de Saint-Barthélémy
     */
    SAINT_BARTHELEMY(977, StatutDepartement.COM, "Saint-Barthélémy", "Gustavia",
            Region.DEPARTEMENT_NON_RATTACHE_A_UNE_REGION), //
    /**
     * Département de Saint-Martin
     */
    SAINT_MARTIN(978, StatutDepartement.COM, "Saint-Martin", "Marigot", Region.DEPARTEMENT_NON_RATTACHE_A_UNE_REGION), //
    /**
     * Département de Terres australes et antarctiques françaises
     */
    TERRES_AUSTRALES_ET_ANTARCTIQUES_FRANCAISE(984, StatutDepartement.TOM,
            "Terres australes et antarctiques françaises", "Aucune prefecture",
            Region.DEPARTEMENT_NON_RATTACHE_A_UNE_REGION), //
    /**
     * Département de Wallis-et-Futuna
     */
    CALLIS_ET_FUTUNA(986, StatutDepartement.PTOM, "Wallis-et-Futuna", "Mata Utu",
            Region.DEPARTEMENT_NON_RATTACHE_A_UNE_REGION), //
    /**
     * Département de Polynésie française
     */
    POLYNESIE_FRANCAISE(987, StatutDepartement.COM, "Polynésie française", "Papeete",
            Region.DEPARTEMENT_NON_RATTACHE_A_UNE_REGION), //
    /**
     * Département de Nouvelle-Calédonie
     */
    NOUVELLE_CALEDONIE(988, StatutDepartement.PTOM, "Nouvelle-Calédonie", "Nouméa",
            Region.DEPARTEMENT_NON_RATTACHE_A_UNE_REGION), //
    /**
     * Département de Île de Clipperton
     */
    ILE_DE_CLIPPERTON(989, StatutDepartement.COM, "Île de Clipperton", "Clipperton",
            Region.DEPARTEMENT_NON_RATTACHE_A_UNE_REGION);

    private int code;
    private StatutDepartement statut;
    private String nom;
    private String villeDePrefecture;
    private Region region;

    /**
     * @param code
     * @param statut
     * @param nom
     * @param villeDePrefecture
     * @param region
     */
    private Departement(int code, StatutDepartement statut, String nom, String villeDePrefecture, Region region) {
        this.code = code;
        this.statut = statut;
        this.nom = nom;
        this.villeDePrefecture = villeDePrefecture;
        this.region = region;
    }

    /**
     * Retourne le {@link Departement} correspondant au nom donné en paramètre.
     * 
     * @param nom du département devant être cherché
     * 
     * @return {@code Departement} correpondant au nom donné, retourne {@code null}
     *         si aucun département avec ce nom a été trouvé.
     * 
     * @see Departement
     */
    public static Departement rechercherParNom(String nom) {
        return OutilsDepartement.rechercherParNom(nom);
    }

    /**
     * Retourne le {@link Departement} correspondant au code donné en paramètre.
     * 
     * @param code du département devant être cherché
     * 
     * @return {@code Departement} correpondant au code donné, retourne {@code null}
     *         si aucun département avec ce code a été trouvé.
     * 
     * @see Departement
     */
    public static Departement rechercherParCode(int code) {
        if (code >= 1000)
            code /= 1000;
        return OutilsDepartement.rechercherParCode(code);
    }

    /**
     * Retourne le {@link Departement} correspondant au code donné en paramètre.
     * 
     * @param code du département devant être cherché
     * 
     * @return {@code Departement} correpondant au code donné, retourne {@code null}
     *         si aucun département avec ce code a été trouvé.
     * 
     * @see Departement
     */
    public static Departement rechercherParCode(String code) {
        try {
            int codeCherche = Integer.parseInt(code);
            return rechercherParCode(codeCherche);
        } catch (NumberFormatException e) {
            if (code.endsWith("A"))
                return Departement.CORSE_DU_SUD;
            if (code.endsWith("B"))
                return Departement.HAUTE_CORSE;
            return null;
        }
    }

    /**
     * Retourne les {@link Departement} correspondant au statut de département donné
     * en paramètre.
     * 
     * @param statut des départements devant être cherchés
     * 
     * @return Un tableau de {@code Departement} correpondants au statut donné
     * 
     * @see StatutDepartement
     */
    public static Departement[] getDepartementsParStatut(StatutDepartement statut) {
        return OutilsDepartement.filtrerDepartementsParStatut(statut);
    }

    /**
     * Retourne les {@link Departement} correspondant à la région donnée en
     * paramètre.
     * 
     * @param Region en commun des départements devant être cherchés
     * 
     * @return Un tableau de {@code Departement} correpondants à la région donnée
     * 
     * @see Region
     */
    public static Departement[] getDepartementsParRegion(Region region) {
        return OutilsDepartement.filtrerDepartementsParRegion(region);
    }

    /**
     * @return le code du département
     */
    public int getCode() {
        return code;
    }

    /**
     * @return le statut du département
     * 
     * @see StatutDepartement
     */
    public StatutDepartement getStatut() {
        return statut;
    }

    /**
     * @return le nom du département
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return la ville de préfecture du département
     */
    public String getVilleDePrefecture() {
        return villeDePrefecture;
    }

    /**
     * @return la région auquelle le département appartient
     * 
     * @see Region
     */
    public Region getRegion() {
        return region;
    }
}