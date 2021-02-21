import fr.france.*;

class ExempleDeCode {
    public static void main(String[] args) {

        // Récupérer la région Corse
        Region corse = Region.CORSE;

        // Récupérer le departement Hérault
        Departement herault = Departement.HERAULT;

        // Récupérer les caumunes de l'Hérault
        List<Caumune> caumunesHerault = herault.getCaumunes();

        // Récupérer la région de l'Hérault
        Region occitanie = herault.getRegion();

        // Récupérer les départements de la région Occitanie
        List<Departement> departementsOccitanie = occitanie.getDepartements();

        // Rechercher un département par rapport à son code
        Departement vaucluse = Departement.rechercherParCode(84);

        // Récupérer des départements par rapport à leur statut
        List<Departement> departementsDom = Departement.filtrerParStatut(StatutDepartement.DOM);

        // Rechercher les Caumunes par rapport à leur code postal
        List<Caumune> caumunes = RepertoireCaumune.rechercherParCodePostal(56250);

        // Rechercher une Caumune par rapport à son nom et son code postal
        Caumune trefflean = RepertoireCaumune.rechercherParNomEtCodePostal("Trefflean", 56250);

        // Rechercher les Caumunes par rapport à leur nom
        List<Caumune> caumunesTrefflean = RepertoireCaumune.rechercherParNom("Trefflean");

        // Récupérer toutes les Caumunes d'une région
        List<Caumune> caumunesOccitanie = Region.OCCITANIE.getCaumunes();
    }
}