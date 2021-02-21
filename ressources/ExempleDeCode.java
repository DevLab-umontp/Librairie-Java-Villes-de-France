import fr.france.*;

class ExempleDeCode {
    public static void main(String[] args) {

        // Récupérer la région Corse
        Region corse = Region.CORSE;

        // Récupérer le departement Hérault
        Departement herault = Departement.HERAULT;

        // Récupérer les Communes de l'Hérault
        List<Commune> CommunesHerault = herault.getCommunes();

        // Récupérer la région de l'Hérault
        Region occitanie = herault.getRegion();

        // Récupérer les départements de la région Occitanie
        List<Departement> departementsOccitanie = occitanie.getDepartements();

        // Rechercher un département par rapport à son code
        Departement vaucluse = Departement.rechercherParCode(84);

        // Récupérer des départements par rapport à leur statut
        List<Departement> departementsDom = Departement.filtrerParStatut(StatutDepartement.DOM);

        // Rechercher les Communes par rapport à leur code postal
        List<Commune> Communes = RepertoireCommune.rechercherParCodePostal(56250);

        // Rechercher une Commune par rapport à son nom et son code postal
        Commune trefflean = RepertoireCommune.rechercherParNomEtCodePostal("Trefflean", 56250);

        // Rechercher les Communes par rapport à leur nom
        List<Commune> CommunesTrefflean = RepertoireCommune.rechercherParNom("Trefflean");

        // Récupérer toutes les Communes d'une région
        List<Commune> CommunesOccitanie = Region.OCCITANIE.getCommunes();
    }
}