<!-- [![Maven Central](https://img.shields.io/maven-central/v/com.github.devlab-umontp/villes-et-departements-de-france.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22com.github.devlab-umontp%22%20AND%20a:%22villes-et-departements-de-france%22)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=DevLab-umontp_Librairie-Java-Villes-de-France&metric=alert_status)](https://sonarcloud.io/dashboard?id=DevLab-umontp_Librairie-Java-Villes-de-France)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=DevLab-umontp_Librairie-Java-Villes-de-France&metric=coverage)](https://sonarcloud.io/dashboard?id=DevLab-umontp_Librairie-Java-Villes-de-France) -->
![GitHub Actions](https://github.com/DevLab-umontp/Librairie-Java-Villes-de-France/workflows/Java%20CI%20with%20Maven/badge.svg)
[![Javadoc](https://img.shields.io/badge/JavaDoc-Online-green)](https://mathieusoysal.github.io/stats/librairie-java-villes-de-france/fr/france/package-summary.html)
[![Gitmoji.dev](https://img.shields.io/badge/gitmoji-%20😜%20😍-FFDD67.svg?style=flat-square)](https://gitmoji.dev) 

# ![](ressources/devicon.png) Librairie Java : Villes de France [![GitHub](https://img.shields.io/github/license/DevLab-umontp/Librairie-Java-Villes-de-France)](https://github.com/DevLab-umontp/Librairie-Java-Villes-de-France/blob/master/LICENSE)

### IUT Montpellier-Sète – Département Informatique
* **Colaborateurs:** [étudiants du département informatique](https://iut-montpellier-sete.edu.umontpellier.fr/dut-informatique/)

### Les projets utilisant la librairie 
 - [Bot Discord EDT](https://github.com/DevLab-umontp/BOT-DISCORD-EDT) : Bot Discord facilitant l'accès à l'empoi du temps de l'IUT de Montpellier

## Comment intégrer la Librairie Java Villes de France dans votre code

### Maven 

Si vous avez Maven, ajoutez ce qui suit aux dépendances de votre fichier `pom.xml` :

```xml
<dependency>
  <groupId>com.github.devlab-umontp</groupId>
  <artifactId>villes-et-departements-de-france</artifactId>
  <version>1.0.0</version>
</dependency>
```
>*Voir un exemple de fichier [pom.xml](https://github.com/DevLab-umontp/Librarie-Java-Villes-de-France/blob/main/ressources/pom.xml#L20L24) avec la librairie Villes de France*
### Gradle

Si vous utilisez Gradle, ajoutez ce qui suit aux dépendances de votre fichier `build.gradle`:

```
    implementation 'com.github.devlab-umontp:villes-et-departements-de-france:1.0.0'
```

## Exemple de code d'utilisation de la Librairie Java Villes de France

```java
import fr.france.*;

class ExempleDeCode {
    public static void main(String[] args) {

        // Récupérer la région Corse
        Region corse = Region.CORSE;

        // Récupérer le departement de l'Hérault
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
        Caumune trefflean = RepertoireCaumune.rechercherParNomEtCodePostal("Trefflean",56250);
    }
}
```
>*Voir plus d'[exemples de code](ressources/ExempleDeCode.java)*
## Contribution
Les suggestions et contributions sont toujours les bienvenues! Veuillez discuter des modifications plus importantes via un [issue](https://github.com/DevLab-umontp/Librarie-Java-Villes-de-France/issues) avant de soumettre une demande.

## Licence

Ce projet est publié sous la licence [Academic Free License 3.0](https://github.com/DevLab-umontp/Librarie-Java-Villes-de-France/blob/main/LICENSE)
