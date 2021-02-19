package fr.france.outils;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class OutilsRepertoireGenerique {
    private OutilsRepertoireGenerique() {
        throw new IllegalStateException("Class utilitaire");
    }

    public static <K, T extends Enum<T>> Map<K, T> genererMap(Collection<K> keys, Class<T> enumType) {
        Map<K, T> temp = new HashMap<>();
        Iterator<K> iterator = keys.iterator();
        for (T departement : enumType.getEnumConstants())
            temp.put(iterator.next(), departement);
        return Collections.unmodifiableMap(temp);
    }

}
