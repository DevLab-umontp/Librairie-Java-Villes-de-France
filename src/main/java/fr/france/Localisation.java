package fr.france;

/**
 * <b>Localisation est la classe représentant une localisation gps.</b>
 * <p>
 * Un objet Localisation est caractérisé par les informations suivantes :
 * <ul>
 * <li>Une latitude.</li>
 * <li>Une longitude.</li>
 * </ul>
 * 
 * @author MathieuSoysal
 * @version 1.0.0
 */
public class Localisation {
    private final double latitude;
    private final double longitude;

    public Localisation(double lat, double lon) {
        latitude = lat;
        longitude = lon;
    }

    /**
     * @return la latitude de la localisation
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * @return la longitude de la localisation
     */
    public double getLongitude() {
        return longitude;
    }
}
