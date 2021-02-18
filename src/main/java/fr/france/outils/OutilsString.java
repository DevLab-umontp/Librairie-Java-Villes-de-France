package fr.france.outils;

import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class OutilsString {

    private OutilsString() {
        throw new IllegalStateException("Class utilitaire");
    }

    private static final int INDEX_NOT_FOUND = 0;

    public static int indexOfDifference(CharSequence cs1, CharSequence cs2) {
        if (cs1 == cs2)
            return INDEX_NOT_FOUND;
        if (cs1 == null || cs2 == null)
            return 0;
        int i = 0;
        for (; i < cs1.length() && i < cs2.length(); ++i)
            if (cs1.charAt(i) != cs2.charAt(i))
                break;
        if (i < cs2.length() || i < cs1.length())
            return i;
        return INDEX_NOT_FOUND;
    }

    public static String trouverLaMeilleurOccurence(Collection<String> c, String str) {
        PriorityQueue<Occurence> queue = new PriorityQueue<>(Comparator.comparing(Occurence::getDifference));
        queue.addAll(c.stream().map(x -> new Occurence(x, str)).collect(Collectors.toList()));
        Occurence occurence1 = queue.poll();
        Occurence occurence2 = queue.poll();
        if (occurence1.getDifference() != occurence2.getDifference())
            return occurence1.getValeur();
        return null;
    }
}
