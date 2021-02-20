package fr.france;

import com.opencsv.bean.CsvBindByPosition;

/**
 * <b>Caumune est la classe représentant une caumune française.</b>
 * <p>
 * Un objet Caumune est caractérisé par les informations suivantes :
 * <ul>
 * <li>Une code INSEE.</li>
 * <li>Un nom.</li>
 * <li>Un code postal.</li>
 * <li>Un département.</li>
 * <li>Une région.</li>
 * </ul>
 * 
 * @see Region
 * @see Departement
 * 
 * @author MathieuSoysal
 * @version 1.0.0
 */
public class Caumune {
    @CsvBindByPosition(position = 0)
    private String codeINSEE;

    @CsvBindByPosition(position = 1)
    private String nom;

    @CsvBindByPosition(position = 2)
    private int codePostal;

    /**
     * @return le code INSEE de la caumune
     */
    public String getCodeINSEE() {
        return codeINSEE;
    }

    /**
     * @return le nom de la caumune
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return le code postal de la caumune
     */
    public int getCodePostal() {
        return codePostal;
    }

    public Object getDepartement() {
        int code = codePostal / 1000;
        if (code != 20)
            return Departement.rechercherParCode(code);
        else
            return Departement.rechercherParCode(codeINSEE.substring(0, 2));
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 40000;
        result = prime * result + ((codeINSEE == null) ? 0 : codeINSEE.hashCode());
        result = prime * result + codePostal;
        result = prime * result + ((nom == null) ? 0 : nom.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Caumune other = (Caumune) obj;
        if (codeINSEE == null) {
            if (other.codeINSEE != null)
                return false;
        } else if (!codeINSEE.equals(other.codeINSEE))
            return false;
        if (codePostal != other.codePostal)
            return false;
        if (nom == null) {
            if (other.nom != null)
                return false;
        } else if (!nom.equals(other.nom))
            return false;
        return true;
    }

}