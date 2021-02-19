package fr.france;

import com.opencsv.bean.CsvBindByPosition;

public class Caumune {
    @CsvBindByPosition(position = 0)
    private String codeINSEE;

    @CsvBindByPosition(position = 1)
    private String nom;

    @CsvBindByPosition(position = 2)
    private int codePostal;

    /**
     * @return the codeINSEE
     */
    public String getCodeINSEE() {
        return codeINSEE;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return the codePostal
     */
    public int getCodePostal() {
        return codePostal;
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